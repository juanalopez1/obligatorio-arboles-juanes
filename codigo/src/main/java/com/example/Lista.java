package com.example;

public class Lista<E> implements ILista<E> {

    private INodo<E> primero;
    private int Largo;

    public Lista() {
        primero = null;
    }

    public Lista(INodo<E> unNodo) {
        this.primero = unNodo;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(Integer Largo) {
        this.Largo = Largo;
    }

    public boolean esVacia() {
        return primero == null;
    }

    public INodo<E> getPrimero() {
        return primero;
    }

    @Override
    public void insertar(INodo<E> nodo) {
        if (esVacia()) {
            this.primero = nodo;
            Largo++;
        } else {
            INodo<E> aux = getPrimero();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            Largo++;
            aux.setSiguiente(nodo);

        }
    }

    @Override
    public INodo buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            INodo<E> aux = getPrimero();
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();

            }
        }
        return null;
    }

    @Override
    public void insertarOrdenado(INodo<E> nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public String imprimirLista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirLista'");
    }

}
