const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim();
//
let result = "";

function getGCD(a, b) {
  return b === 0 ? a : getGCD(b, a % b);
}

function getLCM(a, b) {
  return (a * b) / getGCD(a, b);
}

const [A, B] = input.split(" ").map(Number);
if (A > B) {
  result += `${getLCM(B, A)}\n`;
} else {
  result += `${getLCM(A, B)}\n`;
}

console.log(result);
