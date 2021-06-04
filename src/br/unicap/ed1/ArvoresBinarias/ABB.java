package br.unicap.ed1.ArvoresBinarias;

public class ABB<T extends Comparable<T>> {

    private ABBNode<T> raiz;

    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T valor) {
        if (this.isEmpty()) {
            raiz = new ABBNode(valor);
        } else {

        }
    }
}
