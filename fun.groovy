println "This is git fun with groovy."

// lists
def list = ["abc","def", "a"]
def list2 = ["def","a","z"]
assert list.size() == 3

println list.sort()
assert list == ["a", "abc","def"]

assert list.intersect(list2).sort() == ["a", "def"]

// maps
def map = [
	Bob : 42,
	Alice: 54,
	Max : 33
]


map.each { entry ->
	println "Name: $entry.key ==> Age: $entry.value"
}