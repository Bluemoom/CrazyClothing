<%-- 
    Document   : Employee
    Created on : Dec 31, 2015, 10:26:31 AM
    Author     : sunny
--%>

<%@page import="dao.CustomerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
    </head>
    <body>
        <% CustomerDao customerDao = new CustomerDao();
            Customer customer1 = (Customer) session.getAttribute("customerEdit");

        %>
        <%@include file="header.jsp"%>
        <%@include file="Menu.jsp"%>
        <p style="font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center">QUẢN LÝ TÀI KHOẢN</p>            
        <div class="registration_form">
            <!-- Form -->
            <form id="registration_form" action="CustomerController" method="post">				
                <div>
                    <label>
                        <input placeholder="Họ tên..." name="name"  value="<%=(customer1 != null) ? customer1.getCustomerName() : ""%>" type="text" tabindex="2" required>
                    </label>
                </div>
                <div>
                    <label>
                        <input placeholder="Email..." name="email"  value="<%=(customer1 != null) ? customer1.getEmail() : ""%>" type="text" tabindex="3" >
                    </label>
                </div>
                <div>
                    <label>
                        <input placeholder="Địa chỉ"  value="<%=(customer1 != null) ? customer1.getAddress() : ""%>" name="address" type="text" tabindex="4" >
                    </label>
                </div>	
                <div>
                    <label>
                        <input placeholder="Số điện thoại..."  value="<%=(customer1 != null) ? customer1.getPhoneNumber() : ""%>" name="phonenumber" type="text" tabindex="5" >
                    </label>
                </div>	
                <div>
                    <label>
                        <input placeholder="Tên đăng nhập..."  value="<%=(customer1 != null) ? customer1.getUsername() : ""%>" name="username" type="text" tabindex="6" >
                    </label>
                </div>	
                <div>
                    <label>
                        <input placeholder="Mật khẩu..."  value="<%=(customer1 != null) ? customer1.getPassword() : ""%>" name="password" type="password" tabindex="7" >
                    </label>
                </div>	
                <div>
                    <label>
                        <input placeholder="Nhập lại mật khẩu..."  value="<%=(customer1 != null) ? customer1.getPassword() : ""%>" name="repassword" type="password" tabindex="8" >
                    </label>
                </div>	
                <div>
                    <label>
                        Quyền:   <select tabindex="9" name="rule">
                            <option value="1">Nhân viên</option>
                            <option value="0">Khách hàng</option>
                        </select>
                    </label>
                </div>
                <div>
                    <label>
                        Trạng thái:   <select tabindex="10" name="status">
                            <option value="1">Hoạt động</option>
                            <option value="0">Khóa</option>
                        </select>
                    </label>                                    
                </div>
                <div>
                    <input type="submit" value="LƯU" name="action"  id="register-submit">
                </div>		

            </form>
            <!-- /Form -->
        </div>

        <table class ="Listt">
            <tr>
                <th style="width: 5%;"><p class="thgroupid" style="margin-left: 20px">ID</p></th>
        <th style="width: 20%; padding-left: 5px;"><p class="thgroupid">HỌ TÊN</p></th>
    <th style="width: 20%; padding-left: 5px;"><p class="thgroupid">EMAIL</p></th>
<th style="width: 20%; padding-left: 5px;"><p class="thgroupid">ĐỊA CHỈ</p></th>
<th style="width: 10%; padding-left: 5px;"><p class="thgroupid">SỐ ĐIỆN THOẠI</p></th>
<th><p class="thgroupid">TÊN ĐĂNG NHẬP</p></th>
<th><p class="thgroupid">MẬT KHẨU</p></th>
<th><p class="thgroupid">QUYỀN</p></th>
<th><p class="thgroupid">TRẠNG THÁI</p></th>
<th></th>
</tr>
<%
    for (Customer cus : customerDao.list()) {
%>
<tr>
    <td><p><%=cus.getCustomerID()%></p></td>
    <td><p><%=cus.getCustomerName()%></p></td>
    <td><p><%=cus.getEmail()%></p></td>
    <td><p><%=cus.getAddress()%></p></td>
    <td><p><%=cus.getPhoneNumber()%></p></td>
    <td><p><%=cus.getUsername()%></p></td>
    <td><p><%=cus.getPassword()%></p></td>
    <td><p><%=(cus.getRule() == 1) ? "Nhân viên" : "Khách hàng"%></p></td>
    <td><p><%=(cus.getStatus() == 1) ? "Hoạt động" : "Khóa"%></p></td>

    <td>
        <a style="margin-left: 20px;color: #3333ff" href="CustomerController?action=Sua&customerID=<%=cus.getCustomerID()%>">SỬA</a> | <a style="color: #3333ff" href="CustomerController?action=Khoa&customerID=<%=cus.getCustomerID()%>">KHÓA</a>
    </td>
</tr>
<%}%>
</table>
<%@include file="footer.jsp"%>
</body>
</html>
