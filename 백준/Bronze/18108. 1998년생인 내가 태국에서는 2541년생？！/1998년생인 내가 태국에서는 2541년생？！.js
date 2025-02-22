const fs = require('fs');

const input = fs.readFileSync('./dev/stdin').toString().trim();
const diffNum = 2541 - 1998;

console.log(Number(input) - diffNum);