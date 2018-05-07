<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Minimal an Admin Panel Category Flat Bootstrap Responsive Website Template | Signin :: w3layouts</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="login">
            <h1><a href="index.html">Copa mundo Rusia 2018 </a></h1>
            <div class="login-bottom">
                <h2>Login</h2>
                <f:view>
                    <h:form id="formularioLogin">   
                        <div class="col-md-6">
                            <div class="login-mail">
                                <h:inputText value="#{loginBean.user}"/>
                                <i class="fa fa-envelope"></i>
                            </div>
                            <div class="login-mail">
                        <h:inputSecret value="#{loginBean.password}"/> 
                                <i class="fa fa-lock"></i>
                            </div>
                            <a class="news-letter " href="#">
                                <label class="checkbox1"><input type="checkbox" name="checkbox" ><i> </i>Olvidó su contraseña</label>
                            </a>


                        </div>
                        <div class="col-md-6 login-do">
                            <label class="hvr-shutter-in-horizontal login-sub">
                                 <h:commandButton value="Ingresar" action="#{loginBean.validarLogin}" />      
                            </label>
                            <p>Do not have an account?</p>
                            <a href="signup.html" class="hvr-shutter-in-horizontal">Signup</a>
                        </div>                          
                                             
                        <%= request.getAttribute("errorAccesos") == null ? "" : request.getAttribute("errorAccesos") %>
                    </h:form>
                </f:view>
            </div>
        </div>
    </body>
</html>
