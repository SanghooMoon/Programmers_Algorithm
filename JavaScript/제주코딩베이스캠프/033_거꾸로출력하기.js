/**
한 줄에 여러개의 숫자가 입력되면, 역순으로 그 숫자들을 하나씩 출력하는 프로그램을 작성하시오.
 */

var key = prompt().split(' ');
        
for(var i=key.length-1; i>=0; i--) {
    document.write(key[i]);
}



var data = prompt('숫자를 입력하세요.').split(' ').reverse();
var result = '';

for (let i=0; i<data.length; i++){
  result += data[i];
}

console.log(result);