<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
   	<link rel="stylesheet" type="text/css" href="css/style.css">
	<style type="text/css">  
	body{background: url(images/turkey-3191091_960_720.jpg) no-repeat;background-size:cover;font-size: 20px;}  
               .form{background: rgba(255,255,255,0.3);width:400px;margin:100px auto;}  
	#login{display: block;}            
                   
	</style>	
	<title>Welcome to UTC</title>

</head>
<body>
${error }
<form action="login.do" method="post">
	 <div class="container">
		<div class="form row">
			<div class="col-md-offset-3 col-xs-offset-3 form-horizontal" id="login">	 
				 <h1 class="title" style ="font-size: 40px">Welcome to UTC</h1></div>
				 <div class="col-sm-9 col-md-9">
				 <div class="form-group"> 
				
				 Username<input class="form-control required" style ="margin-left:20px" type="text" placeholder="Username" 

name="username" autofocus="autofocus" size="30" maxlength="30"/></div>
				<br>
				<br>
				<div class="form-group">
				
				Password<input class="form-control required" style ="margin-left:19px" type="text" placeholder="Password" 

id="password" name="password" maxlength="30"  size="30"/></div>
				<br>
				<div class="form-group col-xs-offset-9 col-md-offset-9">
				<input type="submit" class="btn btn-success pull-right" style ="margin-left:170px"  name="submit" 

value="Login"> </div>
			 </div>
         </div>
     </div>
</form>

</body>
</html>