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
public class Cadenes {
    
    public static String insertaCadena(String text, String subcadena, int numero ){
        
        if(text==null) return subcadena;
        if(subcadena==null) return text;
    
        if(numero<=0) return subcadena+text;
        if(numero>=text.length()) return text+subcadena;
        
        String resultat="";
        int i;
        for (i = 0; i < numero; i++) {
            resultat+= text.charAt(i);            
        }
        resultat+= subcadena;            
        for (; i < text.length(); i++) {
            resultat+= text.charAt(i);            
        }
        
        return resultat;
    }  
    
    public static String subcadena(String text, int inici, int fi){
    
        if(text==null) return null;
        if(inici<0) inici=0;
        if(fi<=0 || inici>=text.length() || inici>=fi) return "";
        if(fi>text.length()) fi=text.length();
        
        String resultat="";
        
        for (int i = inici; i < fi; i++) {
            resultat = resultat + text.charAt(i);            
        }
    
        return resultat;
        //return text.substring(inici, fi);
    }
    
    

}
