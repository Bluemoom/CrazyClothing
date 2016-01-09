<%-- 
    Document   : Nivoslider
    Created on : Jan 9, 2016, 6:36:57 PM
    Author     : Mr_Dat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/megamenu_1.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="Nivoslider/nivo-slider.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script src="Nivoslider/jquery.nivo.slider.js" type="text/javascript"></script>
        <script src="Nivoslider/jquery.nivo.slider.pack.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
    </head>
    <body>
          <div class="arriv">      
             <div id="beforeNAVMENU">
            <table>
                <tr>
                    <td style="vertical-align:top" class="auto-style1">
                        <table style="width:250px">                                                    
                            <tr style="border-color: black; border-width: thin;height: 40px">
                                <td style="border-color: black; background-color: #e4e4e4; text-align:center; font-weight: bold;" class="auto-style4">
                                    KHOẢNG GIÁ</td>
                            </tr>
                            <tr style="height: 20px"></tr>
                             <tr>              
                                <td style="background-color: #e4e4e4;font-size:14px;text-align:left" class="auto-style8">                                                                            
                                    <div  class="registration_form">
                                        <form id="registration_form" action="SearchByPriceServlet" method="post">
                                            <input style="margin-bottom: 10px" type="radio" name="price" value="200000" />   Duoi 200,000<br>
                                            <input style="margin-bottom: 10px" type="radio" value="500000" name="price" />   200,000 => 500,000<br>
                                            <input style="margin-bottom: 10px" type="radio" value="1000000" name="price" />   500,000 => 1,000,000<br>
                                            <input style="margin-bottom: 10px" type="radio" value="2000000" name="price" />   1,000,000 => 2,000,000<br>
                                            <input style="margin-bottom: 10px" type="radio" value="2100000" name="price" />   Tren 2,000,000<br>
                                            <div>
                                                 <input style="float: right;margin-right: 10px" type="submit" value="Tìm kiếm" id="register-submit">
                                            </div>	
                                        </form>                                      
                                        <br />                                                                   
                                    </div>
                                </td>
                            </tr>                 
                         </table>
                    </td>
                    <td style="padding-left:40px;vertical-align:top">
                        <div id="slider" class="nivoSlider">
                            <img src="images/BACK VENT PENCIL SKIRT.jpg" alt=""/>
                            <img src="images/BASIC CARDIGAN.jpg" alt=""/>
                            <img src="images/BASIC SEAMS TOP.jpg" alt=""/>
                            <img src="images/BELT LONG CARDIGAN.jpg" alt=""/>
                            <img src="images/BELT PRINTED DRESS.jpg" alt=""/>
                        </div>
                    </td>
                </tr>
            </table>
         </div>             
        </div>     
        <script type="text/javascript">
        $(window).load(function() {
            $('#slider').nivoSlider({
                controlNav: false,
                nextText: '',
                prevText:'',
            });
        });
        </script>
    </body>
</html>
