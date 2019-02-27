<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="sheet.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Flipkartx</title>
</head>
<body>
<div class="jumbotron">
  <div class="container text-center">
    <h1>Flipkart</h1>      
    
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Electronics</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
       <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
       <li><a href="JSP/signup.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Register</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">IPHONE</div>
        <a href="JSP/iphone.jsp"><div class="panel-body"><img src="C:\Users\sburugu\Downloads\New folder (2)\iphonex.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <!-- <button type="button" class="btn btn-default">BuyNow</button> -->
        <div class="panel-footer"> 
       
       <button onclick="location.href = 'JSP/iphone.jsp';" id="myButton" class="btn btn-warning" >View Details</button>
      <p class="price">RS:1,10,000</p>
       <p><b>Brand:</b>I Phone X</p>
            </div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">ONEPLUSL</div>
       <a href="JSP/oneplus.jsp"> <div class="panel-body"><img src="C:\Users\sburugu\Downloads\New folder (2)\OnePlus-7.png" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <!-- <button type="button" class="btn btn-default">BuyNow</button> -->
        <div class="panel-footer">
        <button onclick="location.href = 'JSP/oneplus.jsp';" id="myButton" class="btn btn-warning" >View Details</button>
        <p class="price"> RS:38,000</p>
       <p><b>Brand:</b>One Plus</p>
        </div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">SAMSUNG</div>
        <a href="JSP/samsung.jsp"><div class="panel-body"><img src="C:\Users\sburugu\Downloads\New folder (2)\samsung-galaxy-s9-plus.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <!-- <button type="button" class="btn btn-default">BuyNow</button> -->
        <div class="panel-footer">
        <button onclick="location.href = 'JSP/samsung.jsp';" id="myButton" class="btn btn-warning" >View Details</button>
        <p class="price"> RS:60,000</p>
       <p><b>Brand:</b>Samsung</p>
        </div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">NOKIA</div>
       <a href="JSP/nokia.jsp"> <div class="panel-body"><img src="C:\Users\sburugu\Downloads\New folder (2)\Nokia 8.1.jpeg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <!-- <button type="button" class="btn btn-default">BuyNow</button> -->
        <div class="panel-footer">
       <button onclick="location.href = 'JSP/nokia.jsp';" id="myButton" class="btn btn-warning" >View Details</button>
       <p class="price"> RS:25,000</p>
       <p><b>Brand:</b>Nokia</p>
       </div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">MI</div>
        <a href="JSP/mi.jsp"><div class="panel-body"><img src="C:\Users\sburugu\Downloads\New folder (2)\5-g-phone.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <!-- <button type="button" class="btn btn-default">BuyNow</button> -->
        <div class="panel-footer">
       <button onclick="location.href = 'JSP/mi.jsp';" id="myButton" class="btn btn-warning" >View Details</button>
       <p class="price"> RS:18,000</p>
       <p><b>Brand:</b>Xiaomi</p>
        </div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">BLACKBERRY</div>
       <a href="JSP/blackberry.jsp"> <div class="panel-body"><img src="C:\Users\sburugu\Downloads\New folder (2)\blackberry-key2-1.jpg" class="img-responsive" style="width:100%" alt="Image"></div></a>
        <!-- <button type="button" class="btn btn-default">BuyNow</button> -->
        <div class="panel-footer">
       <button onclick="location.href = 'JSP/blackberry.jsp';" id="myButton" class="btn btn-warning" >View Details</button>
       <br></br>
       <p class="price"> RS:30,000</p>
       <p><b>Brand:</b>BlackBerry</p>
        </div>
      </div>
    </div>
  </div>
</div><br></br>

<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline" >Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign In</button>
  </form>
</footer>
<br>
<footer class="container-fluid text-center">
<!-- <p style="text-align:center"><span style="font-size:12px">Share this email:</span></p> -->
<p style="text-align:center">
<!--Facebook icon-->
<a href="http://facebook.com/flashissue" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/YdvNzBsfTrqg9Cx9Tozh_Facebook-e1386022800280.png" style="height:50px; width:50px" /> </a>&nbsp; &nbsp; &nbsp;
<!--Google+ icon-->
<a href="http://plus.google.com" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/HdT6jbRJRhqyPu3BKhi7_google-Plus-e1386022876181.png" style="height:50px; width:50px" /> </a>&nbsp; &nbsp;&nbsp;
<!--Twitter icon-->
<a href="http://twitter.com/flashissue" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/3b3zdiavSf26SleQOaDd_twitter-e1386023015819.png" style="height:50px; width:50px" /> </a>&nbsp; &nbsp;&nbsp;
<!--Linkedin icon-->
<a href="http://linkedin.com" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/dJtLdIsbRAix3zQhvygP_linkedin_icon_dark_hover-5be7d72ca83a10c0c76c32d141b0b828.png" style="height:50px; width:50px" /> </a>
</p>
</footer>
</body>
</html>
