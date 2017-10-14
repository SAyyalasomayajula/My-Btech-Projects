using System;
using System.Data;
using System.Configuration;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using System.Data.SqlClient;
using System.Text;
using System.Security.Cryptography;
using System.Net.Mail;
using System.IO;

/// <summary>
/// Summary description for encryption
/// </summary>
public class encryption
{
    SqlConnection cn = new SqlConnection(ConfigurationManager.AppSettings["connection"]);
    SqlCommand com,cmd1;

    string id;
    int fid;
	public encryption()
	{
		//
		// TODO: Add constructor logic here
		//
	}

    public static string Encrypt(string toEncrypt, bool useHashing)
    {
        byte[] keyArray;
        byte[] toEncryptArray = UTF8Encoding.UTF8.GetBytes(toEncrypt);
        System.Configuration.AppSettingsReader settingsReader = new AppSettingsReader();
        string key = (string)settingsReader.GetValue("connection", typeof(String));
        if (useHashing)
        {
            MD5CryptoServiceProvider hashmd5 = new MD5CryptoServiceProvider();
            keyArray = hashmd5.ComputeHash(UTF8Encoding.UTF8.GetBytes(key));
            hashmd5.Clear();
        }
        else
                    keyArray = UTF8Encoding.UTF8.GetBytes(key);

            TripleDESCryptoServiceProvider tdes = new TripleDESCryptoServiceProvider();
            tdes.Key = keyArray;
            tdes.Mode = CipherMode.ECB;
            tdes.Padding = PaddingMode.PKCS7;
            ICryptoTransform cTransform = tdes.CreateEncryptor();
            byte[] resultArray = cTransform.TransformFinalBlock(toEncryptArray, 0, toEncryptArray.Length);
            tdes.Clear();
            return Convert.ToBase64String(resultArray, 0, resultArray.Length);

        }
    public  int userid()
    {
        cn.Open();
        cmd1 = new SqlCommand("select max(userid) from registration", cn);
        id = Convert.ToString(cmd1.ExecuteScalar());
        if (id == "")
        {
            fid = 1;
        }
        else
        {
            fid = Convert.ToInt16(id);
            fid = fid + 1;
        }
        cn.Close();
        return fid;
    }
    public DataSet checkuser(string usr,string psw,string key)
    {
        cn.Open();
        SqlDataAdapter adt = new SqlDataAdapter("select usernam,password,rdn from registration where usernam='" + usr + "' and rdn='" + key + "'", cn);
        DataSet da = new DataSet();
        adt.Fill(da);
        cn.Close();
        return da;
        
    }

    public static string Decrypt(string TextToBeDecrypted)
    {
        RijndaelManaged RijndaelCipher = new RijndaelManaged();

 
        string Password = "CSC";

        string DecryptedData;

 

        try
        {

            byte[] EncryptedData = Convert.FromBase64String(TextToBeDecrypted);

 

            byte[] Salt = Encoding.ASCII.GetBytes(Password.Length.ToString());

            //Making of the key for decryption

            PasswordDeriveBytes SecretKey = new PasswordDeriveBytes(Password, Salt);

            //Creates a symmetric Rijndael decryptor object.

            ICryptoTransform Decryptor = RijndaelCipher.CreateDecryptor(SecretKey.GetBytes(32), SecretKey.GetBytes(16));

 

            MemoryStream memoryStream = new MemoryStream(EncryptedData);

            //Defines the cryptographics stream for decryption.THe stream contains decrpted data

            CryptoStream cryptoStream = new CryptoStream(memoryStream, Decryptor, CryptoStreamMode.Read);

 

            byte[] PlainText = new byte[EncryptedData.Length];

            int DecryptedCount = cryptoStream.Read(PlainText, 0, PlainText.Length);

            memoryStream.Close();

            cryptoStream.Close();

 

            //Converting to string

            DecryptedData = Encoding.Unicode.GetString(PlainText, 0, DecryptedCount);

        }

        catch

        {

            DecryptedData = TextToBeDecrypted;

        }

        return DecryptedData;

    }
}
