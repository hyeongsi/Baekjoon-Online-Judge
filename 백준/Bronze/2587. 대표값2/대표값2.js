const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().trim().split('\n');

const numbers = input.map(Number);

numbers.sort((a, b) => a - b);
const sum = numbers.reduce((pv, cv) =>{
    return pv + cv;
}, 0);

console.log(sum / numbers.length);
console.log(numbers[Math.floor(numbers.length / 2)]);
