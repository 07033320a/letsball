/** 域对象 START */
var LOAD = {};
/** 域对象 END */

LOAD.flag = true;
LOAD.message = "";

/** 加载HTML */
LOAD.loadHTML = function(parent, htmlName) {
	console.log(parent, htmlName);
	if(parent == null || parent == undefined) {
		parent = "page-wrapper";
	}
	if(htmlName == null || htmlName == undefined) {
		LOAD.flag = false;
		LOAD.message = "htmlName is null";
		return false;
	}
	$("#" + parent).load(htmlName + ".html");
};

/** 加载HTML带参数的 */
LOAD.loadHTMLParams = function(parent, htmlName, json) {
	LOAD.loadHTML(parent, htmlName);
	if(LOAD.flag == true) {
		sessionStorage.setItem("jsonVal", json);
	}
};