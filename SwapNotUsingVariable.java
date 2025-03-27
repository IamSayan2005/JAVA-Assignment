import java.util.Scanner;
public class SwapNotUsingVariable {
  public static void swap(int a, int b) {
    a = a + b;
    b = a - b;
    a = a - b;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("Before swapping: a = " + a + ", b = " + b);
    swap(a,b);
    System.out.println("After swapping: a = " + a + ", b = " + b);
  }
}
