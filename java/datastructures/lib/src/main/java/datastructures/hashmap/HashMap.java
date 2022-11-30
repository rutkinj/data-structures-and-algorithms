package datastructures.hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {

  //FIELDS
  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrList;
  int size;

  //CONSTRUCTOR
  public HashMap(int size){
    if (size < 1){
      throw new IllegalArgumentException("Size must be greater than 0.");
    }
    this.size = size;
    this.bucketArrList = new ArrayList<>(size);

    for (int i = 0; i < this.size; i++)
    {
      bucketArrList.add(i, new LinkedList<>());
    }
  }

  //METHODS
  public void set(K key, V value){
    int hashedKey = hash(key);
    HashMapPair<K, V> pair = new HashMapPair<>(key, value);
    LinkedList<HashMapPair<K,V>> ll = bucketArrList.get(hashedKey);

    if(!ll.isEmpty()){
      for(HashMapPair<K, V> node : ll) {
        if(node.getKey() == key){
          node.setValue(value);
          return;
        }
      }
    }
    ll.add(pair);
  }

  public V get(K key){
    int hashedKey = hash(key);
    LinkedList<HashMapPair<K,V>> ll = bucketArrList.get(hashedKey);
    if(!ll.isEmpty()){
      for(HashMapPair<K, V> node : ll){
        if(node.getKey() == key){
          return node.getValue();
        }
      }
    }
    return null;
  }

  public boolean has(K key){
    int hashedKey = hash(key);
    LinkedList<HashMapPair<K,V>> ll = bucketArrList.get(hashedKey);
    if(!ll.isEmpty()){
      for(HashMapPair<K, V> node : ll){
        if(node.getKey() == key){
          return true;
        }
      }
    }
    return false;
  }

  public ArrayList<K> keys(){
    ArrayList<K> retArr = new ArrayList<>();
    for (int i = 0; i < this.size; i++)
    {
      LinkedList<HashMapPair<K,V>> ll = bucketArrList.get(i);
      if(!ll.isEmpty()){
        for (HashMapPair<K, V> node : ll) {
          retArr.add(node.getKey());
        }
      }
    }
    return retArr;
  }

  private int hash(K key){
    return Math.abs(key.hashCode()) % size;
  }
}
