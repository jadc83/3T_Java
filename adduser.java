import java.util.Arrays;
import java.util.Scanner;

public class adduser {

    int id_grupo = 1000;
    int id_user = 1000;
    public static void main(String[] args) {
        
        String[] permisos = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario:");
        String user = sc.nextLine();
        permisos[0] = user;
        System.out.println("Introduce contraseña:");
        String password = sc.nextLine();

        System.out.println("Nivel permisos propietario:");
        String owner = sc.nextLine();
        permisos[1]  = owner;
        System.out.println("Nivel permisos groups:");
        String group = sc.nextLine();
        permisos[2] = group;
        System.out.println("Nivel permisos others:");
        String others = sc.nextLine();
        permisos[3] = others;
        sc.close();
        String finaluser = user + ":" + "x" + ":" + "id_user" + ":" + "group_user" + ":" + "Nombre" + ":" + "ruta" + "interprete";
        System.out.print(finaluser);
}
}

