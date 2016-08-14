package Start_DirectUser_of_Inheritage;

import Inheritage_Sources.SimpleClass;

public class Start_DirectUser_of_Inheritage_SimpleClass extends SimpleClass {

    // Polymorphism (Override) static function through extends
            // This "StaticFunction" hides the "StaticFunction" of "SimpleClass"
                public static void StaticFunction (){
                    System.out.println("First Name:" + firstName_Static +" Last Name:"+ lastName_Static + " Age:" + age_Static);

                // or:
                // super.StaticFunction();
                // System.out.println("Age:" + age_Static );
        }

    // Polymorphism (Override) non-static function through extends
            // This "SimpleFunction" hides the "SimpleFunction" of "SimpleClass"
                public  void SimpleFunction (){
                    System.out.println("First Name:" + firstName +" Last Name:"+ lastName + " Age:" + age);

                // or:
                // super.StaticFunction();
                // System.out.println("Age:" + age );

        }
}
