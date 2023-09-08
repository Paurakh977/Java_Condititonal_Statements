import java.util.Scanner;

//WAP to map work day with number(1-7)
//guessing game (use random)
//calculator
//greatest numbers between 3 numbers
//login system
//lucky draw
//highest no. g notes in a number

public class Map_Work {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number which day you want");
        int number= obj.nextInt();
        if (number==1){
            System.out.println("SUNDAY");
        } else if (number==2) {
            System.out.println("MONDAY");
        } else if (number==3) {
            System.out.println("TUESDAY");
        } else if (number==4) {
            System.out.println("WEDNESDAY");
        } else if (number==5) {
            System.out.println("THRUSDAY");
        } else if (number==6) {
            System.out.println("FRIDAY");
        } else if (number==7) {
            System.out.println("SATURDAY");
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
