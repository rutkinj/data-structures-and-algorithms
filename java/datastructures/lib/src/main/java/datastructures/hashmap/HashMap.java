package datastructures.hashmap;

public class HashMap<K, V> {

  int size;
  public HashMap(int size){
    this.size = size;
  }
  //METHODS
  //set
  public void set(key, value){
    // hash key
    // set kv at hashed key location
      // handle collision??
    // replace value if key already exists
  }
  //get
  public string get(key){
    // has?
    // return v at k
  }

  //has
  public boolean has(key){
    // return if k in hashmap
  }

  //keys
  public keysList keys(){
    //  return all keys
  }

  //hash
  private int hash(key){
    return Math.abs(key.hashcode()) % size;
  }
}
