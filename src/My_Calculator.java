import java.util.Scanner;

public class My_Calculator {
    public static void main(String[] args) {
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +
                " CALCULATOR");
        double num1,num2,reslut;
        String operator;
        Scanner obj=new Scanner(System.in);
        System.out.println("\nEnter the first number you want to carry out the operation ---->");
        num1= obj.nextDouble();
        System.out.println("\nEnter the Second number you want to carry out the operation ---->");
        num2= obj.nextDouble();
        System.out.println(" Here are the Operations we provide:\n");
        System.out.println("\t\t\t\t                     1) + (addition)                                   2) - (Subtraction)");
        System.out.println("\t\t\t\t                     3) X (Multiplication)                             4) / (Division)");
        System.out.println("\t\t\t\t                                                5) % (Remainder)");
        System.out.println("\nEnter the corresponding number or the operating symbol ---->");
        operator=obj.next();
        if (operator.equals("1")|| operator.equals("+") )
        {
            reslut=(double) num1+num2;
            System.out.println("Your Sum of "+ num1 +" + "+ num2 + " is "+ reslut );
        }
        else if (operator.equals("2")|| operator.equals("-") )
        {
            reslut=(double) num1-num2;
            System.out.println("Your Difference of "+ num1 +" - "+ num2 + " is "+ reslut );
        }
        else if (operator.equals("3")|| operator.equals("X") ||operator.equals("*") )
        {
            reslut=(double) num1 * num2;
            System.out.println("Your Product of "+ num1 +" X "+ num2 + " is "+ reslut );
        }
        else if (operator.equals("4")|| operator.equals("/") )
        {
            reslut=(double) num1 / num2;
            System.out.println("Your Quotient of "+ num1 +" ÷ "+ num2 + " is "+ reslut );
        }
        else if (operator.equals("5")|| operator.equals("%") )
        {
            reslut=(double) num1 % num2;
            System.out.println("Your Remainder of "+ num1 +" MOD "+ num2 + " is "+ reslut );
        }


    }
}
