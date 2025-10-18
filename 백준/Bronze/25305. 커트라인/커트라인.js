const fs = require('fs');
const inputs = fs.readFileSync('./dev/stdin').toString().trim().split('\n');

const awardCriteria = inputs[0].split(" ");
const scores = inputs[1].split(" ");

scores.sort((a, b) => b - a);
console.log(scores[awardCriteria[1] - 1]);