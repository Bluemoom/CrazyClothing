<%@page import="dao.ClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="css/megamenu_1.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="Nivoslider/nivo-slider.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script src="Nivoslider/jquery.nivo.slider.js" type="text/javascript"></script>
        <script src="Nivoslider/jquery.nivo.slider.pack.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
    </head>
    <body>        
        <%@include file="header.jsp"%>
        <%@include file="Menu.jsp"%>
        <div class="arriv">      
             <div id="beforeNAVMENU">            
                        <div id="slider" class="nivoSlider">
                            <img src="images/685_jean-bella-banner-doanh-nghiep.jpg" alt=""/>
                            <img src="images/20130910235524_banner_to.jpg" alt=""/>
                            <img src="images/685_banner-proguide" alt=""/>
                            <img src="images/4_banner.jpg" alt=""/>
                            <img src="images/Banner Thoi Trang.jpg" alt=""/>
                        </div>
         </div>             
        </div>           
        <%@include file="Seach.jsp" %>
        <div class="special">            
            <div class="container">
                <h4>SẢN PHẨM NỔI BẬT</h4>
                <div class="specia-top">
                    <ul class="grid_2">
                        <% ClothDao clothDao = new ClothDao();
                            HttpSession sesstion = request.getSession();
                            String querySeach = (session.getAttribute("querySeach") != null) ? (String) session.getAttribute("querySeach") : "";
                            String query = "select Top 8 * from Cloth where [status] = 1 " + querySeach+" order by clothID desc";
                        %>
                        <%for (Cloth cloth : clothDao.list(query)) {%>
                        <li>
                            <a href="ShowDetailCloth.jsp?ClothID=<%=cloth.getClothID()%>"><img src="<%=cloth.getImage()%>" class="img-responsive" alt=""></a>
                            <div class="special-info grid_1 simpleCart_shelfItem">
                                <h5><%=cloth.getClothName()%></h5>
                                <div class="item_add"><span class="item_price"><h6> <%=cloth.getPrice()%> VNĐ</h6></span>
                                    <span class="code">Sales: <%=cloth.getSale()%> %</span>	
                                </div>
                                <div class="item_add"><span class="item_price"><a href="CartServlet?command=buy&clothID=<%=cloth.getClothID()%>">THÊM VÀO GIỎ</a></span></div>
                            </div>
                        </li>
                        <% }
                            sesstion.removeAttribute("querySeach");
                        %>
                    </ul>
                    <div class="clearfix"> </div>
                </div>
            </div>
        <%@include file="footer.jsp"%>
        <script type="text/javascript">
        $(window).load(function() {
            $('#slider').nivoSlider({
                controlNav: false,
                nextText: '',
                prevText:'',
            });
        });
        </script>
    </body>
</html>
