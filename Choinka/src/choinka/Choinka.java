/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choinka;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class Choinka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program rysuje choinkę; wysokość podana przez użytkownika
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki ");
        int n = odczyt.nextInt();           
    
    for (int i=0;i<n;i++){
     for (int j = 0; j < n - i; j++) {
        System.out.print(" ");}
        for (int j=0; j<=i*2;j++){  
        
          System.out.print("*");
    }
      
        System.out.println();
    }
    
    }
    
}
