import java.util.*;

public class Retirement2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you earn per year?");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        String input;

        do{
            balance = balance + payment;
            double interest = balance * interestRate /100;
            balance = balance + interest;

            year = year + 1;

            System.out.printf("After year %d, your balance is %, .2f%n", year, balance);

            System.out.print("Ready to retire?(Y/N)");
            input = in.next();
        }
        while(input.equals("N"));
    }
}