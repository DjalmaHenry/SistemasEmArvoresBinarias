// Classe Produto
package estoque;

public class Produto implements Comparable<Produto> {

    private String codigo;
    private String descricao;
    private String fornecedor;
    private double preco;
    private int estoque;

    public Produto(String codigo, String descricao, String fornecedor, double preco, int estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String toString() {
        return "Código: " + this.getCodigo() + " Fornecedor: " + this.getFornecedor()
                + " Preço: " + this.getPreco() + " Estoque: " + this.getEstoque();
    }

    public int compareTo(Produto produto) {
        int result;
        result = this.codigo.compareTo(produto.codigo);
        return result;
    }
}
