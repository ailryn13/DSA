import java.util.Scanner;

public class hcfandlcm{
    public static void main(String[] args) {
        int num1,num2,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: " );
        num1=sc.nextInt();
        System.out.print("Enter Second Number: " );
        num2=sc.nextInt();

        lcm=lcm(num1,num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static int lcm(int a,int b){
        int lcm;
        lcm=(a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm++;
        }
    }
}