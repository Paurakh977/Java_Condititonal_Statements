import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String Stactic_Username="Paurakh_01",Static_Password="*Red!Light*";
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +
                " LOGIN SYSTEM\n");
        System.out.println("Enter your Username:\n");
        String Username= obj.next();
        System.out.println("Enter Your Password:\n");
        String Password= obj.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t We make Sure that Your information is Secure");
        if (Username.equals(Stactic_Username))
        {
            if (Password.equals(Static_Password))
            {
                System.out.println("Access Granted ");
                System.out.println("Welcome "+ Username);
            }
            else
            {
                System.out.println("Incorrect Password Please Try Again.");
            }
        }
        else {
            System.out.println("Incorrect Username. Please Try Again.");
        }
    }
}
