<%@ Page Language="C#" AutoEventWireup="true" CodeFile="register.aspx.cs" Inherits="register" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Registration Form</title>
    <link href="App/style.css" rel="stylesheet" type="text/css" />
    <script src="App/js/cuf_run.js" type="text/javascript"></script>
    <script src="App/js/cufon-yui.js" type="text/javascript"></script>
    <script src="App/js/arial.js" type="text/javascript"></script>
</head>
<body>
<div class="main">

  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="register.aspx">Registratiuon</a></li>
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
          <center>
        
          <h2>Registration </h2>
         <table style="height: 369px"><tr><td>
          <asp:Image ID="Image1" runat="server" 
                 ImageUrl="~/App/images/Student-id-icon.png" Height="187px" 
                 Width="199px" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td>
          <table align="center" style="height: 326px" >
           
           <tr><td><asp:Label ID="Label2" runat="server" Text="User Name:" Font-Bold="True" 
                   Font-Size="Small"></asp:Label></td>
               <td><asp:TextBox ID="txt_name" runat="server" Width="168px" Height="24px"></asp:TextBox></td>
               <td><asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" CssClass="input_field"
                            ControlToValidate="txt_name" ErrorMessage="Enter your name"></asp:RequiredFieldValidator></td></tr>
    <tr><td><asp:Label ID="Label8" runat="server" Text="Password:" Font-Bold="True" 
            Font-Size="Small"></asp:Label></td>
        <td><asp:TextBox ID="txt_pwd" runat="server" TextMode="Password" 
                CssClass="input_field" Width="168px" Height="24px"></asp:TextBox></td>
        <td><asp:RegularExpressionValidator ID="RegularExpressionValidator4" runat="server" ControlToValidate="txt_pwd" ErrorMessage="Atleast 4 not more than 7 " 
                ValidationExpression="^([a-zA-Z0-9]{4,7})$"></asp:RegularExpressionValidator></td>
    </tr>
    <tr><td><asp:Label ID="Label4" runat="server" Text="Contact No :" Font-Bold="True" 
            Font-Size="Small"></asp:Label></td>
        <td><asp:TextBox ID="txt_num" runat="server" CssClass="input_field" Width="168px" Height="24px"></asp:TextBox></td>
        <td><asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ControlToValidate="txt_num" ErrorMessage="Enter valid mobile numbers " 
                            ValidationExpression="^\d{10}"></asp:RegularExpressionValidator></td>
    </tr>
    <tr><td><asp:Label ID="Label3" runat="server" Text="Email Id:" Font-Bold="True" 
            Font-Size="Small"></asp:Label></td>
        <td><asp:TextBox ID="txt_email" CssClass="input_field" runat="server" Width="168px" Height="24px"></asp:TextBox></td>
        <td><asp:RegularExpressionValidator ID="RegularExpressionValidator2" runat="server" ControlToValidate="txt_email"
                            ErrorMessage="Enter valid Email Id" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator></td>
    </tr>
    <tr><td><asp:Label ID="Label5" runat="server" Text="City:" Font-Bold="True" 
            Font-Size="Small"></asp:Label></td>
        <td><asp:TextBox ID="txt_city" CssClass="input_field" runat="server" Width="168px" Height="24px"></asp:TextBox></td>
        <td><asp:RegularExpressionValidator ID="RegularExpressionValidator3" runat="server" ControlToValidate="txt_city" ErrorMessage="Enter only characters" 
                            ValidationExpression="^[a-zA-z\s]*"></asp:RegularExpressionValidator></td>
    </tr>
    <tr><td>
        <asp:Label ID="Label9" runat="server" Visible="False"></asp:Label>
        </td>
    <td><asp:Button ID="btnregister" CssClass="submit_btn" runat="server" 
            Text="Register" onclick="btnregister_Click" Font-Bold="True" Height="32px" 
            Width="77px" />
          </td></tr>
      
      
      
        </table>
              </td></tr></table>
    
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
