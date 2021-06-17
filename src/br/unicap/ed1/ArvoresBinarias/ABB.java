package br.unicap.ed1.ArvoresBinarias;

import br.unicap.c3.ed1.TAD.Queue;
import br.unicap.c3.ed1.TAD.Stack;

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
    
    public T menorValor() {
        ABBNode<T> r;
        if (this.isEmpty()) {
            System.err.println("Árvore vazia!");
            return null;
        } else {
            r = buscaMenorValor(raiz);
            return r.getInfo();
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
    
    public void passeioPorNivel() {
        Queue<ABBNode<T>> fila;
        ABBNode<T> aux;
        if (!this.isEmpty()) {
            fila = new Queue(1000);
            fila.enQueue(raiz);
            while (!fila.isEmpty()) {
                aux = fila.deQueue();
                if (aux.getEsq() != null) {
                    fila.enQueue(aux.getEsq());
                }
                if (aux.getDir() != null) {
                    fila.enQueue(aux.getDir());
                }
                System.out.println(aux.getInfo());
            }
        } else {
            System.err.println("Árvore vazia!");
        }
    }
    
    public int passeioContaNo() {
        Queue<ABBNode<T>> fila;
        ABBNode<T> aux;
        int cont = 0;
        if (!this.isEmpty()) {
            fila = new Queue(1000);
            fila.enQueue(raiz);
            while (!fila.isEmpty()) {
                aux = fila.deQueue();
                if (aux.getEsq() != null) {
                    fila.enQueue(aux.getEsq());
                }
                if (aux.getDir() != null) {
                    fila.enQueue(aux.getDir());
                }
                cont++;
            }
            return cont;
        } else {
            System.err.println("Árvore vazia!");
            return 0;
        }
    }
    
    public int passeioContaFolha() {
        Queue<ABBNode<T>> fila;
        ABBNode<T> aux;
        int cont = 0;
        if (!this.isEmpty()) {
            fila = new Queue(1000);
            fila.enQueue(raiz);
            while (!fila.isEmpty()) {
                aux = fila.deQueue();
                if (aux.getEsq() != null) {
                    fila.enQueue(aux.getEsq());
                }
                if (aux.getDir() != null) {
                    fila.enQueue(aux.getDir());
                }
                if (aux.getDir() == null && aux.getEsq() == null) {
                    cont++;
                }
            }
            return cont;
        } else {
            System.err.println("Árvore vazia!");
            return 0;
        }
    }
    
    public int passeioContaNaoFinais() {
        Queue<ABBNode<T>> fila;
        ABBNode<T> aux;
        int cont = 0;
        if (!this.isEmpty()) {
            fila = new Queue(1000);
            fila.enQueue(raiz);
            while (!fila.isEmpty()) {
                aux = fila.deQueue();
                if (aux.getEsq() != null) {
                    fila.enQueue(aux.getEsq());
                }
                if (aux.getDir() != null) {
                    fila.enQueue(aux.getDir());
                }
                if (aux.getDir() != null || aux.getEsq() != null) {
                    cont++;
                }
            }
            return cont;
        } else {
            System.err.println("Árvore vazia!");
            return 0;
        }
    }
    
    public T buscaNo(T valor) {
        if (this.isEmpty()) {
            return null;
        } else {
            ABBNode<T> aux = raiz;
            while (aux != null) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    return aux.getInfo();
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    aux = aux.getEsq();
                } else {
                    aux = aux.getDir();
                }
            }
            return null;
        }
    }
    
    public int passeioContaRepetidos(T valor) {
        Queue<ABBNode<T>> fila;
        ABBNode<T> aux;
        int cont = 0;
        if (!this.isEmpty()) {
            fila = new Queue(1000);
            fila.enQueue(raiz);
            while (!fila.isEmpty()) {
                aux = fila.deQueue();
                if (aux.getEsq() != null) {
                    fila.enQueue(aux.getEsq());
                }
                if (aux.getDir() != null) {
                    fila.enQueue(aux.getDir());
                }
                if (valor.compareTo(aux.getInfo()) == 0) {
                    cont++;
                }
            }
            return cont;
        } else {
            System.err.println("Árvore vazia!");
            return 0;
        }
    }
    
    public void passeioEmOrdem() {
        Stack<ABBNode> pilha = new Stack();
        ABBNode<T> aux;
        if (isEmpty()) {
            System.err.println("Árvore vazia!");
        } else {
            aux = raiz;
            while (!pilha.isEmpty() || aux != null) {
                if (aux != null) {
                    pilha.push(aux);
                    aux = aux.getEsq();
                } else {
                    aux = pilha.pop();
                    System.out.println(aux.getInfo());
                    aux = aux.getDir();
                }
            }
        }
    }
    
    public void passeioPreOrdem() {
        Stack<ABBNode> pilha = new Stack();
        ABBNode<T> aux;
        if (isEmpty()) {
            System.err.println("Árvore vazia!");
        } else {
            aux = raiz;
            while (!pilha.isEmpty() || aux != null) {
                if (aux != null) {
                    System.out.println(aux.getInfo());
                    pilha.push(aux);
                    aux = aux.getEsq();
                } else {
                    aux = pilha.pop();
                    aux = aux.getDir();
                }
            }
        }
    }
    
    public void remove(T valor) {
        if (isEmpty()) {
            System.err.println("Árvore Vazia!");
        } else {
            raiz = removeNode(raiz, valor);
        }
    }
    
    private ABBNode<T> removeNode(ABBNode<T> r, T valor) {
        if (r != null) {
            if (valor.compareTo(r.getInfo()) == 0) {
                ABBNode<T> pai, filho;
                if (r.getEsq() == null && r.getDir() == null) {
                    r = null;
                } else if (r.getEsq() == null) {
                    r = r.getDir();
                } else if (r.getDir() == null) {
                    r = r.getEsq();
                } else {
                    pai = r;
                    filho = pai.getEsq();
                    while (filho.getEsq() != null) {
                        pai = filho;
                        filho = filho.getDir();
                    }
                    pai.setDir(filho.getEsq());
                    r.setInfo(filho.getInfo());
                }
            } else if (valor.compareTo(r.getInfo()) < 0) {
                r.setEsq(removeNode(r.getEsq(), valor));
            } else {
                r.setDir(removeNode(r.getDir(), valor));
            }
        }
        return r;
    }
}
