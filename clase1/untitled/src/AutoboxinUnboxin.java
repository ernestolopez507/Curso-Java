public class AutoboxinUnboxin {
    public static void main(String args[]){
        //autoboxing viene de auto y boxing, es cuando el compilador convierte un tipo primitivo a su clase wrapper
        //ejemplo
        int entero = 10;
        Integer enteroObjeto = entero;
        //unboxing viene de un y boxing, es cuando el compilador convierte un objeto de su clase wrapper a su tipo primitivo
        //ejemplo
        Integer enteroObjeto2 = 10;
        int entero2 = enteroObjeto2;

        
        //formas explicitas de hacer autoboxing y unboxing
        //autoboxing
        Integer enteroObjeto3 = Integer.valueOf(entero);
        //unboxing
        int entero3 = enteroObjeto3.intValue();

        //formas implicitas de hacer autoboxing y unboxing
        //autoboxing
        Integer enteroObjeto4 = 10;
        //unboxing
        int entero4 = enteroObjeto4;
    }
}
