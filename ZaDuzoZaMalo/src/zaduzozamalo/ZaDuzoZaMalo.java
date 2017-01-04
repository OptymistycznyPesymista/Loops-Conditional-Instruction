/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaduzozamalo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class ZaDuzoZaMalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /**
            Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
   (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
   wartości. Jeżeli podana wartość jest:
   • większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
   • mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
   • identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
   się kończy.

       * 
        */ 
        
        
        
        Random rand = new Random();
      int a = rand.nextInt(101)+1;
              
      System.out.println(" Podaj liczbe z zakresu 1-100:");
      for(;;)
      { Scanner odczyt = new Scanner (System.in);
         int n = odczyt.nextInt();
        if (a==n)
        System.out.println("Zgadles");
        else if(n>a)
            System.out.println("Podales za duzo");
        else if(n<a)
          System.out.println("Podales za malo");
      }
              
    }
    
}
