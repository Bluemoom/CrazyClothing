<%-- 
    Document   : BagDetail
    Created on : Dec 28, 2015, 3:10:57 PM
    Author     : sunny
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.ClothBuy"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="model.Cloth"%>
<%@page import="java.util.TreeMap"%>
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
        <%
            List<ClothBuy> cart = (ArrayList<ClothBuy>) session.getAttribute("cart");
            if (cart == null) {
                cart = new ArrayList<ClothBuy>();
            }
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
            
        %> 

        <div class="container">               
            <div class="check">    
                <div class="col-md-3 cart-total">                            
                    <a class="continue" href="index.jsp">Tiếp tục mua hàng</a>
                    <div class="price-details">
                        <h3>Chi tiết đơn hàng</h3>
                        <span>Tổng tiền</span>
                        <span class="total1"> <%=nf.format((Double)session.getAttribute("totalPrice"))  %> VNĐ </span>
                        <span>Phí vận chuyển:</span>
                        <span class="total1">0 VNĐ</span>
                        <div class="clearfix"></div>				 
                    </div>	
                    <ul class="total_price">
                        <li class="last_price"> <h4>TỔNG TRẢ</h4></li>	
                        <li class="last_price"><span><%=nf.format((Double)session.getAttribute("totalPrice"))  %> VNĐ</span></li>
                        <div class="clearfix"> </div>
                    </ul>
                    <div class="btn_form">
                        <a href="OrderInfomation.jsp">THANH TOÁN</a>
                    </div>

                    <div class="clearfix"></div>
                    <!--			 <a class="order" href="#">Place Order</a>-->
                    <div class="total-item">
                        <!--				 <h3>OPTIONS</h3>
                                                         <h4>COUPONS</h4>
                                                         <a class="cpns" href="#">Apply Coupons</a>
                                                         <p><a href="#">Log In</a> to use accounts - linked coupons</p>-->
                    </div>                      
                </div>             
                <div class="col-md-9 cart-items">

                    <h1>GIỎ HÀNG : <%=cart.size()%> </h1>

                    <div class="cart-header">
                        <div class="close1"> </div>
                        <div class="cart-sec simpleCart_shelfItem">   
                            <%for (ClothBuy cb : cart) {%>  
                            <div class="cart-item cyc">
                                <img src="<%=cb.getCloth().getImage()%>" class="img-responsive" alt=""/>
                            </div>
                            <div class="cart-item-info">
                                <h3><a href="#"></a><span>Mã sản phẩm: <%=cb.getCloth().getClothID()%></span></h3>
                                <h3><span>Tên sản phẩm: <%=cb.getCloth().getClothName()%></span></h3>
                                <ul class="qty">
                                    <li><p>Số lượng mua : <%=cb.getQuantityBuy()%></p></li>							
                                </ul>
                                <ul class="qty">
                                    <li><p>Giá bán : <%=nf.format(cb.getCloth().getPrice())%> VNĐ</p></li>							
                                </ul>
                                <ul class="qty">
                                    <li><p>Giảm giá : <%=cb.getCloth().getSale()%> %</p></li>							
                                </ul>						
                                <div class="price">
                                    <span class="text">Tổng tiền:</span>
                                    <span class="price-new"><%=nf.format(cb.getQuantityBuy() * cb.getCloth().getPrice() - (cb.getQuantityBuy() * cb.getCloth().getPrice() * cb.getCloth().getSale() / 100))%> VNĐ</span>
                                </div>
                            </div>
                            <div class="clearfix"></div>   
                            <% }%>       
                        </div>
                    </div>	

                </div>		
                <div class="clearfix"> </div>   

            </div>

        </div>

    </body>
</html>
