/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potegiliczby;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class PotegiLiczby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       // Program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba)

        
        
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Podaj liczbe dodatnia n ");
        int n = odczyt.nextInt();
     
        
        
        
     
         
     for (int i=0; i<=n; i++){
      double potega = Math.pow(2,i);    
        
      if (potega<=n)
      System.out.println(potega);
     }  
     
     
         
    
    
    }
}

