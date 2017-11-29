package x20171018;

/**
 * @author Schwarczenberger Ferenc
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.print.DocFlavor;

public class io_token {

  public static void main(String[] args) {
    int szam;
    int sum = 0;
    String szum = "", actual;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérek több egész számot vesszővel elválasztva!");
    String sor = sc.nextLine(); // sor beolvasása
    String hibasAdatok = "";
    // darabolás
    StringTokenizer st = new StringTokenizer(sor, " "); // elválasztójel a vessző!
    //int db = st.countTokens(); //adatok (tokenek) száma
    int db=0;
    while (st.hasMoreTokens()) {
      try {
        actual = st.nextToken();
        szam = Integer.parseInt(actual);
        sum += szam;
        szum += actual+"+";
        db++;
      } catch (Exception e) {
        hibasAdatok += e.getMessage().split(":")[1].trim().replace("\"", "")+";";
      }
    }
    System.out.println("A beolvasott számok (" + db + " db) összege: " + sum);
    szum= szum.substring(0, szum.length()-1)+"="+sum;
    System.out.println("Az összeadás: "+szum);
    System.out.println(hibasAdatok);
  }
}
