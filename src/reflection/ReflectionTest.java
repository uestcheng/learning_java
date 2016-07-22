package reflection;

import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest{
    public static void main(String[] args){
        String name;
        if(args.length > 0){
            name = args[0];
        }
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name:");
            name = in.next();
        }

        try{
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print("class" + name);
            if(supercl != null && supercl != Object.class){
                System.out.print("extends " + supercl.getName());
            }
            System.out.print("\n{\n");
            printConstructor(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructor(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();

        for(Constructor c: constructors){
            String name = c. getName();
            System.out.print(" ");
        }

    }
}