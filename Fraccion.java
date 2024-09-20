public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {
        int num = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        int denom = f1.denominador * f2.denominador;
        return new Fraccion(num, denom);
    }

    public Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
        int num = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
        int denom = f1.denominador * f2.denominador;
        return new Fraccion(num, denom);
    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        int num = f1.numerador * f2.numerador;
        int denom = f1.denominador * f2.denominador;
        return new Fraccion(num, denom);
    }

    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        int num = f1.numerador * f2.denominador;
        int denom = f1.denominador * f2.numerador;
        return new Fraccion(num, denom);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
