package Assignment4;

import java.util.Scanner;

public class Thirdques {
    Scanner scanner = new Scanner(System.in);
    int i;
    {
        System.out.println("Enter the number upto which you want to print Fibonacci Series.");
    }
    int a = scanner.nextInt();

    {
        for (i = 0; i < a; i++) {
            System.out.println(fibo(i));
        }
    }

    public int fibo(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return (fibo(num - 1) + fibo(num - 2));
        }
    }
}
