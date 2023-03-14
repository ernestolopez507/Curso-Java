class Persona{
    private String nombre;

    public void cambiarReferencia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}

public class ValorYReferencia {
    public static void main(String args[]){
        //explicame sobre el paso de parametros por valor y por referencia
        //paso de parametros por valor
        //cuando se pasa un parametro por valor, se crea una copia del valor del parametro y se pasa a la funcion
        //ejemplo
        int numero = 10;
        System.out.println("numero = " + numero);
        cambiarValor(numero);
        System.out.println("numero = " + numero);
        //paso de parametros por referencia
        //cuando se pasa un parametro por referencia, se pasa la referencia del objeto y no se crea una copia
        //ejemplo
        Persona persona = new Persona();
        persona.cambiarReferencia("Andres");
        System.out.println("persona.nombre = " + persona.getNombre());
        test(persona);
        System.out.println("persona.nombre = " + persona.getNombre());


        //en sintesis un primitivo pasa su valor y un objeto pasa su referencia
        //excepto las clases wrapper que pasan su valor y no su referencia porque son inmutables, siempre crean una instancia nueva
    }
    public static void cambiarValor(int numero){
        numero = 20;
    }
    public static void test(Persona personaRef){
        personaRef.cambiarReferencia("Juan");
    }
}
