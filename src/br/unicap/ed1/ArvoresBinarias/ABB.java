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
            raiz.insertNode(valor);
        }
    }

    public void emOrdem() {
        if (this.isEmpty()) {
            System.err.println("Árvore vazia!");
        } else {
            percorrerEmOrdem(raiz);
        }
    }

    private void percorrerEmOrdem(ABBNode<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getEsq());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getDir());
        }
    }

    public void preOrdem() {
        if (this.isEmpty()) {
            System.err.println("Árvore vazia!");
        } else {
            percorrerPreOrdem(raiz);
        }
    }

    private void percorrerPreOrdem(ABBNode<T> r) {
        if (r != null) {
            System.out.println(r.getInfo());
            percorrerPreOrdem(r.getEsq());
            percorrerPreOrdem(r.getDir());
        }
    }

    public void posOrdem() {
        if (this.isEmpty()) {
            System.err.println("Árvore vazia!");
        } else {
            percorrerPosOrdem(raiz);
        }
    }

    private void percorrerPosOrdem(ABBNode<T> r) {
        if (r != null) {
            percorrerPosOrdem(r.getEsq());
            percorrerPosOrdem(r.getDir());
            System.out.println(r.getInfo());
        }
    }
}
