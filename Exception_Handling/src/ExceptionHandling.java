/*
 Create a java class with the main method in it
 Inside the main method, write the following statements inside a try block:
 Create a String name = "Dci";
    call a method called repeat on the name string. This method returns a string whose value is the concatenation of this string repeated {@param int count} times
    System.out.println(name.repeat(3));
    Call the repeat method again with a negative parameter. name.repeat(-1). This will throw an exception. Handle (catch)
    that exception and print("Repeat only takes positive numbers as parameters")

    System.out.println(name.charAt(9));
    create an int array of 5 elements. Try to print the element in 7th index of that array. This will give you an exception.
    Handle both of the above exceptions using IndexOutOfBoundsException
    Create another string hello = null;
    Access a method of hello and it'll give you NullPointerException. Handle that exception and print "String is null"
*/
public class ExceptionHandling {
  public static void main(String[] args) {
    try {

      // Illegal Argument Exception
      String name = "Dci";
      System.out.println(name.repeat(3));
      System.out.println(name.repeat(-1));

      // Index out of Bounds Exception
      System.out.println(name.charAt(9));
      int[] number = new int[5];
      System.out.println(number[7]);

      // Null Pointer Exception
      // String hello = null;
      // System.out.println(hello.length());
    } catch (IllegalArgumentException e) {
      System.out.println("Repeat only takes positive numbers as parameters " + e.getMessage());
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Impossible to reach index location " + e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("String is null" + e.getMessage());
    }
  }
}
