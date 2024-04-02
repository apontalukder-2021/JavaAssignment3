import java.util.Scanner;
public class NumberSameAndDifferent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the three numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1==num2&&num2==num3)
        {
            System.out.println("All number same");
        }
        else if (num1!=num2&&num2!=num3)
        {
            System.out.println("All number different");
        }
        else if (num1==num2||num2==num3||num3==num1)
        {
            System.out.println("Neither");
        }

    }
}
