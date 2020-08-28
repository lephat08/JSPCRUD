<%@page import="java.sql.ResultSet"%>
<%@page import="model.MyConnectDB"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo Connect DTB</title>
<style type="text/css">
.row {
	margin-top: 40px;
	padding: 0 10px;
}

.clickable {
	cursor: pointer;
}

.panel-heading div {
	margin-top: -18px;
	font-size: 15px;
}

.panel-heading div span {
	margin-left: 5px;
}

.panel-body {
	display: none;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 align="center">Test</h2>
		<div class="row">
			<div class="col-md-12">
				<a href="ThemTaiKhoan.jsp"><button class="btn btn-success">Thêm
						Sach</button></a>
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Danh sách Book</h3>

					</div>
					<div class="panel-body">
						<input class="form-control" id="dev-table-filter"
							data-action="filter" data-filters="#dev-table"
							placeholder="Từ khóa" type="text">
					</div>

					<%
						MyConnectDB con = new MyConnectDB();
						ResultSet rs = con.chonDuLieuTuDTB("select * from book");
					%>
					<table class="table table-hover" id="dev-table">
						<thead>
							<tr>
								<th>STT</th>
								<th>Tac Gia</th>
								<th>Tieu De</th>
								<th>Gia</th>
							</tr>
						</thead>
						<tbody>
							<%
								while (rs.next()) {
							%>

							<tr>
								<td><%=rs.getString(1)%></td>
								<td><%=rs.getString(2)%></td>
								<td><%=rs.getString(3)%></td>
								<td><%=rs.getString(4)%></td>
								<td><a href="XoaTK?stt=<%=rs.getString(1)%>"><button
											class="btn btn-warning">Xóa</button></a></td>

							</tr>
							<%
								}
							%>

						</tbody>
					</table>
				</div>
			</div>
		</div>



	</div>

</body>
</html>