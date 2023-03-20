import java.util.Scanner;

public class Average {
    Scanner scanner=new Scanner(System.in);
    public void avg() {
        System.out.println("enter three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = (a + b + c);
        int average = (sum / 3);
        System.out.println("the sum is " + sum + ".");
        System.out.println("the average is " + average + ".");
    }
}
