import java.util.*;

public class ConstructorTest{
    public static void main(String[] args){
        EmployeeForConTest[] staff = new EmployeeForConTest[3];

        staff[0] = new EmployeeForConTest("Harry", 40000);
        staff[1] = new EmployeeForConTest(60000);
        staff[2] = new EmployeeForConTest();

        for(EmployeeForConTest e : staff){
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
    }
}


class EmployeeForConTest{
    private static int nextId;

    private int id;

    private String name = "";
    private double salary;

    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId = nextId + 1;
    }

    public  EmployeeForConTest(String n, double s){
        name = n;
        salary = s;
    }

    public EmployeeForConTest(double s){
        this("Employee #"+ nextId, s);
    }

    public EmployeeForConTest(){

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}