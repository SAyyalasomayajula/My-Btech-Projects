<%@ Page Language="C#" AutoEventWireup="true" CodeFile="datastorage.aspx.cs" Inherits="datastorage" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Data Storage</title>
    <link href="App/style.css" rel="stylesheet" type="text/css" />
    <script src="App/js/cufon-yui.js" type="text/javascript"></script>
    <script src="App/js/cuf_run.js" type="text/javascript"></script>
    <script src="App/js/arial.js" type="text/javascript"></script>
    <style type="text/css">
        .style1
        {
            height: 51px;
        }
    </style>
</head>
<body>
    <div class="main">

    <form id="form1" runat="server">

  <div class="header">
    <div class="header_resize">
        <asp:Label ID="Label5" runat="server" Text="Label"></asp:Label>
      <div class="menu_nav">
        <ul>
          <li><a href="Home.aspx">Home</a></li>
          <li class="active"><a href="datastorage.aspx">Data Storage</a></li>
          <li><a href="clientView.aspx">SecureDBaaS Client</a></li>
            <li><a href="Search.aspx">Data Search</a></li>
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
    <div>
        <table align="center" cellspacing="10">
               <tr><td></td><td>
                   <asp:Label ID="Label3" runat="server" Text="File Id :" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label>
                   </td><td>
                       <asp:Label ID="Label4" runat="server" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label>
                   </td></tr>
                   <tr><td></td><td></td><td></td></tr>
      <tr><td></td><td>
          <asp:Label ID="Label1" runat="server" Text="File Keyword :" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label></td><td>
              <asp:TextBox ID="TextBox1" runat="server" Height="28px" 
                  Width="134px"></asp:TextBox></td></tr>
              <tr><td></td><td></td><td></td></tr>
      <tr><td></td><td>
          <asp:Label ID="Label2" runat="server" Text="Select File :" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label></td><td>
              <asp:FileUpload ID="FileUpload1" runat="server" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB" />
          </td></tr>
              <tr><td></td><td></td><td>
                  <asp:TextBox ID="TextBox2" runat="server" TextMode="MultiLine" Visible="False" ></asp:TextBox>
                  </td></tr>
      <tr><td class="style1"></td><td class="style1"></td><td class="style1">
          <asp:Button ID="Button1" runat="server" Text="Upload" Font-Bold="True" 
              Font-Size="Medium" Height="35px" 
              Width="75px" Font-Names="Californian FB" onclick="Button1_Click" />
              
          <asp:Label ID="Label6" runat="server" Visible="False"></asp:Label>
              
          </td></tr></table>
          <br />
          <br />
          <br />
    </div>
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

    </form>

  <div class="footer">
  </div>
</div>
</body>
</html>
