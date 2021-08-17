enum 2TupleWithName<A, B> {
    case tup(A, B)
}

// indirect enum List {
//     case Nil
//     case Cons(Int, List)
// }

// version with type variable A
// List is paramerized by A - generic type
indirect enum List<A> {
    case Nil
    case Cons(A, List<A>)
}

// generic length function
// parametric polymorphism
func length<B>(_ list: List<B>) -> Int {
    switch list {
    case .Nil: return 0
    case .Cons(_, let rest): return length(rest) + 1
    }
}

func returnsTwoThings() -> (Int, Bool) {
    return (17, true)
}

func main() {
    let (x, b) = returnsTwoThings()
}

let myList/*: List<Int>*/ = List.Cons(1, List.Cons(4, List.Cons(8, List.Nil)))
print(length(myList)) // prints 3

let myList2/*: List<String>*/ = List.Cons("foo", List.Cons("bar", List.Nil)) // doesn't compile
print(length(myList2)) // prints 2

// tuple: fixed number of things inside, fixed at compile time
// types of the items inside are fixed at compile time

// 2-tuple (pair)
let tup1: (String, Int) = ("foo", 42)

// 3-tuple (triple)
let tup2: (String, Bool, Int) = ("bar", false, 70)

let (a, b) = tup1
print(a)
print(b)

let (_, c, _) = tup2
print(c)

print(tup2.0)

let list = List.Cons(1, List.Nil);

switch list {
case .Cons(let head, let tail):
    List<B>.Cons(f(head), map(tail, f))
case .empty: // List<A>
    List<B>.Nil
}
