import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class fraccion {
            private int num;
            private int denom;
            public fraccion(int num, int denom) {
                this.num = num;
                this.denom = denom;
            }
            public fraccion sumarFraccion(fraccion f) {
                int num2 = this.num * f.denom + f.num * this.denom;
                int denom2 = this.denom * f.denom;
                return new fraccion(num2, denom2);
            }
            public fraccion restarFraccion(fraccion f) {
                int num2 = this.num * f.denom - f.num * this.denom;
                int denom2 = this.denom * f.denom;
                return new fraccion(num2, denom2);
            }
            public fraccion multiplicarFraccion(fraccion f) {
                int num2 = this.num * f.denom;
                int denom2 = this.denom * f.denom;
                return new fraccion(num2, denom2);
            }
            public fraccion dividirFraccion(fraccion f) {
                int num2 = this.num * f.denom;
                int denom2 = this.denom * f.denom;
                return new fraccion(num2, denom2);
            }
            @Override
            public String toString() {
                return num + "/" + denom;
            }
        }
        class operacionesFraccion {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese un valor para numerador de la primera fraccion: ");
                int num1 = sc.nextInt();
                System.out.println("Ingrese un valor para denominador de la primera fraccion: ");
                int den1 = sc.nextInt();
                System.out.println("Ingrese un valor para numerador de la segunda fraccion: ");
                int num2 = sc.nextInt();
                System.out.println("Ingrese un valor para denominador de la segunda fraccion: ");
                int den2 = sc.nextInt();
                fraccion frac1 = new fraccion(num1, den1);
                fraccion frac2 = new fraccion(num2, den2);
                fraccion suma = frac1.sumarFraccion(frac2);
                fraccion resta = frac1.restarFraccion(frac2);
                fraccion multiplica = frac1.multiplicarFraccion(frac2);
                fraccion dividir = frac1.dividirFraccion(frac2);
                System.out.println("Suma: " + suma);
                System.out.println("Resta: " + resta);
                System.out.println("Multiplicacion: " + multiplica);
                System.out.println("Division: " + dividir);
                sc.close();
    }
}

        }
    }