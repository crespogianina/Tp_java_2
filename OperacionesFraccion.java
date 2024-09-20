import java.util.Scanner;

public class OperacionesFraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numerador y denominador de la primera fracción:");
        Fraccion f1 = new Fraccion(sc.nextInt(), sc.nextInt());

        System.out.println("Ingrese numerador y denominador de la segunda fracción:");
        Fraccion f2 = new Fraccion(sc.nextInt(), sc.nextInt());

        Fraccion resultado;

        resultado = f1.sumarFracciones(f1, f2);
        System.out.println("Suma: " + resultado);

        resultado = f1.restarFracciones(f1, f2);
        System.out.println("Resta: " + resultado);

        resultado = f1.multiplicarFracciones(f1, f2);
        System.out.println("Multiplicación: " + resultado);

        resultado = f1.dividirFracciones(f1, f2);
        System.out.println("División: " + resultado);
    }
}
