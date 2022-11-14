package Listas_Enlazadas;

/**
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Nodo {
    Nodo next;
    Word letra;

    public Nodo(Word letra) {
        this.letra = letra;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Word getLetra() {
        return letra;
    }

    public void setLetra(Word letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return letra.toString();
    }
}
