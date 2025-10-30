const fs = require("fs");
const [cnt, ...inputs] = fs
  .readFileSync("./dev/stdin")
  .toString()
  .trim()
  .split("\n");

const set = new Set();
inputs.forEach((value) => {
  const [name, inout] = value.trim().split(" ");
  inout === "enter" ? set.add(name) : set.delete(name);
});

console.log([...set].sort().reverse().join("\n"));
