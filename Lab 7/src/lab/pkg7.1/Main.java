
package lab.pkg7;

import java.util.Scanner;

public class Main {
public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Values for Addition:");
        Calculator obj1 = new Calculator(sc.nextInt(),sc.nextInt());
        obj1.add();
        System.out.println("Values for Subtraction:");
        Calculator obj2 = new Calculator(sc.nextInt(),sc.nextInt());
        obj2.Subtract();
        System.out.println("Values for Multiplication:");
        Calculator obj3 = new Calculator(sc.nextInt(),sc.nextInt());
        obj3.multiply();
        System.out.println("Values for Division:");
        Calculator obj4 = new Calculator(sc.nextInt(),sc.nextInt());
        obj4.Division();
  }
}
