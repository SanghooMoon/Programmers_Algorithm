/**
2-gram이란 문자열에서 2개의 연속된 요소를 출력하는 방법입니다. 

예를 들어 'Javascript'를 2-gram으로 반복해 본다면 다음과 같은 결과가 나옵니다.
 */
var key = prompt('문자를 입력하세요');
        
for (var i=0; i<key.length-1; i++){
    console.log(key.charAt(i), key.charAt(i+1));
}

for (let i=0; i<key.length-1; i++){
    console.log(key[i], key[i+1]);
}