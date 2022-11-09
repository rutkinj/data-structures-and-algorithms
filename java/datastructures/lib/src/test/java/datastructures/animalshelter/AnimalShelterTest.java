package datastructures.animalshelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalShelterTest {
  @Test void makeNewAnimalShelter(){
    AnimalShelter sut = new AnimalShelter();
    assertNotNull(sut);
  }

  @Test void testEnqueueDequeue(){
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue("cat");
    sut.enqueue("dog");
    assertEquals("cat", sut.dequeue("cat"));
  }
}
