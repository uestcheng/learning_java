import javax.sound.midi.SysexMessage;

public class ParamTest{
    public static void main(String[] args){
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        trippleValue(percent);
        System.out.println("Afer: percent="+ percent);


        System.out.println("\nTest tripleSalary:");
        EmployeesForStaticTest harry = new EmployeesForStaticTest("Harry", 50000);
        System.out.println("Before: salary="+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:salary="+ harry.getSalary());


        System.out.println("\nTesting swap:");
        EmployeesForStaticTest a = new EmployeesForStaticTest("Alice", 70000);
        EmployeesForStaticTest b = new EmployeesForStaticTest("Bob", 60000);
        System.out.println("Before:a=" + a.getName());
        System.out.println("Before:b=" + b.getName());
        swap(a,b);

        System.out.println("After:a=" + a.getName());
        System.out.println("After:b=" + b.getName());

    }

    public static void trippleValue(double x){
        x = 3 * x;
        System.out.println("End of method:x=" + x);
    }

    public static void tripleSalary(EmployeesForStaticTest x){
        x.raiseSalary(200);
        System.out.println("End of method:salary="+x.getSalary());
    }

    public static void swap(EmployeesForStaticTest x, EmployeesForStaticTest y){
        EmployeesForStaticTest temp = x;
        x = y;
        y = temp;
        System.out.println("End of method:x=" + x.getName());
        System.out.println("End of method:y=" + y.getName());
    }
}

class EmployeesForStaticTest{
    private  String name;
    private double salary;

    public EmployeesForStaticTest(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary = salary + raise;
    }
}