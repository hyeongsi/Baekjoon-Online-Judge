const input = require('fs').readFileSync(0).toString().trim().split(/\r?\n/);


const n = Number(input[0]);
const nCard = input[1].split(" ").map(Number);
const m = Number(input[2]);
const mCard = input[3].split(" ").map(Number);

const card = new Map();

for (let i = 0; i < n; i++) {
    const num = nCard[i];
    card.set(num, (card.get(num) || 0) + 1);
}

const result = mCard.map(num => card.get(num) || 0);

console.log(result.join(" "))