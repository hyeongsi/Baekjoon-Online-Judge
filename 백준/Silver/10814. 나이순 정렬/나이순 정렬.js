const fs = require("fs");
const [num, ...words] = fs
  .readFileSync("./dev/stdin")
  .toString()
  .trim()
  .split("\n");

const newWords = words
  .map((word, index) => {
    const [num, str] = word.split(" ");
    return { num: Number(num), str, index };
  })
  .sort((a, b) => {
    if (a.num === b.num) {
      return a.index - b.index;
    }

    return a.num - b.num;
  })
  .forEach(({ num, str }) => {
    console.log(`${num} ${str}`);
  });
