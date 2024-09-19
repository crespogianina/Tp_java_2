import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);

        System.out.print("Ingrese el numero del ejercicio deseado: ");
        int ejercicio = opc.nextInt();

        switch (ejercicio) {
            case 1:double valorDecimal;
            System.out.println("Ingrese un numero decimal: ");
            valorDecimal = opc.nextDouble();
            short valorShort = (short) valorDecimal;
            int valorInt = (int) valorDecimal;
            long valorLong = (long) valorDecimal;
            String valorString = String.valueOf(valorDecimal); //Para convertir de double a string
            float valorFloat = (float) valorDecimal;
            System.out.println("Short: " + valorShort);
            System.out.println("Int: " + valorInt);
            System.out.println("Long: " + valorLong);
            System.out.println("String: " + valorString);
            System.out.println("Float: " + valorFloat);
            break;
            case 2:byte valorByte = 120;
            valorByte = (byte) (valorByte + 10); //Se genera un overflow
                System.out.println("Byte: " + valorByte);//se soluciona dando un nuevo valor de rango
                break;
            case 3:int n1;
                System.out.println("Ingrese un numero de tres digitos: ");
                n1 = opc.nextInt();
                if (n1 >= 100 && n1 <= 999) {
                    int suma = 0;
                    suma += n1 % 10;
                    n1 /= 10;
                    suma += n1 % 10;
                    n1 /= 10;
                    suma += n1;
                    System.out.println("La suma de los digitos es: " + suma);
                } else {
                    System.out.println("El numero ingresado no esta dentro del rango solicitado");
                }
            break;
            case 4:System.out.println("Ingrese la cantidad de dinero: ");
            double cantidad = opc.nextDouble();
            int[] billetes = {200, 100, 50, 20, 10, 5, 2, 1};
            double[] monedas = {0.50, 0.25, 0.10, 0.05};
            for (int ib : billetes) {
                int cantBilletes = (int) (cantidad / ib);
                if (cantBilletes > 0) {
                    System.out.println(cantBilletes + " billete/s de " + ib + " pesos");
                }
                cantidad %= ib;
            }
            for (double im : monedas) {
                int cantMonedas = (int) (cantidad / im);
                if (cantMonedas > 0) {
                    System.out.println(cantMonedas + " moneda/s de " + im + " centavos");
                }
                cantidad %= im;
                }
            break;
            case 5:System.out.println("Ingrese un numero entero: ");
            int numero = opc.nextInt();
            String numeroString = String.valueOf(numero);
            System.out.println("El numero ingresado en string es: " + numeroString);
            break;
            case 6:String frase = "La lluvia en Mendoza es escasa";
            int tamano = frase.length();
            System.out.println("El tamaño de la frase: " + frase + " es: " + tamano);
            break;
            case 7:System.out.println("Ingrese una cadena: ");
            String cadena = opc.next();
            int tamano2 = cadena.length();
            int contVocal = 0;
            String vocales = "aeiouAEIOU";
            for (int i = 0; i < tamano2; i++) {
                char c = cadena.charAt(i);
                if (vocales.indexOf(c) != -1) {
                    contVocal++;
                }
            }
            System.out.println("El tamano de la cadena es: " + cadena);
            System.out.println("La cantidad de vocales es: " + contVocal);
            break;
            case 8:System.out.println("Ingrese una cadena: ");
                String cadena2 = opc.next();
                String reemplazo = cadena2.replace('a', 'e');
                System.out.println("El cadena nueva es: " + reemplazo);
                break;
            case 9:String frase2 = "La lluvia en Mendoza es escasa";
                int tamano3 = frase2.length();
                for (int i = 0; i < tamano3; i++) {
                    char c2 = frase2.charAt(i);
                    int codigoAscii = (int) c2;
                    System.out.println(codigoAscii + " ");
                    }
                break;
            case 10:System.out.println("Debe ingresar una cadena, para ello seleccione si desea convertirlo a minusculas(minu) o mayusculas(mayus)");
            String cadena3 = opc.next();
            if (cadena3 != "minu") {
                System.out.println("Ingrese una cadena: ");
                String cadena4 = opc.next();
                String cadMinu = cadena4.toLowerCase();
                System.out.println("La cadena en minusculas: " + cadMinu);
            } else {
                System.out.println("Ingrese una cadena: ");
                String cadena4 = opc.next();
                String cadMayus = cadena4.toUpperCase();
                System.out.println("La cadena en mayusculas: " + cadMayus);
            }
            break;
            case 11:System.out.println("Ingrese una palabra: ");
            String palabra = opc.next();
            System.out.println("Ingrese otra palabra: ");
            String palabra2 = opc.next();
            int comparar = palabra.compareTo(palabra2);
            int ignorar = palabra.compareToIgnoreCase(palabra2);
            boolean igual = palabra.equals(palabra2);
            System.out.println("El palabra " + palabra + " y " + palabra2 + " comparado: " + comparar);
                System.out.println("El palabra " + palabra + " y " + palabra2 + " comparado ignorando el caso: " + ignorar);
                System.out.println("El palabra " + palabra + " y " + palabra2 + " son: " + igual);
                break;
            case 12:System.out.println("Ingrese una cadena: ");
            String cadena5 = opc.next();
            String subcadena = cadena5.substring(4, 6);
            System.out.println("La subcadena es: " + subcadena);
            break;
            case 13:System.out.println("Ingrese una cadena: ");
            String cadena6 = opc.next();
            System.out.println("Ingrese otra cadena: ");
            String cadena7 = opc.next();
            int cad = cadena7.indexOf(cadena6);
            System.out.println(cad);
            break;
            case 17: class FuncionesPrograma {
                public static String getFechaString(Date fecha) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                return formato.format(fecha);
                            }
                            public class Principal {
                            public static void main(String[] args) {
                            Date fechaActual = new Date();
            String fechaCad = FuncionesPrograma.getFechaString(fechaActual);
            System.out.println("La fecha actual es: " + fechaCad);
                        }
                    }
                }
                break;
            case 18:class FuncionesPrograma2 {
                public static String getFechaString2(Date fecha2) {
                    SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
                    return formato2.format(fecha2);
                }
                public static Date getFechaDate(int dia, int mes, int anio) {
                    Calendar cal = Calendar.getInstance();
                    cal.set(anio, mes - 1, dia);
                    return cal.getTime();
                }
                public class Principal {
                    public static void main(String[] args) {
                        Date fecha2 = FuncionesPrograma2.getFechaDate(19, 9, 2024);
                        System.out.println("La fecha creada es: " + fecha2);
                    }
                }
            }
            break;
            case 19:
                class OperacionMate {
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

                public double aplicarOperacion(String operar) {
                    this.operacion = operar;
                    switch (operar) {
                        case "+":
                            return sumarNumeros();
                        case "-":
                            return restarNumeros();
                        case "*":
                            return multiplicarNumeros();
                        case "/":
                            return dividirNumeros();
                        default:
                            throw new IllegalArgumentException("La operación no es válida.");
                    }
                }
            }

                class Calculo { // Cambiado a mayúscula
                    public static void main(String[] args) {
                        OperacionMate operacion = new OperacionMate();
                        operacion.setValor1(10.5);
                        operacion.setValor2(2.5);
                        System.out.println("Suma: " + operacion.aplicarOperacion("+"));
                        System.out.println("Resta: " + operacion.aplicarOperacion("-"));
                        System.out.println("Multiplicación: " + operacion.aplicarOperacion("*"));
                        System.out.println("División: " + operacion.aplicarOperacion("/")); // Cambiado a "División"
                    }
                }
                break;
            default: System.out.println("Error");
        }
            }
        }



