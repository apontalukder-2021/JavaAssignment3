import java.util.Scanner;
public class InOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num1,num2,num3;
        System.out.println("Enter the three numbers");
        num1=sc.nextDouble();
        num2= sc.nextDouble();
        num3= sc.nextDouble();

        if ((num1 <= num2  && num2 < num3) || (num1 < num2 && num2 <= num3) ||
                (num1 > num2 && num2 >= num3) || (num1 >= num2 && num2 > num3))

        {
          System.out.println("In order");
        }
        else {
            System.out.println("Not In order");
        }
    }

}
