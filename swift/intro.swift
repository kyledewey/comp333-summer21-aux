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

func indirectIf(
	_ a: Bool,
	ifTrue: () -> Int,
	ifFalse: () -> Int) -> Int {
	
	return a ? ifTrue() : ifFalse()																	  
}

print(indirectIf(true, ifTrue: {1 + 1}, ifFalse: {2 + 2}))
