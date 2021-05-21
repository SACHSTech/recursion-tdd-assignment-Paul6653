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

}
