public class ops {
    public static int suma(int numero, int numero2)
    {return numero + numero2;}

    public static int resta(int numero, int numero2)
    {return numero - numero2;}

    public static int producto(int numero, int numero2)
    {return numero * numero2;}

    public static int division(int numero, int numero2)
    {return numero - numero2;}

    public static void es_primo(int numero)
    {int contador = 0;
    for (int i = 1; i <= numero; i++){
        if (numero % i == 0){contador++;}}
    if (contador == 2)
        {System.out.print("Es primo");}
    else 
        {System.out.print("No es primo");}
    }
    }


