package SingleClass;
import java.util.Scanner;
public class WeeklyExpenseCalculator {
    public static void main(String []args){
        double budget;
        double food;
        double transport;
        double rent;
        double sendHome;
        double total;
        double remaining;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==== weekly Expenses Calculator");

        System.out.println("1. Enter Your Budget");
        budget = sc.nextDouble();
        System.out.println("Please Enter you food expense ");
        food = sc.nextDouble();
        System.out.println("Please enter your transportation expensess");
        transport = sc.nextDouble();
        System.out.println(" what's your Monthly rent ");
        rent = sc.nextDouble();
        System.out.println("How much you're sending home ?");
        sendHome = sc.nextDouble();

        total = food + transport + rent + sendHome ;
        remaining  = budget - total ;


        System.out.println("\n ==== Your Total Expenses for this month =====");
        System.out.println("Your total expenses : "  + total);
        System.out.println("Remaining Money : " + remaining);
        sc.close();


    }

}
