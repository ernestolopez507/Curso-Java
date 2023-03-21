import java.util.Calendar;

public class ClaseCalendar {
    public static void main(String[] args) {
        //Calendar es una clase abstracta, por lo que no se puede instanciar con el operador new
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.getTime());
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendario.get(Calendar.MONTH));
        System.out.println(calendario.get(Calendar.YEAR));
        System.out.println(calendario.get(Calendar.HOUR));
        System.out.println(calendario.get(Calendar.MINUTE));
        System.out.println(calendario.get(Calendar.SECOND));
        System.out.println(calendario.get(Calendar.MILLISECOND));
        System.out.println(calendario.get(Calendar.AM_PM));
        System.out.println(calendario.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendario.get(Calendar.WEEK_OF_MONTH));

        //set() permite modificar el valor de un campo del calendario
        calendario.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendario.getTime());
        //parametros: año, mes, dia, hora, minuto, segundo
    }
}
