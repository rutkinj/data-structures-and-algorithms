# Data Structures

## Challenge 05 && 06 && 07

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

###### cc-05
`insert(value)`
  - adds a new node with value as the head on the linked list

`includes(searchValue)`
  - searches through the linked list for a particular value
  - returns a boolean

`toString()`
  - returns a visual string representation of the linked list
###### cc-06

`append(value)`
  - adds new node with value as tail of linked list

`insertBefore(searchTerm, value)`
  - adds new node with value **before** node with value of searchTerm
  - if searchTerm not found, souts an error message

`insertAfter(searchTerm, value)`
  - adds new node with value **after** node with value of searchTerm
  - if searchTerm not found, souts an error message
###### cc-07
`kthFromEnd(k)`
  - returns value at index k from tail

Approach and Efficiency

Tried for tortoise and hare --> one pointer runs through LL to end with second pointer trailing `k` nodes behind. I tried to timebox 1 hour and at like minute 50 I realized I had some sort of off by one issue and then broke everything while "fixing" the issue. Got all tests passing but needs some work.
- O(n) time --> must run through entire ll
- O(1) space --> create set number of variables

[Whiteboard](img/kth.png)

###### cc-08
`linkedListZip(LL1, LL2)`
  - zips two linked lists together by alternating nodes
  - currently only "happy path" works

Approach and Efficiency

Implemented solution with two pointers and two temps
- O(2n) time --> must run through both ll (and I think 2n is a valid big O?)
- O(1) space --> four pointers regardless of ll size

[Whiteboard](img/zip.png)

## Challenge 10

Stacks and Queues. Implement stacks and queues using linked list class as a guide.

## Approach & Efficiency
Both classes are barebones implementations with only the ability to add and remove nodes one at a time. All methods have O(1) for both time and space complexity.

## API
### Stack
`push(value)`
- adds a new node with value to the top of the stack

`pop()`
- removes the top node from the stack and returns its value

`peek()`
- returns the value of the stacks top node

`isEmpty()`
- returns a boolean indicating whether there are any nodes in the stack

### Queue
`enqueue(value)`
- adds a new node with value to the end of the queue

`dequeue()`
- removes the node at the front of the queue and returns its value

`peek()`
- returns the value of the queues front node

`isEmpty()`
- returns a boolean indicating whether there are any nodes in the queue


Location: `codechallenges/linkedlist/LinkedListChallenges`

Method: `linkedListChallenge06()`
