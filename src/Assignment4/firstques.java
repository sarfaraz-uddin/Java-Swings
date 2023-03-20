package Assignment4;

import java.util.Scanner;

public class firstques {

    Scanner scanner=new Scanner(System.in);
    int i;
    {System.out.println("Enter a number");}
    int a = scanner.nextInt();
    public void first(){
        for(i=1;i<=10;i++){

            int output=a*i;
            System.out.println(a + "*" + i + "=" + output);
        }
    }


}
