import java.util.Date;

public class Principal {
    public static void main(String[] args){
        Date fecha = FuncionesPrograma.getFechaDate(10, 2, 2024);
        
        String fechaActual = FuncionesPrograma.getFechaString(fecha);
        System.out.println("La fecha actual es: "+ fechaActual);
        
    }
}

