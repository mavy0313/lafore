package chapter6;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(factorial(0));
  }

//  private static int factorial(int n) {
//    if (n == 0) {
//      return 1;
//    } else {
//      return n * factorial(n - 1);
//    }
//  }

//  private static int factorial(int n) {
//    if (n <= 1) {
//      return 1;
//    } else {
//      return n * factorial(n - 1);
//    }
//  }

  private static int factorial(int n) {
    int result = 1;

    while (n > 0) {
      result *= n;
      n--;
    }
    return result;
  }

}
