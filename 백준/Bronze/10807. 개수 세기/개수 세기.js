const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().split("\n");

const [num, target] = [input[1], input[2]];
const numArr = num.split(" ");

const find = numArr.filter((v, i) => { return v == target });
console.log(find.length);
