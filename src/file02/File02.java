/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author miguel
 */
public class File02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // TODO code application logic here
        String Cadena;
        FileReader f = new FileReader("Salida.txt");
        
        BufferedReader b = new BufferedReader(f);
        
        while((Cadena = b.readLine()) != null)
        {
            System.out.println(Cadena);
        }
    }
    
}
