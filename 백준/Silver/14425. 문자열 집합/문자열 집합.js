const fs = require("fs");
const input = fs.readFileSync("./dev/stdin").toString().trim().split("\n");

const [setSize, inputSize] = input[0].split(" ");

const set = new Set();
let cnt = 0;
input.slice(1).forEach((value, index) => {
  if (setSize > index) {
    set.add(value);
  } else {
    if (set.has(value)) {
      cnt++;
    }
  }
});

console.log(cnt);
