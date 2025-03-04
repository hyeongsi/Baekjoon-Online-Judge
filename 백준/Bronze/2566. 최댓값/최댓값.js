const fs = require('fs');
const inputs = fs.readFileSync('./dev/stdin').toString().trim().split("\n");

const SIZE = 9;
let max = 0;
let y = 0;
let x = 0;

for (let i = 0; i < SIZE; i++) {
    max = inputs[i].trim()
                    .split(" ")
                    .map(Number)
                    .reduce((previousValue, currentValue, currentIndex) => {
        if (previousValue < currentValue) {
            y = i;
            x = currentIndex;
            return currentValue;
        }
        return previousValue;
    }, max);
}

console.log(max);
console.log(y + 1, x + 1);