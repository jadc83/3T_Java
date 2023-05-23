import java.lang.Math;

/*Declara dos variables numéricas (con el valor que desees), 
muestra por consola la suma, resta, multiplicación, división
y módulo (resto de la división).  */


public class declaracion_variables {

    public static void main(String[] args) {
        
        double num1 = 1;
        double num2 = 2;

        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;

        System.out.println("La suma es " + Math.round(suma));  
        System.out.println("La resta es " + Math.round(resta));
        System.out.println("El producto es " + producto);
        System.out.println("La division es " + division);
        System.out.println("El modulo es " + modulo);

    }

    
}
    