package datastructures.leftJoin;


import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class leftJoinTest {
  @Test void worksAtAll(){
    HashMap sut1 = new HashMap<>();
    sut1.put(1, 11);
    sut1.put(2, 12);
    sut1.put(3, 13);
    HashMap sut2 = new HashMap<>();
    sut2.put(1, 21);
    sut2.put(2, 22);
    sut2.put(3, 23);

//    Integer[][];

    Integer[][] result = leftJoin.leftJoin(sut1,sut2);
  }
}
