<%--
    Document   : Menu
    Created on : Dec 28, 2015, 2:56:25 PM
    Author     : sunny
--%>

<%@page import="model.GroupCloth"%>
<%@page import="dao.GroupClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <% GroupClothDao grd = new GroupClothDao(); %>
        <ul class="megamenu skyblue">
            <li class="active grid"><a class="color1" href="index.jsp">Home</a></li>
            <li class="grid"><a class="color1" href="ShowAllCloth.jsp">TOÀN BỘ</a></li>
            <li class="grid"><a class="color1" href="ShowSaleCloth.jsp">SẢN PHẨM GIẢM GIÁ</a></li>       
                <%for (GroupCloth gr : grd.showDanhMuc()) {%>
            <li class="grid"><a class="color2" href="ShowByGroup.jsp?groupID=<%=gr.getGroupID()%>"><%=gr.getGroupName()%></a></li>
                <% }%>
        </ul> 
