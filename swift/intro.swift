func printSomething(_ myString: String) {
	print(myString)
}

func returnParam(param: Int) -> Int {
	return param
}

// f is of type: (Int) -> Int
func callWithFive(_ f: (Int) -> Int) -> Int {
	return f(5)
}


// let addOne = x => x + 1; // JavaScript
let addOne = { x in x + 1 };

let addTwo = { (a: Int, b: Int) in a + b };
print(addOne(17))
let temp = callWithFive(addOne)
print(temp)
