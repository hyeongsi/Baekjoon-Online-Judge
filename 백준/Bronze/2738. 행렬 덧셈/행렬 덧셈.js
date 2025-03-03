const fs = require('fs');
const inputs = fs.readFileSync('./dev/stdin').toString().trim().split("\n");

const [n, m] = inputs[0].trim().split(' ').map(Number);

const a = inputs.slice(1, n + 1).map(row => row.split(' ').map(Number));
const b = inputs.slice(-n).map(row => row.split(' ').map(Number));

const result = a.map((row, i) => {
    return row.map((val, j) => {
        return val + b[i][j];
    })
});
console.log(result.map(row => row.join(' ')).join('\n'));