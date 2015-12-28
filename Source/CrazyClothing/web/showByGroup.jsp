<%-- 
    Document   : showByGroup
    Created on : Dec 28, 2015, 11:54:04 PM
    Author     : Mr_Dat
--%>

<%@page import="model.GroupCloth"%>
<%@page import="model.Cloth"%>
<%@page import="dao.ClothDao"%>
<%@page import="dao.GroupClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
         <div class="special">
	<div class="container">
		<h4>SẢN PHẨM THEO NHÓM</h4>
		<div class="specia-top">
			<ul class="grid_2">
                            <% GroupClothDao clothDao = new GroupClothDao(); %>
                            <%for(Cloth cloth : clothDao.showClothByGroup(request.getParameter("groupID"))) {%>
		<li>
                    <a href="Clothdetail.jsp?ClothID=<%=cloth.getClothID()%>"><img src="<%=cloth.getImage() %>" class="img-responsive" alt=""></a>
				<div class="special-info grid_1 simpleCart_shelfItem">
					<h5><%=cloth.getClothName()%></h5>
					<div class="item_add"><span class="item_price"><h6><%=cloth.getPrice()%> VNĐ</h6></span></div>
					<div class="item_add"><span class="item_price"><a href="#">THÊM VÀO GIỎ</a></span></div>
				</div>
		</li>
                <% } %>
		<div class="clearfix"> </div>
	</ul>
		</div>
	</div>
</div>        
    </body>
</html>
