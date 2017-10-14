<%@ Page Language="C#" AutoEventWireup="true" CodeFile="cloudDBaaS.aspx.cs" Inherits="cloudDBaaS" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>cloud DBaaS</title>
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
          <li><a href="Home.aspx">HOME</a></li>
          <li><a href="clientlogin.aspx">CLIENT</a></li>
          <li class="active"><a href="cloudDBaaS.aspx">cloud DBaaS</a></li>
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
    <h2>View Cloud DBaaS</h2>
        <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" Font-Names="Calisto MT" Font-Size="Medium" 
                HorizontalAlign="Center" Width="656px" Height="151px" DataSourceID="SqlDataSource1">
            <Columns>
                <asp:BoundField DataField="ID" HeaderText="ID" SortExpression="ID" 
                    ItemStyle-Width="50px" ItemStyle-VerticalAlign="Top" >
<ItemStyle VerticalAlign="Top" Width="50px"></ItemStyle>
                </asp:BoundField>
                
                <asp:BoundField DataField="enyfile" HeaderText="File Name" 
                    SortExpression="enyfile" ItemStyle-Width="50px" 
                    ItemStyle-VerticalAlign="Top" >
<ItemStyle VerticalAlign="Top" Width="50px"></ItemStyle>
                </asp:BoundField>
                <asp:BoundField DataField="enfname" HeaderText="File" 
                    SortExpression="enfname" ItemStyle-Width="50px" 
                    ItemStyle-VerticalAlign="Top" >
<ItemStyle VerticalAlign="Top" Width="50px"></ItemStyle>
                </asp:BoundField>
                
                <asp:TemplateField HeaderText="Meta Data">
                      <ItemTemplate>
                          <asp:TextBox ID="TextBox1" runat="server" Text='<%# Eval("metadata") %>' ReadOnly="true"></asp:TextBox>
                         </ItemTemplate>
                          </asp:TemplateField>
            </Columns>
            <PagerStyle Font-Names="Calisto MT" Font-Size="Small" HorizontalAlign="Center" 
                    VerticalAlign="Top" />
                <HeaderStyle BackColor="#00BBEA" Font-Names="Calisto MT" Font-Size="Medium" />
                <EditRowStyle Font-Bold="True" Font-Size="Medium" />
                <AlternatingRowStyle BackColor="#D7F7FF" />
        </asp:GridView>
                            <asp:SqlDataSource ID="SqlDataSource1" runat="server" 
                                ConnectionString="<%$ ConnectionStrings:DistributedConnectionString3 %>" 
                                SelectCommand="SELECT [ID], [enyfile], [metadata], [enfname] FROM [upload]">
                            </asp:SqlDataSource>
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
