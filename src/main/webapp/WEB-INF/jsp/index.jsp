<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.1 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <title>Group 43 Web application</title>
    <s:head/>
</head>

<body>
<s:form class="ui form" action="helloWorld">
    <s:textfield class="field" label="What is your name?" name="name"/>

    <s:textfield class="field" label="What is the date?" name="dateNow"/>

    <s:submit class="ui button"/>
</s:form>
</body>
</html>
