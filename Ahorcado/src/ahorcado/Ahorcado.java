/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
        System.out.println("Escribe la palabra secreta:"); //Escribe la palabra secreta para adivinar.
        String palabraU = sc.next().toLowerCase();
        String[] vect = palabraU.split("");//Convierte la palabra secreta en un Array.
        String[] palabraJ = new String[vect.length];//Nuevo Array para ser sustituido por el jugador.
        int vida = 4; //Vida de jugador.
        boolean encuentro, validacion = false;//Encuentro: variable para evaluar si el jugador pierde una vida; Validacion: variable para evaluar si el jugador ha ganado o no.

        //Se muestra al usuario para que adivine la palbra con los espacios
        System.out.println("Adivina la siguiente palabra:");
        for (int i = 0; i < vect.length; i++) {
            palabraJ[i] = "__";
        }
        System.out.print(Arrays.toString(palabraJ));
        System.out.println();

        //Bucle de juego hasta que se acabe las vidas o gane el juego
        while ((vida > 0 && vida <= 4) && (validacion != true)) {
            encuentro = false; // Valor inicial para validacion de vida
            System.out.println("Escribe la letra:"); // Letra suministrada por el usuario
            String letraU = sc.next();
            for (int i = 0; i < vect.length; i++) { //Bucle para cambiar el espacio por la letra del jugador
                if (vect[i].equals(letraU)) {       // Compara la frase inicial con la letra del jugador
                    palabraJ[i] = letraU;           // Cambia el espacio por la letra
                    encuentro = true;               // Si es true encuentro no le quita vidas al jugador
                }
            }

            if (encuentro == false) {               // Evalua si validacion es falsa
                vida -= 1;                          //Quita una vida
            }
                                                    //Ciclo que evalua si el array de la palabra secreta es igual al array de jugador
            for (int i = 0; i < palabraJ.length; i++) {
                if (palabraJ[i].equals(vect[i])) {
                    validacion = true;
                } else {
                    validacion = false;
                    break;
                }
            }

            switch (vida) {
                case 3:
                    System.out.println(" ---------------------");
                    System.out.println(" |                     |");
                    System.out.println(" |                     |");
                    System.out.println(" |                  -------");
                    System.out.println(" |                 | -  -  |");
                    System.out.println(" |                 |   o   |");
                    System.out.println(" |                  -------");
                    break;

                case 2:
                    System.out.println(" ---------------------");
                    System.out.println(" |                     |");
                    System.out.println(" |                     |");
                    System.out.println(" |                  -------");
                    System.out.println(" |                 | -  -  |");
                    System.out.println(" |                 |   o   |");
                    System.out.println(" |                  -------");
                    System.out.println(" |                     |   ");
                    System.out.println(" |                     |   ");
                    System.out.println(" |                     |   ");
                    System.out.println(" |                     |   ");
                    System.out.println(" |                     |   ");
                    break;

                case 1:
                    System.out.println(" ---------------------");
                    System.out.println(" |                     |");
                    System.out.println(" |                     |");
                    System.out.println(" |                  -------");
                    System.out.println(" |                 | -  -  |");
                    System.out.println(" |                 |   o   |");
                    System.out.println(" |                  -------");
                    System.out.println(" |                     |   ");
                    System.out.println(" |                   / | \\ ");
                    System.out.println(" |                  /  |   \\ ");
                    System.out.println(" |                 /   |     \\ ");
                    System.out.println(" |                     |   ");

                    System.out.println("__________");
                    break;

                case 0:
                    System.out.println(" ---------------------");
                    System.out.println(" |                     |");
                    System.out.println(" |                     |");
                    System.out.println(" |                  -------");
                    System.out.println(" |                 | X  X  |");
                    System.out.println(" |                 |   o   |");
                    System.out.println(" |                  -------");
                    System.out.println(" |                     |   ");
                    System.out.println(" |                   / | \\ ");
                    System.out.println(" |                  /  |   \\ ");
                    System.out.println(" |                 /   |     \\ ");
                    System.out.println(" |                     |   ");
                    System.out.println(" |                    / \\");
                    System.out.println(" |                   /   \\  ");
                    System.out.println(" |                  /     \\ ");
            }

            System.out.print(Arrays.toString(palabraJ));
            System.out.println();
            System.out.println("--------- Vida: " + vida + " ---------");
            if (validacion == true) {
                System.out.println("--------- Ganaste ---------");
            }

        }
        if (vida == 0) {
            System.out.println("--------- Perdiste --------");
        }
        System.out.println("--------- Fin del juego ---");

    }
}
