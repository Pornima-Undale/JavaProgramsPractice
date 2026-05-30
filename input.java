import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition is " + (num1+num2));
    }
}
