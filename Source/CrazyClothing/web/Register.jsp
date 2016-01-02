<%-- 
    Document   : Register
    Created on : Dec 28, 2015, 3:15:03 PM
    Author     : sunny
--%>

<%@page import="dao.CustomerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <%         
            String username_err = ""; String retypepassword_err = "";           
            if (request.getAttribute("username_err") != null)
            {
                username_err = (String) request.getAttribute("username_err");
            }         
            if (request.getAttribute("retypepassword_err") != null)
            {
                retypepassword_err = (String) request.getAttribute("retypepassword_err");
            }
            String username = ""; String name = "";String password = ""; String phone = ""; String email ="";
             if (request.getAttribute("username") != null)
            {
                username = (String) request.getAttribute("username");
            }
             if (request.getAttribute("name") != null)
            {
                name = (String) request.getAttribute("name");
            }
            if (request.getAttribute("phone") != null)
            {
                phone = (String) request.getAttribute("phone");
            } 
             if (request.getAttribute("email") != null)
            {
                email = (String) request.getAttribute("email");
            }          
        %>
        <div class="container">
            <div class="main">
                <div class="registration">
                    <div class="registration_left">
                        <h2>new user? <span> create an account </span></h2>
                        <!-- [if IE] 
                            < link rel='stylesheet' type='text/css' href='ie.css'/>  
                         [endif] -->  

                        <!-- [if lt IE 7]>  
                            < link rel='stylesheet' type='text/css' href='ie6.css'/>  
                        <! [endif] -->  
                        <script>
                            (function () {

                                // Create input element for testing
                                var inputs = document.createElement('input');

                                // Create the supports object
                                var supports = {};

                                supports.autofocus = 'autofocus' in inputs;
                                supports.required = 'required' in inputs;
                                supports.placeholder = 'placeholder' in inputs;

                                // Fallback for autofocus attribute
                                if (!supports.autofocus) {

                                }

                                // Fallback for required attribute
                                if (!supports.required) {

                                }

                                // Fallback for placeholder attribute
                                if (!supports.placeholder) {

                                }

                                // Change text inside send button on submit
                                var send = document.getElementById('register-submit');
                                if (send) {
                                    send.onclick = function () {
                                        this.innerHTML = '...Sending';
                                    }
                                }

                            })();
                        </script>
                        <div class="registration_form">
                            <!-- Form -->
                            <form id="registration_form" action="RegisterServlet" method="post">				
                                <div>
                                    <label>
                                        <input placeholder="Name:" name="name" value="<%=name%>" type="text" tabindex="1" autofocus required>
                                    </label>                         
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="email address:" name="email"  value="<%=email%>" type="email" tabindex="2" required>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="Phone number:"  value="<%=phone%>" name="phone" type="text" tabindex="3" required>
                                    </label>
                                </div>				
                                <div>
                                    <label>
                                        <input placeholder="username"  value="<%=username%>" name="username" type="text" tabindex="4" required>
                                    </label>   
                                    <p style="color: red"><%=username_err%></p>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="password" name="password" type="password" tabindex="5" required>
                                    </label>
                                </div>						
                                <div>
                                    <label>
                                        <input placeholder="retype password" name="retypepassword" type="password" tabindex="6" required>
                                    </label>
                                    <p style="color: red"><%=retypepassword_err%></p>
                                </div>	
                                <div>
                                    <input type="submit" value="create an account" id="register-submit">
                                </div>	

                            </form>
                            <!-- /Form -->
                        </div>
                    </div>
                    <div class="registration_left">
                        <h2>existing user</h2>
                        <div class="registration_form">
                            <!-- Form -->
                            <form id="registration_form" action="contact.php" method="post">
                                <div>
                                    <label>
                                        <input placeholder="email:" type="email" tabindex="3" required>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input placeholder="password" type="password" tabindex="4" required>
                                    </label>
                                </div>						
                                <div>
                                    <input type="submit" value="sign in" id="register-submit">
                                </div>
                                <div class="forget">
                                    <a href="#">forgot your password</a>
                                </div>
                            </form>
                            <!-- /Form -->
                        </div>
                    </div>

                    <div class="clearfix"></div>
                </div>
                </body>
                </html>
