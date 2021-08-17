// extension - a way of attaching methods
// to values of a specified type

// func increment_real(_ mySelf: Int) -> Int {
//     return mySelf + 1
// }

// // ...
// let y = increment_real(x);


extension Int {
    func increment() -> Int {
        // self in Swift is basically this in Java/C++
        // self: Int
        return self + 1
    }
}

let x = 12;
let y = x.increment();
//print(y); // prints 13


// doesn't work - not "nominal" according to Swift
// (doesn't have a name)
//
// extension (Int, Int) {
//     func add() -> Int {
//         return self.0 + self.1
//     }
// }

indirect enum List<A> {
    case Nil
    case Cons(A, List<A>)
}

protocol Plus {
    func add(_ other: Self) -> Self;
}

extension Int : Plus {
    // +: (Int, Int) -> Int
    func add(_ param: Int) -> Int { return self + param }
}

extension String : Plus {
    // +: (String, String) -> String
    func add(_ param: String) -> String { return self + param }
}

extension Bool : Plus {
    func add(_ param: Bool) -> Bool { return self || param }
}

extension Plus {
    func printHello() {
        print("hello")
    }
}

protocol Test {
    func createValue() -> Self;
}

extension Int : Test {
    func createValue() -> Int {
        return 0;
    }
}

// want to say: A implements the add method
//   sum<A : Plus>
func sum<A>(_ elements: List<A>, _ zero: A) -> A
  where A : Plus, A : Test {
    switch elements {
    case .Nil: return zero
    case .Cons(let head, let tail): return head.add(sum(tail, zero))
    }
}

let temp1 = 12.add(3);
temp1.printHello()
let temp2 = "foo".add("bar");

let list1 = List.Cons("foo", List.Cons("bar", List.Cons("baz", List.Nil)))
print(sum(list1, ""))

let list2 = List.Cons(1, List.Cons(2, List.Cons(3, List.Nil)))
print(sum(list2, 0))

let list3 = List.Cons(true, List.Cons(false, List.Nil))
print(sum(list3, false)) // fails to compile - Bool does not implement Plus
