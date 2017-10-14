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

public partial class clientView : System.Web.UI.Page
{
    SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["con"].ConnectionString);
    protected void Page_Load(object sender, EventArgs e)
    {
        Label1.Text=Session["name"].ToString();
        if (!IsPostBack)
        {
            BindDetails();
        }
    }

    private void BindDetails()
    {
        con.Open();
        SqlCommand cmd = new SqlCommand("Select ID,filekey,filename,filetype,filesize from upload where clientname='" + Label1.Text + "'", con);
        SqlDataAdapter da = new SqlDataAdapter(cmd);
        DataSet ds = new DataSet();
        da.Fill(ds);
        con.Close();
        if (ds.Tables[0].Rows.Count > 0)
        {
            GridView1.DataSource = ds;
            GridView1.DataBind();
        }
        else
        {
            ds.Tables[0].Rows.Add(ds.Tables[0].NewRow());
            GridView1.DataSource = ds;
            GridView1.DataBind();
            int columncount = GridView1.Rows[0].Cells.Count;
            GridView1.Rows[0].Cells.Clear();
            GridView1.Rows[0].Cells.Add(new TableCell());
            GridView1.Rows[0].Cells[0].ColumnSpan = columncount;
            GridView1.Rows[0].Cells[0].Text = "No Records Found";
        }
    }

    protected void GridView1_RowCommand(object sender, GridViewCommandEventArgs e)
    {

        if (e.CommandName == "View")
        {
            //TextBox1.Visible = true;
            con.Open();
            int index = Convert.ToInt32(e.CommandArgument);

            GridViewRow selectedRow = GridView1.Rows[index];
            TableCell contactName = selectedRow.Cells[0];
            string contact = contactName.Text;
            SqlCommand cd1 = new SqlCommand("select ID,filekey,filename,filesize,filetype from upload where ID='" + contact + "'", con);
            SqlDataReader dr = cd1.ExecuteReader();
            dr.Read();
            Response.Write("<script>alert('< Meta Data >      ");
            Response.Write("File ID :"+ dr["ID"].ToString());
            Response.Write("|| File Key :" + dr["filekey"].ToString());
            Response.Write("|| File Name :"+dr["filename"].ToString());
            Response.Write("|| File Type :" + dr["filetype"].ToString());
            Response.Write("|| File Size :" + dr["filesize"].ToString());
            Response.Write("')</script>");
            dr.Close();
        }
        if (e.CommandName == "Download")
        {
            con.Open();
            int index = Convert.ToInt32(e.CommandArgument);

            GridViewRow selectedRow = GridView1.Rows[index];
            TableCell contactName = selectedRow.Cells[0];
            string contact = contactName.Text;
            SqlCommand cd1 = new SqlCommand("select enfname,encryfile,filetype from upload where ID='" + contact + "'", con);
            SqlDataReader dr = cd1.ExecuteReader();
            dr.Read();
            string fname = dr["encryfile"].ToString();
            string ftype = dr["filetype"].ToString();
            string efname = dr["enfname"].ToString();

            Response.ContentType = ftype;
            Response.Clear();
            Response.AppendHeader("Content-Disposition", "attachment; filename=" + efname);
            Response.WriteFile(fname);
            Response.Flush();
            Response.End();
            con.Close();
        }
    }
}
