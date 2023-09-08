import java.util.Scanner;

public class days2week {
    public static void main(String[] args) {
        int days;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of days");
        days= obj.nextInt();
        if (days>=0){
            int no_of_weeks=days/7;
            int no_of_days=days % 7;
            if (no_of_days>0){
                System.out.println("The total no of weeks is :"+no_of_weeks+" and "+no_of_days);
            }
            else {
                System.out.println("total no. of weeks is  "+no_of_weeks);
            }
        }
        else {
            System.out.println("Invalid");
        }

    }
}
