<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.1 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <!-- Semantic-UI CSS -->
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.11/semantic.min.css"></link>
    <title><decorator:title default="Struts Starter"/></title>
    <decorator:head/>
</head>
<body id="page-home">

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.11/semantic.min.js"></script>
<div class="ui inverted menu">
    <div class="header item">
        Group 43 Web application
    </div>
</div>
<div class="ui divider"></div>
<div class="ui container">
    <div id="content" class="ui main text container">
        <h1 class="ui header">Hello World</h1>
        <div id="main">
            <h3>Main Content</h3>
            <decorator:body/>
        </div>
    </div>
</div>
<div id="footer" class="ui inverted vertical footer segment">
    Footer
</div>

<div id="extra1">&nbsp;</div>
<div id="extra2">&nbsp;</div>
</body>
</html>
