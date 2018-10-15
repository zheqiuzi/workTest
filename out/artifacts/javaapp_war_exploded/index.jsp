<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/21
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery.min.js"></script>
</head>
<body>

<form action="myController" method="get">
    <input name="name">
    return:${name}
    <input value="提交" type="submit">
</form>

<script>
    $.ajax({
        url:"myController",
        success:function(data){
            console.log(data);
        }
    })
</script>

</body>
</html>
