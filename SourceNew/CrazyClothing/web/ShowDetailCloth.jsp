<%-- 
    Document   : ShowDetailCloth
    Created on : Dec 29, 2015, 1:18:15 AM
    Author     : Mr_Dat
--%>
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
        <title> Cloth detail</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <script type='text/javascript' src="js/jquery-1.11.1.min.js"></script>      
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Gretong Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>
        <script>$(document).ready(function () {
                $(".megamenu").megamenu();
            });</script>
        <script src="js/menu_jquery.js"></script>       
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%@include file="Menu.jsp"%>
        <%
            ClothDao cl = new ClothDao();
            Cloth cloth = cl.ShowDetailCloth(request.getParameter("ClothID"));
            GroupClothDao grc = new GroupClothDao();
            GroupCloth gr = grc.GetGroupCloth(cloth.getGroupCloth().getGroupID());

            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);

        %>

        <div class="row single">
            <div class="col-md-9 det">
                <div class="single_left">
                    <div class="grid images_3_of_2">
                        <div class="flexslider">
                            <!-- FlexSlider -->
                            <script src="js/imagezoom.js"></script>
                            <script defer src="js/jquery.flexslider.js"></script>
                            <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

                            <script>
            // Can also be used with $(document).ready()
            $(window).load(function () {
                $('.flexslider').flexslider({
                    animation: "slide",
                    controlNav: "thumbnails"
                });
            });
                            </script>
                            <!-- //FlexSlider-->

                            <ul class="slides">
                                <li data-thumb="<%=cloth.getImage()%>">
                                    <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive"> </div>
                                </li>
                                <li data-thumb="<%=cloth.getImage()%>">
                                    <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive"> </div>
                                </li>
                                <li data-thumb="<%=cloth.getImage()%>">
                                    <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive"> </div>
                                </li>
                                <li data-thumb="<%=cloth.getImage()%>">
                                    <div class="thumb-image"> <img src="<%=cloth.getImage()%>" data-imagezoom="true" class="img-responsive"> </div>
                                </li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                    <div class="desc1 span_3_of_2">
                        <h3><%=cloth.getClothName()%></h3>
                        <span class="brand">NHÓM : <a href="ShowByGroup.jsp?groupID=<%=gr.getGroupID()%>"><%=gr.getGroupName()%></a></span>
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
<%@include file="footer.jsp"%>
</body>
</html>
