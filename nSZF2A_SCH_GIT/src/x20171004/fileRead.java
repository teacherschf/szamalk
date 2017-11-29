package x20171004;
import java.io.*;
import java.util.*;

/**
 *
 * @author Schwarczenberger Ferenc
 */
public class fileRead {
  public static void main(String[] args)throws Exception {
  //Abszolút file hivatkozás, csak abban a mappában lehet:
    //File theFile = new File("C:/Users/Tanulo/Documents/NetBeansProjects/nSZF2A2_SchwarczenbergerFerenc/src/x20171004/input.txt"); 
  //Relatív file hivatkozás, projekt mappában kell lennie:
    //File theFile = new File("input.txt");
  //RElatív file,  projekt mappában kell lennie:
    File theFile = new File("src/x20171004/input.txt");
      
    try {
      Scanner eyes = new Scanner(theFile);
        while (eyes.hasNextLine()) {              
            String sor = eyes.nextLine();
            System.out.println(sor);
        }
      eyes.close();
    }
    catch(Exception e){
      System.out.println("Error: "+e.getMessage());
    }
  }
}
