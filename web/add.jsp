<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/6
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增花卉</title>
</head>
<body>
<form action = "inster" method="post">
    <table border="1" align="center">
        <tr>
            <td colspan="2" style="text-align:center;font-size:30px;font-weight:bold;">
                花卉信息
            </td>
        </tr>
        <tr>
            <td><b>花卉名称:</b></td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td><b>花卉价格:</b></td>
            <td><input type="text" name="price"/></td>
        </tr>
        <tr>
            <td><b>原产地:</b></td>
            <td><input type="text" name="production"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="提交"/><input type="reset" value="重置"/>
            </td>
        </tr>
    </table>

</form>
</body>
</html>
