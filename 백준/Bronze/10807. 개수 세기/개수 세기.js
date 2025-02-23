const fs = require('fs');
const input = fs.readFileSync('./dev/stdin')
    .toString()
    .split("\n")
    .map(el => el.split(" ").map(Number));

const array = input[1];
const target = input[2][0];

console.log(array.filter(val => val === target).length);