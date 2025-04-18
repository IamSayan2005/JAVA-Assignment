import java.util.Scanner;

public class RevrsOfNum {
  public static int reverse(int num) {
    int reversed = 0;
    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    return reversed;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int reversed = reverse(num);
    System.out.println("Reversed Number is : " + reversed);
  }
}
