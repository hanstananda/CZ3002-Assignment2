<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.1 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <title>Group 43 Login Page</title>
    <s:head/>
</head>

<body>
<div class="column" style="min-width:250px">
    <div>
        <div class="ui secondary stacked segment">
        <h2 class="ui grey center aligned icon header">
            <i class="circular user icon"></i>
            Login
        </h2>
            <s:form class="ui form" action="login" style="width:100%">
                <s:textfield class="field" placeholder="Username" name="username"/>

                <s:password class="field" placeholder="Password" name="password"/>

                <s:submit class="ui fluid large teal submit button" value="Login"/>

            </s:form>
            <s:if test="errorMsg!=''">
                <div class="ui error message">
                    <div class="header">Invalid Login</div>
                    <p><s:property value="errorMsg" /></p>
                </div>
            </s:if>
        </div>
    </div>
</div>

</body>
</html>
