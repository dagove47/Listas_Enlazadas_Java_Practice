/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Listas_Enlazadas;

import javax.swing.*;

/**
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Listas_Enlazadas_Java_Practice {

    public static void main(String[] args) {

        Word w = new Word();
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Seleccione el menu al que desea ingresar:" +
                        " \n\t1.Listas Simple\n\t2.Lista Circular\n\t3.Salir"
                        + "\nSeleccione lo que desea hacer (1-3)"));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "Ingreso un dato diferente de un número entero..\n" + e);

            }

            switch (opcion) {
                case 1:
                    w.operaciones();
                    break;
                case 2:
                    Persona p = new Persona();
                    p.operaciones();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción "
                            + "digitada no existe, " + "intente de nuevo...");
            }
        } while (opcion != 3);

    }
    

}
