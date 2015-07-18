<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ログイン</title>
</head>
<body>
<h1>◯◯へようこそ</h1>
<s:form method="POST" >
	メールアドレス：<input type="email" property="mail"><html:errors property="mail"/>
	パスワード:<input type="password" property="password"><html:errors property="password"/>
	<input type="submit" name="login" value="ログイン">
</s:form>
</body>
</html>