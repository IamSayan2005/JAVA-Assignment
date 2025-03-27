import java.util.Scanner;

public class Palindrome {
  public static boolean check(int num) {
    int original = num, reversed = 0;
    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    return original == reversed;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
  
    if (check(num)) {
      System.out.println(num + " is a Palindrome");
    } else {
      System.out.println(num + " is not a Palindrome");
    }
  }
}
