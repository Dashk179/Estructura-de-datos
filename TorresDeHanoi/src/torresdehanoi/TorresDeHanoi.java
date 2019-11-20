/*
 * Cada vez que se imprime juego completado(linea 32) hace referencia a cuantas veces hace recursividad
 */
package torresdehanoi;

/**
 *
 * @author dash
 */
public class TorresDeHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TorresDeHanoi ejem = new TorresDeHanoi();
      ejem.torresHanoi(4, 1, 2, 3);
        System.out.println("Juego terminado");
    }
    
    public void torresHanoi(int discos,int torre1,int torre2,int torre3){
        //Caso base
        if (discos==1){
            System.out.println("Mover disco de Torre " + torre1 + " a Torre "+ torre3 );
        }else{
            //Dominio 
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
            
        }
       // System.out.println("Juego Completado");
    }
}
