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
using System.Text;
using System.Text.RegularExpressions;

public partial class matching : System.Web.UI.Page
{
    search match = new search();
    StringBuilder sb = new StringBuilder();
    DataSet ds, da;
    string p, s, next;
    int h = 0;
    protected void Page_Load(object sender, EventArgs e)
    {
        txt_keyword.Text = (string)Session["keyword"];
        string text = (string)Session["keyword"];
        string splitby = " ";
        Regex rg = new Regex(splitby);
        string[] st = rg.Split(text);
        int m = st.Count();
        for (int k = 0; k < m; k++)
        {
            s = st[k].ToString();
            next = s.Remove(s.Length - 1);
            da = new DataSet();
            da = match.filematching(next);
            if (da.Tables[0].Rows.Count > 0)
            {
                for (int f = 0; f < da.Tables[0].Rows.Count; f++)
                {
                   // bool useHashing = true;
                    lbl_entxt.Visible = false;
                    lbl_entxt.Text = da.Tables[0].Rows[f]["enyfile"].ToString();
                    string cipherText = lbl_entxt.Text.Trim();
                    sb.Append(cipherText + "<br>");
                    string decryptedText = encryption.Decrypt(cipherText);

                    

                    LinkButton linkbtn = new LinkButton();
                    linkbtn.Text = decryptedText + "<br><br>";
                    linkbtn.Visible = true;
                    linkbtn.CommandName = decryptedText;
                    linkbtn.Command += new CommandEventHandler(this.Link1_Click);
                    linkbtn.ID = h.ToString();
                    this.downloadfiles1.Controls.Add(linkbtn);
                    h++;

                }
            }
            else
            {
                Label1.Text = "No files in server";
            }
        }
    }

    protected void Link1_Click(object sender, CommandEventArgs e)
    {
        startdownload(e.CommandName);
    }

    protected void startdownload(string s)
    {
        Response.Redirect("verification.aspx?ID=" + s + "");
    }
}
