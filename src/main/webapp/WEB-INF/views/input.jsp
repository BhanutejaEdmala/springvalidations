<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
    <h2>User Form</h2>
    <form:form method="post" modelAttribute="user" action="/process">
        <table>
            <tr>
                <td>User ID:</td>
                <td><form:input path="uid" /><br/>
                    <form:errors path="uid" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td><form:input path="uname" /><br/>
                    <form:errors path="uname" cssClass="error" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
