/** 域对象 START */
var LOAD = {};
/** 域对象 END */

/** 加载HTML */
LOAD.loadHTML = function(htmlName) {
	$("#page-wrapper").load(htmlName + ".html");
};