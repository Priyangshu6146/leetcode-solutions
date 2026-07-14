var isPalindrome = function (x) {
    let original = x + "";
    let reverced = [];
    for (let i = 0; i < original.length; i++) {
        let j = original.length - i - 1;
        reverced.push(original[j]);

    }
    reverced = reverced.join("");
    if (original === reverced) {
        return true;
    } else {
        return false;
    }
}

isPalindrome(121)