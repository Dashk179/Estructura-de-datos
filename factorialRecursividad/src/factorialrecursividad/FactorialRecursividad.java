package factorialrecursividad;

/**
 *
 * @author dash
 */
public class FactorialRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactorialRecursividad obj = new FactorialRecursividad();
        System.out.println("El factorial de 4 mediante el metodo recursivo es de: " + obj.factorialRecursivo(4));
        System.out.println("El factorial de 4 mediante un metodo con cilo es: "+ obj.factorialCilco(4));

    }
    //4! = 1 * 2 * 3 * 4 = 24 

    public int factorialRecursivo(int n) {
        if (n < 0) {
            return 0;

        } else {
            //Caso base
            if (n == 0) {
                return 1;
            } else {
                //Dominio (problema - 1)
                return n * factorialRecursivo(n - 1);
            }
        }
    }

    //Creando metodo factorial mediante ciclo
    public int factorialCilco(int n) {
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (n != 0) {
                factor = n * factor;
                n--;
            }
            return factor;

        }

    }

}
