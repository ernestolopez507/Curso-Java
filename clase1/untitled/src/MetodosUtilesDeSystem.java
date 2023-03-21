public class MetodosUtilesDeSystem {
    public static void main(String[] args) {
        //el metodo .out de la clase System es un PrintStream que se utiliza para escribir en la consola
        //el metodo .err de la clase System es un PrintStream que se utiliza para escribir en la consola de errores
        //un PrintStream es un flujo de salida de datos
        //un flujo de salida de datos es un objeto que se utiliza para escribir datos en un destino
        //el destino puede ser un archivo, un socket, la consola, etc.

        //el metodo .exit de la clase System se utiliza para terminar la ejecucion de la aplicacion, generalmente se le pasa como parametro un entero que indica el codigo de salida
        //el codigo de salida es un entero que se utiliza para indicar el estado de finalizacion de la aplicacion
        //si el codigo de salida es 0, significa que la aplicacion finalizo correctamente
        //si el codigo de salida es distinto de 0, significa que la aplicacion finalizo con errores

        //el metodo .currentTimeMillis de la clase System devuelve la cantidad de milisegundos transcurridos desde el 1 de enero de 1970 hasta el momento de la invocacion
        //este metodo se utiliza para medir el tiempo de ejecucion de un fragmento de codigo
        //ejemplo:
        long inicio = System.currentTimeMillis();
        //codigo a medir
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion: " + (fin - inicio) + " ms");

        //el metodo .gc de la clase System se utiliza para forzar la ejecucion del recolector de basura
        //el recolector de basura es un proceso que se ejecuta en segundo plano y se encarga de liberar la memoria de los objetos que ya no se utilizan
        //cuando se crea un objeto, se reserva un espacio en la memoria para almacenar la informacion del objeto
        //cuando el objeto ya no se utiliza, se libera el espacio en la memoria

        
        
        
    }
}
