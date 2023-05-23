/*Pide por teclado un intervalo entre 2 números. Luego imprime por pantalla 
todos los numeros enteros del intervalo diciendo los que son primos y los que no.  */


public class intervalo_primos {

    public static String es_primo(int numero)
    {int contador = 0;
    for (int i = 1; i <= numero; i++){
        if (numero % i == 0){contador++;}}

    if (contador == 2) {return "Primo";}
    else {return "Compuesto";}

    }

    public static void intervalo(int numero1, int numero2){
        for (int i = numero1; i < numero2; i++){
            String res = es_primo(i);
            System.out.print(i + " ");
            System.out.println(res);

        }

    }
    
}
