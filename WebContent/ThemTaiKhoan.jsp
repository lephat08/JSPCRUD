<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en" c>
<head>
  <title>Them Sach</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Thêm thông tin Sach</h2>
  <form class="form-horizontal" action="ThemTK" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="author">Tac Gia</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="author" name="author" placeholder="Nhập vào tac gia" >
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="title">Tieu De</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id=""title"" name=""title"" placeholder="Nhập vào Tieu de">
      </div>
    </div>
  <div class="form-group">
      <label class="control-label col-sm-2" for="price">Gia:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="price" name="price" placeholder="Nhập vào Gia" >
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Thêm</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>