const fs = require("fs");
const [num, ...words] = fs
  .readFileSync("./dev/stdin")
  .toString()
  .trim()
  .split("\n");

const distinctWords = [...new Set(words)];

console.log(
  distinctWords
    .sort((a, b) => {
      if (a.length === b.length) {
        return a.localeCompare(b);
      }

      return a.length - b.length;
    })
    .join("\n")
);
