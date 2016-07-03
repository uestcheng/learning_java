import java.util.*;

public class Retirement{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("How much mondy do you earn per year?");
        double payment = in.nextDouble();


        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();


        System.out.print("Interest rate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while(balance < goal){
            balance = balance + payment;
            double interest = balance * interestRate /100;
            balance = balance + interest;
            years = years + 1;
        }

        System.out.println("You can retire in " + years + " years");
    }
}