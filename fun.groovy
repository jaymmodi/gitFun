println "This is git fun with groovy."

def list = ["abc","def", "a"]
assert list.size() == 3

println list.sort()
assert list == ["a", "abc","def"]