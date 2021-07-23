/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static javafx.scene.input.KeyCode.N;
import static javax.swing.text.html.HTML.Attribute.N;

/**
 *
 * @author Francisco Back
 */
public class Traductor {
    
    public String Traducir(String N){
      
        char[] aCaracteres = N.toCharArray();

        for (int i = 0; i < aCaracteres.length; i++) {
             
            if (aCaracteres[i] == 'M'|| aCaracteres[i] == 'm') {
                aCaracteres[i] = '0';
            }
            if (aCaracteres[i] == 'u') {
                aCaracteres[i] = '1';
            }
            if (aCaracteres[i] == 'r') {
                aCaracteres[i] = '2';
            }
            if (aCaracteres[i] == 'c') {
                aCaracteres[i] = '3';
            }
            if (aCaracteres[i] == 'i') {
                aCaracteres[i] = '4';
            }
            if (aCaracteres[i] == 'e') {
                aCaracteres[i] = '5';
            }
            if (aCaracteres[i] == 'l') {
                aCaracteres[i] = '6';
            }
            if (aCaracteres[i] == 'a') {
                aCaracteres[i] = '7';
            }
            if (aCaracteres[i] == 'g') {
                aCaracteres[i] = '8';
            }
            if (aCaracteres[i] == 'o') {
                aCaracteres[i] = '9';
            }
          //  System.out.print(aCaracteres[i]);
                  
            //System.out.println(N.charAt(i));
            /* if(N.charAt(i)=='M'){
              N.replace("M", "1");
        
            }if(N.charAt(i)=='u'){
                N.replace("u", "1");
            }if(N.charAt(i)=='r'){
                
            } if(N.charAt(i)=='c'){
               
            }else{
                
            }*/
        }
        System.out.println("");
        System.out.println(String.valueOf(aCaracteres));
        String traducir=String.valueOf(aCaracteres);
        
       return traducir;
    }

           
     
}
    

