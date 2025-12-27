const [[size], input] = require("fs")
  .readFileSync("dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((d) => d.split(" ").map(Number));
input.sort((a, b) => a - b);

console.log(input[0] * input[size - 1]);
