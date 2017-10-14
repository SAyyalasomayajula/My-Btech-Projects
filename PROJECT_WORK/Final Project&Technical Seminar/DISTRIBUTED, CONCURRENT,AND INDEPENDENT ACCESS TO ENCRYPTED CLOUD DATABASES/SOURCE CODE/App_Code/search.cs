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
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Security.Cryptography;

/// <summary>
/// Summary description for search
/// </summary>
public class search
{
    SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["con"].ConnectionString);
    SqlCommand cmd, cmd1,cmd2;
    string key,enkey,id;
    int fid;
    //string[] enkey;
	public search()
	{
		//
		// TODO: Add constructor logic here
		//
	}

    public string Encrypt(string keyword)
    {
        enkey = "";
        int len = keyword.Length;
        for (int i = 0; i < len; i++)
        {
            con.Open();
            cmd = new SqlCommand("select keys from alphakeys where alphabets='" + keyword[i].ToString() + "'", con);
            key = Convert.ToString(cmd.ExecuteScalar());
            enkey += key;
            //enkey= new string[50];
            //enkey[i] =key;
            con.Close();
        }
        return enkey;
    }
    
    public DataSet matching(string en)
    {
        con.Open();
        SqlDataAdapter adp = new SqlDataAdapter("select filekey from upload where decryptedtext like '"+'%'+ en +'%'+ "' ", con);
        DataSet d = new DataSet();
        adp.Fill(d);
        con.Close();
        return d;
    }

    public DataSet filematching(string key)
    {
        con.Open();
        SqlDataAdapter ad = new SqlDataAdapter("select enyfile from upload where filekey like '" + '%' + key +'%' + "' ", con);
        DataSet dst = new DataSet();
        ad.Fill(dst);
        con.Close();
        return dst;
    }
    public DataSet listfiles()
    {
        SqlConnection cn = new SqlConnection(ConfigurationManager.AppSettings["connection"]);
        cn.Open();
        SqlDataAdapter ad1 = new SqlDataAdapter("select * from ownerfiles", cn);
        DataSet dst1 = new DataSet();
        ad1.Fill(dst1);
        cn.Close();
        return dst1;
    }
    public DataSet delete(string id)
    {
        con.Open();
        SqlDataAdapter data = new SqlDataAdapter("delete from ownerfiles where fileid='" + id + "'", con);
        DataSet det = new DataSet();
        data.Fill(det);
        con.Close();
        return det;
    }
    public DataSet editdistance(string txt)
    {
        con.Open();
        SqlDataAdapter ad = new SqlDataAdapter("select filenam from ownerfiles where filenam like '" + '%' + txt + '%' + "' ", con);
        DataSet dst = new DataSet();
        ad.Fill(dst);
        con.Close();
        return dst;
    }
    public DataSet ddl()
    {
        con.Open();
        SqlDataAdapter ad = new SqlDataAdapter("select distinct filenam from ownerfiles ", con);
        DataSet dset = new DataSet();
        ad.Fill(dset);
        con.Close();
        return dset;
    }
    public DataSet fillgridviwew(string fname)
    {
        con.Open();
        SqlDataAdapter ad1 = new SqlDataAdapter("select * from registration where filenam='"+fname+"'", con);
        DataSet set = new DataSet();
        ad1.Fill(set);
        con.Close();
        return set;
    }

    public DataSet filllist(string fname)
    {
        con.Open();
        SqlDataAdapter ad1 = new SqlDataAdapter("select usernam from registration where filenam='" + fname + "'", con);
        DataSet set1 = new DataSet();
        ad1.Fill(set1);
        con.Close();
        return set1;
    }

    public DataSet viewdetails(string uname)
    {
        con.Open();
        SqlDataAdapter ad1 = new SqlDataAdapter("select * from registration where usernam='" + uname + "'", con);
        DataSet set1 = new DataSet();
        ad1.Fill(set1);
        con.Close();
        return set1;
    }
    public DataSet listusers()
    {
        con.Open();
        SqlDataAdapter ad1 = new SqlDataAdapter("select usernam from registration", con);
        DataSet set1 = new DataSet();
        ad1.Fill(set1);
        con.Close();
        return set1;
    }
}


