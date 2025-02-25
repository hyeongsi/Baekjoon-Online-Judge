const fs = require('fs');
const input = fs.readFileSync('./dev/stdin')
    .toString()
    .split("\n")

const [N, M] = input[0].split(' ').map(Number);
let baskets = Array.from({length: N}, (_, i) => i + 1);

const reverseBasket = (baskets, i, j) => {
    while(i < j) {
        [baskets[i], baskets[j]] = [baskets[j], baskets[i]];
        i++;
        j--;
    }
}

for (let n = 0; n < M; n++) {
    const [i, j] = input[n + 1].split(" ").map(num => num - 1);
    reverseBasket(baskets, i, j);
}

console.log(baskets.join(" "));
