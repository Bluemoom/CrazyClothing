<%-- 
    Document   : ClothManagement
    Created on : Jan 7, 2016, 4:55:21 PM
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
        <title>Cloth Management</title>
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
            ClothDao cld = new ClothDao();         
            String clothID = cld.sinhMa(cld.GetClothID());               
            ArrayList<Cloth> arr = cld.showCloth();
            int start =0, end =9;
            if (arr.size() < 9)
            {
                end = arr.size();
            }
            if (request.getParameter("start")!= null)
            {
                start = Integer.parseInt(request.getParameter("start"));
            }
            if (request.getParameter("end")!= null)
            {
                end = Integer.parseInt(request.getParameter("end"));
            }
            ArrayList<Cloth> list = cld.getListByPage(arr, start, end);                               
        %>
        <%@include file="header.jsp"%>
        <%@include file="MenuForAdmin.jsp"%>       
            <p style="font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center">QUẢN LÝ SẢN PHẨM</p>          
                 <div class="registration_form">
                            <!-- Form -->
                            <form id="registration_form" action="ClothServlet" method="post">				
                                <div>
                                    <label>
                                        <input name="clothID" placeholder="<%=clothID%>..." type="text" tabindex="1">
                                    </label>                         
                                </div>
                                <div>
                                    <label>
                                      Nhóm sản phẩm: <select tabindex="2" name="groupCloth">
                                                        <%for (GroupCloth gr : grc.showDanhMuc()) {%>
                                                        <option ><%=gr.getGroupID()%></option>                                                 
                                                        <% }%>
                                                     </select>                                                   
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input name="clothName" placeholder="Tên sản phẩm" type="text" tabindex="3">
                                    </label>                         
                                </div>
                                        <div>
                                    <label>
                                        Hình ảnh:   <input name="image" type="file" tabindex="4">
                                    </label>                                  
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="Số lượng..."  value="" name="quantity" type="text" tabindex="5" >
                                    </label>
                                </div>	
                                <div>
                                    <label>
                                        <input placeholder="Mô tả..."  value="" name="description" type="text" tabindex="6" >
                                    </label>
                                </div>	
                                <div>
                                    <label>
                                        <input placeholder="Giá bán..."  value="" name="price" type="text" tabindex="7" >
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="Giảm giá..."  value="" name="sale" type="text" tabindex="8" >
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        Trạng thái:   <select tabindex="9" name="status">
                                                        <option>1</option>
                                                        <option>0</option>
                                                      </select>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        Mới:   <select tabindex="10" name="neww">
                                                    <option>1</option>
                                                    <option>0</option>
                                                </select>
                                    </label>                                    
                                </div>
                                <div>
                                    <input type="submit" value="Tạo mới" id="register-submit">
                                </div>		

                            </form>
                            <!-- /Form -->
                    </div>
         
            <div style=" margin-left: auto;margin-right: auto;margin-bottom: 40px;margin-top: 40px">
                <table style="padding: 10px">
                    <tr>
                        <th><p>Mã sản phẩm</p></th>
                        <th><p class="thclothid">Nhóm sản phẩm</p></th>
                        <th><p class="thclothid">Tên sản phẩm</p></th>
                        <th><p class="thclothid">Hình ảnh</p></th>
                        <th><p class="thclothid">Số lượng</p></th>
                        <th><p class="thclothid">Mô tả</p></th>
                        <th><p class="thclothid">Giá bán</p></th>   
                        <th><p class="thclothid">Giảm giá</p></th>
                        <th><p class="thclothid">Trạng thái</p></th>
                        <th><p class="thclothid">Mới</p></th>
                        <th></th>
                    </tr>  
                   <%
                        for (Cloth cl : list) {                                
                   %>
                        <tr>
                            <td><p><%=cl.getClothID().substring(0,6)%>...</p></td>
                            <td><p style="padding-left: 40px"><%=cl.getGroupCloth().groupID.substring(0,6)%>...</p></td>
                            <td><p style="padding-left: 40px"><%=cl.getClothName().substring(0,6)%>...</p></td>
                            <td><p style="padding-left: 40px"><%=cl.getImage().substring(0,6)%>...</p></td>
                            <td><p style="padding-left: 40px"><%=cl.getQuantity()%></p></td>
                            <td><p style="padding-left: 40px"><%=cl.getDescription()%>...</p></td>
                            <td><p style="padding-left: 40px"><%=cl.getPrice()%></p></td>
                            <td><p style="padding-left: 40px"><%=cl.getSale()%></p></td>
                            <td><p style="padding-left: 40px"><%=cl.getSatus()%></p></td>
                            <td><p style="padding-left: 40px"><%=cl.getNeww()%></p></td>      
                            <td>
                                <a style="margin-left: 20px;color: #3300ff" href="EditCloth.jsp?clothID=<%=cl.getClothID()%>">Edit</a>
                                <a style="margin-left: 20px;color: #3300ff" href="DeleteClothServlet?clothID=<%=cl.getClothID()%>">Delete</a>
                            </td>
                        </tr>
                   <%
                        }
                   %>             
                </table>
            </div>
                   <ul class="pagination">
                       <%
                            int a, b;
                            int limit = arr.size() / 9;
                            if (limit * 9 < arr.size()) {
                            limit += 1;
                            }
                        for (int i = 1; i <= limit; i++) 
                        {
                            a = (i - 1) * 9;
                            b = i * 9;                       
                          if (b > arr.size()) 
                          {
                             b = arr.size();
                          }
                        %>
                        <li class="active"><a href="ClothManagement.jsp?start=<%=a%>&end=<%=b%>"><%=i %></a></li>
                        <%
                            }
                        %>                     
                   </ul>
        <%@include file="footer.jsp"%>
    </body>
</html>
