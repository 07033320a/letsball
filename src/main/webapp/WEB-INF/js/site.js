// call this from the developer console and you can control both instances
var calendars = {};

$(document).ready(
		function() {

			// assuming you've got the appropriate language files,
			// clndr will respect whatever moment's language is set to.
			// moment.lang('ru');
			moment.locale('Zh-cn', {
				months : [ "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月",
						"九月", "十月", "十一月", "十二月" ],
				weekdays : [ "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" ],
				weekdaysMin : [ "日", "一", "二", "三", "四", "五", "六" ]
			});

			// here's some magic to make sure the dates are happening this
			// month.
			var thisMonth = moment().format('YYYY-MM');

			var eventArray = [ {
				date : moment().format('YYYY-MM-') + '07',
				title : 'This is an Event'
			} ];

			// the order of the click handlers is predictable.
			// direct click action callbacks come first: click, nextMonth,
			// previousMonth, nextYear, previousYear, or today.
			// then onMonthChange (if the month changed).
			// finally onYearChange (if the year changed).

			calendars.clndr1 = $('.cal1').clndr({
				events : eventArray,
				// constraints: {
				// startDate: '2013-11-01',
				// endDate: '2013-11-15'
				// },
				clickEvents : {
					click : function(target) {
						if ($(target.element).hasClass('inactive')) {
							console.log('not a valid datepicker date.');
						} else {
							console.log('VALID datepicker date.');
						}
					},
					nextMonth : function() {
						console.log('next month.');
					},
					previousMonth : function() {
						console.log('previous month.');
					},
					onMonthChange : function() {
						console.log('month changed.');
					},
					nextYear : function() {
						console.log('next year.');
					},
					previousYear : function() {
						console.log('previous year.');
					},
					onYearChange : function() {
						console.log('year changed.');
					}
				},
				multiDayEvents : {
					startDate : 'startDate',
					endDate : 'endDate'
				},
				showAdjacentMonths : true,
				adjacentDaysChangeMonth : false,
				thisDates : [ "2015-10-01", "2015-10-04", "2015-10-11", ]
			});

			// calendars.clndr2 = $('.cal2').clndr({
			// template: $('#template-calendar').html(),
			// events: eventArray,
			// startWithMonth: moment().add('month', 1),
			// clickEvents: {
			// click: function(target) {
			// console.log(target);
			// }
			// }
			// });

			// bind both clndrs to the left and right arrow keys
			$(document).keydown(function(e) {
				if (e.keyCode == 37) {
					// left arrow
					calendars.clndr1.back();
					calendars.clndr2.back();
				}
				if (e.keyCode == 39) {
					// right arrow
					calendars.clndr1.forward();
					calendars.clndr2.forward();
				}
			});

		});