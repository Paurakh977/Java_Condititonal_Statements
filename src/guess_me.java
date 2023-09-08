import java.util.Random;
import java.util.Scanner;

public class guess_me {
    public static void main(String[] args) {
        Random obj=new Random();
        Scanner xyz=new Scanner(System.in);
        int rand_number,choice;
        rand_number= obj.nextInt(10);
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t WELCOME TO GUESSING HUB");
        System.out.println("We Challenge you to Guess the number");
        System.out.println("\t\t\t\t\t\t\t\t\t\t" +
                "******************** GENERATING NUMBER ********************\n");
        System.out.println("THE NUMBER IS BETWEEN 0-9");
        System.out.println("\nEnter Your GUESS --->");
        choice= xyz.nextInt();
        if (choice<0 || choice>9){
            System.out.println("Entered Number is out of range");
        }
        else {
            if (choice==rand_number)
            {
                System.out.println("AMAZING! YOU GUESSED IT CORRECT THE  NUMBER IS "+ rand_number);
            } else if (choice!=rand_number)
            {
                System.out.println("OPPS! Better Luck next time. You guessed Wrong. The number is "+ rand_number);
            }
        }

    }
}
