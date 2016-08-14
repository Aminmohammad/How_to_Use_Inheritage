package Main_IndirectUser_of_Inheritage;

import Start_DirectUser_of_Inheritage.Start_DirectUser_of_Inheritage_Abstract;
import Start_DirectUser_of_Inheritage.Start_DirectUser_of_Inheritage_Interface;
import Start_DirectUser_of_Inheritage.Start_DirectUser_of_Inheritage_SimpleClass;


public class Main {

    public static void main(String[] args) {

        // Section 1 : Accessing the "SimleClass" through "DirectUser"
            // Sampling Way (for both "Static" and "non-Static" Variables&Functions)
                Start_DirectUser_of_Inheritage_SimpleClass sdu = new Start_DirectUser_of_Inheritage_SimpleClass();

                // Static Function
                    sdu.firstName_Static = "Amin";
                    sdu.lastName_Static = "Mohammad";
                    sdu.age_Static = 29;
                    sdu.StaticFunction();


                // non-Static Function
                    sdu.firstName = "Amin";
                    sdu.lastName = "Mohammad";
                    sdu.age = 29;
                    sdu.SimpleFunction();

            // Sampling Way (just for "Static" Variables&Functions)
                Start_DirectUser_of_Inheritage_SimpleClass.firstName_Static = "Amin";
                Start_DirectUser_of_Inheritage_SimpleClass.lastName_Static = "Mohammad";
                Start_DirectUser_of_Inheritage_SimpleClass.age_Static = 29;
                Start_DirectUser_of_Inheritage_SimpleClass.StaticFunction();







        // Section 2 : Accessing the "Abstract" through "DirectUser"
            // Sampling Way (for both "Static" and "non-Static" Variables&Functions)
                Start_DirectUser_of_Inheritage_Abstract sda = new Start_DirectUser_of_Inheritage_Abstract();

            // Static Function
                sda.firstName_Static = "Amin";
                sda.lastName_Static = "Mohammad";
                sda.age_Static = 29;
                sda.AbstractFunction();


            // non-Static Function
                sda.firstName = "Amin";
                sda.lastName = "Mohammad";
                sda.age = 29;
                sda.SimpleFunction();

            // Sampling Way (just for "Static" Variables&Functions)
                Start_DirectUser_of_Inheritage_SimpleClass.firstName_Static = "Amin";
                Start_DirectUser_of_Inheritage_SimpleClass.lastName_Static = "Mohammad";
                Start_DirectUser_of_Inheritage_SimpleClass.age_Static = 29;
                Start_DirectUser_of_Inheritage_SimpleClass.StaticFunction();







        // Section 3 : Accessing the "Interface" through "DirectUser"
            // Sampling Way (for "non-Static" Variables&Functions)
                Start_DirectUser_of_Inheritage_Interface sdi = new Start_DirectUser_of_Inheritage_Interface();

            // non-static Function
                sdi.firstName = "Amin";
                sdi.lastName = "Mohammad";
                sdi.age = 29;
                sdi.InterfaceFunction();


    }
}
