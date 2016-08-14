package Inheritage_Sources;

/**
 * Created by Amin on 8/13/2016.
 */
public class SimpleClass {
    public static String firstName_Static;
    public static String lastName_Static;
    public static int age_Static;
    public String firstName;
    public String lastName;
    public int age;

    public static void StaticFunction (){
        System.out.println("First Name:" + firstName_Static +" Last Name:"+ lastName_Static );
    }

    public void SimpleFunction (){
        System.out.println("First Name:" + firstName +" Last Name "+ lastName );
    }


}
