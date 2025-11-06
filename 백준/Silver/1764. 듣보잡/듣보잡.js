const input = require('fs').readFileSync(0).toString().trim().split(/\r?\n/);

const [n, m] =input[0].split(" ").map(Number);
const nPeople = input.slice(1, n + 1);
const mPeople = input.slice(n + 1);      
const target = new Set(nPeople);

const result = mPeople.filter((i) => target.has(i)).sort();

console.log(result.length + "")
console.log(result.join("\n"))