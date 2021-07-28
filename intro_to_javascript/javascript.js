// predicate: function that returns a boolean

// use of higher-order function
// myFunction: ArrayElement => Boolean
function printSome(arr, myFunction) {
    let index;
    for (index = 0; index < arr.length; index++) {
        let curElement = arr[index];
        if (myFunction(curElement)) {
            console.log(curElement);
        }
    }
}

function returnsTrue(x) {
    console.log("RETURNS TRUE CALLED WITH: " + x);
    return true;
}

function printAll(arr) {
    // Example #0
    printSome(arr, returnsTrue);
}

function printAllLessThanFive(arr) {
    printSome(arr, (curElement) => curElement < 5);
}

function printAllGreaterThan(arr, value) {
    // creates a closure - requires memory allocation
    printSome(arr, function (curElement) {
        return curElement > value;
    });
}

function printAllNotEqual(arr, value) {
    let tempFunction = function (curElement) {
        return curElement != value;
    };
    printSome(arr, tempFunction);
}

function doSomething(value) {
    if (value) {
        console.log("value was true");
    } else {
        console.log("value was " + value);
    }
}

// indirectWhile Call:
// indirectWhile(
//   () => x < 10,
//   function() {
//     console.log(x);
//     x++;
//   })
//
// equivalent while loop:
// while (x < 10) {
//   console.log(x);
//   x++;
// }

function indirectWhile(funcA, funcB) {
    if (funcA()) {
        funcB();
        indirectWhile(funcA, funcB);
    }
}
