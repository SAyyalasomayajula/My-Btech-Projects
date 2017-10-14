<%@ Page Language="C#" AutoEventWireup="true" CodeFile="cloud.aspx.cs" Inherits="cloud" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Cloud Service</title>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script src="App/js/arial.js" type="text/javascript"></script>
    <link href="App/style.css" rel="stylesheet" type="text/css" />
    <script src="App/js/cufon-yui.js" type="text/javascript"></script>
    <script src="App/js/cuf_run.js" type="text/javascript"></script> 
</head>
<body>
<div class="main">

  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="Home.aspx">HOME</a></li>
          <li><a href="cloud.aspx">LOGIN</a></li>
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
        <center> <table><tr><td><table align="center" cellspacing="10" bgcolor="#CCCCCC">
      <tr><td></td><td>
          <asp:Label ID="Label3" runat="server" Text="Cloud Login" Font-Bold="True" 
              Font-Names="Californian FB" Font-Size="XX-Large" ForeColor="#0099CC"></asp:Label></td></tr>
               <tr><td></td><td></td><td></td><td></td></tr>
      <tr><td></td><td>
          <asp:Label ID="Label1" runat="server" Text="Cloud Name :" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label></td><td>
              <asp:TextBox ID="TextBox1" runat="server" Height="28px" 
                  Width="134px"></asp:TextBox></td><td> <asp:RequiredFieldValidator ID="RV1" runat="server" ControlToValidate="TextBox1" 
                             SetFocusOnError="True" ErrorMessage="*" Font-Size="X-Large"></asp:RequiredFieldValidator></td></tr>
              <tr><td></td><td></td><td></td><td></td></tr>
      <tr><td></td><td>
          <asp:Label ID="Label2" runat="server" Text="Password :" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label></td><td>
              <asp:TextBox ID="TextBox2" runat="server" Height="29px" 
                  Width="136px" TextMode="Password"></asp:TextBox></td><td> <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="TextBox2" 
                             SetFocusOnError="True" ErrorMessage="*" Font-Size="X-Large"></asp:RequiredFieldValidator></td></tr>
              <tr><td></td><td></td><td></td><td></td></tr>
      <tr><td></td><td></td><td>
          <asp:Button ID="Button1" runat="server" 
              Text="Login" Font-Bold="False" Font-Size="Medium" Height="35px" 
              Width="75px" Font-Names="Californian FB" onclick="Button1_Click" />
          </td><td></td></tr></table></td><td>
              <asp:Image ID="Image1" runat="server" ImageUrl="~/App/images/cloudrarch.png" 
                  Height="305px" /></td></tr></table>
        </center>
    </div>
    </form>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star">Menu</h2>
          <ul class="sb_menu">
            <li><a href="Home.aspx">Home</a></li>
            <li><a href="clientlogin.aspx">Client</a></li>
            <li><a href="cloud.aspx">cloud DBaaS</a></li>
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
