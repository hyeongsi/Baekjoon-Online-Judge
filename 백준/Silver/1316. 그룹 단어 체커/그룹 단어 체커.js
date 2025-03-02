const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().trim().split("\n").map(v => v.trim());

const words = input.slice(1);
let result = words.length;

for (let i = 0; i < words.length; i++) {
    const word = words[i];

    const set = new Set();
    let prev = words[i].charAt(0);
    for (let j = 0; j < word.length; j++) {
        const key = word[j];

        if (prev !== key) {
            if (set.has(key)) {
                result-=1;
                break;
            }
        }

        set.add(key);
        prev = key;
    }
}

console.log(result);
