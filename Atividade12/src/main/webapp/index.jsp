<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
	
	if(request.getParameter("titulo") == null || request.getParameter("ano") == null || request.getParameter("autor") == null){
		out.println("<h2> Digite todas as informa��es na URL (t�tulo/ano/autor), para melhor visualiza��o das mesmas! </h2>"); 
		} else{
			out.println("<h2>T�tulo: "+request.getParameter("titulo")+"<br>"+"Ano: "+request.getParameter("ano")+
					"<br>"+"Autor: "+request.getParameter("autor")+"</h2>");
		}
	
	%>

</body>
</html>