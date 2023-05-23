import java.util.Scanner;

public class nombres2array {

    public static void main(String[] args) {
        
        String[] nombres = new String[5];


    
    for (int i = 0; i < nombres.length; i++){

        System.out.print("Introduce nombre:");
        Scanner scan = new Scanner(System.in);


        nombres[i] = scan.nextLine();

    }

    for (String elemento:nombres){

        System.out.print(elemento + " ");

    }



    }
}

