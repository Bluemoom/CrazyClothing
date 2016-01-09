<%-- 
    Document   : SearchByName
    Created on : Jan 9, 2016, 11:21:26 PM
    Author     : Mr_Dat
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SearchByName</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%
            ArrayList<Cloth> arr = (ArrayList<Cloth>) session.getAttribute("arr");
            if (arr == null)
            {
                arr = new ArrayList<Cloth>();
            }
            NumberFormat nf = NumberFormat.getInstance();
            nf.getMinimumIntegerDigits();
        %>
        <%@include file="header.jsp"%>
        <%@include file="Menu.jsp"%>
        <div class="special">
            <div class="container">
                <h4>SẢN PHẨM THEO TÊN</h4>
                <div class="specia-top">
                    <ul class="grid_2">                     
                        <%for (Cloth cloth : arr) {%>
                        <li>
                            <a href="ShowDetailCloth.jsp?ClothID=<%=cloth.getClothID()%>"><img src="<%=cloth.getImage()%>" class="img-responsive" alt=""></a>
                            <div class="special-info grid_1 simpleCart_shelfItem">
                                <h5><%=cloth.getClothName()%></h5>
                                <div class="item_add"><span class="item_price"><h6> <%=nf.format(cloth.getPrice())%> VNĐ</h6></span>
                                    <span class="code">Sales: <%=cloth.getSale()%> %</span>	
                                </div>
                                <div class="item_add"><span class="item_price"><a href="CartServlet?command=buy&clothID=<%=cloth.getClothID()%>">THÊM VÀO GIỎ</a></span></div>
                            </div>
                        </li>
                        <% }%>

                    </ul>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
