package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{

  //Problem set 1 tests
  @Test
  public void Test1() {
    assertEquals(1, Recursion.count7(7));
  }

  @Test
  public void Test2() {
    assertEquals(1, Recursion.count7(27));
  }

  @Test
  public void Test3() {
    assertEquals(2, Recursion.count7(70172));
  }

  @Test
  public void Test4() {
    assertEquals(0, Recursion.count7(0));
  }

  @Test
  public void Test5() {
    assertEquals(4, Recursion.count7(7777));
  }

  //Problem set 2 tests
  @Test
  public void Test6() {
    assertEquals("", Recursion.endX(""));
  }

}
