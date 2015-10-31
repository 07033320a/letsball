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

TEAM_MANAGE_INFO.getMemberList = function(tabId, position) {
	var param = {
		"tid" : sessionStorage.getItem("jsonVal"),
		"position" : position
	};
	$.ajax({
		type : "post",
		data : param,
		dataType : "json",
		contentType : "application/x-www-form-urlencoded;charset=UTF-8",
		url : "/letsball/teamManage/getMemberList",
		async : false,
		success : function(data) {
			if(data.result.length == '0') {
				$("#" + tabId + " div[class='scrollbar']").html("此位置无球员");
				return false;
			}
			var html = template('div_memberList_template', data);
			$("#" + tabId + " div[class='scrollbar']").html(html);
		},
		error : function() {
			alert("服务器发生故障，请尝试重新登录！");
		}
	});
};

$(document).ready(function() {
	TEAM_MANAGE_INFO.setTeamInfo();
	TEAM_MANAGE_INFO.getMemberList("panel-1", "1");
});