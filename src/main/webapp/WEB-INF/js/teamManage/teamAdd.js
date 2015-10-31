/** 域对象 START */
var TEAM_MANAGE_ADD = {};
/** 域对象 END */

TEAM_MANAGE_ADD.add = function() {
	var form = $("#teamAddForm");
	$.ajax({
		type : "post",
		data : form.serialize(),
		dataType : "json",
		contentType : "application/x-www-form-urlencoded;charset=UTF-8",
		url : "/letsball/teamManage/addTeamInfo",
		async : false,
		success : function(data) {
			if (data.result == '1') {
				$("#teamAddDialogBtn").click();
				$('#teamAddDialog').on('hide.bs.modal', function() {
					$(".modal-backdrop").remove();
					LOAD.loadHTML('page-wrapper', 'teamManagement/teamList');
				})
			}
		},
		error : function() {
			alert("服务器发生故障，请尝试重新登录！");
		}
	});
};

$(document).ready(function() {
});