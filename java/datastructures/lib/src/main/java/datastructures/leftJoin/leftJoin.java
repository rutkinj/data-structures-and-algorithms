package datastructures.leftJoin;

import java.util.ArrayList;
import java.util.HashMap;

public class leftJoin {
  public static Integer[][] leftJoin(HashMap hm1, HashMap hm2){
    Integer[][] retArr = new Integer[hm1.size()][3];

    fillMatrix(retArr,hm1);
    joinMatrix(retArr,hm2);


    return retArr;
  }

  private static void fillMatrix(Integer[][] retArr, HashMap hm1){

    hm1.forEach((k, v) -> {
      retArr[0][0] = (Integer)k;
      retArr[0][1] = (Integer)v;
    });
  }

  private static void joinMatrix(Integer[][] retArr, HashMap hm2){
    for(Integer[] row:retArr){
      row[2] = (Integer)hm2.getOrDefault(row[0], null);
    }
  }
}
