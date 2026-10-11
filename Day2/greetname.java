package Day2;

import java.util.Scanner;

public class greetname{
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        name = sc.next();
        System.out.println("Welcome, " + name);
    }
}