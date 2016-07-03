import java.util.*;

public class InputTest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name");
        String name = in.nextLine();

        System.out.print("How old are you");
        int age = in.nextInt();
        String message = String.format("Hello, %s. Next year, you will be %d", name, age);
        //System.out.println(message);
        System.out.printf("%s %tB %<tY", "Due date:", new Date());
    }
}