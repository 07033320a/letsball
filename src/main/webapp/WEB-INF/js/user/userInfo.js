/** 域对象 START */
var USER_INFO = {};
/** 域对象 END */

USER_INFO.getUserInfo = function() {
	$.ajax({
		type : "post",
		dataType : "json",
		contentType : "application/x-www-form-urlencoded;charset=UTF-8",
		url : "/letsball/user/getUserInfo",
		async : false,
		success : function(data) {
			if(data.result == "success") {
				var html = template('div_userInfo_template', data);
				$("#main_content").html(html);
			} else {
				$("#userInfoDialog .modal-body p").html(data.msg);
				$("#userInfoDialogBtn").click();
			}
		},
		error : function() {
			alert("服务器发生故障，请尝试重新登录！");
		}
	});
};

$(document).ready(function() {
	USER_INFO.getUserInfo();
});