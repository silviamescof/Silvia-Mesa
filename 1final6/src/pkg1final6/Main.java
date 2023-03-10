/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1final6;
import java.util.*;

 
public class Main {
    
     char devuelve = 0;
        for(int i=0;i<indice.length;i++){
            if(indice[i]==caracter){
                devuelve= codigo[i];
                break;
            }else{
                devuelve= caracter;
            }
        }
        return devuelve;
    }

     
    public static void main(String[] args) {
       
         char[]indice={'e','i','k','m','p','q','r','s','t','u','v'};
        char[]codigo={'p','v','i','u','m','t','e','r','k','q','s'};
        
        String texto;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("dime una frase");
        texto=sc.nextLine();
        
        char[]texcode=new char[texto.length()];
        String texfinal;
        
        for(int i=0;i<texcode.length;i++){
            texcode[i]=codifica(indice,codigo,texto.charAt(i));    
        }
        
        texfinal=String.valueOf(texcode);
        System.out.println(texfinal);
    }
    
}
