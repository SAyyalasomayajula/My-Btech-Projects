<%@ Page Language="C#" AutoEventWireup="true" CodeFile="clientView.aspx.cs" Inherits="clientView" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Client View</title>
    <link href="App/style.css" rel="stylesheet" type="text/css" />
    <script src="App/js/cufon-yui.js" type="text/javascript"></script>
    <script src="App/js/arial.js" type="text/javascript"></script>
    <script src="App/js/cuf_run.js" type="text/javascript"></script>    
</head>
<body>
    <div class="main">

  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
           <li><a href="Home.aspx">Home</a></li>
          <li><a href="datastorage.aspx">Data Storage</a></li>
          <li class="active"><a href="clientView.aspx">SecureDBaaS Client</a></li>
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
    <form id="form1" runat="server">
    <div>
    <h2>SecureDBaaS client : <asp:Label ID="Label1" runat="server"></asp:Label></h2>
        <center>
        
            <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" onrowcommand="GridView1_RowCommand" Font-Names="Calisto MT" Font-Size="Medium" 
                HorizontalAlign="Center" Width="556px">
                <Columns>
                    <asp:BoundField DataField="ID" HeaderText="File Id" SortExpression="ID" />
                    <asp:BoundField DataField="filekey" HeaderText="Keyword" 
                        SortExpression="filekey" />
                    <asp:BoundField DataField="filename" HeaderText="File Name" 
                        SortExpression="filename" />
                    <asp:BoundField DataField="filetype" HeaderText="File Extension" 
                        SortExpression="filetype" />
                    <asp:BoundField DataField="filesize" HeaderText="File Size" 
                        SortExpression="filesize" />
                         <asp:TemplateField HeaderText="MetaData">
                       <ItemTemplate>
                           <asp:LinkButton ID="LinkButton1" runat="server" CommandName="View" CommandArgument="<%# ((GridViewRow) Container).RowIndex %>">View</asp:LinkButton>
                          </ItemTemplate>
                          </asp:TemplateField>
                      <asp:TemplateField HeaderText="File">
                      <ItemTemplate>
                          <asp:LinkButton ID="LinkButton2" runat="server" CommandName="Download" CommandArgument="<%# ((GridViewRow) Container).RowIndex %>">Download</asp:LinkButton>
                          </ItemTemplate>
                          </asp:TemplateField>
                </Columns>
                <PagerStyle Font-Names="Calisto MT" Font-Size="Small" HorizontalAlign="Center" 
                    VerticalAlign="Top" />
                <HeaderStyle BackColor="#00BBEA" Font-Names="Calisto MT" Font-Size="Medium" />
                <EditRowStyle Font-Bold="True" Font-Size="Medium" />
                <AlternatingRowStyle BackColor="#D7F7FF" />
            </asp:GridView>
            
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
