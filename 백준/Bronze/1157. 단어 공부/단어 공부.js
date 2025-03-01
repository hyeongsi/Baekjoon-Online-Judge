const fs = require('fs');
const input = fs.readFileSync('./dev/stdin').toString().trim();

const word = input.toUpperCase();
const hash = {};
for (let i = 0; i < word.length; i++) {
    hash[word[i]] = (hash[word[i]] || 0) + 1;
}
const max = Math.max(...Object.values(hash));
const ans = Object.keys(hash).filter(v => hash[v] == max );
console.log(ans.length > 1 ? '?' : ans[0]);