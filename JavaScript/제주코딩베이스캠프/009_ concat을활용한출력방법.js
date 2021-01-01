/**
	데이터
	var year = '2019';
	var month = '04';
	var day = '26';
	var hour = '11';
	var minute = '34';
	var second = '27';
	
	var result = //빈칸을 채워주세요
	
	console.log(result);
	
	출력
	2019/04/26 11:34:27
 */

var result = year.concat('/', month, '/', day, ' ', hour, ':', minute, ':', second);
var result = `${year}/${month}/${day} ${hour}:${minute}:${second}`;	// 백틱 활용
