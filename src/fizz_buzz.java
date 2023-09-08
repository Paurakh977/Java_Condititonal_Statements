import java.util.Scanner;

public class fizz_buzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        if (number% 3==0 & number%5!=0){
            System.out.println("fizz");
        }
         if (number% 3!=0 & number%5==0){
            System.out.println("BUzz");
        }
        if(number% 5 ==0& number%3==0){
            System.out.println("FizzBUzz");
        }
        if(number%5!=0 & number%3!=0){
            System.out.println(number);
        }
    }
}
