/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podane0;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class Podane0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Program, który wczytuje liczby podawane przez użytkownika dotąd, dopókinie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych liczb.

     Scanner odczyt = new Scanner (System.in);
     System.out.println(" Podaj liczbe n"); 
     int n = odczyt.nextInt();
        
        
     int suma=0;
     suma=suma+n;   
     
        
        for (;;){
        
            {
              if (n!=0)
            System.out.println(" Podaj liczbe n ");
              n = odczyt.nextInt();
        suma=suma+n;}
        
        if (n==0)
        { System.out.println(" Suma liczb podanych przez użytkownika wynosi ");        
            System.out.println(suma);}
              
    }
}  
}

    
        
        
        
    


