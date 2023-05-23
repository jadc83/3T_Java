import java.util.Scanner;

public class potencia2 {
    
    public static void main (String[]args){

        Scanner dato = new Scanner(System.in); {
        System.out.println("Introduce numero: ");
        int num = dato.nextInt();
        boolean res = num != 0 & (num & (num - 1) ) == 0;
        if (res)
        {System.out.println("Es potencia de 2");}
        else 
        {System.out.println("No es potencia de 2");}
        dato.close();
        }
    }
}