package br.unicap.ed1.ArvoresBinarias;

class ABBNode<T extends Comparable<T>> {

    private T info;
    private ABBNode<T> esq;
    private ABBNode<T> dir;

    ABBNode(T valor) {
        info = valor;
    }

    void setInfo(T valor) {
        info = valor;
    }

    T getInfo() {
        return info;
    }

    void setEsq(ABBNode<T> novaEsq) {
        esq = novaEsq;
    }

    ABBNode<T> getEsq() {
        return esq;
    }

    void setDir(ABBNode<T> novaDir) {
        dir = novaDir;
    }

    ABBNode<T> getDir() {
        return dir;
    }
}
