/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas_Enlazadas;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Carro {
    private Nodo2 cabeza;
    private Nodo2 ultimo;
    
    public void inserta(Persona p){
        if(cabeza==null){
            cabeza = new Nodo2(p);
            ultimo = cabeza;
        }else if(p.getEdad()<18){
            Nodo2 aux = new Nodo2(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(p.getEdad()>=18){
            ultimo.setNext(new Nodo2(p));
            ultimo = ultimo.getNext();
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo); 
    }
    
    @Override
    public String toString(){
        Nodo2 aux = cabeza;
        String s="Lista: ";
        if (aux != null){
            s+=aux+", ";
            aux=aux.getNext();
            while(aux != cabeza){
                s+=aux+", ";
                aux=aux.getNext();
            }
        } else{
            s+="vacia";
        }
        return s;
    }
}
