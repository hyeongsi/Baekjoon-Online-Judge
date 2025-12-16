const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const [x1, y1] = input[0].split(' ').map(Number);
const [x2, y2] = input[1].split(' ').map(Number);

const x3 = x1 * y2 + x2 * y1;
const y3 = y1 * y2;

let r = GCD(x3, y3);
console.log(x3 / r, y3 / r);
function GCD(a, b) {
  if (b === 0) return a;
  return GCD(b, a % b);
}