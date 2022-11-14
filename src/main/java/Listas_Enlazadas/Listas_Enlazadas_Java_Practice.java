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
                    menu2();
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
    
    public static void menu2() {
        Carro carro = new Carro();
        
        int loop = 0;
        while(loop == 0) {
            int add = JOptionPane.showConfirmDialog(null,
                    carro + "\n" +
                            "Desea agregar mas conductores a la fila?",
                    "Question",JOptionPane.YES_NO_OPTION);
            switch(add) {
                case 0:
                    String nombre = JOptionPane.showInputDialog(
                            "Digite el nombre del conductor:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite la edad del conductor:"));
                    carro.inserta(new Persona(nombre, edad));
                    break;
                default:
                    loop = 1;
                    break;
            }
        }
        System.exit(0);
    }
}
