function test(str1, str2){
    if(str1.length >= str2.length){
        for(let i = str1.length - 1; i >= 0; i--){
            for (let j = str2.length - 1; j >= 0; j--) {
                if(str2[j] != str1[i]){
                    return false;
                }
                else {
                    i--;
                }
            }
            return true;
        }
    }
    else {
        for(let i = str2.length - 1; i >= 0; i--){
            for (let j = str1.length - 1; j >= 0; j--) {
                if(str1[j] != str2[i]){
                    return false;
                }
                else {
                    i--;
                }
            }
            return true;
        }
    }
}

console.log(test('abced', 'ced'));
console.log(test('abced', 'ce'));
console.log(test('abced', 'd'));
console.log(test('d', 'acced'));
console.log(test('d', 'ad'));
console.log(test('d', 'a'));
console.log(test('d', 'd'));
console.log(test('ad', 'd'));