package Listas_Enlazadas;

import javax.swing.*;

public class Lista {
    private Nodo cabeza;

    public void add(Word p){

        if (cabeza == null){
            cabeza = new Nodo(p);
        } else {
            Nodo aux = cabeza;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }

            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    public void getLetter(int index){
        if (index == 0){
            JOptionPane.showMessageDialog(null,"En el espacio anterior no existe nada.\n"+
                    "Posición Solicitada: " +cabeza + "\n" + "Posición de Adelante:" +cabeza.getNext().getLetra());
        } else{
            int contador = 0;
            Nodo temp = cabeza;
            while (contador < index -1){
                temp = temp.getNext();
                contador ++;
            }
            if (temp.getNext().getNext() == null){
                JOptionPane.showMessageDialog(null,"Posición anterior: "
                        + temp.getLetra() + "\nPosicion Solicitada :" + temp.getNext().getLetra()
                        + "\nEn la posición de adelante no existe nada..");
            } else {
                JOptionPane.showMessageDialog(null,"Posición anterior: "
                        + temp.getLetra() + "\nPosicion Solicitada :" + temp.getNext().getLetra()
                        + "\nPosición de adelante: "+ temp.getNext().getNext().getLetra());
            }

        }
    }
    @Override
    public String toString(){
        Nodo aux = cabeza;
        String s="";
        while(aux!=null){
            s+=  aux+", \n";
            aux=aux.getNext();
        }
        return s;

    }
}
