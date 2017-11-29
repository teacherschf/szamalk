package x20171004;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Schwarczenberger Ferenc
 */
public class fileRead {
    public static void main(String[] args) throws Exception{
//aBSZOLÚT ELÉRÉSI ÚT: 
//       File theFile = new File("C:/Users/Tanulo/Documents/NetBeansProjects/nSZF2A1_SchwarczenbergerFerenc/src/x20171004/input.txt");
//RELATÍV ELÉRÉSI  ÚT  a project mappához képest:
//               File theFile = new File("src/x20171004/input.txt");
//Text file a project mappába:
    File theFile = new File("input.txt");
    
        try {
            Scanner eyes = new Scanner(theFile);
            while (eyes.hasNextLine()) {                
                String sor = eyes.nextLine();
                System.out.println(sor);
            }
          
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }   
    }
}
