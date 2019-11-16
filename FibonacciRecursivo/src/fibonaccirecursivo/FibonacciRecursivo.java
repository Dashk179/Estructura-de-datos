/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccirecursivo;

/**
 *
 * @author dash
 */
public class FibonacciRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FibonacciRecursivo fibo = new FibonacciRecursivo();
        System.out.println("La sucesion fibonacci de 12 mediante Recursividad es: " + fibo.fibonacciRecursivo(12));
        System.out.println("La sucesion fibonacci de 12 mediante Recursividad es: " + fibo.fibonacciCiclo(12));
        
       
    }
    
    public int fibonacciRecursivo(int n){
        if (n==1 || n==2){
        //Caso base (Respuesta Explicita)
        return 1;
    }
        else{
            //Domino (problema -1)
                return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
                }
    }
    
    //Creando el metodo con ciclo para la sucesion fibonacci
    public int fibonacciCiclo(int n){
        int fibo=0;
        int primero=1;
        int segundo=0;
        
        while (n>0) { 
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
            
        }
        return fibo;
    }
}
