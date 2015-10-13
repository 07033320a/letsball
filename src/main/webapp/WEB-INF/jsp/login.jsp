<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="乐意动" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="<%=basePath%>/css/style.css" rel='stylesheet' type='text/css' />
<link href="<%=basePath%>/css/font-awesome.css" rel="stylesheet">
<!-- jQuery -->
<script src="<%=basePath%>/js/jquery.min.js"></script>
<!----webfonts--->
<link
	href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>
<!---//webfonts--->
<!-- Bootstrap Core JavaScript -->
<script src="<%=basePath%>/js/bootstrap.min.js"></script>
</head>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/login.css">
<script type="text/javascript" src="<%=basePath%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/md5.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/login.js"></script>
</head>

<body id="login">
	<div class="login-logo">
		<a href="index.html">乐意动</a>
	</div>
	<h2 class="form-heading">登录</h2>
	<div class="app-cam">
		<form>
			<input type="text" class="text" name="username" value="123"
				onFocus="this.value = '';"
				onBlur="if (this.value == '') {this.value = 'username';}"> <input
				type="password" value="123" name="password"
				onFocus="this.value = '';"
				onBlur="if (this.value == '') {this.value = 'Password';}">
			<div class="submit">
				<input type="submit" id="loginBtn" value="登录">
			</div>
			<div class="login-social-link">
				<a href="index.html" class="facebook"> Facebook </a> <a
					href="index.html" class="twitter"> Twitter </a>
			</div>
			<ul class="new">
				<li class="new_left"><p>
						<a href="#">忘记密码 ?</a>
					</p></li>
				<li class="new_right"><p class="sign">
						新来的 ?<a href="register.html"> 注册</a>
					</p></li>
				<div class="clearfix"></div>
			</ul>
		</form>
	</div>
	<div class="copy_layout login">
		<p>
			Copyright © 2015 乐意动. All Rights Reserved | Design by <a
				href="index.html" target="_blank">乐意动</a>
		</p>
	</div>
</body>
</html>
