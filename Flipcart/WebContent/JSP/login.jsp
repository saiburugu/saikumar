<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="sheet.css">
<body>

<form action="../LoginServlet" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign In</h1>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" value="saikumar@gmail.com" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" value="saikumar123" required>

<!--     <label for="psw-repeat"><b>Repeat Password</b></label> -->
<!--     <input type="password" placeholder="Repeat Password" name="psw-repeat" value="saikumar123" required> -->
    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>
    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <input type="submit" value="Login">
     
    </div>
  </div>
</form>

</body>
</html>