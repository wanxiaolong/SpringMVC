<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
${error }
	<form action="login.do" method="post">
		账号登陆<br>
		<hr>		
		卡号：<input type="text" name="cardNo"><br>
		密码：<input type="text" name="password"><br>
		<input type="submit" value="登陆">
	</form>

</body>
</html>