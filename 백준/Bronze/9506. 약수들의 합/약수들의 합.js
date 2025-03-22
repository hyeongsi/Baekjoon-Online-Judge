const fs = require('fs');
let input = fs.readFileSync('./dev/stdin').toString().trim().split("\n").map(e => e.trim());

for (let i = 0; i < input.length - 1; i++) {
    const n = parseInt(input[i]);
    const set = new Set();
    for (let j = 1; j <= Math.sqrt(parseInt(input[i])); j++) {
        if (n % j == 0) {
            set.add(j);
            set.add(n / j);
        }
    }

    const sort = [...set].sort((a, b) => a - b).slice(0, -1);
    const sum = sort.reduce((acc, cur) => acc + cur, 0);
    if (n === sum) {
        console.log(`${n} =`, sort.join(' + '));
    } else {
        console.log(`${n} is NOT perfect.`);
    }
}