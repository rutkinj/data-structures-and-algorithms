package datastructures.graph;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {
  @Test void makeGraph(){
    Graph<String> sut = new Graph<>(10);
    assertNotNull(sut);
  }

  @Test void addVertex(){
    Graph<String> sut = new Graph<>(10);
    Vertex<String> newVert = sut.addVertex("Bingbong");
    Set<Vertex<String>> verts = sut.getVertices();
    assertTrue(verts.contains(newVert));
  }

  @Test void addEdge(){
    Graph<String> sut = new Graph<>(10);
    Vertex<String> firstVert = sut.addVertex("Bingbong");
    Vertex<String> secondVert = sut.addVertex("potato");
    sut.addEdge(firstVert, secondVert);
    assertEquals(sut.getNeighbors(firstVert).peek().destination, secondVert);
  }

  @Test void getVertices(){
    Graph<String> sut = new Graph<>(10);
    Vertex<String> firstVert = sut.addVertex("Bingbong");
    Vertex<String> secondVert = sut.addVertex("potato");
    Vertex<String> thirdVert = sut.addVertex("eraser");
    Set<Vertex<String>> allVerts = sut.getVertices();
    assertTrue(allVerts.contains(thirdVert));
    assertTrue(allVerts.contains(secondVert));
    assertTrue(allVerts.contains(firstVert));
  }
}
