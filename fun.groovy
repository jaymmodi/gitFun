println "This is git fun with groovy."

def list = ["abc","def", "a"]
def list2 = ["def","a","z"]
assert list.size() == 3

println list.sort()
assert list == ["a", "abc","def"]

assert list.intersect(list2).sort() == ["a", "def"]