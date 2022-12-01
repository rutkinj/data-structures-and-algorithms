# HashMap

## Challenge
Implement a HashMap class from scratch.

## Approach & Efficiency
The base HashMap is initialized with an empty LinkedList at each index. So creating a hashmap has is O(n), n being the initial size of the HashMap.

If the HashMap contains no collisions, `set`, `get`, and `has` are all O(1) as they use a hash method to determine where they need to look. If there are collisions, they become O(c) where c is the number of collisions. If your HashMap is large and your hashing is effective, collisions should remain quite low.

`keys` is 0(n + c), iterates through every kv in the HashMap.

## API
- `set(key, value)` Creates a kv object and then places it in an appropriate location in the hashmap. If a passed in key already exists, then that keys value is updated. Handles collision.
- `get(key)` Returns the value of the given key. Return null if no key found.
- `has(key)` Returns true if the key is found, otherwise returns false.
- `keys` Returns an ArrayList containing all keys in the HashMap
