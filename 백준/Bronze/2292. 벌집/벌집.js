const fs = require('fs');
let n = fs.readFileSync('./dev/stdin').toString().trim();

n = parseInt(n);
let compare = 1;
let result = 1;

while (compare < n) {

    compare += (6 * result);
    result++;
}

console.log(result);