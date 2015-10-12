
/** 域对象 START */
var TEAM_MANAGE = {};
/** 域对象 END */

TEAM_MANAGE.getTeamList = function() {
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
			var html = template('table_tr_template', data);
			$("#example tbody").html(html);
			initDataTable("example");
		},
		error : function() {
			alert("服务器发生故障，请尝试重新登录！");
		}
	});
};

TEAM_MANAGE.setTeamInfo = function(tid) {
	$("#tableTitle h3").html("球队管理&gt;&gt;球队信息");
	var param = {
			"tid" : tid
		};
		$.ajax({
			type : "post",
			data : param,
			dataType : "json",
			contentType : "application/x-www-form-urlencoded;charset=UTF-8",
			url : "/letsball/teamManage/getTeamInfo",
			async : false,
			success : function(data) {
				var html = template('div_teamInfo_template', data);
				$("#main_content").html(html);
			},
			error : function() {
				alert("服务器发生故障，请尝试重新登录！");
			}
		});
	};

$(document).ready(function () {
	TEAM_MANAGE.getTeamList();
});