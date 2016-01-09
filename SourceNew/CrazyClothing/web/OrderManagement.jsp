<%-- 
    Document   : OrderManagement
    Created on : Jan 8, 2016, 11:17:02 PM
    Author     : sunny
--%>

<%@page import="dao.OrderDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Management</title>
        <link href="css/AdminCSS/AdminCss.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <style>
            table[border="1"] {
                border-collapse:collapse;
                font:normal normal 11px Trebuchet,"Trebuchet MS",Arial,Sans-Serif;
                color:#3366CC;
            }

            table[border="1"] tr {
                background:#E1D4C1;
            }

            table[border="1"] th,
            table[border="1"] td {
                vertical-align:top;
                padding:5px 15px;
                border:1px solid #fff;
            }

            table[border="1"] td:nth-child(odd) {
                background:#F5EDE3;
            }

            table[border="1"] th {
                background:#104386;
                color:#F89605;
                font-weight:bold;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%@include file="MenuForAdmin.jsp"%>
        <%            OrderDao odd = new OrderDao();
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        %>
        <p style="font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center">QUẢN LÝ ĐƠN ĐẶT HÀNG</p>          
        <div style ="border: 1px solid #00677C; padding: 20px; border-radius:5px;">
        <table>
                <tr>
                <th><p>MÃ HÓA ĐƠN</p></th>
                <th><p class="thclothid">MÃ KHÁCH HÀNG</p></th>
                <th><p class="thclothid">THỜI GIAN MUA</p></th>
                <th><p class="thclothid">TỔNG TIỀN</p></th>
                <th><p class="thclothid">TRẠNG THÁI</p></th>
                <th><p class="thclothid">TÙY CHỌN</p></th>
                </tr>  
                <%
                    for (Order cl : odd.list()) {
                %>
                <tr>
                    <td><p><%=cl.getOrderID()%></p></td>
                    <td><p style="padding-left: 40px"><%=cl.getCustomerID()%></p></td>
                    <td><p style="padding-left: 40px"><%=cl.getTime()%></p></td>
                    <td><p style="padding-left: 40px"><%=nf.format(cl.getTotalMoney())%></p></td>
                    <td><p style="padding-left: 40px"><%=(cl.getStatus() == 1) ? "Chưa thanh toán" : ""%></p></td>
                    <td>
                        
                        <a style="margin-left: 20px;color: #3300ff" href="OrderDetailManagement.jsp?orderID=<%=cl.getOrderID()%>">XEM CHI TIẾT</a>
                    </td>
                </tr>
                <%
                    }
                %>             
            </table>
            </div>
            <%@include file="footer.jsp"%>
    </body>
</html>
