<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="sheet.css">
<body>
<style>
  {
  background-image:src="C:\Users\sburugu\Documents\workspace-spring-tool-suite-4-4.1.1.RELEASE\Flipkart\WebContent/11.jpg";
  }
</style>
<style>
body {
  background-image: url("https://ak0.picdn.net/shutterstock/videos/17581150/thumb/1.jpg");
}
</style>
<form action="Checkout.jsp" >
  <div class="container">
   <center><h1>LogIn</h1></center>
    <hr>
    <center><br><h4><label for="email"><b>Email :</h4></b></label></center>
    <center><input type="text" placeholder="Enter Email" name="email" value="saikumar@gmail.com" required></center>

    <center><br><h4><label for="psw"><b>Password :<h4></b></label></center>
    <center><input type="password" placeholder="Enter Password" name="psw" value="saikumar123" required></center>

<!--     <label for="psw-repeat"><b>Repeat Password</b></label> -->
<!--     <input type="password" placeholder="Repeat Password" name="psw-repeat" value="saikumar123" required> -->
    <label>
      <br><center><input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px">Remember me</center>
    </label>
    <center><div class="clearfix"></center>
      <br><center><input type="submit" value="Login"> </center>  
      <br><center><button type="button" class="cancelbtn">Cancel</button></center> 
    </div>
  </div>
</form>

</body>
</html>