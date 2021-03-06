<%-- 
    Document   : ShowGroup
    Created on : Dec 29, 2015, 12:08:20 AM
    Author     : Mr_Dat
--%>

<%@page import="dao.ClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShowByGroup</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%@include file="Menu.jsp"%>
        <%@include file="Seach.jsp"%>
        <div class="special">
            <div class="container">
                <h4>SẢN PHẨM THEO NHÓM</h4>
                <div class="specia-top">
                    <ul class="grid_2">
                        <% ClothDao clothDao = new ClothDao(); 
                        HttpSession sesstion = request.getSession();            
                        String querySeach = (session.getAttribute("querySeach")!=null)?(String)session.getAttribute("querySeach"):"";
                        String groupClothID = (request.getParameter("groupID")!=null)?request.getParameter("groupID"):(String) session.getAttribute("groupIDD");
                        String query = "select * from Cloth where groupClothID ="+groupClothID+ " "+querySeach;
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
                        <% } sesstion.removeAttribute("querySeach");                        %>

                    </ul>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
