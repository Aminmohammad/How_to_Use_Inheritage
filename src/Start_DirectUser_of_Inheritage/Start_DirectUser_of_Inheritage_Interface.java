package Start_DirectUser_of_Inheritage;

import Inheritage_Sources.Interface;

public class Start_DirectUser_of_Inheritage_Interface implements Interface {

    public String firstName;
    public String lastName;
    public int age;

    // Implement Abstract function through extends
            // This "StaticFunction" implements the "StaticFunction" of "SimpleClass"
                public void InterfaceFunction (){
                    System.out.println("First Name:" + firstName +" Last Name:"+ lastName + " Age:" + age);
        }

}
