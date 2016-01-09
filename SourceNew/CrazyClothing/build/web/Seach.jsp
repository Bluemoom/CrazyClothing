<%-- 
    Document   : Seach
    Created on : Jan 9, 2016, 6:58:49 PM
    Author     : sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seach</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <div  class="registration_form">
            <form style="background-color: cornsilk;" id="registration_form" action="SeachController" method="post">	
                <input type="radio" name="seachPrice" Checked="" value="1"> Dưới 300.000 VNĐ | 
                <input type="radio" name="seachPrice" value="2"> 300.000 - 500.000 VNĐ |                
                <input type="radio" name="seachPrice" value="3"> 500.000 - 1.000.000 VNĐ |
                <input type="radio" name="seachPrice" value="4"> 1.000.000 - 2.000.000 VNĐ |
                <input type="radio" name="seachPrice" value="5"> Trên 2.000.000 VNĐ 
                <div>
                    <input type="hidden" name="url" value="<%=request.getRequestURI()%>"/>
                    <input type="hidden" name="groupIDD" value="<%=request.getParameter("groupID")%>"/>
                    <input type="submit"  value="TÌM KIẾM" id="register-submit">
                </div>
            </form>           	
        </div>
        <form class="Form" method="post" action ="">

        </form>
    </body>
</html>
