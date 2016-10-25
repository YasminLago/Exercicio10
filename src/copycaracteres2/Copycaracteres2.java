package copycaracteres2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author oracle
 */
public class Copycaracteres2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader read = new BufferedReader(new FileReader("texto10.txt"));
        BufferedWriter write = new BufferedWriter(new FileWriter("texto11.txt"));
        PrintWriter pw = new PrintWriter(write);
        
        String c;
        while((c = read.readLine()) != null){
            System.out.println(c);
            pw.println(c);           
        }      
        read.close();
        pw.flush(); //Guarda los cambios del fichero
        pw.close();
    }
    
}
    
