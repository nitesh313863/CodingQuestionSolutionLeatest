import java.util.Scanner;

public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println(s.replaceAll(" ", ""));
        sc.close();
    }

}
