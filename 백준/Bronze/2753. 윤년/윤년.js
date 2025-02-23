const fs = require('fs');

const year = fs.readFileSync('./dev/stdin')
    .toString();

function isLeapYear(year) {
    const now = new Date(year, 1, 29);
    return (now.getMonth() == 1) ? 1 : 0;
}

console.log(isLeapYear(Number(year)));