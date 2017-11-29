/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20170913;

import x20170906.*;

/**
 *
 * @author Schwarci
 */
public class szemszam {
    
    static String sz;
    int k;
    
    public static void main(String[] args) {
        //sz=extra.Console.readLine("Kérem adja meg a személyi számát!\n");
        sz="28006181239";
        
        int elso = Character.getNumericValue(sz.charAt(0));
        int utolso = Character.getNumericValue(sz.charAt(10));
        
        System.out.println("A bekért szám: "+sz);
        System.out.println("első számjegy: "+elso);
        System.out.println("utolsó számjegy: "+utolso);
    }
    
}
