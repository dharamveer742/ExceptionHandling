package Handling;

public class finallyBlock {
   void p() {
       try {
           System.out.println("Inside a user defined  method (p)");
           System.out.println("try block before exception");
           int data = 50 / 0;                                       //Exception//
           System.out.println("try block after exception");
       }
       catch (ArithmeticException e) {
           System.out.println("catch block after exception to handle it");
           System.out.println(e.getMessage());
       }
      finally{                             // Finally block will always  execute
           int data =50/5;
           System.out.println(data);
       }
   }
   public static void main(String[] args) {
        finallyBlock ob = new finallyBlock();
         ob.p();
    }
}

