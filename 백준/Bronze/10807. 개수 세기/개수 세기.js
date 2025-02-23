const fs = require('fs');
const [loop, inputs, target] = fs.readFileSync('./dev/stdin').toString().trim().split("\n");

let ans = 0;
inputs.split(" ").forEach(item => {
    if (target == item)
        ans++;
});

console.log(ans);