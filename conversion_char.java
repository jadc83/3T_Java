/* Lee un número por teclado y muestra por consola, el carácter al que pertenece 
en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.

Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un 
carácter (char) y muestre su código en la tabla ASCII. */

import java.util.Scanner;

public class conversion_char {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        char num = (char) numero;

        System.out.println(num);

        


}    
}
