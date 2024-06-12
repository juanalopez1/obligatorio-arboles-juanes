
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    TArbolBB<Integer> arbol = new TArbolBB<>();
    TElementoAB<Integer> raiz = new TElementoAB<>(1, 1);
    TElementoAB<Integer> nodo2 = new TElementoAB<>(2, 2);
    TElementoAB<Integer> nodo3 = new TElementoAB<>(3, 3);
    TElementoAB<Integer> nodo4 = new TElementoAB<>(4, 4);
    TElementoAB<Integer> nodo5 = new TElementoAB<>(5, 5);
    raiz.setHijoDer(nodo3);
    raiz.setHijoIzq(nodo2);
    nodo3.setHijoIzq(nodo4);
    nodo3.setHijoDer(nodo5);
    arbol.insertar((raiz));
    arbol.insertar((nodo2));
    arbol.insertar((nodo3));
    arbol.insertar((nodo4));
    arbol.insertar((nodo5));
    IElementoAB padre = raiz.getParent(nodo4);
    System.out.println(padre.getEtiqueta().toString());

    // cargar los productos desde el archivo "altas.txt"

  }
}
