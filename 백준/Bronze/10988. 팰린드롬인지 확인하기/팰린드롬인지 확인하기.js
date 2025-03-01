const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().trim();

for (let i = 0; i < input.length / 2; i++) {
    const reverseIdx = input.length - i - 1;
    if (input[i] !== input[reverseIdx]){
        console.log(0);
        return;
    }
}

console.log(1);
