import java.util.Scanner;

public class entrada_datos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = sc.nextLine();
        sc.close();
        System.out.println("Hola! " + nombre);


    }
}
