
package dam105t3_pooavanz;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;


public class Dam105t3e201 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opcGen = 0;

        String nom;
        GeneroPersona gen;
        String dni;
        int telefono;
        String email;
        LocalDate fechaNaci;

        HashSet <Persona_v4> arrayPersonas = new HashSet<>();

        do {
            
            System.out.print("Introduce el nombre: ");
            nom = teclado.nextLine();

            if (nom.equals("Z")) break;

            System.out.println("Selecciona el Género: ");
            System.out.println("1 - Masculino");
            System.out.println("2 - Femenino");
            opcGen = teclado.nextInt();

            if (opcGen == 1) {

                gen = GeneroPersona.MASCULINO;

            }

            else {

                if (opcGen == 2) {

                    gen = GeneroPersona.FEMENINO;

                }

                else {

                    gen = null;

                }

            }

            teclado.nextLine();

            System.out.print("Introduce el DNI: ");
            dni = teclado.nextLine();

            System.out.print("Introduce el Telefono: ");
            telefono = teclado.nextInt();

            teclado.nextLine();

            System.out.print("Introduce el Email: ");
            email = teclado.nextLine();

            System.out.print("Introduce la Fecha de Nacimiento (YYYY-MM-DD): ");
            fechaNaci = LocalDate.parse(teclado.nextLine());

            arrayPersonas.add(new Persona_v4(nom, gen, dni, telefono, email, fechaNaci));

        } while (!nom.equals("Z"));


        for (Persona_v4 persona : arrayPersonas) {
            
            System.out.println(persona.toString());

        }

    }
    
}
