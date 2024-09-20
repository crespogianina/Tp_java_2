public class OperacionMatematica {
    
    private double valor1;
    private double valor2;
    private String operacion;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    private double sumarNumeros() {
        return valor1 + valor2;
    }

    private double restarNumeros() {
        return valor1 - valor2;
    }

    private double multiplicarNumeros() {
        return valor1 * valor2;
    }

    private double dividirNumeros() {
        if (valor2 != 0) {
            return valor1 / valor2; // Corrección aquí
        } else {
            throw new ArithmeticException("No se permite dividir entre cero.");
        }
    }

    public double aplicarOperacion(String operacion) {
        switch (operacion) {
            case "+":
                return sumarNumeros();
            case "-":
                return restarNumeros();
            case "*":
                return multiplicarNumeros();
            case "/":
                return dividirNumeros();
            default:
                System.out.println("Operación no válida.");
                return 0;
        }
    }
    
}
