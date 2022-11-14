package Listas_Enlazadas;

import javax.swing.*;

/**
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Word {
    private char letra;
    int id;

    public Word(char letra, int id) {
        this.letra = letra;
        this.id = id;
    }

    public Word() {
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Word{" + "letra=" + letra + ", id=" + id + '}';
    }

    public void operaciones() {
        Lista lista = new Lista();

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra: ");
        int id = 0;
        char[] array = palabra.toCharArray();

        for (int x = 0; x < array.length; x++) { //B u e n a s
            lista.add(new Word(array[x], id++));
        }
        try {
            lista.getLetter(Integer.parseInt(JOptionPane.showInputDialog("Lista Actual:\n" + lista +
                    "\n\nQue indice desea buscar?")));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Se ingreso un dato diferente " +
                    "de un número entero.\n" + e);
        }

    }
}

