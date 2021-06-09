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

    public ABBNode<T> menorValor() {
        ABBNode<T> r;
        if (this.isEmpty()) {
            System.err.println("Árvore vazia!");
            return null;
        } else {
            r = buscaMenorValor(raiz);
            System.out.println(r.getInfo());
            return r;
        }
    }

    private ABBNode<T> buscaMenorValor(ABBNode<T> r) {
        if (r.getEsq() != null) {
            r = buscaMenorValor(r.getEsq());
        }
        return r;
    }

    public ABBNode<T> maiorValor() {
        ABBNode<T> r;
        if (this.isEmpty()) {
            System.err.println("Árvore vazia!");
            return null;
        } else {
            r = buscaMaiorValor(raiz);
            System.out.println(r.getInfo());
            return r;
        }
    }

    private ABBNode<T> buscaMaiorValor(ABBNode<T> r) {
        if (r.getDir() != null) {
            r = buscaMaiorValor(r.getDir());
        }
        return r;
    }

    public void insertSemRecursao(T valor) {
        if (this.isEmpty()) {
            raiz = new ABBNode(valor);
        } else {
            ABBNode<T> aux = raiz;
            while (aux != null) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.err.println("Valor repetido!");
                    return;
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    if (aux.getEsq() == null) {
                        ABBNode<T> novo = new ABBNode(valor);
                        aux.setEsq(novo);
                        return;
                    } else {
                        aux = aux.getEsq();
                    }
                } else {
                    if (aux.getDir() == null) {
                        ABBNode<T> novo = new ABBNode(valor);
                        aux.setDir(novo);
                        return;
                    } else {
                        aux = aux.getDir();
                    }
                }
            }
        }
    }
    
    public int contaNo() {
        int cont;
        ABBNode<T> r = raiz;
        if (this.isEmpty()) {
            return 0;
        } else {
            if (r != null) {
            percorrerEmOrdem(r.getEsq());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getDir());
        }
        }
    }
}
