import java.util.Scanner;

public class ecuacion_2do_grado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce 'a': ");
        double a = sc.nextInt();

        if (a == 0.0){System.out.print("El valor de 'a' no puede ser 0");
            System.exit(0);}

        System.out.print("Introduce 'b': ");
        double b = sc.nextInt();
        System.out.print("Introduce 'c': ");
        double c = sc.nextInt();

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);

        System.out.println("x1 = " + x1);
        System.out.print("x2 = " + x2);

    }
}
