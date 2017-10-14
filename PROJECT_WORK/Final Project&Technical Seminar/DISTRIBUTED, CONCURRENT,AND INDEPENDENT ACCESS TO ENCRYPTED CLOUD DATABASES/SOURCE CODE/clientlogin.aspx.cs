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

public partial class clientlogin : System.Web.UI.Page
{
    SqlConnection con = new SqlConnection(System.Configuration.ConfigurationManager.ConnectionStrings["con"].ConnectionString);
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        if (TextBox1.Text != "" && TextBox2.Text != "")
        {
            string uname = TextBox1.Text;
            string pwd = TextBox2.Text;
            con.Open();
            string str1 = "SELECT username,password FROM register WHERE username='" + TextBox1.Text + "'";

            SqlDataAdapter objadapter = new SqlDataAdapter(str1, con);
            DataSet dataset = new DataSet();
            objadapter.Fill(dataset, "register");
            DataTable datatable = dataset.Tables[0];
            for (int i = 0; i < datatable.Rows.Count; i++)
            {
                string unam1 = datatable.Rows[i]["username"].ToString();
                string upwd1 = datatable.Rows[i]["password"].ToString();

                if (((unam1.Trim() == uname) && (upwd1.Trim() == pwd)))
                {
                    Page.ClientScript.RegisterStartupScript(this.GetType(), "Message", "alert('Login Successfull...');window.location='" + "client" + ".aspx';", true);
                }
                else
                {
                    Response.Write("<script>alert('Check Your Name and Password...')</script>");
                }
                Session["name"] = TextBox1.Text;
            }
        }
        else
        {
            Response.Write("<script>alert('Please Enter Your username and Password...')</script>");
        }
    }
    protected void LinkButton1_Click(object sender, EventArgs e)
    {
        Response.Redirect("register.aspx");
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        TextBox1.Text = "";
        TextBox2.Text = "";
    }
}
