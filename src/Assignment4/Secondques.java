package Assignment4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Secondques {
    double usd;
    double nepali;
    Scanner scanner=new Scanner(System.in);
    {System.out.println("Enter the amount to convert");}
    double a= scanner.nextDouble();
    public void second(){
        usd = a / 135.03;
        System.out.println(a + " RUPEE = " + usd + " USD");
    }
}
