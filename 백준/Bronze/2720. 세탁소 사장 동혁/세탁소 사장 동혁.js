const fs = require('fs');
const inputs = fs.readFileSync('./dev/stdin').toString().trim().split("\n").map(e => parseInt(e.trim()));

const coins = [25, 10, 5, 1];
for (let i = 1; i <= inputs[0]; i++) {
    let change = "";

    coins.forEach(coin => {
        change += Math.floor(inputs[i] / coin) + " ";
        inputs[i] %= coin;
    })

    console.log(change);
}