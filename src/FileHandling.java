import java.io.File;
import java.io.FileReader;
public class FileHandling {
    public static void main(String[] args) {
        File file = new File("D:\\google donload\\sql.txt");
        System.out.println(file.length());
        char[] Array = new char[(int) file.length()];
        try{
            FileReader fr = new FileReader("D:\\google donload\\sql.txt");
            fr.read(Array);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(Array);


    }
}
