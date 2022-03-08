
/* Throwing checked Exception */

package Handling;
public class Throws {

    public  void findFile() throws ClassNotFoundException {

            throw new ClassNotFoundException("File not found");

    }
    public void run() throws ClassNotFoundException{    /* we used throws clause because we are not handling */
        findFile();                                     /* the Exception in this method*/
    }

    public static void main(String[] args) /*throws ClassNotFoundException*/ {
        Throws ob = new Throws();
        try {
            System.out.println("try before Exception");
            ob.findFile();
            System.out.println("try  after Exception");
        }
        catch(ClassNotFoundException e){
            System.out.println("Handled");

        }
        finally {
            System.out.println("finally block always executed");
        }
    }
}
