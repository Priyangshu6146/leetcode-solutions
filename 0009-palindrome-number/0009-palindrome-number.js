var isPalindrome = function (x) {
    let demo = x + "";
    let reverced = [];
    for (let i = demo.length - 1; i >= 0; i--) {
        reverced.push(demo[i]);

    }
    reverced = reverced.join("");

    if (demo === reverced) {
        return true;
    } else {
        return false;
    }
};
isPalindrome(121)