package x20171108;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Schwarczenberger Ferenc
 */

class Tanulo implements Serializable{
  String nev;
  Integer kor;
  
   @Override
 public String toString(){
  return nev+", "+kor;
 }
}

public class serialization {
  private static void make() throws IOException{
    
    Tanulo sanyi = new Tanulo();
      sanyi.nev = "Rúzsa Sándor";
      sanyi.kor = 160;

  
    Tanulo mari = new Tanulo();
      mari.nev = "Kiss Mária";
      mari.kor = 40;
      
    Tanulo tibi = new Tanulo();
      tibi.nev = "Nagy Tibor";
      tibi.kor = 21;
      
    FileOutputStream fos = new FileOutputStream("adat.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    //sanyi->oos->fos->file
    oos.writeObject(sanyi);
    oos.writeObject(mari);
    oos.writeObject(tibi);   
    oos.close();
      
      }
  
  private static void load() throws IOException, ClassNotFoundException{
    Tanulo egy = new Tanulo();
    Tanulo kettő = new Tanulo();
    
    FileInputStream fis = new FileInputStream("adat.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    
    egy = (Tanulo) ois.readObject();
    kettő = (Tanulo) ois.readObject();
    ois.close();
    
    System.out.println("adat1/1: "+egy.nev);
    System.out.println("adat1/2: "+egy.kor);
    
    System.out.println("adat2/1: "+kettő.nev);
    System.out.println("adat2/2: "+kettő.kor);
  
  }
  
  private static void load2() throws IOException, ClassNotFoundException{
    FileInputStream fis = null;
    ObjectInputStream ois = null;
    try {
          fis = new FileInputStream("adat.txt");
          ois = new ObjectInputStream(fis);
          
          while (true) {
        Tanulo student = (Tanulo) ois.readObject();
        
            System.out.println(student.nev);
            System.out.println(student.kor);
      }
          
    } catch (EOFException eof) {
      System.out.println("Vége a fájlnak!");
    }
    catch (IOException | ClassNotFoundException ex){
      ex.printStackTrace();
    }
    finally{
      ois.close();
    }

  
  }
  
  private static void load3() throws IOException, ClassNotFoundException{
        FileInputStream fis = null;
    ObjectInputStream ois = null;          
    try {
      fis = new FileInputStream("adat.txt");
          ois = new ObjectInputStream(fis);
          
          while (ois.read()==-1) {        
            System.out.println(""+ois.readObject().toString());
      }
          ois.close();
          
    } catch (Exception e) {
    }
         
  }
 
  public static void main(String[] args) throws IOException, ClassNotFoundException{
    make();
    //load();
    //load2();
    load3();
    
    
    
  }
  
}
