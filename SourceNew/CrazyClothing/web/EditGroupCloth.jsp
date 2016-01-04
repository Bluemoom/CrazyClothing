<%-- 
    Document   : EditGroupCloth
    Created on : Jan 4, 2016, 11:33:06 PM
    Author     : Mr_Dat
--%>

<%@page import="dao.GroupClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit GroupCloth</title>
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
            String groupID = request.getParameter("groupID");
            GroupCloth gr = grc.GetGroupCloth(groupID);           
        %>
        <%@include file="header.jsp"%>
        <%@include file="MenuForAdmin.jsp"%>       
            <p style="font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center">CẬP NHẬT NHÓM SẢN PHẨM</p>         
                 <div class="registration_form">                       
                          <form id="registration_form" action="EditGroupClothServlet" method="post">				
                                <div>
                                    <label>
                                        <input name="groupID" value="<%=gr.getGroupID()%>" type="hidden" tabindex="1">
                                    </label>                         
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="Tên nhóm..." name="groupName"  value="<%=gr.getGroupName()%>" type="text" tabindex="2" required>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="Hình ảnh..." name="image"  value="<%=gr.getImage()%>" type="text" tabindex="3" >
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="..."  value="<%=gr.getGroupTop()%>" name="groupTop" type="text" tabindex="4" >
                                    </label>
                                </div>				                                                            				                          
                                <div>
                                    <input type="submit" value="Cập nhật" id="register-submit">
                                </div>		
                            </form>                     
                 </div>  
        <%@include file="footer.jsp"%>  
    </body>
</html>
