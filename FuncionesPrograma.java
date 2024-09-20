import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncionesPrograma {
    public static String getFechaString(Date fecha){
        SimpleDateFormat stringFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        return stringFecha.format(fecha);   
    }
    
    public static Date getFechaDate(int dia, int mes, int anio){
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes -1, dia);
        
        System.out.println(calendario.getTime());
        return calendario.getTime();
        
    };
}
