package Listas_Enlazadas;

public class lista2 {
    private Nodo2 cabeza;
    private Nodo2 ultimo;

    public void insertar(Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo2(p);
            ultimo = cabeza;
        } else if (p.getEdad() < 18) {
            Nodo2 aux = new Nodo2(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (ultimo.getDato().getEdad() <= p.getEdad()) {
            ultimo.setNext(new Nodo2(p));
            ultimo = ultimo.getNext();
        } else {
            Nodo2 aux = cabeza;
            while (aux.getNext().getDato().getEdad() < p.getEdad()) {
                aux = aux.getNext();
            }
            Nodo2 temp = new Nodo2(p);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp); //nuevo
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);
    }

    @Override
    public String toString() {
        Nodo2 aux = cabeza;
        String s = "Lista: \n";
        if (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + "\n" ;
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }
}
