/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdissenymodular;

import static exercicisdissenymodular.Numeros.vectorDigits;

/**
 *
 * @author profe
 */
public class ExercicisDissenyModular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Random r=new Random();
//        if(primer(13)) System.out.format("El %d és primer.\n", 13); 
//        else System.out.format("El %d no és primer.\n", 13);
//        for(int i=1;i<=100;i++){
//            int num=r.nextInt(201878);
////            if(primer(num)) System.out.format("El %d és primer.\n", num); 
////            else System.out.format("El %d no és primer.\n", num);
//            System.out.format((primer(num)?"El %d és primer.\n":"El %d no és primer.\n"), num);
//        
//            System.out.println(insertaCadena(null, null, 0));
//        System.out.println(insertaCadena(null, "subcadena", 0));
//        System.out.println(insertaCadena("text", null, 0));
//        System.out.println(insertaCadena("text", "subcadena", -10));
//        System.out.println(insertaCadena("text", "subcadena", 0));
//        System.out.println(insertaCadena("text", "subcadena", "text".length()/2));
//        System.out.println(insertaCadena("text", "subcadena", "text".length()));
//        System.out.println(insertaCadena("text", "subcadena", "text".length()+10));
//        System.out.println("");
   
        
//        System.out.println(subcadena("123456", 2, 5));
//        System.out.println("123456".substring( 2, 5));
//        
        int[] resultat=vectorDigits(+24);
        for (int i = 0; i < resultat.length; i++) {
            System.out.print(resultat[i]);
            
        }
        System.out.println("");
        
    }
        
    
    
}
