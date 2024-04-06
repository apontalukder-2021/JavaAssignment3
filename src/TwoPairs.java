import java.util.Scanner;

public class TwoPairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.println("Enter four numbers :");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        num4=sc.nextInt();
        if (num1 == num2 || num1 == num3 || num1 == num4
                || num2 == num3 || num2 == num4 || num3 == num4)
        {
           System.out.println("two pairs");
       }
       else {
           System.out.println("not pairs");
       }
    }
}
