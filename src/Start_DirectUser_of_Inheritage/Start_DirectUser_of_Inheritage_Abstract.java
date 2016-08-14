package Start_DirectUser_of_Inheritage;

import Inheritage_Sources.Abstract;

public class Start_DirectUser_of_Inheritage_Abstract extends Abstract {

    // Implement Abstract function through extends
            // This "AbstractFunction" implements the "AbstractFunction" of "Abstract"
                public void AbstractFunction (){
                    System.out.println("First Name:" + firstName_Static +" Last Name:"+ lastName_Static + " Age:" + age_Static);
        }


    // Polymorphism (Override) static function through extends
            // This "SimpleFunction" hides the "SimpleFunction" of "Abstract"
                public static void SimpleFunction (){
                    System.out.println("First Name:" + firstName_Static +" Last Name:"+ lastName_Static + " Age:" + age_Static);

                // or:
                // super.StaticFunction();
                // System.out.println("Age:" + age );

        }
}
