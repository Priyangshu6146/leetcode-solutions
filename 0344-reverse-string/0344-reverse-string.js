/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function (s) {
for(let i=0;i<(s.length/2);i++){
    let firstidx=i;
    let lastidx=(s.length-1)-i;
    [s[firstidx],s[lastidx]]=[s[lastidx],s[firstidx]];
}
console.log(s);
};
reverseString( ["h","e","l","l","o"]);