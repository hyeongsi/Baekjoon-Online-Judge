const fs = require("fs");
const [num, ...posStr] = fs
  .readFileSync("./dev/stdin")
  .toString()
  .trim()
  .split("\n");

const pos = [];
posStr.forEach((value, index, array) => {
  pos.push(value.split(" ").map(Number));
});

pos.sort((a, b) => {
  if (a[1] === b[1]) {
    return a[0] - b[0];
  }
  return a[1] - b[1];
});

let ans = "";
pos.forEach((value, index, array) => {
  ans += value.join(" ") + "\n";
});
console.log(ans);
