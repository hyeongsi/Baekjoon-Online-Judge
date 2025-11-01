const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? 0 : "./input.txt", "utf-8")
  .trim()
  .split("\n");

const [n, m] = input[0].split(" ").map(Number);

const book = input.slice(1, n + 1);
const test = input.slice(n + 1);

const bookMap = new Map();
book.forEach((pokemon, idx) => bookMap.set(pokemon, idx + 1));

const res = test.map((q) => {
  if (Number.isInteger(Number(q))) {
    return book[Number(q) - 1];
  } else {
    return bookMap.get(q);
  }
});

console.log(res.join("\n"));
