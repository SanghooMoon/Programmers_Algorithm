/**
<pass>부분에 배열 내장함수를 이용하여 코드를 입력하고 다음과 같이 출력되게 하세요.

**데이터**
var arr = [200, 100, 300];
//pass
console.log(arr);

**출력**
[200, 100, 10000, 300]
 */

var arr = [200, 100, 300];
//pass
arr.splice(2, 0, 10000);		

console.log(arr);

/*
splice(_position, _remove, _addElements), 첫번째는 새로운 요소를 추가할 위치, 두번째는 삭제할 개수, 이 후 파라미터는 추가할 요소들

The first parameter (2) defines the position where new elements should be added (spliced in).
The second parameter (0) defines how many elements should be removed.
The rest of the parameters ("Lemon" , "Kiwi") define the new elements to be added.
*/