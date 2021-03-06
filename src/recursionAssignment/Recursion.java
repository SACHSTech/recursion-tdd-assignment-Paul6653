package recursionAssignment;

public class Recursion{
  
  /**
    * Given a non-negative integer, return the number of occurrences of the digit 7
    * @param n non-negative integer
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
    * @param str random string
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

  /**
    * Given an integer array, return true if any of the values are followed by a value 10 times larger
    * @param1 intNums integer array
    * @param2 index integer to check array
    * @return true if any of the values are followed by a value 10 times larger, otherwise false
    * @author P. Tran
    */
  public static boolean array220(int[] intNums, int index) {
    //base case
    if (index == intNums.length - 1) {
      return false;
    }

    /**
      *if the value followed after index is 10 times larger, return true and end, 
      *else, check the next index
      */
    if (intNums[index] * 10 == intNums[index + 1]) {
      return true;
    } else {
      return array220(intNums, index + 1);
    }
  }

}
