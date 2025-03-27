import java.util.*;

public class Armstrong {
  public static boolean isArmstrong(int num) {
    int sum = 0;
    int count = 0;
    int temp = num;
    while (temp != 0) {
      count++;
      temp = temp / 10;
    }
    temp = num;
    while (temp != 0) {
      int rem = temp % 10;
      sum += Math.pow(rem, 3);
      temp = temp / 10;
    }
    return sum == num;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if (isArmstrong(num)) {
      System.out.println(num + " is an Armstrong number.");
    } else {
      System.out.println(num + " is not an Armstrong number.");
    }
  }

}
