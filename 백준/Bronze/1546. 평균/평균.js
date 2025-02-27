const fs = require('fs');
let [n, score] = fs.readFileSync('./dev/stdin').toString().split("\n");

score = score.split(" ").map(Number);
const max = Math.max(...score);

const sum = score.reduce((pre, cur) => {
    return pre + (cur / max * 100);
},0);

console.log(sum / n);