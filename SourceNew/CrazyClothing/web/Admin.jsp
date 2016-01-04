<%-- 
    Document   : Admin
    Created on : Dec 31, 2015, 10:26:45 AM
    Author     : sunny
--%>

<%@page import="dao.GroupClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GroupCloth Management</title>
        <link href="css/AdminCSS/AdminCss.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%            
            GroupClothDao grc = new GroupClothDao();
            request.setAttribute("Admin", grc.showDanhMuc());
            String groupID = grc.sinhMa(grc.GetgroupID());
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        %>
        <%@include file="header.jsp"%>
        <%@include file="MenuForAdmin.jsp"%>       
            <p style="font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center">QUẢN LÝ NHÓM SẢN PHẨM</p>            
                 <div class="registration_form">
                            <!-- Form -->
                            <form id="registration_form" action="GroupClothServlet" method="post">				
                                <div>
                                    <label>
                                        <input name="groupID" placeholder="<%=groupID%>" type="text" tabindex="1">
                                    </label>                         
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="Tên nhóm..." name="groupName"  value="" type="text" tabindex="2" required>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="Hình ảnh..." name="image"  value="" type="text" tabindex="3" >
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="..."  value="" name="groupTop" type="text" tabindex="4" >
                                    </label>
                                </div>				                                                            				                          
                                <div>
                                    <input type="submit" value="Tạo mới" id="register-submit">
                                </div>		

                            </form>
                            <!-- /Form -->
                    </div>

            <div style="width: 800px; margin-left: auto;margin-right: auto;margin-bottom: 40px">
                <table style="padding: 10px">
                    <tr>
                        <th><p class="thgroupid" style="margin-left: 20px">GroupID</p></th>
                        <th><p class="thgroupid">Tên Nhóm</p></th>
                        <th><p class="thgroupid">Hình Ảnh</p></th>
                        <th><p class="thgroupid">GroupTop</p></th>
                        <th></th>
                    </tr>
                    <c:forEach items="${Admin}" var="p">
                        <tr>
                            <td><p style="text-align: right">${p.groupID}</p></td>
                            <td><p style="padding-left: 100px">${p.groupName}</p></td>
                            <td>${p.image}</td>
                            <td>${p.groupTop}</td>
                            <td>
                                <a style="margin-left: 20px;color: #3333ff" href="EditGroupCloth.jsp?groupID=${p.groupID}">Edit</a>
                                <a style="color: #3333ff" href="DeleteGroupClothServlet?command=delete&groupID=${p.groupID}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        <%@include file="footer.jsp"%>
    </body>
</html>
