/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczbynieparzyste;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class LiczbyNieparzyste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(" Program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od podanej liczby");
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Podaj liczbe dodatnia ");
        int a = odczyt.nextInt();
        
          if (a<0){ 
                System.out.println(" Podaj liczbe dodatnia");
                 a = odczyt.nextInt();}
    System.out.println(" Liczby nieparzyste, nie wieksze od podanej: " );
    for (int i=0; i<=a; i++){
      if (i%2==1)
      { 
        System.out.println(i);
     }
        
        
        
        
    }
    
    }
    
}
