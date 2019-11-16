/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosrecursivos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dash
 */
public class MetodosRecursivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MetodosRecursivos ObjEsc = new MetodosRecursivos();
        ObjEsc.bajarEscalera(100);
    }

    //Creando un metodo para bajar una escalera de forma recursiva
    public void bajarEscalera(int escalones) {

        if (escalones == 0)
        {
            //caso base, Respuesta explicita ()
            System.out.println("Has terminado de bajar la escalera");
        }
        else {
            try {
                //Dominio,division del problema original (problema-1)
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MetodosRecursivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Bajando escalon:" + escalones);
            //Haciendo uso de la recursividad
            bajarEscalera(escalones-1);
        }
    }
}
