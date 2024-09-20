import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TP_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del ejercicio");
        int numEjercicio = sc.nextInt();
        System.out.println("El numero del ejercicio es " + numEjercicio);
        sc.nextLine();
        
        switch (numEjercicio) {
            case 1:
                realizar_casteo(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 3:
                numero_tres_digitos(sc);
                break;
            case 4:
                programa_cajera(sc);
                break;
            case 5:
                convertir_entero_a_string(sc);
                break;
            case 6:
                indicar_tamaño_cadena(sc);
                break;
            case 7:
                indicar_vocales_cadena(sc);
                break;
            case 8:
                remplazar_caracter(sc);
                break;
            case 9:
                transformar_a_codigo_ASCII();   
                break;
            case 10:
                trasnformar_mayuscula_minuscula(sc);
                break;
            case 11:
                indicar_igualdad_palabras(sc);
                break;             
            case 12:
                extraer_letras(sc);
                break;
            case 13:
                cadena_indexada(sc);
                break;
            case 21:
                ejercicio21(sc);
                break;
            case 22:
                ejercicio22(sc);
                break;
            case 23:
                ejercicio23(sc);
                break;
            default:
                System.out.print(numEjercicio);
        }
    }
     //ejercicio 1
    public static void realizar_casteo(Scanner sc) {
         
        System.out.println("Ingrese un valor decimal");
        double valorDecimal = sc.nextDouble();
        
        System.out.println("EL número ingresado es: " + valorDecimal);
        
        short valorShort = (short)valorDecimal;
        System.out.println("Short: " + valorShort);
        
        int valorInt = (int)valorDecimal;
        System.out.println("Int: " + valorInt);
        
        long valorLong = (long)valorDecimal;
        System.out.println("Long: " + valorLong);
        
        String valorString = String.valueOf(valorDecimal);//Para convertir de double a string
        System.out.println("String: " + valorString);
        
        float valorFloat = (float)valorDecimal;
        System.out.println("Float: " + valorFloat);
    } 
        
    //ejercicio 2
    public static void ejercicio2(Scanner sc){
        byte valorByte = 120;
        valorByte = (byte) (valorByte + 10); //Se genera un overflow
        System.out.println("Byte: " + valorByte);//se soluciona dando un nuevo valor de rango
    }

    //ejercicio 3
    public static void numero_tres_digitos(Scanner sc) {
        int n1;
        System.out.println("Ingrese un numero de tres digitos: ");
        n1 = sc.nextInt();
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
    }
    
    //ejercicio 4
    public static void programa_cajera(Scanner sc){
        System.out.println("Ingresar la cantidad de dinero");
        double dineroIngresado = sc.nextDouble();
        
        int[] arregloBilletes = {200,100,50,20,10,5,2,1};
        double[] arregloMonedas = {0.50,0.25,0.10};
        
        int parteEntera = (int)dineroIngresado;
        int parteDecimal = (int)Math.round((dineroIngresado - parteEntera)*100);
        
        for(int billete : arregloBilletes){
            if(parteEntera >= billete){
                int cantidadBilletes = parteEntera / billete;
                parteEntera %= billete;
                System.out.println(cantidadBilletes +" billete(s) de " + billete);
            }
        }
        for(double moneda : arregloMonedas){
            int valorMonedaEnCentavos = (int)(moneda * 100);
            if(parteDecimal >= valorMonedaEnCentavos){
                int cantidadMonedas = parteDecimal / valorMonedaEnCentavos;
                parteDecimal %= valorMonedaEnCentavos;
                System.out.println(cantidadMonedas + " moneda(s) de "+ moneda);
            }
        }
    };
    
    //ejercicio 5
    public static void convertir_entero_a_string(Scanner sc){
    
        System.out.println("Ingrese un numero entero");
        int numero = sc.nextInt();
        String numeroString = String.valueOf(numero);
        System.out.println("El numero ingresado en string es: " + numeroString);
    };

    //ejercicio 6
    public static void indicar_tamaño_cadena(Scanner sc) {
        String frase = "La lluvia en Mendoza es escasa";
        int tamano = frase.length();
        System.out.println("El tamaño de la frase: " + frase + " es: " + tamano);
    }
    
    //ejercicio 7
    public static void indicar_vocales_cadena(Scanner sc) {
        System.out.println("Ingrese una cadena:");
        String cadenaDeTexto = sc.nextLine();
        
        int cantidadCaracteres =  cadenaDeTexto.length();
        
        int contadorVocales = 0;
        for(int i = 0; i < cadenaDeTexto.length(); i++){
            char caracter = Character.toLowerCase(cadenaDeTexto.charAt(i));    
            if(caracter == 'a' ||caracter == 'e' || caracter == 'i' ||caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La cantidad de caracteres son: " + cantidadCaracteres);
        System.out.println("La cantidad de vocales son: " + contadorVocales);
    }
    
    //ejercicio 8
    public static void remplazar_caracter(Scanner sc){
        System.out.println("Ingrese una cadena: ");
        String textoIngresado = sc.nextLine();
        
        String textoModificado = textoIngresado.replace("a", "e");
        
        System.out.println("EL texto modificado es " + textoModificado);
        
    }
    //ejercicio 9
    public static void transformar_a_codigo_ASCII () {    
        String frase2 = "La lluvia en Mendoza es escasa";
        int tamano3 = frase2.length();
        for (int i = 0; i < tamano3; i++) {
            char c2 = frase2.charAt(i);
            int codigoAscii = (int) c2;
            System.out.println(codigoAscii + " ");
        }
    }
    
    //ejercicio 10
    public static void trasnformar_mayuscula_minuscula(Scanner sc){
        System.out.println("Ingrese una frase");
        String fraseIngresadaUsuario = sc.nextLine();
        int opcion;
        
        do{
            System.out.println("Ingrese 1 si desea que se conviertan los caaracteres a mayuscula");
            System.out.println("Ingrese 2 si desea que se conviertan los caaracteres a minuscula");
            opcion = sc.nextInt();
        }while(opcion != 1 && opcion != 2);        
        
        if(opcion == 1) {
            fraseIngresadaUsuario = fraseIngresadaUsuario.toUpperCase();
            System.out.print(fraseIngresadaUsuario);
        }else if(opcion ==2 ) {
            fraseIngresadaUsuario = fraseIngresadaUsuario.toLowerCase();
            System.out.println(fraseIngresadaUsuario);
        }
    }
    
    //ejercicio 11
    public static void indicar_igualdad_palabras(Scanner sc){
        System.out.println("Ingrese la primer palabra");
        String palabra1 = sc.nextLine();
        
        System.out.println("Ingrese la segunda palabra");
        String palabra2 = sc.nextLine();
        
        if(palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras son distintas");
        }
    };
    //ejercicio 12
    public static void extraer_letras(Scanner sc) {
        System.out.println("Ingresar una palabra");
        String palabraIngresada = sc.nextLine();
        
        String palabraModificada = palabraIngresada.substring(3,5);
        System.out.println(palabraModificada);
    }
    
    //ejercicio 13
    
    public static void cadena_indexada(Scanner sc) {
        System.out.println("Ingresar una cadena");
        String cadena1 = sc.nextLine();
        
        System.out.println("Ingrese la segunda cadena");
        String cadena2 = sc.nextLine();
        
        if(cadena1.contains(cadena2)){
            System.out.println("Si, la segunda cadena se encuentra dentro de la primera");
        }else {
            System.out.println("No, la segunda cadena no se encuentra dentro de la primera");
        }
        
    }
    
    //ejercicio 21
    public static void ejercicio21(Scanner sc){
        System.out.println("Ingrese un numero mayor a 0");  
        int numeroIngresado = sc.nextInt();
        
        int resultado = suma_recursiva(numeroIngresado);
        System.out.println(resultado);
    };
    public static int suma_recursiva(int numeroIngresado){
        if(numeroIngresado == 0){
            return 0;
        }
        if(numeroIngresado == 1) {
            return 1;
        }
        return numeroIngresado + suma_recursiva(numeroIngresado -1);
    }
    
    //ejercicio 22
    public static void ejercicio22 (Scanner sc){
        System.out.println("Ingrese un numero");
        int numeroIngresado = sc.nextInt();
        
        int resultado = suma_digitos(numeroIngresado);
        System.out.println("El resultado es: "+ resultado);
    };
    
    public static int suma_digitos(int numeroIngresado){
        if (numeroIngresado == 0) {
            return 0;
        }
        return numeroIngresado % 10 + suma_digitos(numeroIngresado / 10);
        
    };
    
    //ejercicio 23
    public static void ejercicio23(Scanner sc){
        System.out.println("Ingrese una cadena");
        String cadenaIngresada = sc.nextLine();
        
        String cadenaInvertida = invertir_cadena(cadenaIngresada);
        System.out.println("La cadena invertida es:" +  cadenaInvertida);
    }
    
    public static String invertir_cadena(String cadenaIngresada){
        if(cadenaIngresada.isEmpty()) {
            return cadenaIngresada;
        }
        return invertir_cadena(cadenaIngresada.substring(1)) + cadenaIngresada.charAt(0);   
    }
    
}



