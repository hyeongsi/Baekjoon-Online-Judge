const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const N = parseInt(input[0]);
const coords = input[1].split(" ").map(Number);

const uniqueSorted = [...new Set(coords)].sort((a, b) => a - b);

const compressMap = new Map();
uniqueSorted.forEach((value, index) => {
  compressMap.set(value, index);
});

const result = coords.map((coord) => compressMap.get(coord));

console.log(result.join(" "));
