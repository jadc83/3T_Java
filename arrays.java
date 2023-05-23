/*Pide 5 números por teclado, los suma y los guarda en un array, luego imprime por pantalla la suma 

y los números en orden inverso. */

import java.util.Scanner;

public class arrays{

    public static void main(String[] args) {
        
        int[] lista = new int[5];

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int acumulador = 0;

        while (true)
        {if (contador == 5){break;}
        System.out.println("Mete numero: ");
        int num = sc.nextInt();
        System.out.println("------------");
        lista[contador] = num;
        contador++;}

        for (int elemento:lista)
        {
        acumulador = acumulador + elemento;
        }

        for (int i = lista.length - 1; i >= 0; i-- )
        {
        System.out.println(lista[i]);
        }
        System.out.println("------------");
        System.out.println("Total = " + acumulador);
    }
}