const fs = require("fs");
const input = fs.readFileSync("./dev/stdin").toString().trim().split("\n");

const [n, m] = input[0].split(" ").map(Number);
const dm = input.slice(1, n + 1);
const bm = input.slice(n + 1);

const dmSet = new Set(dm);
const result = bm.filter((i) => dmSet.has(i)).sort();

console.log(result.length);
console.log(result.join("\n"));
