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
using System.Security.Cryptography;

public partial class verification : System.Web.UI.Page
{
    SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["con"].ConnectionString);
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        string fnam = Request.Params["ID"];
        Session["filename"] = fnam;
        con.Open();
        SqlCommand cmd = new SqlCommand("select clientprivatekey from register where username='"+TextBox1.Text+"'",con);
        SqlDataReader dr = cmd.ExecuteReader();
        dr.Read();
        string pkey=dr["clientprivatekey"].ToString();
        dr.Close();
        if (pkey == TextBox2.Text)
        {
            SqlCommand cmd1 = new SqlCommand("select filename,filetype,encryfile from upload where filename='"+fnam+"'",con);
            SqlDataReader dr1 = cmd1.ExecuteReader();
            dr1.Read();
            Label3.Text=dr1["encryfile"].ToString();
            Label4.Text= dr1["filetype"].ToString();
            
            string fileName = fnam;
            //string fileExtension = Path.GetExtension(FileUpload1.PostedFile.FileName);

            //Build the File Path for the original (input) and the decrypted (output) file
            string input = Label3.Text;
            string output = Server.MapPath("~/File/") + fileName + "_dec" + Label4.Text;
            if (File.Exists(Label3.Text))
            {
                using (TextReader tr = new StreamReader(Label3.Text))
                {
                   string content=tr.ReadLine();
                   if (!(File.Exists(output)))
                   {
                       FileStream fs=File.Create(output);
                       fs.Close();
                       fs.Dispose();
                   }
                   if (File.Exists(output))
                   {
                       using (StreamWriter sw = File.CreateText(output))
                       {
                           sw.WriteLine(content);
                       }
                   }
                }
            }

            //Save the Input File, Decrypt it and save the decrypted file in output path.

            this.Decrypt(input, output);

            //Download the Decrypted File.
            Response.Clear();
            Response.ContentType = Label4.Text;
            Response.AppendHeader("Content-Disposition", "attachment; filename=" + Path.GetFileName(output));
            Response.WriteFile(output);
            Response.Flush();
            Response.End();
            File.Delete(input);
            File.Delete(output);
        }
        else
        {
            Response.Write("<script>alert('Verification Failed')</script>");
        }
        con.Close();
    }

    private void Decrypt(string inputFilePath, string outputfilePath)
    {
        string EncryptionKey = "MAK212";
        using (Aes encryptor = Aes.Create())
        {
            Rfc2898DeriveBytes pdb = new Rfc2898DeriveBytes(EncryptionKey, new byte[] { 0x49, 0x76, 0x61, 0x6e, 0x20, 0x4d, 0x65, 0x64, 0x76, 0x65, 0x64, 0x65, 0x76 });
            encryptor.Key = pdb.GetBytes(32);
            encryptor.IV = pdb.GetBytes(16);
            using (FileStream fsInput = new FileStream(inputFilePath, FileMode.Open))
            {
                using (CryptoStream cs = new CryptoStream(fsInput, encryptor.CreateDecryptor(), CryptoStreamMode.Read))
                {
                    using (FileStream fsOutput = new FileStream(outputfilePath, FileMode.Create))
                    {
                        int data;
                        while ((data = cs.ReadByte()) != -1)
                        {
                            fsOutput.WriteByte((byte)data);
                        }
                    }
                }
            }
        }
    }
}
