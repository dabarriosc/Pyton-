/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Lector_de_archivos {
    
    public String reader(String direccion){
        
        
        String texto = "";
        
        try {
             BufferedReader lector = new BufferedReader(new FileReader(direccion));
             String temp = " ";
             String bf ;
             
             while( (bf = lector.readLine()) != null ){
                 
                 temp = temp + bf; 
             
             
             }
             
             texto = temp ;
             
        } catch (Exception e) {
        }
        
        return texto ;    
        
    }
    
    public String readerLine(String Direccion, String Espesificacion){
        
    
    
      String texto = "";
        
        try {
             BufferedReader lector = new BufferedReader(new FileReader(Direccion));
             String temp = " ";
             String bf ;
             
             while((bf = lector.readLine()) != null){
                 
                 if(bf.equals(Espesificacion)) {
                 
                     temp =  bf; }
             
             
             }
             
             texto = temp ;
            
             
        } catch (Exception e) {System.err.println(e);
        }
        
        return texto ;    
      
    
    
  }
    
  public String readerFichero(String Direccion){
  
    File fichero = new File (Direccion);

       Scanner sc=new Scanner(System.in);
       String respuesta;
       String salida = "";
       String salida_2 = null;

       try {
    do {
        BufferedReader br=new BufferedReader(new FileReader(fichero));
        System.out.println("Introduco un nombre que quieras buscar: ");
        respuesta="Persona: "+sc.nextLine();

        String linea="";
        boolean encontrado = false;
        while ((linea= br.readLine())!=null) {

            if(linea.equalsIgnoreCase(respuesta)) {
                System.out.println(linea);

                for(int i=0;i<2;i++) {
                    System.out.println(br.readLine());
                }   
                encontrado = true;
                break;

            }

        }

        if(!encontrado) System.out.println("El usuario no existe");

            System.out.println("¿Quieres introducir otro nombre?");
            respuesta=sc.nextLine();



    }while(respuesta.equalsIgnoreCase("si"));
} catch (IOException e) {

    System.out.println("Error");
}
    return salida ; 
  
 
  }
  
  
  
  
 
}   



  
