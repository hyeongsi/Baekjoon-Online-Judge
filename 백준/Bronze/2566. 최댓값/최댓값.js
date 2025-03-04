const fs = require('fs');
const inputs = fs.readFileSync('./dev/stdin').toString().trim().split("\n")
                                                        .map((value, index) => value.split(" ").map(Number))

const max = Math.max(...inputs.flat());
let answer = '';

for (let i = 0; i < 9; i++) {
    for (let j = 0; j < 9; j++) {
        if (inputs[i][j] === max) {
            answer += `${max}\n${i + 1} ${j + 1}`;
            console.log(answer);
            return;
        }
    }
}