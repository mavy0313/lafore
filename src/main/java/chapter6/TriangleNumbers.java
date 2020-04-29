package chapter6;

public class TriangleNumbers {

  public static void main(String[] args) {
    System.out.println(triangle(4));
  }

  private static int triangle(int n) {
    int total = 0;
    while (n > 0) {
      total = total + n;
      --n;
    }
    return total;
  }
}
