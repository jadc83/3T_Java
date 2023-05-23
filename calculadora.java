import java.util.Scanner;
import java.lang.Math;
public class calculadora {

    public static void main (String[]args){

        {   System.out.print("\033[H\033[2J");  
            System.out.flush();  
            System.out.println("Bienvenido a la calculadora");
            System.out.println("Operaciones disponibles:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Division entera");
            System.out.println("6. Potencia");
            System.out.println("7. Modulo");
            System.out.println("8. ANDbit");
            System.out.println("9. ORbit");
            System.out.println("0. Salir");
        
            try (Scanner entrada = new Scanner(System.in)) {
                System.out.print("Seleccione operacion: ");

                int seleccion = entrada.nextInt();

                switch (seleccion){

                    case 1: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                System.out.print("Operando 1");
                                int op2 = operando2.nextInt();
                            int resultado = op1 + op2;
                            System.out.print(resultado);}}}

                    case 2: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                    System.out.print("Operando 1");
                                    int op2 = operando2.nextInt();
                            int resultado = op1 - op2;
                            System.out.print(resultado);}}}
                    
                    case 3: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                    System.out.print("Operando 1");
                                    int op2 = operando2.nextInt();
                            int resultado = op1 * op2;
                            System.out.print(resultado);}}}
                    
                    case 4: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1: ");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                System.out.print("Operando 2: ");
                                int op2 = operando2.nextInt();
                            if (op1 < 1 || op2 < 1) {throw new ArithmeticException("No se puede dividir entre 0");}
                            
                            double resultado = op1 / op2;
                            System.out.print(resultado);}}}

                    case 5: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1: ");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                System.out.print("Operando 2: ");
                                int op2 = operando2.nextInt();
                            int resultado = op1 / op2;
                            System.out.print(resultado);}}}

                    case 6: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1: ");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                System.out.print("Operando 2: ");
                                int op2 = operando2.nextInt();
                            double resultado = Math.pow(op1, op2);
                            System.out.print(resultado);}}}
                    
                    case 7: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                System.out.print("Operando 2: ");
                                int op2 = operando2.nextInt();
                            int resultado = op1 % op2;
                            System.out.print(resultado);}}}

                    case 8: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                System.out.print("Operando 2: ");
                                int op2 = operando2.nextInt();
                            int resultado = op1 & op2;
                            System.out.print(resultado);}}}

                    case 9: {
                            try (Scanner operando1 = new Scanner(System.in)) {
                                System.out.print("Operando 1");
                                int op1 = operando1.nextInt();
                            try (Scanner operando2 = new Scanner(System.in)) {
                                System.out.print("Operando 2: ");
                                int op2 = operando2.nextInt();
                            int resultado = op1 | op2;
                            System.out.print(resultado);}}}
                    case 0: { System.exit(1);}
                            
}
}                        
}
}
}