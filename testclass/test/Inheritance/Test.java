
package Inheritance;

public class Test {
    public static void main (String[] args){
        Teacher t1 = new Teacher();
        t1.name = "A";
        t1.age = 30;
        t1.qualification = "MSc in CSE";
        t1.displayinformation2();
        
        Teacher t2 = new Teacher();
        t2.name = "B";
        t2.age = 32;
        t2.qualification = "BSc in CSE";
        t2.displayinformation2();
        
    } 

}
