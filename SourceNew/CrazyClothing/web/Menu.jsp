<%--
    Document   : Menu
    Created on : Dec 28, 2015, 2:56:25 PM
    Author     : sunny
--%>

<%@page import="model.GroupCloth"%>
<%@page import="dao.GroupClothDao"%>
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
        <% GroupClothDao grd = new GroupClothDao(); %>
        <ul class="megamenu skyblue">
            <li class="active grid"><a class="color1" href="index.jsp">Home</a></li>
            <li class="grid"><a class="color1" href="ShowAllCloth.jsp">TOÀN BỘ</a></li>
            <li class="grid"><a class="color1" href="ShowSaleCloth.jsp">SẢN PHẨM GIẢM GIÁ</a></li>       
                <%for (GroupCloth gr : grd.showDanhMuc()) {%>
            <li class="grid"><a class="color2" href="ShowByGroup.jsp?groupID=<%=gr.getGroupID()%>"><%=gr.getGroupName()%></a></li>
                <% }%>
        </ul> 
    </body>
</html>
