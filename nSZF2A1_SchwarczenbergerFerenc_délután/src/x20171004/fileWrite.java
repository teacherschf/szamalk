package x20171004;
import java.io.*;
/**
 *
 * @author Schwarczenberger Ferenc
 */
public class fileWrite {
    public static void main(String[] args)throws Exception{
        try {
            FileWriter theFile = new FileWriter("output.txt");
            BufferedWriter write = new BufferedWriter(theFile);
            
            for (int i = 1; i <= 90; i++) {
                write.write(Integer.toString(i)+" ");
                if (i%10==0) {
                   write.newLine(); 
                }
           }
            
            write.close();
        } catch (Exception e) {
            System.out.println("I/O hiba: "+e.getMessage());
        }
    }
}