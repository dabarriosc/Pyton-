/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufer;

/**
 *
 * @author danie
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Lector_de_archivos lc = new Lector_de_archivos();
        
        String texto = lc.readerFichero("C:\\Users\\danie\\Desktop\\prueba_2.txt");
        
        System.out.println(texto);
        
        
    }
    
}
