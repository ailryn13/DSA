import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
