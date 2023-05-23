/*Escribe una aplicación con un String que contenga una contraseña cualquiera. 
Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando 
aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». 

Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos) */

import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
    
        String password = "papanatas";
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        while (true){
            contador++;
            if (contador == 3){break;}
            System.out.print("Tu intento:");
            String intento = sc.nextLine();
            if (password.equals(intento)){System.out.print("Enhorabuena"); break;}
            }

        }

    }

