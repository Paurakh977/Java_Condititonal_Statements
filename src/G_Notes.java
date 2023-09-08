import java.util.Scanner;

public class G_Notes {
    public static void main(String[] args) {
        String item = null;
        int total = 0, change = 0;
        int thousands = 0, fiveHundreds = 0, hundreds = 0, fifties = 0, twenties = 0, tens = 0, fives = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +
                "Pintu's Grocery \n");
        System.out.println("Hamro grocery ma maya bahek sab painxa\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tITEMS\t\t\t\t\t\t\t\t RATE");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t1)Lifebuoy soap\t\t\t\t\t\t Rs 80");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t2)Harpic\t\t\t\t\t\t\t Rs 120");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t3)Maida Ko Pitho\t\t\t\t\t Rs 70");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t4)Wai-Wai Chauchau\t\t\t\t\t Rs 25");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t5)Prawn\t\t\t\t\t\t\t\t Rs 60");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t6)Frooti\t\t\t\t\t\t\t Rs 30");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t7)Tuborg(650ml)\t\t\t\t\t\t Rs 450");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t Press the Corresponding Number Of The Item You Would Like To Have");
        int order = obj.nextInt();
        if (order == 1) {
            System.out.println("How many quantity of Lifebuoy soap Would You like to have?");
            item = "Lifebuoy soap";
        } else if (order == 2) {
            item = "Harpic";
            System.out.println("How many quantity of Harpic Would You like to have?");
        } else if (order == 3) {
            item = "Maida Ko Pitho";
            System.out.println("How many quantity (KG) of Maida Ko Pitho Would You like to have?");
        } else if (order == 4) {
            item = "Wai-Wai Chauchau";
            System.out.println("How many quantity of Wai-Wai Chauchau Would You like to have?");
        } else if (order == 5) {
            item = "Prawn";
            System.out.println("How many quantity of Prawn Would You like to have?");
        } else if (order == 6) {
            item = "frooti";
            System.out.println("How many quantity of frooti Would You like to have?");
        } else if (order == 7) {
            item = "Tuborg";
            System.out.println("How many quantity of Tuborg Would You like to have?");
        } else {
            System.out.println("Invalid Input");
        }

        int quantity = obj.nextInt();

        System.out.println("For Confirmation. Your orders are:" + quantity + " " + item);
        System.out.println("Press Y for Yes and N for No ");
        String descisoin = obj.next();
        if (descisoin.equals("Y") || descisoin.equals("y")) {
            System.out.println("Thank You. Your orders are on the way.");
        } else {
            System.out.println("Run Program Again");
        }

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                + "BILL\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tItems\t\t\t\t\t\t\t\t Quantity\t\t\t\t\t\t Rate\t\t\t\t\tTotal");
        if (item.equals("Lifebuoy soap")) {
            total = (80 * quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tLifebuoy soap" + "\t\t\t\t\t\t\t" + quantity
                    + "\t\t\t\t\t\t\t 150" + "\t\t\t\t\t " + total);
        } else if (item.equals("Harpic")) {
            total = (120 * quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tHarpic" + "\t\t\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 100"
                    + "\t\t\t\t\t " + total);
        } else if (item.equals("Maida Ko Pitho")) {
            total = (70 * quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tMaida Ko Pitho" + "\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 450"
                    + "\t\t\t\t\t " + total);
        } else if (item.equals("Wai-Wai Chauchau")) {
            total = (25 * quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tWai-Wai Chauchau" + "\t\t\t\t\t\t" + quantity
                    + "\t\t\t\t\t\t\t 350" + "\t\t\t\t\t " + total);
        } else if (item.equals("Prawn")) {
            total = (60 * quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tPrawn" + "\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 150"
                    + "\t\t\t\t\t " + total);
        } else if (item.equals("frooti")) {
            total = (30 * quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tfrooti" + "\t\t\t\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t  30"
                    + "\t\t\t\t\t  " + total);
        } else if (item.equals("Tuborg")) {
            total = (450 * quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tTuborg" + "\t\t\t\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t  450"
                    + "\t\t\t\t\t " + total);
        }
        System.out.println("VAT:13%");
        System.out.println("Discount: 10%");

        double gtotal = total - (total * 0.1);
        gtotal = gtotal + (gtotal * 0.13);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                + "Grand Total: " + gtotal);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nAmount of Cash You are Paying:");
        int payment = obj.nextInt();
        if (gtotal < payment) {
            change = (int) (payment - gtotal);
        } else if (gtotal > payment) {
            System.out.println("You are Very poor. Take it for free");
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("\nYou 'll be receving change of Rs"+ change+"\n");
        if (change >= 1000) {
            thousands = change / 1000;
            change = change % 1000;
        }
        if (change >= 500) {
            fiveHundreds = change / 500;
            change = change % 500;
        }
        if (change >= 100) {
            hundreds = change / 100;
            change = change % 100;
        }
        if (change >= 50) {
            fifties = change / 50;
            change = change % 50;
        }
        if (change >= 20) {
            twenties = change / 20;
            change = change % 20;
        }
        if (change >= 10) {
            tens = change / 10;
            change = change % 10;
        }
        if (change >= 5) {
            fives = change / 5;
            change = change % 5;
        }
        if (change > 0) {
            System.out.println("take Chocolates of " + change + " Rupees\n");
        }
        System.out.println("You'll recive " + thousands + " Thousands notes " + fiveHundreds + " Five Hundreds notes "
                + hundreds + " Hundreds notes " + fifties + " Fifty notes" + twenties + " Twenty notes " + tens
                + " ten notes and " + fives + " Five notes");
        System.out.println("\ni.e :"+ "1000 X "+ thousands +" + 500 X "+ fiveHundreds +" + 100 X "+ hundreds + "+ 50 X "+ fifties + " + 20 X "+ twenties +" + 10 X "+ tens + "+ 5 X "+ fives+ " and " + change+" choclates");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPLEASE VISIT AGAIN");

    }
}
