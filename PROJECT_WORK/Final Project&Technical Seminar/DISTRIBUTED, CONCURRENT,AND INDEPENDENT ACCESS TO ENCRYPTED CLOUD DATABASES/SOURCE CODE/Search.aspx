<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Search.aspx.cs" Inherits="Search" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Search</title>
    <link href="App/style.css" rel="stylesheet" type="text/css" />
    <script src="App/js/cufon-yui.js" type="text/javascript"></script>
    <script src="App/js/cuf_run.js" type="text/javascript"></script>
    <script src="App/js/arial.js" type="text/javascript"></script>
</head>
<body>
<div class="main">

  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="Home.aspx">Home</a></li>
          <li><a href="datastorage.aspx">Data Storage</a></li>
          <li><a href="clientView.aspx">SecureDBaaS Client</a></li>
            <li class="active"><a href="Search.aspx">Data Search</a></li>
            <li><a href="Home.aspx">Logout</a></li>
        </ul>
        <div class="clr"></div>
      </div>
      <div class="clr"></div>
      <div class="logo"><h1>Distributed, Concurrent, and Independent Access to Encrypted Cloud Databases</h1></div>
    </div>
  </div>

  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
    <form id="form1" runat="server">
    <div>
   <h2>Search :</h2>
               <center> <table>
                <tr><td>
                    <asp:TextBox ID="txt_keyword" runat="server" Width="400px" Height="25px"></asp:TextBox></td><td>
                           <asp:Button ID="Button1" runat="server" Text="Search" BorderColor="#009999" CssClass="searchsubmit formbutton" 
                            onclick="Button1_Click" Height="29px" Width="72px" />
                          
                    </td></tr>
                            </table>
                            <br />
                            <br />
                            <br />
                            <br />
                   <br />
                   <br />
                   <br />
                   <br />
                   <br />
                   <br />
                        </center>
    </div>
    </form>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star">Menu</h2>
          <ul class="sb_menu">
            <li><a href="Home.aspx">Home</a></li>
            <li><a href="datastorage.aspx">Data Storage</a></li>
            <li><a href="Search.aspx">Data Search</a></li>
          </ul>
        </div>
        <div class="gadget">
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>

  <div class="footer">
  </div>
</div>
</body>
</html>
