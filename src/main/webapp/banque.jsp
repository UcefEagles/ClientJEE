<%@page import="service.BanqueWsProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%  
    	double mt=0; double res=0;
        if(request.getParameter("montant")!=null){
    	 mt =Double.parseDouble(request.getParameter("montant"));
    	 BanqueWsProxy stub=new BanqueWsProxy() ;
    	 res=stub.conversionEuroToDh(mt);
    	 
    	
    }
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
Montant:<input type="text" name="montant" value="<%=mt %>">
<input type="submit" value="OK">
</form>
<%=mt %> en EURO = <%=res %> en Dh

</body>
</html>