const fs = require('fs');
const [, ...nums] = fs.readFileSync('./dev/stdin').toString().trim().split('\n');

const result = nums.map(Number).sort((a, b) => a - b).join('\n');
console.log(result);