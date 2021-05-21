package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;

import recursionAssignment.Recursion;

public class RecursionTest{

  /**
    * An initial test
    */
  @Test
  public void Test1() {
    assertEquals(2, Recursion.count7(7));
  }

}
