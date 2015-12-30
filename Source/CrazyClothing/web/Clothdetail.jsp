<%-- 
    Document   : Clothdetail
    Created on : Dec 28, 2015, 3:04:46 PM
    Author     : sunny
--%>

<%@page import="model.Card"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="model.GroupCloth"%>
<%@page import="dao.GroupClothDao"%>
<%@page import="model.Cloth"%>
<%@page import="dao.ClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CrazyClothing</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />    
        <link href="css/flexslider.css" rel="stylesheet" type="text/css"/>
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />       
    </head>
    <body>      
        <% 
            ClothDao cl = new ClothDao();                      
            Cloth cloth = cl.ShowDetailCloth(request.getParameter("ClothID"));  
            GroupClothDao grc = new GroupClothDao();
            GroupCloth gr = grc.GetGroupCloth(cloth.getGroupCloth().getGroupID());
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
            
            Card card = (Card) session.getAttribute("card");
            if (card == null)
            {
                card = new Card();
                session.setAttribute("card", card);
            }
        %>
             
        <div class="container">
        <div class="women_main">
	<!-- start content -->
			<div class="row single">
				<div class="col-md-9 det">
				  <div class="single_left">
					<div class="grid images_3_of_2">
						<div class="flexslider">
							        <!-- FlexSlider -->
										<script src="js/imagezoom.js"></script>
										  <script defer="" src="js/jquery.flexslider.js"></script>
										<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen">

										<script>
										// Can also be used with $(document).ready()
										$(window).load(function() {
										  $('.flexslider').flexslider({
											animation: "slide",
											controlNav: "thumbnails"
										  });
										});
										</script>
									<!-- //FlexSlider-->

							  
							<div class="clearfix"></div>
						<div class="flex-viewport" style="overflow: hidden; position: relative;">
                                                    <ul class="slides" style="width: 1200%; transition-duration: 0.6s; transform: translate3d(-1152px, 0px, 0px);">
                                                        <li data-thumb="images/d4.jpg" class="clone" aria-hidden="true" style="width: 288px; float: left; display: block;">
                                                            <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive" draggable="false"> </div>
							</li>
								<li data-thumb="images/d1.jpg" class="" style="width: 288px; float: left; display: block;">
									<div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive" draggable="false"> </div>
								</li>
								<li data-thumb="images/d2.jpg" style="width: 288px; float: left; display: block;" class="">
									 <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive" draggable="false"> </div>
								</li>
								<li data-thumb="images/d3.jpg" style="width: 288px; float: left; display: block;" class="">
								   <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive" draggable="false"> </div>
								</li>
								<li data-thumb="images/d4.jpg" style="width: 288px; float: left; display: block;" class="flex-active-slide">
								   <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive" draggable="false"> </div>
								</li>
							  <li data-thumb="images/d1.jpg" class="clone" aria-hidden="true" style="width: 288px; float: left; display: block;">
									<div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive" draggable="false"> </div>
								</li></ul></div><ol class="flex-control-nav flex-control-thumbs"><li><img src="<%=cloth.getImage()%>" class="" draggable="false"></li><li><img src="<%=cloth.getImage()%>" draggable="false" class=""></li><li><img src="<%=cloth.getImage()%>" draggable="false" class=""></li><li><img src="<%=cloth.getImage()%>" draggable="false" class="flex-active"></li></ol><ul class="flex-direction-nav"><li class="flex-nav-prev"><a class="flex-prev" href="#">Previous</a></li><li class="flex-nav-next"><a class="flex-next" href="#">Next</a></li></ul></div>
					</div>
				  <div class="desc1 span_3_of_2">
					<h3><%=cloth.getClothName()%></h3>
                                        <span class="brand">NHÓM : <a href="ShowGroup.jsp?groupID=<%=gr.getGroupID()%>"><%=gr.getGroupName()%></a></span>
					<br>
                                        <span class="code">Mã sản phẩm: <%=cloth.getClothID()%></span>					
						<div class="price">
							<span class="text">Giá:</span>
                                                        <span class="price-new"><%=nf.format(cloth.getPrice())%> VNĐ</span>
						</div>
					<div class="det_nav1">
						<h4>SALE : <%=cloth.getSale()%> %</h4>
							<div class=" sky-form col col-4">
								<span class="code">Số lượng còn : <%=cloth.getQuantity()%> sản phẩm</span>	
							</div>
					</div>
					<div class="btn_form">
                                            <a href="CartServlet?command=buy&clothID=<%=cloth.getClothID()%>">MUA</a>
					</div>
					<a href="#"><span>đăng nhập để được giảm giá </span></a>
					
			   	 </div>
          	    <div class="clearfix"></div>
          	   </div>
          	    <div class="single-bottom1">
					<h6>Chi tiết sản phẩm</h6>
					<p class="prod-desc"><%=cloth.getDescription()%></p>
				</div>
	       </div>	
		   <div class="clearfix"></div>		
	  </div>
	<!-- end content -->
</div>
</div>      
    </body>
</html>
