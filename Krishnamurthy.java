import java.util.*;
public class Krishnamurthy {
  public static int fact(int num) {
    if(num == 0) {
      return 1;
    }
    return num * fact(num - 1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
   int temp=num;int fact=0;
    while(temp!=0) {
      int rem=temp%10;
      int factor=fact(rem);
      fact+=factor;
      temp=temp/10;
    }
    if(fact==num) {
      System.out.println(num+" is Krishnamurthy number.");
    }
    else {
      System.out.println(num+" is not Krishnamurthy number.");
    }
  }
}
