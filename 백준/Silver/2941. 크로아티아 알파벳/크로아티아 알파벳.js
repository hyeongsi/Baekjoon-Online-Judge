const fs = require('fs');
let input = fs.readFileSync('./dev/stdin').toString().trim();

const croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z='];
for (let i = 0; i < croatia.length; i++) {
    input = input.replaceAll(croatia[i], '1');
}
console.log(input.length);
