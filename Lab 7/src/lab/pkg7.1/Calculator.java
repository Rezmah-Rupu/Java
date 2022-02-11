package lab.pkg7;

public class Calculator {
    
    private final int a;
    private final int b;

     public Calculator(int a, int b) {
         this.a = a;
         this.b = b;
     }

     public int getA() {
         return a;
     }


     public int getB() {
         return b;
     }

 public int add()
     {
         if(a>0 && b>0)
         return getA()+getB();
         else
             throw new ArithmeticException("values can't be negative for addition");
     }
     public int Subtract ()
     {
         if(a>0 && b>0)
             return getA()-getB();
         else {
             throw new ArithmeticException("values can't be negative for Subtraction");
            }
     }
     public int multiply()
     {
         if(a!=0 && b!=0)
             return getA()*getB();
         else
             throw new ArithmeticException("values can't be zero for multiplication");
     }
     public double Division()
     {
         if(a!=0 && b!=0)
             return (double)getA()/getB();
         else
             throw new ArithmeticException("values can't be zero for Division");
     }

}
