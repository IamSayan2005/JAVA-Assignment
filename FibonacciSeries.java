import java.util.Scanner;

public class FibonacciSeries {
  public static void fib(int upperbound) {
    int a = 0, b = 1;
    while(a <= upperbound) {
      System.out.print(a + " ");
      int c = a + b;
      a = b;
      b = c;
    }
  }
  public static void main(String[] args) {
    int upperbound;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter upper bound: ");
    upperbound = sc.nextInt();
    fib(upperbound);
  }
}
