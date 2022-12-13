package datastructures.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int maxNumberOfVertices)
  {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    Vertex<T> newVertex = new Vertex<>(value);
    numberOfVertices++;
    return newVertex;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    Edge<T> newEdge = new Edge<>(destination, weight);
    LinkedList<Edge<T>> edges = adjacencyLists.get(start);
    if (edges == null) { //<-- this might be problematic
      edges = new LinkedList<>();
    }
    edges.add(newEdge);
    adjacencyLists.put(start, edges);
  }

  public Set<Vertex<T>> getVertices()  // getNodes()
  {
    return adjacencyLists.keySet();
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
  {
    // TODO: implement me
    return adjacencyLists.getOrDefault(vertex, new LinkedList<>());
  }

  public int size()
  {
    return numberOfVertices;  // TODO: make sure this gets updated at the right times
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    // Good for testing
    // WARNING: Your HashMap does not guarantee ordering!
    // But you can basically rely on it if you add nodes to your graphs in a consistent way

    return "";
  }
}

