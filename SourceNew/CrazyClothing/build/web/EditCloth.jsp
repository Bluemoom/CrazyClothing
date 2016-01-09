<%-- 
    Document   : EditCloth
    Created on : Jan 8, 2016, 4:28:16 PM
    Author     : Mr_Dat
--%>

<%@page import="dao.ClothDao"%>
<%@page import="dao.GroupClothDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cloth Edit</title>
        <link href="css/AdminCSS/AdminCss.css" rel="stylesheet" type="text/css"/>
         <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%            
            String clothID = request.getParameter("clothID");
            GroupClothDao grc = new GroupClothDao();
            ClothDao cld = new ClothDao();         
            Cloth cl = cld.findById(clothID);                            
        %>
        <%@include file="header.jsp"%>
        <%@include file="MenuForAdmin.jsp"%>       
            <p style="font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center">CẬP NHẬT SẢN PHẨM</p>          
                 <div class="registration_form">
                            <!-- Form -->
                            <form id="registration_form" action="EditClothServlet" method="post">				
                                <div>
                                    <label>
                                        <input name="clothID" value="<%=cl.getClothID()%>" type="hidden" tabindex="1">
                                    </label>                         
                                </div>
                                <div>
                                    <label>
                                      Nhóm sản phẩm: <select tabindex="2" name="groupCloth" required>
                                                        <%for (GroupCloth gr : grc.showDanhMuc()) {%>
                                                        <option ><%=gr.getGroupID()%></option>                                                 
                                                        <% }%>
                                                     </select>                                                   
                                    </label>
                                </div>
                                <div>
                                    <label>
                                       Tên sản phẩm: <input name="clothName" required value="<%=cl.getClothName()%>" type="text" tabindex="3">
                                    </label>                         
                                </div>
                                        <div>
                                    <label>
                                        Hình ảnh:   <input name="image" type="file" tabindex="4" required>
                                    </label>                                  
                                </div>
                                <div>
                                    <label>
                                        Số lượng: <input placeholder="Số lượng..." required value="<%=cl.getQuantity()%>" name="quantity" type="text" tabindex="5" >
                                    </label>
                                </div>	
                                <div>
                                    <label>
                                        Chi tiết: <input placeholder="Mô tả..."  name="description" type="text" tabindex="6" >
                                    </label>
                                </div>	
                                <div>
                                    <label>
                                        Giá bán: <input placeholder="Giá bán..." required value="<%=cl.getPrice()%>" name="price" type="text" tabindex="7" >
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        Giảm giá: <input placeholder="Giảm giá..." required value="<%=cl.getSale()%>" name="sale" type="text" tabindex="8" >
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        Trạng thái:   <select tabindex="9" name="status" required>
                                                        <option>1</option>
                                                        <option>0</option>
                                                      </select>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        Mới:   <select tabindex="10" name="neww" required>
                                                    <option>1</option>
                                                    <option>0</option>
                                                </select>
                                    </label>                                    
                                </div>
                                <div>
                                    <input type="submit" value="Cập nhật" id="register-submit">
                                </div>		

                            </form>
                            <!-- /Form -->
                    </div>                    
        <%@include file="footer.jsp"%>
    </body>
</html>
