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

<h1 class="ui teal center aligned header">CZ3002 Assignment 2 Group 43</h1>
<div class="ui hidden divider"></div>
    <div id="content" class="ui main text container">
        <div class="ui middle aligned center aligned grid">
            <div id="main">
                <decorator:body/>
            </div>
        </div>
    </div>
</body>
</html>
