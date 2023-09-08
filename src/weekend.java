import java.util.Scanner;

public class weekend {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday is Weekend");
                break;
            case 2:
                    System.out.println("Monday is weekday");
                    break;
            case 3:
                    System.out.println("Tuesday is weekday");
                    break;
            case 4:
                    System.out.println("Wednesday is weekday");
                    break;
            case 5:
                    System.out.println("Thrusday is weekday");
                    break;  
            case 6:
                    System.out.println("Friday is Weekend");
                    break;
            case 7:
                    System.out.println("Saturday is Weekend");
                    break;
            default:
                    System.out.println("Invalid input");
                break;
        }
    }
}
