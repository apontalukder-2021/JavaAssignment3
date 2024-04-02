import java.util.Scanner;
public class NumberOrderChecker {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num1,num2,num3;
            System.out.print("Enter the three numbers:");
            num1=in.nextInt();
            num2=in.nextInt();
            num3=in.nextInt();
            if (num1 < num2 && num2 < num3) {
                System.out.println("Increasing");
            }
            else if (num1 > num2 && num2 > num3) {
                System.out.println("Decreasing");
            }
            else {
                System.out.println("Neither");
            }
        }
    }


