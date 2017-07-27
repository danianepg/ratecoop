<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<spring:url value="/resources/js/jquery.min.js" var="jqueryJS"></spring:url>
	
	<spring:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" var="bootstrapCSS"></spring:url>
	<spring:url value="/resources/vendor/bootstrap/js/bootstrap.min.js" var="bootstrapJS"></spring:url>
	<spring:url value="/resources/vendor/metisMenu/metisMenu.min.css" var="metisMenu"></spring:url>
	<spring:url value="/resources/vendor/metisMenu/metisMenu.min.js" var="metisMenuJS"></spring:url>
	<spring:url value="/resources/dist/css/sb-admin-2.css" var="customCSS"></spring:url>
	<spring:url value="/resources/dist/js/sb-admin-2.js" var="customJS"></spring:url>
	<spring:url value="/resources/vendor/font-awesome/css/font-awesome.min.css" var="customFonts"></spring:url>
	
	<spring:url value="/resources/vendor/datatables-plugins/dataTables.bootstrap.css" var="dataTablesCSS"></spring:url>
	<spring:url value="/resources/vendor/datatables-responsive/dataTables.responsive.css" var="dataTablesResponsiveCSS"></spring:url>
	
	<spring:url value="/resources/vendor/datatables/js/jquery.dataTables.min.js" var="dataTablesJS"></spring:url>
	<spring:url value="/resources/vendor/datatables-plugins/dataTables.bootstrap.min.js" var="dataTablesBootstrapJS"></spring:url>
	<spring:url value="/resources/vendor/datatables-responsive/dataTables.responsive.js" var="dataTablesResponsiveJS"></spring:url>
		
	
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<title>
		<tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute>
	</title>
	
	 <!-- Bootstrap Core CSS -->
    <link href="${bootstrapCSS}" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${metisMenu}" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${customCSS}" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${customFonts}" rel="stylesheet" type="text/css">
    
    <link href="${dataTablesCSS}" rel="stylesheet">
	<link href="${dataTablesResponsiveCSS}" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
		
	<script type="text/javascript" src="${jqueryJS}"></script>
	<script type="text/javascript" src="${bootstrapJS}"></script>	

    <!-- Metis Menu Plugin JavaScript -->
    <script src="${metisMenuJS}"></script>

    <!-- Custom Theme JavaScript -->
    <script src="${customJS}"></script>
    
    <!-- DataTables JavaScript -->
	<script src="${dataTablesJS}"></script>
	<script src="${dataTablesBootstrapJS}"></script>
	<script src="${dataTablesResponsiveJS}"></script>
			
		
</head>


<body>

	<div id="wrapper">

		<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
			<tiles:insertAttribute name="header" ignore="false"></tiles:insertAttribute>		
			<tiles:insertAttribute name="sideMenu" ignore="false"></tiles:insertAttribute>
		</nav>

		<div>
			<tiles:insertAttribute name="body" ignore="false"></tiles:insertAttribute>
		</div>

		<div>
			<tiles:insertAttribute name="footer" ignore="false"></tiles:insertAttribute>
		</div>

	</div>

</body>
</html>