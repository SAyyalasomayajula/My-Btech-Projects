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

public partial class cloud : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        if (TextBox1.Text == "cloud")
        {
            if (TextBox2.Text == "cloud")
            {
                Response.Redirect("cloudDBaaS.aspx");
            }
            else
            {
                Response.Write("<script>alert('Invalid Password')</script>");
            }
        }
        else
        {
            Response.Write("<script>alert('Invalid Name')</script>");
        }
    }
}
