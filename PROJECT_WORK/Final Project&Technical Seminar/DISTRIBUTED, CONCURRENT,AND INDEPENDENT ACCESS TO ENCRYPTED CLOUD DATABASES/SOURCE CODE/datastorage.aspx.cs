using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using System.Data.SqlClient;
using System.IO;
using System.Text;
using System.Security.Cryptography;

public partial class datastorage : System.Web.UI.Page
{
    SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["con"].ConnectionString);
    protected void Page_Load(object sender, EventArgs e)
    {
        Label6.Text=Session["name"].ToString();
        try
        {
            int s;
            con.Open();
            SqlCommand cmd1 = new SqlCommand("select max(ID) from upload", con);
            string sl = Convert.ToString(cmd1.ExecuteScalar());
            if (sl == null || sl == "")
            {
                s = 1;
            }
            else
            {
                s = Convert.ToInt32(sl);
                s = s + 1;
            }
            con.Close();
            Label4.Text = s.ToString();
        }
        catch (Exception ex)
        {
            Response.Write("<script>alert('" + ex.ToString() + "')</script>");
        }
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        con.Open();
        string filename = Path.GetFileNameWithoutExtension(FileUpload1.PostedFile.FileName);
       // string path = FileUpload1.PostedFile.FileName;
        string size = Convert.ToString(FileUpload1.PostedFile.ContentLength)+"Byte";
        string ext = Path.GetExtension(FileUpload1.PostedFile.FileName);
        Stream str = FileUpload1.PostedFile.InputStream;
        BinaryReader br = new BinaryReader(str);
        Byte[] data = br.ReadBytes((int)str.Length);

        string fileName = Path.GetFileNameWithoutExtension(FileUpload1.PostedFile.FileName);
        string fileExtension = Path.GetExtension(FileUpload1.PostedFile.FileName);

        //Build the File Path for the original (input) and the encrypted (output) file.
        string input = Server.MapPath("~/File/") + fileName + fileExtension;
        string output = Server.MapPath("~/File/") + fileName + "_enc" + fileExtension;
        string outfile = fileName + "_enc" + fileExtension;
        //Save the Input File, Encrypt it and save the encrypted file in output path.
        FileUpload1.SaveAs(input);
        this.Encrypt(input, output);

        TextBox2.Text = "File Id:'" + Label4.Text + "'.File Name:'" + filename + "'.File Type: '" + ext + "'.File Size:'" + size + "'";
        SqlCommand cmd = new SqlCommand("insert into upload(ID,clientname,filekey,enyfile,filename,filetype,filesize,filedata,metadata,enfname,encryfile) values(@ID,@cName,@keyword,@Name1,@Name,@Type,@size,@Data,@mData,@enfname,@encryfile)", con);
        cmd.Parameters.AddWithValue("@ID", Label4.Text);
        cmd.Parameters.AddWithValue("@cName", Label6.Text);
        cmd.Parameters.AddWithValue("@keyword", TextBox1.Text);
        cmd.Parameters.AddWithValue("@Name", filename);
        cmd.Parameters.AddWithValue("@Name1", Encrypt(filename));
        //cmd.Parameters.AddWithValue("@path", path);
        cmd.Parameters.AddWithValue("@Type", ext);
        cmd.Parameters.AddWithValue("@size", size);
        cmd.Parameters.AddWithValue("@Data", data);
        cmd.Parameters.AddWithValue("@mData", Encrypt(TextBox2.Text));
        cmd.Parameters.AddWithValue("@enfname", outfile);
        cmd.Parameters.AddWithValue("@encryfile",output);

        cmd.ExecuteNonQuery();
        Response.Write("<script>alert('Uploaded successfully')</script>");
        con.Close();
    }

    private void Encrypt(string inputFilePath, string outputfilePath)
    {
        string EncryptionKey = "MAK212";
        using (Aes encryptor = Aes.Create())
        {
            Rfc2898DeriveBytes pdb = new Rfc2898DeriveBytes(EncryptionKey, new byte[] { 0x49, 0x76, 0x61, 0x6e, 0x20, 0x4d, 0x65, 0x64, 0x76, 0x65, 0x64, 0x65, 0x76 });
            encryptor.Key = pdb.GetBytes(32);
            encryptor.IV = pdb.GetBytes(16);
            using (FileStream fsOutput = new FileStream(outputfilePath, FileMode.Create))
            {
                using (CryptoStream cs = new CryptoStream(fsOutput, encryptor.CreateEncryptor(), CryptoStreamMode.Write))
                {
                    using (FileStream fsInput = new FileStream(inputFilePath, FileMode.Open))
                    {
                        int data;
                        while ((data = fsInput.ReadByte()) != -1)
                        {
                            cs.WriteByte((byte)data);
                        }
                    }
                }
            }
        }
    }

    private object Encrypt(string TextToBeEncrypted)
    {
        //string strmsg = string.Empty;
       // byte[] encode = new byte[clearText.Length];
        //encode = Encoding.UTF8.GetBytes(clearText);
        //strmsg = Convert.ToBase64String(encode);
        //return strmsg;
       RijndaelManaged RijndaelCipher = new RijndaelManaged();

        string Password = "CSC";

        byte[] PlainText = System.Text.Encoding.Unicode.GetBytes(TextToBeEncrypted);

        byte[] Salt = Encoding.ASCII.GetBytes(Password.Length.ToString());

        PasswordDeriveBytes SecretKey = new PasswordDeriveBytes(Password, Salt);

        //Creates a symmetric encryptor object.

        ICryptoTransform Encryptor = RijndaelCipher.CreateEncryptor(SecretKey.GetBytes(32), SecretKey.GetBytes(16));

        MemoryStream memoryStream = new MemoryStream();

        //Defines a stream that links data streams to cryptographic transformations

        CryptoStream cryptoStream = new CryptoStream(memoryStream, Encryptor, CryptoStreamMode.Write);

        cryptoStream.Write(PlainText, 0, PlainText.Length);

        //Writes the final state and clears the buffer

        cryptoStream.FlushFinalBlock();
        byte[] CipherBytes = memoryStream.ToArray();

        memoryStream.Close();

        cryptoStream.Close();

        string EncryptedData = Convert.ToBase64String(CipherBytes);

 

        return EncryptedData;

    }
}
