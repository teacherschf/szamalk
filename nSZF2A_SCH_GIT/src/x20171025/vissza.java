package x20171025;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Schwarczenberger Ferenc
 */
public class vissza {
    public static void main(String[] args)throws Exception {
     File theFile = new File("vissza.txt");
      
    try {
       try (Scanner eyes = new Scanner(theFile)) {
         while (eyes.hasNextLine()) {
           String sor = eyes.nextLine();
           System.out.println(sor);
           StringBuilder sb = new StringBuilder(sor);
           System.out.println("visszafelé: "+sb.reverse());
         }
       }
    }
    catch(FileNotFoundException fnfe){
      System.out.println("Error: "+fnfe.getMessage());
    }
  }
}
