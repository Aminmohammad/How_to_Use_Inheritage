package Inheritage_Sources;

/**
 * Created by Amin on 8/13/2016.
 */
public abstract class Abstract {
    public static String firstName_Static;
    public static String lastName_Static;
    public static int age_Static;
    public String firstName;
    public String lastName;
    public int age;

    public abstract void AbstractFunction ();

    // Abstracts can have simple functions,  too.
        public static void SimpleFunction (){
            System.out.println("First Name:" + firstName_Static +" Last Name "+ lastName_Static );
        }
}
