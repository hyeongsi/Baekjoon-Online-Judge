const input = require('fs')
    .readFileSync(0, "utf-8")
    .trim()
    .split(/\r?\n/)
    .map(Number);

input.shift();

const diffs = input.slice(1).map((v, i) => v - input[i]);

function gcd(a, b) {
    while (b !== 0) [a, b] = [b, a % b];
    return a;
}

const GCD = diffs.reduce((pv, cv) => gcd(pv, cv));

const inputSet = new Set(input);

const minVal = Math.min(...input);
const maxVal = Math.max(...input);

const result = (maxVal - minVal)/ GCD + 1 - input.length;
console.log(result);