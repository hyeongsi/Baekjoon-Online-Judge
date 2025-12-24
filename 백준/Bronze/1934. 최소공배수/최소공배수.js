const fs = require("fs");
const input = fs
  .readFileSync("./dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map((e) => e.trim());

const nums = input.slice(1).map((e) => e.split(" ").map(Number));

for (let num of nums) {
  console.log((num[0] * num[1]) / gcd(num[0], num[1]));
}

function gcd(a, b) {
  if (a < b) {
    let tmp = a;
    a = b;
    b = tmp;
  }

  if (b === 0) return a;
  else return gcd(b, a % b);
}
