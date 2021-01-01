/**
	크리스마스 날, 은비는 친구들과 함께 파티를 하기로 했습니다. 그런데, 크리스마스 트리를 사는 것을 깜빡하고 말았습니다. 
	온 가게를 돌아다녀 봤지만 크리스마스 트리는 모두 품절이었습니다. 
	하는 수 없이 은비는 프로그래밍으로 트리를 만들기로 합니다. 
	
	**은비를 위해 프로그램을 작성해 주세요.**
	**입력**
	5
	
	**출력**		
	    *		
	   ***
	  *****
	 *******
	*********
 */

//실행 수 : 입력(5)
//별  1, 3, 5, 7, 9
//공백 4, 3, 2, 1, 0

var input = 5;
for (var i=1; i<=input; i++) {
  // 공백
  var line = "";
  for (var j=input; j>i; j--) {
    line += " ";
  }
  // 별
  for (var k=1; k<=(2*i)-1; k++) {
    line += "*";
  }
  console.log(line + "\n");
}


var input = 5;
var line = "";
for (var i = 1; i <= input; i++) {
  // 공백
  for (var j = input; j > i; j--) {
    line += " ";
  }
  // 별
  for (var k = 1; k <= 2 * i - 1; k++) {
    line += "*";
  }
  line += "\n";
}
console.log(line);

