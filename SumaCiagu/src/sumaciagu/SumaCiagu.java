/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaciagu;

import java.util.Scanner;

/**
 *
 * @author Nikodem
 */
public class SumaCiagu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(" Program obliczający sumę ciągu liczb od A do B");
        
        Scanner odczyt = new Scanner (System.in);
        System.out.println(" Podaj liczbe A ");
        int A = odczyt.nextInt();
        System.out.println(" Podaj liczbe wieksza od A ");
        int B = odczyt.nextInt();
   
    
           if (B<A)
                        {System.out.println(" Podaj liczbe A ");
                          A = odczyt.nextInt();
                          
                          System.out.println(" Podaj liczbe wieksza od A ");
                            B = odczyt.nextInt();}
    
        
          
           int suma = 0;
           
           for (; A<=B; A++){                                                        
           suma = suma + A;
           }
       System.out.println(suma);
       }   
    
   /*   w pętli while
       

         int suma=0;
        while(A<=B)
        
          { 
         suma = suma+A;
         A++;}
        System.out.println(suma); /*
    
}
   

 /* w petli do while   
    
   do{
            
       
       suma = suma+A;
         A++;        
      }
    
    while(A<=B);
       
           System.out.println(suma); 
            
        }
    }  
    
    
     /*











    
 
