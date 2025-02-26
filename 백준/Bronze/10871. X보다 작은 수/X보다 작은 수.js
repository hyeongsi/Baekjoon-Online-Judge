const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().split("\n");

const [n, x] = input[0].split(" ");
const arr = input[1].split(" ");

const filter = arr.filter((v, i) => { return Number(v) < Number(x) });
let str = "";
filter.forEach(v => str = str + " " + v);
console.log(str.trim());