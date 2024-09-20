public class Calculo {
    public static void main(String[] args) {
        OperacionMatematica operacion = new OperacionMatematica();
        operacion.setValor1(10.5);
        operacion.setValor2(5);

        System.out.println("Suma: " + operacion.aplicarOperacion("+"));
        System.out.println("Resta: " + operacion.aplicarOperacion("-"));
        System.out.println("Multiplicación: " + operacion.aplicarOperacion("*"));
        System.out.println("División: " + operacion.aplicarOperacion("/"));
    }
}
