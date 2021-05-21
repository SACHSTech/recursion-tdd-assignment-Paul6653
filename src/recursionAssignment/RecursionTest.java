package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{

  //Problem set 1 tests
  @Test
  public void Test1() {
    //only seven
    assertEquals(1, Recursion.count7(7));
  }

  @Test
  public void Test2() {
    //2-digit ending with 7
    assertEquals(1, Recursion.count7(27));
  }

  @Test
  public void Test3() {
    //5-digit beginning with 7
    assertEquals(2, Recursion.count7(70172));
  }

  @Test
  public void Test4() {
    //no 7s
    assertEquals(0, Recursion.count7(0));
  }

  @Test
  public void Test5() {
    //all 7s
    assertEquals(4, Recursion.count7(7777));
  }

  //Problem set 2 tests
  @Test
  public void Test6() {
    //empty string
    assertEquals("", Recursion.endX(""));
  }

  @Test
  public void Test7() {
    //string of length-2 starting with x
    assertEquals("ex", Recursion.endX("xe"));
  }

  @Test
  public void Test8() {
    assertEquals("et1exx", Recursion.endX("et1xxe"));
  }
}
