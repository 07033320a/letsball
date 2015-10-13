/** 域对象 START */
var TEAM_MANAGE_INFO = {};
/** 域对象 END */

TEAM_MANAGE_INFO.setTeamInfo = function() {
	var param = {
		"tid" : sessionStorage.getItem("jsonVal")
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

$(document).ready(function() {
	TEAM_MANAGE_INFO.setTeamInfo();
});