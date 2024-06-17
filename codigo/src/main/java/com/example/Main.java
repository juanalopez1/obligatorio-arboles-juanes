package com.example;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolBB<Integer> arbol = new TArbolBB<>();
        TElementoAB<Integer> raiz = new TElementoAB<>(5, 5);
        TElementoAB<Integer> tres = new TElementoAB<>(3, 3);
        TElementoAB<Integer> diez = new TElementoAB<>(10, 10);
        TElementoAB<Integer> uno = new TElementoAB<>(1, 1);
        TElementoAB<Integer> catorce = new TElementoAB<>(14, 14);
        TElementoAB<Integer> seis = new TElementoAB<>(6, 6);
        TElementoAB<Integer> nueve = new TElementoAB<>(9, 9);
        raiz.setHijoDer(diez);
        raiz.setHijoIzq(tres);
        tres.setHijoIzq(uno);
        tres.setHijoDer(seis);
        diez.setHijoDer(catorce);
        diez.setHijoIzq(nueve);
        IElementoAB padre = raiz.getParent(uno);
        System.out.println(padre.getEtiqueta().toString());
        boolean result = raiz.isItBST();
        System.out.println("Es de busqueda? " + result);
        raiz.levelAndLeaf(0);
        System.out.println("Cantidad de nodos en un nivel = " + raiz.nodesPerLevel(2, 0));

        // cargar los productos desde el archivo "altas.txt"

    }
}
