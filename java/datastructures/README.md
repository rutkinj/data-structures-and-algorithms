# Data Structures

## Implementation Notes

## Code Challenges

### Challenge 05 && 06

#### Singly Linked List
Implement a linked list and nodes.

#### Challenge
Create linked list and node classes. Implement testing for various scenarios

#### Approach & Efficiency
Both linked list and node classes are pretty barebones with simple constructors.
Efficiency:
- insert is O(1) for time and space as it only ever interacts with two nodes.
- includes and toString are O(n) for time, the function must iterate through every node
- toString is O(n) on space as it recreates the input.

#### API
###### lab-05
- insert(value)
  - adds a new node with value as the head on the linked list
- includes(searchValue)
  - searches through the linked list for a particular value
  - returns a boolean
- toString()
  - returns a visual string representation of the linked list
###### lab-06
- append(value)
  - adds new node with value as tail of linked list
- insertBefore(searchTerm, value)
  - adds new node with value **before** node with value of searchTerm
  - if searchTerm not found, souts an error message
- insertAfter(searchTerm, value)
  - adds new node with value **after** node with value of searchTerm
  - if searchTerm not found, souts an error message

Location: `codechallenges/linkedlist/LinkedListChallenges`

Method: `linkedListChallenge06()`
