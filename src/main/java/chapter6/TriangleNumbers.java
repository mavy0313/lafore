package chapter6;

public class TriangleNumbers {

  public static void main(String[] args) {
    System.out.println(triangle(1));
  }

//  private static int triangle(int n) {
//    int total = 0;
//    while (n > 0) {
//      total = total + n;
//      --n;
//    }
//    return total;
//  }

//  private static int triangle(int number) {
//
//    if (number == 1) {
//      return 1;
//    } else {
//      return number + triangle(number - 1);
//    }
//  }

  private static int triangle(int number) {
    int result = 0;
    int i = 1;
    while (i <= number) {
      result += i;
      i++;
    }
    return result;
  }
}
