const fs = require("fs");
const input = fs.readFileSync("./dev/stdin").toString().trim().split("\n");

const aSet = new Set(input[1].split(" ").map(Number));
const bSet = new Set(input[2].split(" ").map(Number));

let result = 0;

aSet.forEach((value) => {
  if (!bSet.has(value)) {
    result++;
  }
});

bSet.forEach((value) => {
  if (!aSet.has(value)) {
    result++;
  }
});

console.log(result);
