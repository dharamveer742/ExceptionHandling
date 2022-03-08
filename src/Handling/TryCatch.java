package Handling;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("starting point of a try catch block \n");

        try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally{
            int c =8*6;
            System.out.println(c);
        }

    }

}






