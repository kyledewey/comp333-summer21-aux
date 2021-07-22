// use of higher-order function
// check: ArrayElement => Boolean
function printSome(arr, check) {
    let index;
    for (index = 0; index < arr.length; index++) {
        let curElement = arr[index];
        if (check(curElement)) {
            console.log(curElement);
        }
    }
}

function returnsTrue(x) {
    return true;
}

function printAll(arr) {
    // Example #0
    printSome(arr, returnsTrue);
    
    // // Example #1
    // printSome(arr, (x) => true);

    // // Example #2
    // printSome(arr, function (x) { return true; });

    // // Example #3
    // let f = function (x) { return true; };
    // printSome(arr, f);
}

function printAllLessThanFive(arr) {
    let index;
    for (index = 0; index < arr.length; index++) {
        let curElement = arr[index];
        if (curElement < 5) {
            console.log(curElement);
        }
    }
}

function printAllGreaterThan(arr, value) {
    let index;
    for (index = 0; index < arr.length; index++) {
        let curElement = arr[index];
        if (curElement > value) {
            console.log(curElement);
        }
    }
}

function printAllNotEqual(arr, value) {
    let index;
    for (index = 0; index < arr.length; index++) {
        let curElement = arr[index];
        if (curElement != value) {
            console.log(curElement);
        }
    }
}

