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
<s:form class="ui form" action="login">
    <s:textfield class="field" label="Username" name="username"/>

    <s:textfield class="field" label="Password" name="password"/>

    <s:submit class="ui button"/>

    <s:if test="errorMsg!=''">
        <div class="ui negative  message">
            <div class="header">Invalid Login</div>
            <p><s:property value="errorMsg" /></p>
        </div>
    </s:if>

</s:form>

<%--<form class="ui form" action="login">--%>
<%--    <div class="field">--%>
<%--        <label>Username</label>--%>
<%--        <input type="text" name="username" placeholder="Username">--%>
<%--    </div>--%>
<%--    <div class="field">--%>
<%--        <label>Password</label>--%>
<%--        <input type="text" name="password" placeholder="Password">--%>
<%--    </div>--%>
<%--    <button class="ui button" type="submit">Submit</button>--%>
<%--</form>--%>

</body>
</html>
