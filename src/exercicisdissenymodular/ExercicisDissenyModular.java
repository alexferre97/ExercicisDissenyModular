/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdissenymodular;

import static exercicisdissenymodular.Numeros.primer;
import java.util.Random;

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
        Random r=new Random();
        if(primer(13)) System.out.format("El %d és primer.\n", 13); 
        else System.out.format("El %d no és primer.\n", 13);
        for(int i=1;i<=100;i++){
            int num=r.nextInt(201878);
//            if(primer(num)) System.out.format("El %d és primer.\n", num); 
//            else System.out.format("El %d no és primer.\n", num);
            System.out.format((primer(num)?"El %d és primer.\n":"El %d no és primer.\n"), num);
        
        }
        
    }
    
}
