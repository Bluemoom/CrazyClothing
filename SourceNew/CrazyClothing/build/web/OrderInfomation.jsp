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
        <title>JSP Page</title>
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
                        <input type="text" name="txtname" placeholder="Họ tên" required="" />
                    </label>
                </div>
                <div>
                    <label>
                        <input type="email" name="txtemail" placeholder="Email" required="" />
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

                <input type="submit" value="HOÀN TẤT MUA HÀNG"  id="register-submit">
            </form>

        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
