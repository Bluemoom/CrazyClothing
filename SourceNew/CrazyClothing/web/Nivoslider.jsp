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
                        <div id="slider" class="nivoSlider">
                            <img src="images/685_jean-bella-banner-doanh-nghiep.jpg" alt=""/>
                            <img src="images/20130910235524_banner_to.jpg" alt=""/>
                            <img src="images/685_banner-proguide" alt=""/>
                            <img src="images/4_banner.jpg" alt=""/>
                            <img src="images/Banner Thoi Trang.jpg" alt=""/>
                        </div>
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
