const fs = require('fs');
const inputs = fs.readFileSync('./dev/stdin').toString().trim().split("\n").map(e => e.trim());

const maxLength = Math.max(...inputs.map(e => e.length));
let ans = "";
let idx = 0;
let rIdx = 0;
while (rIdx < maxLength) {
    rIdx = parseInt(idx / 5);

    if (inputs[idx % 5].length > rIdx) {
        ans += inputs[idx % 5].charAt(rIdx);
    }

    idx++;
}

console.log(ans);
