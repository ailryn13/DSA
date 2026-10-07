package Day2;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args){
        System.out.print("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number "+ num +" is even");
        }else{
            System.out.println("The number "+ num +"is odd");
        }
    }
}
