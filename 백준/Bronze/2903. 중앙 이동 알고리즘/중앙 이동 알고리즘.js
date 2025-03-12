const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().trim();

let sum = 2;
for (let i = 0; i < input; i++) {
    sum += Math.pow(2, i);
}
console.log(sum * sum);