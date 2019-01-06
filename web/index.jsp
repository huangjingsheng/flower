<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/6
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      a{
        color: black;
        text-decoration: none;
      }
      a:hover{
        color: red;
      }
    </style>
  </head>
  <body>
    <table border="1">
      <tr>
        <th>花卉编号</th>
        <th>花卉名称</th>
        <th>价格(元)</th>
        <th>原产地</th>
      </tr>
      <c:forEach items="${list }" var="flower">
        <tr>
          <th>${flower.id }</th>
          <th>${flower.name }</th>
          <th>${flower.price}</th>
          <th>${flower.production }</th>
        </tr>
      </c:forEach>
    </table>
  <a href="add.jsp">添加花卉信息</a>
  </body>
</html>
