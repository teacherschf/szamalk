package x20171011_Kivetelkezekles;

import java.util.Scanner;

/**
 *
 * @author Schwarczenberger Ferenc
 */
public class osztas {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérema az osztandót!");
    int osztandó = sc.nextInt();
    System.out.println("Kérem az osztót!");    
    int osztó = sc.nextInt();
    
    boolean sikeres = false;
    double hányados = 0.0;
    
      try {
          hányados = (double)(osztandó/osztó);
          System.out.println(osztandó + " / "+ osztó + " = " + hányados);
          sikeres = true; //ha már az első sorban kiakad, a többi sor nem fut le!!!
      } 
      catch (ArithmeticException ae) {
          System.out.println("hiba: "+ae.getMessage());
      }
      finally {
          if (sikeres) {
              System.out.println("Az osztás rendben lezajlott...");
          }
          else{
              System.out.println("Az osztás sikertelen!");
          }
      }  
  }
}
