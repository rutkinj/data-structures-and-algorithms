package datastructures.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTests {
  @Test void newHashMap(){
    HashMap sut = new HashMap<>(5);
    assertEquals(sut.size, 5);
  }
  @Test void addPairToHashMap(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
  }
  @Test void addDupeKeyToHashMapCheckValue(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    sut.set("bingbong","ditdah");
    assertEquals("ditdah", sut.get("bingbong"));
  }
  @Test void addDupeKeyToHashMapCheckKeys(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    sut.set("bingbong","ditdah");
    assertEquals(1, sut.keys().size());
  }
  @Test void collisionHandlingCheckKeys(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    sut.set("potato","ditdah");
    assertEquals(2, sut.keys().size());
  }
  @Test void hasIsTrue(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    assertTrue(sut.has("bingbong"));
  }
  @Test void hasIsTrueWithCollision(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    sut.set("potato", "potahtoe");
    assertTrue(sut.has("potato"));
  }
  @Test void hasIsFalse(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    assertFalse(sut.has("diggity"));
  }
  @Test void getSuccess(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    assertEquals("yeehaw", sut.get("bingbong"));
  }
  @Test void getReturnsNull(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong","yeehaw");
    assertEquals("yeehaw", sut.get("bingbong"));
  }
  @Test void returnAllKeys(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong", "yeehaw");
    sut.set("potato", "potahtoe");
    sut.set("tomato", "tomahtoe");
    assertEquals(3, sut.keys().size());
  }
  @Test void returnValueFromCollision(){
    HashMap sut = new HashMap<>(5);
    sut.set("bingbong", "yeehaw");
    sut.set("potato", "potahtoe");
    sut.set("tomato", "tomahtoe");
    assertEquals("potahtoe", sut.get("potato"));
  }
  @Test void findRepeatedWord(){
    HashMap sut = new HashMap<>(50);
    assertEquals("a", sut.repeatedWord("Once upon a time, there was a brave princess who..."));
  }
  @Test void findRepeatedWordToo(){
    String bigInput = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
    HashMap sut = new HashMap<>(50);
    assertEquals("it", sut.repeatedWord(bigInput));
  }
  @Test void noRepeatedWord(){
    HashMap sut = new HashMap<>(50);
    assertEquals(null, sut.repeatedWord("Once upon da time, there was a brave princess who..."));
  }
  @Test void emptyInputString(){
    HashMap sut = new HashMap<>(50);
    assertEquals(null, sut.repeatedWord("a"));
  }
}
