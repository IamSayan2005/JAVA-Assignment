import java.net.SocketPermission;
import java.util.Scanner;
public class ReverseString {
  public static String reverseString(String input) {
    String reversed = "";
    for (int i = input.length() - 1; i >= 0; i--) {
      reversed += input.charAt(i);
    }
    return reversed;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    System.out.println("Original string: " + input);
    String reversed = reverseString(input);
    System.out.println("Reversed string: " + reversed);
  }
}
