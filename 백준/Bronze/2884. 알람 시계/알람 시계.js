const fs = require('fs');

const [hh, mm] = fs.readFileSync('./dev/stdin')
    .toString()
    .split(' ')
    .map(Number);

const timestamp = hh * 60 + mm;
var alarmTimestamp = timestamp - 45;

if (alarmTimestamp < 0) {
    alarmTimestamp += 24 * 60;
}

const hour = Math.trunc(alarmTimestamp / 60);
const minute = alarmTimestamp % 60;

console.log(hour, minute);