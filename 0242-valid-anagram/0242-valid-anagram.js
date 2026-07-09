/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
   
    let tdemo=[];
    let tdemo2=t.split("");
    if (s.length==tdemo2.length){
    for (let i=0;i<s.length;i++){
        
            for (let j=0;j<tdemo2.length;j++){
                if(s[i]==tdemo2[j]){
                   tdemo.push(tdemo2[j]);
                   tdemo2.splice(j,1);
                   break;
                }
            }
        }
        } else {
            return false;
        }
tdemo= tdemo.join("");
         if(s===tdemo){
            return true;
        }else {
            return false;
        }
    
    
};
isAnagram("anagram","nagaram");