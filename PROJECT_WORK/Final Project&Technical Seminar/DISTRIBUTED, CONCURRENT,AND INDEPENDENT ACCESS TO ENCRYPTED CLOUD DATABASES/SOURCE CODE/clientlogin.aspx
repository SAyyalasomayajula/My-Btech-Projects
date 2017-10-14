<%@ Page Language="C#" AutoEventWireup="true" CodeFile="clientlogin.aspx.cs" Inherits="clientlogin" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Client Login</title>
    <link href="App/style.css" rel="stylesheet" type="text/css" />
    <script src="App/js/cufon-yui.js" type="text/javascript"></script>
    <script src="App/js/cuf_run.js" type="text/javascript"></script>
    <script src="App/js/arial.js" type="text/javascript"></script>
    <style type="text/css">
        .style1
        {
            height: 32px;
        }
    </style>
</head>
<body>
   <div class="main">

  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="Home.aspx">HOME</a></li>
          <li class="active"><a href="clientlogin.aspx">Login</a></li>
        </ul>
        <div class="clr"></div>
      </div>
      <div class="clr"></div>
      <div class="logo"><h1>Distributed, Concurrent, and Independent Access to Encrypted Cloud Databases</h1></div>
    </div>
  </div>

  <div class="content">
      <br />
      <br />
      <br />
    <div class="content_resize">
      <div class="mainbar">
    <form id="form1" runat="server">
    <div>
         <center>
          
      
          <asp:Label ID="Label3" runat="server" Text="Client Login" Font-Bold="True" 
              Font-Names="Californian FB" Font-Size="XX-Large" ForeColor="#0099CC"></asp:Label>
              <br />
             <br />
              <table><tr><td><table align="center">
      <tr><td class="style1"></td><td class="style1">
          <asp:Label ID="Label1" runat="server" Text="User Name :" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label></td>
          <td class="style1">
              <asp:TextBox ID="TextBox1" runat="server" Height="28px" 
                  Width="196px"></asp:TextBox></td></tr>
              <tr><td></td><td></td><td></td></tr>
      <tr><td></td><td>
          <asp:Label ID="Label2" runat="server" Text="Password :" Font-Bold="True" 
              Font-Size="Large" Font-Names="Californian FB"></asp:Label></td><td>
              <asp:TextBox ID="TextBox2" runat="server" Height="29px" 
                  Width="195px" TextMode="Password"></asp:TextBox></td></tr>
              <tr><td></td><td></td><td></td></tr>
      <tr><td></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <asp:Button ID="Button1" runat="server" Text="Login" Font-Bold="False" Font-Size="Medium" Height="35px" 
              Width="75px" Font-Names="Californian FB" onclick="Button1_Click" />
                                                </td><td>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <asp:Button ID="Button2" runat="server" Text="Clear" Font-Bold="False" 
                  Font-Size="Medium" Height="35px" 
              Width="75px" Font-Names="Californian FB" onclick="Button2_Click" />
          </td></tr>
          <tr><td></td><td></td><td></td></tr>
           <tr><td></td><td></td><td></td></tr>
               <tr><td></td><td>
                   <asp:LinkButton ID="LinkButton1" runat="server" onclick="LinkButton1_Click" 
                       Font-Names="Arial Narrow" Font-Size="Medium">Click Here to Register</asp:LinkButton>
                   </td><td>
                       &nbsp;</td></tr></table></td></tr></table>
        
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
            <li><a href="#">Client</a></li>
            <li><a href="#">Cloud Database</a></li>
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
