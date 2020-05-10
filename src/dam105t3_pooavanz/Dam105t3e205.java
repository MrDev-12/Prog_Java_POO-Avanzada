
package dam105t3_pooavanz;

import java.util.Scanner;
import java.util.regex.*;


public class Dam105t3e205 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String regExp;

        System.out.print("Introduce una cadena: ");
        String cad = teclado.nextLine();

        // Matricula de coche

        regExp = "\\d{4}[A-Z]{3}";

        if (Pattern.matches(regExp, cad)) {
            
            System.out.println("La cadena introducida es una MATRICULA");

        }

        // Número binario

        regExp = "[0-1]+";

        if (Pattern.matches(regExp, cad)) {
            
            System.out.println("La cadena introducida es un NÚMERO BINARIO");

        }

        // Número hexadecimal

        regExp = "[0-9a-fA-F]+";

        if (Pattern.matches(regExp, cad)) {
            
            System.out.println("La cadena introducida es un NÚMERO HEXADECIMAL");

        }

        // Fecha con formato YYYY-MM-DD

        regExp = "\\d{4}-\\d{2}-\\d{2}";

        if (Pattern.matches(regExp, cad)) {
            
            System.out.println("La cadena introducida es una Fecha con formato YYYY-MM-DD");

        }

        // Fecha con formato YYYY-MM-DD o YYYY-M-D

        regExp = "\\d{4}-\\d{1,2}-\\d{1,2}";

        if (Pattern.matches(regExp, cad)) {
            
            System.out.println("La cadena introducida es una Fecha con formato YYYY-MM-DD o YYYY-M-D");

        }

        // Usuario de Twitter

        regExp = "@.{2,15}";

        if (Pattern.matches(regExp, cad)) {
            
            System.out.println("La cadena introducida es un USUARIO de TWITTER");

        }

    }
    
}
