const fs = require('fs');
const [...nums] = fs.readFileSync('./dev/stdin').toString().trim().split('').map(Number);

console.log(nums.sort((a, b) => b - a).join(''));