<%-- 
    Document   : OrderDetailManagement
    Created on : Jan 9, 2016, 1:14:16 AM
    Author     : sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Detail</title>
        <link href="css/AdminCSS/AdminCss.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body> 
        <% 
            String orderID = request.getParameter("orderID");
            OrderDao orderDao = new OrderDao();
            CustomerDao customerDao = new CustomerDao();
            OrderDetailDao orderDetailDao = new OrderDetailDao();
            Customer customer1 = customerDao.findById(orderDao.getCustomerID(orderID));
            ClothDao clothDao = new ClothDao();   
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
           %>
        <%@include file="header.jsp"%>
        <%@include file="MenuForAdmin.jsp"%>
        <h3>MÃ HÓA ĐƠN: <%=orderID%></h3>
        <div class="orderDetail">
            <h5>THÔNG TIN KHÁCH HÀNG</h5>
            <span class="code">Tên khách hàng: <%=customer1.getCustomerName()%></span><br/>
            <span class="code">Email: <%=customer1.getEmail()%></span><br/>
            <span class="code">Địa chỉ: <%=customer1.getAddress()%></span><br/>
            <span class="code">Số điện thoại: <%=customer1.getPhoneNumber()%></span><br/>   
        </div>
        <div class="orderDetail">
            <h5>CHI TIẾT HÓA ĐƠN</h5>
            <table>
                <tr>
                <th><p class="thclothid">MÃ HÀNG</p></th>
                <th><p class="thclothid">TÊN HÀNG</p></th>
                <th><p class="thclothid">SỐ LƯỢNG</p></th>
                <th><p class="thclothid">GIÁ BÁN</p></th>
                <th><p class="thclothid">GIẢM GIÁ</p></th>
                <th><p class="thclothid">THÀNH TIỀN</p></th>
                </tr>  
                <%
                    for (OrderDetail od : orderDetailDao.showOrderDetail(orderID)) {
                %>
                <tr>
                    <td><p style="padding-left: 40px"><%=od.getClothID()%></p></td>
                    <td><p style="padding-left: 40px"><%=clothDao.findById(od.getClothID()).getClothName()%></p></td>
                    <td><p style="padding-left: 40px"><%=od.getQuantity()%></p></td>
                    <td><p style="padding-left: 40px"><%=nf.format(clothDao.findById(od.getClothID()).getPrice())%></p></td>
                    <td><p style="padding-left: 40px"><%=nf.format(clothDao.findById(od.getClothID()).getSale())%> %</p></td>                    
                    <td><p style="padding-left: 40px"><%=nf.format(od.getQuantity() * clothDao.findById(od.getClothID()).getPrice() - (od.getQuantity() *clothDao.findById(od.getClothID()).getPrice() * clothDao.findById(od.getClothID()).getSale() / 100))%> VNĐ</p></td>
                </tr>
                <%
                    }
                %>             
            </table>
            
        </div>
                        <div class="orderDetail">
                            <div class="price">
                            <span class="text">TỔNG TIỀN:</span>
                            <span class="price-new"><%=nf.format(orderDao.getTotalPrice(orderID))%> VNĐ</span>
                        </div>
                        </div>
        <div class="btn_form">
             <a href="OrderManagement.jsp">TRỞ VỀ</a>     <a href="PayController?action=duyet&orderID=<%=orderID%>">THANH TOÁN</a>
        </div>       
        <%@include file="footer.jsp"%>        
    </body>
</html>
