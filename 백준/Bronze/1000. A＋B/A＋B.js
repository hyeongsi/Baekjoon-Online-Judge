const fs = require('fs');
const input = fs.readFileSync("./dev/stdin").toString().trim().split(" ");

let number = input.reduce((acc, curVal, index, array) => {
    return Number(acc) + Number(curVal);
}, 0);

console.log(number);
