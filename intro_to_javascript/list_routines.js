// [A, B, C, D, E] ==> [B, D, E]
// function filterLike(arr) {
//     let index;
//     for (index = 0; index < arr.length; index++) {
//         let curElement = arr[index];
//         if (curElement is what we want) { // filter's condition
//             // in filter: retain element
//             // in filterLike: process element directly
//             ...
//         }
//     }
// }

// [A, B, C, D, E] ==> [A', B', C', D', E']
// function mapLike(arr) {
//     let index;
//     for (index = 0; index < arr.length; index++) {
//         let curElement = arr[index];
//         // some operation that gives back new element
//         let newElement = something involving curElement;
//     }
// }

// [A, B, C, D, E] ==> Int
function sum(arr) {
    let index;
    let total = 0;
    for (index = 0; index < arr.length; index++) {
        // total += arr[index];
        total = total + arr[index];
    }
    return total;
}

function sumWithReduce(arr) {
    return reduce(arr, (runningSum, arrElement) => runningSum + arrElement, 0);
}

// [A, B, C, D, E] ==> Int
function product(arr) {
    let index;
    let runningProduct = 1;
    for (index = 0; index < arr.length; index++) {
        runningProduct = runningProduct * arr[index];
    }
    return runningProduct;
}

function productWithReduce(arr) {
    return reduce(arr, (product, arrElement) => product * arrElement, 1);
}

// [A, B, C, D, E] ==> F
// operation: function with signature:
//    (Accumulator, CurrentArrayElement) => NewAccumulator
function reduce(arr, operation, initialAccumulator) {
    let index;
    let accumulator = initialAccumulator;
    for (index = 0; index < arr.length; index++) {
        accumulator = operation(accumulator, arr[index]);
    }
    return accumulator;
}
