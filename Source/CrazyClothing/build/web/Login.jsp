<%-- 
    Document   : Login
    Created on : Dec 30, 2015, 10:05:06 PM
    Author     : sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%@include file="Menu.jsp"%>
        <% session.removeAttribute("customer");%>
        <h2>ĐĂNG NHẬP</h2>
        <div class="registration_form">
            <!-- Form -->
            <form id="registration_form" method="post" action="LoginController">
                <!--                <asp:Label ID="lbThongBao" runat="server" Text="Label"></asp:Label>-->
                <input type="hidden" name="action" value="login"/>
                <div>
                    <label>
                        <input type="text" name="username" placeholder="username" />
                    </label>
                </div>
                <div>
                    <label>
                        <input type="text" placeholder="password" name="password"/>
                    </label>
                </div>						
                <div>
                    <input type="submit" name="submit" value ="ĐĂNG NHẬP"/>
                </div>
                <h5><%=((String) session.getAttribute("error") != null) ? (String) session.getAttribute("error") : ""%></h5>
                <p><a href="Register.jsp">Đăng ký tài khoản - Click Here</a></p>
            </form>
        </div>

        <%@include file="footer.jsp"%>
    </body>
</html>
