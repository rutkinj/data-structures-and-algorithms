# Data Structures

## Implementation Notes

## Code Challenges

### Challenge 05

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
- insert(value)
  - adds a new note as the head on the linked list
- includes(value)
  - searches through the linked list for a particular value
  - returns a boolean
- toString()
  - returns a visual string representation of the linked list

Location: `codechallenges/linkedlist/LinkedListChallenges`

Method: `linkedListChallenge06()`
