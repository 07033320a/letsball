$(document).ready(function () {
	console.log("bbb");
	$.ajax({
		type : "post",
		dataType : "json",
		contentType : "application/x-www-form-urlencoded;charset=UTF-8",
		url : "/letsball/teamManage/getTeamList",
		// 同步async: false,（默认是true）;
		// 如上：false为同步，这个方法中的Ajax请求将整个浏览器锁死，
		// 只有test.jsp执行结束后，才可以执行其它操作。
		async : false,
		success : function(data) {
			console.log(data);
			initDataTable("example");
		},
		error : function() {
			alert("服务器发生故障，请尝试重新登录！");
		}
	});
});