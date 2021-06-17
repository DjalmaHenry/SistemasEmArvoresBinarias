// Classe  ABBNode
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

    void insertNode(T valor) {
        if (valor.compareTo(this.getInfo()) == 0) {
            System.err.println("Valor repetido!");
        } else if (valor.compareTo(this.getInfo()) < 0) {
            if (this.esq == null) {
                this.esq = new ABBNode(valor);
            } else {
                this.esq.insertNode(valor);
            }
        } else {
            if (this.dir == null) {
                this.dir = new ABBNode(valor);
            } else {
                this.dir.insertNode(valor);
            }
        }
    }
}
