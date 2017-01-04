/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzielnikiliczby;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class DzielnikiLiczby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program wyświetlający dzielniki podanej liczby
        
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Podaj liczbe n: ");
        int n = odczyt.nextInt();
     System.out.println(" Dzielniki liczby to: ");
     
     for (int i=1; i<=n; i++){
         if (n%i==0)
          System.out.println(i);
             
        
             
             
     }

    }
    
}
