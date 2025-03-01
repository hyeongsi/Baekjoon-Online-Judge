const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().trim();

const alpahbet = new Map();
let max = 0;
for (let i = 0; i < input.length; i++) {
    const key = input[i].toUpperCase();
    const value = alpahbet.get(key) + 1 || 1;
    alpahbet.set(key, value);

    if (value > max)
        max = value;
}

let result = "";
alpahbet.forEach((value, key) => {
    if (max === value) {
        result = result != "" ? "?" : key;
    }
});

console.log(result);
