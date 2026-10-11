package Day2;

import java.util.Scanner;

public class SimplInterest{
    public static void main(String[] args) {
        int Principle,roi,tenure,interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        Principle = sc.nextInt();
        System.out.println("Enter the roi: ");
        roi = sc.nextInt();
        System.out.println("Enter the tenure: ");
        tenure = sc.nextInt();
        interest = Principle*roi/100*tenure;
        System.out.println("The interest amount is : " + interest);
    }
}