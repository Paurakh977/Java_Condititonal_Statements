import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st number");
        num1=sc.nextInt();
        System.out.println("Enter your 2nd number");
        num2=sc.nextInt();
        System.out.println("Enter your 3rd number");
        num3=sc.nextInt();
        if (num1 >num2 & num1>3){
            System.out.println("The greatest Number is:"+ num1);
        } else if (num2>num1 & num2>num3) {
            System.out.println("The greatest Number is:"+ num2);
        }
        else if (num3>num1 & num3>num2) {
            System.out.println("The greatest Number is:"+ num3);
        }
        else {
            System.out.println("Any of the  Numbers Might be equal");
        }

    }
}
