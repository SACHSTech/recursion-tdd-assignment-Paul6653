package recursionAssignment;

public class Recursion{
  
  /**
    * Given a non-negative integer, return the number of occurrences of the digit 7
    * @param integer1 non-negative integer
    * @return the count of occurrences of the digit 7
    * @author P. Tran
    */
  public static int count7(int n) {
    if (n == 0) {
      return 0;
    }

    if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }

    return count7(n / 10);
  }

  /**
    * Given a string, return a new string where all lowercase 'x' chars have been moved to the end of the string
    * @param string1 random string
    * @return new string with 'x' chars moved to the end
    * @author P. Tran
    */
  public static String endX(String str) {
    //base case
    if (str.length() == 0) {
      return "";
    }

    //recursive case
    if (str.charAt(0) == 'x') {
      return endX(str.substring(1)) + "x";
    }

    //recursive case if string does not begin with "x"
    return str.substring(0,1) + endX(str.substring(1));
  }

  public static boolean array220(int[] intNums, int index) {
  }

}
