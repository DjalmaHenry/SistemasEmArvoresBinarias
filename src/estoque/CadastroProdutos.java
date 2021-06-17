// Classe CadastroProdutos
package estoque;

import br.unicap.ed1.ArvoresBinarias.ABB;
import java.util.Scanner;

public class CadastroProdutos {

    private ABB<Produto> arv;

    public CadastroProdutos() {
        arv = new ABB();
    }

    public void cadastraProduto() {
        Scanner in = new Scanner(System.in);
        String codigo, descricao, fornecedor;
        double preco;
        int estoque;
        System.out.print("Informe o código: ");
        codigo = in.next();
        System.out.print("Informe o descrição: ");
        descricao = in.next();
        System.out.print("Informe o fornecedor: ");
        fornecedor = in.next();
        System.out.print("Informe o preço: ");
        preco = in.nextDouble();
        System.out.print("Informe a quantidade em estoque: ");
        estoque = in.nextInt();
        Produto p = new Produto(codigo, descricao, fornecedor, preco, estoque);
        arv.insert(p);
    }

    public void exibeProdutos() {
        if (arv.isEmpty()) {
            System.err.println("Lista de produtos Vazia!");
        } else {
            arv.emOrdem();
        }
    }

    private Produto buscaProduto(String codigo) {
        Produto p = new Produto(codigo);
        p = arv.buscaNo(p);
        return p;
    }

    public void alteraPreco(String codigo) {
        Produto p = buscaProduto(codigo);
        if (p == null) {
            System.err.println("Erro, código invalido!");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Informe o novo preço: ");
            double preco = in.nextDouble();
            p.setPreco(preco);
            System.out.println("Preço atualizado com sucesso!");
        }
    }

    public void alteraEstoque(String codigo) {
        Produto p = buscaProduto(codigo);
        if (p == null) {
            System.err.println("Erro, código invalido!");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Informe a nova quantidade em estoque: ");
            int estoque = in.nextInt();
            p.setEstoque(estoque);
            System.out.println("Estoque atualizado com sucesso!");
        }
    }

    public void exibeProduto(String codigo) {
        Produto p = buscaProduto(codigo);
        if (p == null) {
            System.err.println("Erro, código invalido!");
        } else {
            System.out.println(p);
        }
    }

    public void removeProduto(String codigo) {
        Produto p = buscaProduto(codigo);
        if (p == null) {
            System.err.println("Erro, código invalido!");
        } else {
            arv.remove(p);
            System.out.println("Produto removido com sucesso!");
        }
    }
}
