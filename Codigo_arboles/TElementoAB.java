public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    public TElementoAB<T> getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return hijoDer;
    }

    /**
     * @param unElemento
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().insertar(unElemento);
            } else {
                hijoIzq = unElemento;
                return true;
            }
        } else if (unElemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer != null) {
                return getHijoDer().insertar(unElemento);
            } else {
                hijoDer = unElemento;
                return true;
            }
        } else {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {

        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().buscar(unaEtiqueta);
            } else {
                return null;
            }
        } else if (hijoDer != null) {
            return getHijoDer().buscar(unaEtiqueta);
        } else {
            return null;
        }
    }

    /**
     * @return recorrida en inorden del subArbol que cuelga del elemento actual
     */
    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void inOrden(Lista<T> unaLista) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.

    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * @return
     */
    public String imprimir() {
        return (etiqueta.toString());
    }

    @Override
    public T getDatos() {
        return datos;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;

    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public int obtenerAltura() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public int obtenerTamanio() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public int obtenerNivel(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public int obtenerCantidadHojas() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    /*
     * @Override
     * public TElementoAB eliminar(Comparable unaEtiqueta) {
     * TElementoAB response = this;
     * if (unaEtiqueta.compareTo(etiqueta) < 0) {
     * this.left = this.left.eliminar(unaEtiqueta);
     * } else if (unaEtiqueta.compareTo(etiqueta) > 0) {
     * this.hijoDer = this.hijoDer.eliminar(unaEtiqueta);
     * } else {
     * if (this.hijoIzq != null && this.hijoDer != null) {
     * TElementoAB temp = this;
     * TElementoAB maxOfTheLeft = this.hijoIzq.findPredecessor();
     * this.value = maxOfTheLeft.getValue();
     * temp.hijoIzq = temp.hijoIzq.eliminar(maxOfTheLeft.getValue());
     * } else if (this.hijoIzq != null) {
     * response = this.hijoIzq;
     * } else if (this.hijoDer != null) {
     * response = this.hijoDer;
     * } else {
     * response = null;
     * }
     * }
     * return response;
     * }
     */

    public TElementoAB encontrarMayor() {
        if (this.hijoDer == null) {
            return this;
        } else {
            return this.hijoDer.encontrarMayor();
        }
    }

    public TElementoAB encontrarMenor() {
        if (this.hijoIzq == null) {
            return this;
        } else {
            return this.hijoIzq.encontrarMenor();
        }
    }

    public TElementoAB getParent(TElementoAB hijoAbuscar) {
        if (hijoAbuscar.getEtiqueta().compareTo(this.getEtiqueta()) < 0) {
            if (hijoAbuscar.getEtiqueta().equals(hijoIzq.getEtiqueta())) {
                return this;
            } else {
                return (hijoIzq.getParent(hijoAbuscar));
            }
        }
        if (hijoAbuscar.getEtiqueta().compareTo(this.getEtiqueta()) > 0) {
            if (hijoAbuscar.equals(hijoDer)) {
                return this;
            } else {
                return (hijoDer.getParent(hijoAbuscar));
            }
        } else {
            return null;
        }

    }

    public boolean isItBST() {
        if (hijoIzq == null && hijoDer == null) {
            return true;
        }
        if (hijoIzq != null) {
            if (hijoIzq.getEtiqueta().compareTo(this.getEtiqueta()) > 0) {
                return false;
            } else {
                if (!hijoIzq.isItBST()) {
                    return false;
                }
            }
        }
        if (hijoDer != null) {
            if (hijoDer.getEtiqueta().compareTo(this.getEtiqueta()) < 0) {
                return false;
            } else {
                if (!hijoDer.isItBST()) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
     * public Nodo delete(Integer value) {
     * Nodo response = this;
     * if (value < this.value) {
     * this.hijoIzq = this.hijoIzq.delete(value);
     * } else if (value > this.value) {
     * this.hijoDer = this.hijoDer.delete(value);
     * } else {
     * if (this.hijoIzq != null && this.hijoDer != null) {
     * Nodo temp = this;
     * Node maxOfTheLeft = this.left.findPredecessor();
     * this.value = maxOfTheLeft.getValue();
     * temp.hijoIzq = temp.hijoIzq.delete(maxOfTheLeft.getValue());
     * } else if (this.hijoIzq != null) {
     * response = this.hijoIzq;
     * } else if (this.hijoDer != null) {
     * response = this.hijoDer;
     * } else {
     * response = null;
     * }
     * }
     * return response;
     * }
     */

    private TElementoAB quitaElNodo() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
