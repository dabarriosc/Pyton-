/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos_arraylist;
import java.util.*;

/**
 *
 * @author danie
 */
public class EstructurasDeDatos_Arraylist {


    public static void main(String[] args) {
        String input = "";
        ArrayList<String> arraylist = new ArrayList<>() ; //instancia del array
        
        
        Scanner lector = new Scanner(System.in); // intancia scanner
        input = lector.nextLine();               // inicializacion lector 
        
        for(int i = 0; i<=(input.length()-1);i++){
          
            arraylist.add(String.valueOf(input.charAt(i))); //llenado array
        }
        
        int j = 0;
        while(j <= (arraylist.size()-1)){   //loop principal
        
            for(int i= 0 ;i<=(arraylist.size()-1); i++){ //loop secundario
                        
          
               if(arraylist.get(i).equals(arraylist.get(j))&&(i!=j)){ 
                
                 arraylist.remove(i);
            
               }
            
           }
            j++;
        }
        
        System.out.println(arraylist);
        
       }
        
        
    }
  
