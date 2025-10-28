const fs = require("fs");
const input = fs.readFileSync("./dev/stdin").toString().trim().split("\n");

const set = new Set();
const myCards = input[1].split(" ").map(Number);
const ckCards = input[3].split(" ").map(Number);
myCards.forEach((value) => set.add(value));

console.log(ckCards.map((value) => (set.has(value) ? "1" : "0")).join(" "));