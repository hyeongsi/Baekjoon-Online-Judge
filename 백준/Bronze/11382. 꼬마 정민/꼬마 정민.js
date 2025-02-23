const fs = require('fs');

const input = fs.readFileSync('./dev/stdin').toString().split(' ');

const sum = input.reduce((previousValue, currentValue, currentIndex, array) => {
    return Number(previousValue) + Number(currentValue);
}, 0);

console.log(sum);