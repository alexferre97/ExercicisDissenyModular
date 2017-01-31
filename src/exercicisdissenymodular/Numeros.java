/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdissenymodular;

/**
 *
 * @author profe
 */
public class Numeros {
    
    
    public static boolean bixest(int any){

        //return (any>=1584) && (any%400==0 || (any%4==0 && any%100!=0));
        if(any<1584) return false;
        else
            if(any%400==0 || (any%4==0 && any%100!=0)) return true;
            else return false;
    
    }
    
    public static boolean primer(int numero){
        int candidat=2;
        int cDivisors=0;
        if(numero<=1) return false;

        for (; candidat <= numero && cDivisors<1; candidat++) {
            if(numero%candidat==0) cDivisors++;            
        }
        //for equivalent que no utiliza la variable cDivisors
        //for (; candidat <= numero && numero%candidat!=0; candidat++);
        return numero==(candidat-1);
        
    }
    
    public static int[] vectorDigits(int num){
        int[] resultat=new int[String.valueOf(num).length()-(num>=0?0:1)];
        boolean negatiu=(num<0);
        if(negatiu) num*=-1;
        for (int i = resultat.length-1; i >=0 ; i--) {
            resultat[i]=num%10;
            num/=10;
        }
        if(negatiu) resultat[0]*=-1;
        
        return resultat;
    
    }
    
    
}
