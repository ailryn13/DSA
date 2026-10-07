import java.util.Scanner;

public class printtillx {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int num;
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equalsIgnoreCase("x")){
                System.out.println("The sum is " + sum);
            }
            try {
                sum+=Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("The Character is invalid either type a number or press to exit");
            }
        }
        
    }
    
}
