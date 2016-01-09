<%-- 
    Document   : Seach
    Created on : Jan 9, 2016, 6:58:49 PM
    Author     : sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div  class="registration_form">
    <form style="background-color: cornsilk;" id="registration_form" action="SeachController" method="post">	
        <input type="radio" name="seachPrice" Checked="" value="1"> Dưới 300.000 VNĐ | 
        <input type="radio" name="seachPrice" value="2"> 300.000 - 500.000 VNĐ |                
        <input type="radio" name="seachPrice" value="3"> 500.000 - 1.000.000 VNĐ |
        <input type="radio" name="seachPrice" value="4"> 1.000.000 - 2.000.000 VNĐ |
        <input type="radio" name="seachPrice" value="5"> Trên 2.000.000 VNĐ 
        <div>
            <input type="hidden" name="url" value="<%=request.getRequestURI()%>"/>
            <input type="hidden" name="groupIDD" value="<%=(request.getParameter("groupID")!=null)?request.getParameter("groupID"):(String) session.getAttribute("groupIDD")%>"/>
            <input type="submit"  value="TÌM KIẾM" id="register-submit">
        </div>
    </form>           	
</div>
