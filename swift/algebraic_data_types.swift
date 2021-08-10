// booleans: algebraic data type
// allows you to create a sum type
// (Int OR Bool)

// needed: a way to introduce a type
//   booleans: true and false
// needed: a way to check which value a type is
//   booleans: if/else

func doSomething(_ b: Bool) {
	if b {
		print("it's true")
	} else {
		print("it's false")
	}
}

// Swift:
//   introduce a type: enum
//   checking a value: switch

/*enum Bool {
	case true
	case false
}*/

enum IntOrBool {
	case isInteger(Int)
	case isBoolean(Bool)
	case isString(String)
}


let ib: IntOrBool =
  IntOrBool.isString("foobar");

// if it's an integer, add one and print
// the result
// if it's a boolean, negate it and print the
// result
// switch (in Swift) performs pattern matching
switch ib {
	case .isInteger(7):
		print("it's seven!")
	case .isInteger(let i):
		// i: Int = 7
		// code to execute if it's an integer
		print(i + 1)
	case .isBoolean(true):
		print("it's true!")
	case .isBoolean(let b):
		// code to execute if it's a boolean
		print(!b)
	case .isString("foobar"):
		print("FOOBAR")
	case .isString(let s):
		print(s)
}

// recursive data structure
indirect enum BinaryTree {
	case leafNode
	case internalNode(BinaryTree,
					  Int,
					  BinaryTree)
}

//   6
//  / \
//  X  X
let tree1 = BinaryTree.internalNode(
	BinaryTree.leafNode,
	6,
	BinaryTree.leafNode
)
print(tree1)

//     8
//    / \
//    7  X
//   / \
//   X  X
let tree2 = BinaryTree.internalNode(
	BinaryTree.internalNode(
		BinaryTree.leafNode,
		7,
		BinaryTree.leafNode
	),
	8,
	BinaryTree.leafNode
)
print(tree2)
