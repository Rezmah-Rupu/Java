
package Inheritance;

public class Teacher extends Person {
  //Name, Age, displayinformation1()  
  String qualification;

  void displayinformation2 () {
   displayinformation1();
   System.out.println("Qualification: " + qualification);
   
  }  
}
