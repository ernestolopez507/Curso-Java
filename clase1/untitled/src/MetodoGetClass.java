import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String args[]){
        //cada objeto en java hereda de la clase object, por lo tanto tienen metodos en comun a la clase object 
        //getclass es un metodo de la clase object que nos devuelve la clase del objeto
        //getclass nos permite obtener informacion y metadaos de la clase del objeto, es decir toda su estructura interna, metodos, atributos, clase padre de la cual hereda, etc.
        //ejemplo
        String nombre = "Andres";
        System.out.println("nombre.getClass() = " + nombre.getClass());
        System.out.println("nombre.getClass().getName() = " + nombre.getClass().getName());
        System.out.println("nombre.getClass().getSimpleName() = " + nombre.getClass().getSimpleName());

        //este metodo retorna una instancia de la clase class
        Class strClass = nombre.getClass();
        System.out.println("strClass = " + strClass);

        //obtener sus metodos
        Method[] metodos = strClass.getMethods();
        for (Method metodo : metodos) {
            System.out.println("metodo = " + metodo.getName());
        }
        
    }
}