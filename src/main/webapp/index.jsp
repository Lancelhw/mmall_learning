<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello World!</h2>

SpringMVC实现上传功能
<form name="form1" action="/manage/product/upload.do" method="post"  enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="SpringmvcUpload"/>
</form>

富文本图片上传
<form name="form2" action="/manage/product/richtext_img_upload.do" method="post"  enctype="multipart/form-data">
    <input type="file" name="upload_file">
    <input type="submit" value="富文本图片Upload"/>
</form>
</body>
</html>
