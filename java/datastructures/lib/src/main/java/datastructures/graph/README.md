# Graphs

## Challenge
Implement a graph from scratch. It should be able to add vertices and connect them via edges.

## Approach & Efficiency
The graph is a hashmap which holds vertices as keys and linked lists (containing edges) as values. Efficiency varies from method to method, but overall things are pretty quick thanks to hashing. Things get more costly the more interconnected the graph is.

## API
`addVertex(value)` creates and adds a new vertex with the given value to the graph and returns the new vertex. If the value is already present in the graph, it will not be overwritten. Underlying structure is a hashmap so adding a vertex is O(1).

`addEdge(startVertex, destinationVertex)` Creates a new edge with given parameters. O(n) where n is the number of edges startVertex already has.

`getVertices()` Returns all vertices in the graph as a set. O(n) where n is the size of the graph.

`getNeighbors(vertex)` Returns all neighbors of the given vertex as a linked list. If the vertex has no neighbors, an empty linked list is returned. O(1) as the information is retrieved from a hashmap.

`size()` Returns the number of vertices contained in the graph. O(1) as this is just a simple getter method.
