import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraCorrecta = "papanatas";
        int intentos = 3;

        for (int i = 0; i < intentos; i++) {
            System.out.print("Ingresa una palabra: ");
            String palabra = scanner.nextLine();

            if (palabra.equals(palabraCorrecta)) {
                System.out.println("¡Correcto! Has adivinado la palabra.");
                break;
            } else {
                System.out.println("Incorrecto. Intenta nuevamente.");
            }
        }
    }
}