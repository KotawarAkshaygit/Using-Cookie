<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%

Cookie cookie[]=request.getCookies();
int d=0;
for(Cookie c:cookie)
{
	if(c.getName().equals("c"))
	{
		d=Integer.parseInt(c.getValue());
	}
}


out.print(d);
%>
</body>
</html>