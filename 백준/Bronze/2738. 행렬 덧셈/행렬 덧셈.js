const fs = require('fs');
const inputs = fs.readFileSync('./dev/stdin').toString().trim().split("\n");

const [n, m] = inputs[0].trim().split(' ').map(Number);
const matrix = [];

for (let y = 1; y <= n; y++) {
    const aLine = inputs[y].trim().split(" ").map(Number);
    const bLine = inputs[y + n].trim().split(" ").map(Number);

    const sumLine = aLine.map((value, index) => {
        return value + bLine[index];
    });
    matrix.push(sumLine);
}

for (const line of matrix) {
    console.log(line.join(" "));
}