public class _509_Fibonacci_Number {

  public static int fibonnaci(int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;
    return fibonnaci(n - 1) + fibonnaci(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(fibonnaci(2)); // 1
    System.out.println(fibonnaci(3)); // 2
    System.out.println(fibonnaci(4)); // 3
  }
}
