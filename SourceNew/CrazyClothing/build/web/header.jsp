<%-- 
    Document   : header
    Created on : Dec 28, 2015, 2:41:56 PM
    Author     : sunny
--%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CrazyClothing</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <% Customer customer = (Customer) session.getAttribute("customer");
         List<ClothBuy> cart1 = (ArrayList<ClothBuy>) session.getAttribute("cart");
            double tt = 0;
            if (session.getAttribute("totalPrice") != null) {
                tt = (Double) session.getAttribute("totalPrice");
            }
            
            NumberFormat nf1 = NumberFormat.getInstance();
            nf1.setMinimumIntegerDigits(0);
        %>
        <div class="top_bg">
            <div class="container">
                <div class="header_top">
                    <div class="top_right">
                        <ul>
                            <li><a href="#">TRỢ GIÚP</a></li>|
                            <li><a href="contact.html">LIÊN HỆ</a></li>|
                            <li><a href="#">THÔNG TIN</a></li>
                        </ul>
                    </div>
                    <div class="top_left">
                        <h2><span></span> GỌI NGAY : 01628282682</h2>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <!-- header -->
        <div class="header_bg">
            <div class="container">
                <div class="header">
                    <div class="head-t">
                        <div class="logo">
                            <a href="index.jsp"><img src="images/logo_1.png" class="img-responsive" alt=""/> </a>
                        </div>
                        <!-- start header_right -->
                        <div class="header_right">
                            <div class="rgt-bottom">
                                <div class="log">
                                    <div class="login" >
                                        <div id="loginContainer"><a href="<%=(customer != null) ? "ChangeCustomerInfo.jsp" : "Login.jsp"%>" id="loginButton"><span><%=(customer != null) ? customer.getCustomerName() : "ĐĂNG NHẬP"%></span></a>
                                            <div id="loginBox">                
                                                <form id="loginForm">
                                                    <fieldset id="body">
                                                        <fieldset>
                                                            <label for="email">Email Address</label>
                                                            <input type="text" name="email" id="email">
                                                        </fieldset>
                                                        <fieldset>
                                                            <label for="password">Password</label>
                                                            <input type="password" name="password" id="password">
                                                        </fieldset>
                                                        <input type="submit" id="login" value="Sign in">
                                                        <label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
                                                    </fieldset>
                                                    <span><a href="#">Forgot your password?</a></span>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="reg">
                                    <a href="<%=(customer != null) ? "Login.jsp" : "Register.jsp"%>"><%=(customer != null) ? "ĐĂNG XUẤT" : "ĐĂNG KÝ"%></a>
                                </div>
                                <div class="cart box_1">
                                    <a href="Bag.jsp">
                                        <h3> <span class="simpleCart_total">$ <%=nf1.format(tt)%> VNĐ</span> (<span id="simpleCart_quantity" class="simpleCart_quantity"><%=(cart1!=null)?cart1.size():0%></span>  sp)<img src="images/bag.png" alt=""></h3>
                                    </a>	
                                    <!--                                    <p><a href="javascript:;" class="simpleCart_empty">(empty card)</a></p>-->
                                    <div class="clearfix"> </div>
                                </div>
                                <div class="create_btn">
                                    <a href="Bag.jsp">GIỎ HÀNG</a>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                            <div class="search">
                                <form method="post" action="SearchByNameServlet">
                                    <input type="text" name="clothName" required placeholder="search...">
                                    <input type="submit" value="">
                                </form>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>

                    </body>
                    </html>
