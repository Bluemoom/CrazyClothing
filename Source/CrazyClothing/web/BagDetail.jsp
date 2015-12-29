<%-- 
    Document   : BagDetail
    Created on : Dec 28, 2015, 3:10:57 PM
    Author     : sunny
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Cloth"%>
<%@page import="java.util.TreeMap"%>
<%@page import="model.Card"%>
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
            Card card = (Card) session.getAttribute("card");
            if (card == null)
            {
                card = new Card();
                session.setAttribute("card", card);
            }
            TreeMap<Cloth,Integer> list = card.getList();
        %>
                
        <div class="container">               
	<div class="check">    
            <div class="col-md-3 cart-total">                            
			 <a class="continue" href="#">Continue to basket</a>
			 <div class="price-details">
				 <h3>Price Details</h3>
				 <span>Total</span>
				 <span class="total1"><%=%></span>
				 <span>Discount</span>
				 <span class="total1">---</span>
				 <span>Delivery Charges</span>
				 <span class="total1">150.00</span>
				 <div class="clearfix"></div>				 
			 </div>	
			 <ul class="total_price">
			   <li class="last_price"> <h4>TOTAL</h4></li>	
			   <li class="last_price"><span>6350.00</span></li>
			   <div class="clearfix"> </div>
			 </ul>
			
			 
			 <div class="clearfix"></div>
			 <a class="order" href="#">Place Order</a>
			 <div class="total-item">
				 <h3>OPTIONS</h3>
				 <h4>COUPONS</h4>
				 <a class="cpns" href="#">Apply Coupons</a>
				 <p><a href="#">Log In</a> to use accounts - linked coupons</p>
			 </div>                      
			</div>             
		 <div class="col-md-9 cart-items">
                     
			 <h1>My Shopping Bag </h1>
				<script>$(document).ready(function(c) {
					$('.close1').on('click', function(c){
						$('.cart-header').fadeOut('slow', function(c){
							$('.cart-header').remove();
						});
						});	  
					});
			   </script>
			 <div class="cart-header">
				 <div class="close1"> </div>
				 <div class="cart-sec simpleCart_shelfItem">   
                                        <%for (Map.Entry<Cloth, Integer> ds : list.entrySet()){%>  
						<div class="cart-item cyc">
                                                    <img src="<%=ds.getKey().getImage()%>" class="img-responsive" alt=""/>
						</div>
                                                <div class="cart-item-info">
						<h3><a href="#"><%=ds.getKey().getClothName()%></a><span>Mã sản phẩm: <%=ds.getKey().getClothID()%></span></h3>
						<ul class="qty">
							<li><p>Sale : <%=ds.getKey().getSale()%></p></li>
							<li><p>Quantity : <%=ds.getValue()%></p></li>
						</ul>
						
							 <div class="delivery">
							 <p>Phí dịch vụ : 0 VNĐ</p>		 
							 <div class="clearfix"></div>
                                                        </div>	
                                                </div>
					   <div class="clearfix"></div>   
                                           <%}%>       
				  </div>
			 </div>	
                                                
		 </div>		
			<div class="clearfix"> </div>   
                       
	 </div>
                                          
	 </div>
                                               
    </body>
</html>
