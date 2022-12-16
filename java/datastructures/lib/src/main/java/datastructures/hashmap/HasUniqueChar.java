package datastructures.hashmap;

import java.util.HashSet;

public class HasUniqueChar {
  public static boolean hasUniqueChars(String input){
    if(input.length() == 0) throw new NullPointerException();
    String[] splitString = input.split("\\W+");

    HashSet<String> hashset = new HashSet<>();

    for (String c: splitString){
      if(!hashset.contains(c)){
        hashset.add(c);
      } else {
        return false;
      }
    }
    return true;
  }
}
