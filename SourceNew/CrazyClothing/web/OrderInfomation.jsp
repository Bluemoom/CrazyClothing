<%-- 
    Document   : OrderInfomation
    Created on : Jan 2, 2016, 3:02:42 PM
    Author     : sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>finish order</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%@include file="Menu.jsp"%>
        <div class="registration_form">
            <h2>THÔNG TIN KHÁCH HÀNG</h2>
            <!-- Form -->
            <form id="registration_form"  method="post" action="LoginController">
                <input type="hidden" name="action" value="order"/>
                <div>
                    <label>
                        <input type="text" name="txtname" placeholder="Họ tên"/>
                    </label>
                </div>
                <div>
                    <label>
                        <input type="email" name="txtemail" placeholder="Email"/>
                    </label>
                </div>
                <div>
                    <label>
                        <input type="text" name="txtaddress" placeholder="Địa chỉ" required="" />
                    </label>
                </div>
                <div>
                    <label>
                        <input type="text" name="txtSoDienThoai" placeholder="Số điện thoại" required="" />
                    </label>
                </div>
                <input type="submit" name="submit" value ="HOÀN TẤT MUA HÀNG"/>
            </form>

        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
