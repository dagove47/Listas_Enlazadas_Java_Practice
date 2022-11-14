/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas_Enlazadas;

import javax.swing.*;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }

    public void operaciones(){
        lista2 lista2 = new lista2();
        int opcion = 0;

        do {
            try {
                opcion  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que desea hacer: " +
                        "\n\t1.Agregar personas a la lista\n\t2.Visualizar lista\n\t3.Volver al menu" +
                        "\nSeleccione lo que desea hacer (1-3): "));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Usted ingreso un dato diferente de " +
                        "número entero...\n" + e);
            }finally {
                switch (opcion){
                    case 1:
                        lista2.insertar(new Persona(JOptionPane.showInputDialog("Ingrese el nombre de la persona: ")
                                ,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "))));
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null,lista2);
                        break;

                    case 3:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"La opción digitada no se " +
                                "encuentra disponible..");
                        break;


                }
            }
        }while (opcion != 3);
    }
}
