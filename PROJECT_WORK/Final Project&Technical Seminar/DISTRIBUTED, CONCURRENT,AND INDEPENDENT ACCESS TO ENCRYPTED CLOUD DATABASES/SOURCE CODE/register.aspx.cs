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
using System.Net.Mail;

public partial class register : System.Web.UI.Page
{
    SqlConnection con = new SqlConnection(System.Configuration.ConfigurationManager.ConnectionStrings["con"].ConnectionString);
    protected void Page_Load(object sender, EventArgs e)
    {
        Random rd = new Random();
        Label9.Text=Convert.ToString(rd.Next(11111,99999));
    }
    protected void btnregister_Click(object sender, EventArgs e)
    {
        con.Open();
        SqlCommand cd = new SqlCommand("insert into register values('" + txt_name.Text + "','" + txt_pwd.Text + "','" + txt_email.Text + "','" + txt_num.Text + "','" + txt_city.Text + "','"+Label9.Text+"')", con);
        cd.ExecuteNonQuery();
        con.Close();
        System.Net.Mail.MailMessage mailMessage = new System.Net.Mail.MailMessage();
        mailMessage.To.Add(txt_email.Text);
        mailMessage.From = new MailAddress("cloudprojects123@gmail.com");
        mailMessage.Subject = "Client Private Key ";
        mailMessage.Body += "Your Private Key is:" + Label9.Text + "\n";
        SmtpClient smtpClient = new SmtpClient("smtp.gmail.com");
        smtpClient.Port = 587;
        smtpClient.EnableSsl = true;
        smtpClient.UseDefaultCredentials = true;
        smtpClient.DeliveryMethod = SmtpDeliveryMethod.Network;
        smtpClient.Credentials = new System.Net.NetworkCredential("cloudprojects123@gmail.com", "cloud@123");
        smtpClient.Send(mailMessage);
        Page.ClientScript.RegisterStartupScript(this.GetType(), "Message", "alert('Registration Successfull...');window.location='" + "clientlogin" + ".aspx';", true);
    }
}
