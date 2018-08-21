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

// keys in maps should not be Gstrings -- example
def key = "jay";
map.put("${key.toUpperCase()}",26)

assert map.get('JAY') == null

map.each { entry ->
	println "Name: $entry.key ==> Age: $entry.value"
}

// grouping of list to create maps
assert [
        [name: 'Clark', city: 'London'], [name: 'Sharma', city: 'London'],
        [name: 'Maradona', city: 'LA'], [name: 'Zhang', city: 'HK'],
        [name: 'Ali', city: 'HK'], [name: 'Liu', city: 'HK'],
].groupBy { it.city } == [
        London: [[name: 'Clark', city: 'London'],
                 [name: 'Sharma', city: 'London']],
        LA    : [[name: 'Maradona', city: 'LA']],
        HK    : [[name: 'Zhang', city: 'HK'],
                 [name: 'Ali', city: 'HK'],
                 [name: 'Liu', city: 'HK']],
]

// map literals
def a = 'Bob'
def ages = [(a): 43]
assert ages['Bob'] == 43