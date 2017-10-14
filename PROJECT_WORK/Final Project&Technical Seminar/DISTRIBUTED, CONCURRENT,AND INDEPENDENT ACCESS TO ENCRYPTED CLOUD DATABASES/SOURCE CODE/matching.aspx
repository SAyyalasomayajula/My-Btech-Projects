<%@ Page Language="C#" AutoEventWireup="true" CodeFile="matching.aspx.cs" Inherits="matching" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Search Result</title>
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
       <h2>Search Result :</h2>
                 <table align="center" bgcolor="#F2F2F2" style="width: 649px" >
   
     <tr><td align="left"rowspan="7" valign="top">
        
         </td><td align="left">
             <asp:TextBox 
    ID="txt_keyword" runat="server" Width="371px" Height="25px"></asp:TextBox>
         </td></tr>
     <tr><td align="center" valign="top"><asp:Label ID="lbl_entxt" runat="server"></asp:Label><asp:Label ID="lbl_text" runat="server"></asp:Label></td></tr>
     <tr><td id="Td1" runat="server" align="left" valign="top" >
            <asp:Label ID="Label1" runat="server" Text="Did you mean:" Font-Bold="True" Font-Italic="True" Font-Names="Verdana" Font-Size="Large" 
                ForeColor="#6600FF" style="height: 16px" Width="184px" Height="35px"></asp:Label>
            <br />
            <br />
            </td></tr>
     <tr><td runat="server" align="left" valign="top" id="downloadfiles1" style="font-size:large; font-family:Verdana;"></td></tr>
     </table>
     <br />
     <br />
     <br />
     <br />
     <br />
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
