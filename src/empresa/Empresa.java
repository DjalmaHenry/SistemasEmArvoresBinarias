// Classe Empresa
package empresa;

import estoque.CadastroProdutos;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroProdutos cadastro = new CadastroProdutos();
        String codigo;
        char resp;
        do {
            menu();
            resp = in.next().charAt(0);
            switch (resp) {
                case '1':
                    cadastro.cadastraProduto();
                    break;
                case '2':
                    cadastro.exibeProdutos();
                    break;
                case '3':
                    System.out.print("Informe o código: ");
                    codigo = in.next();
                    cadastro.alteraPreco(codigo);
                    break;
                case '4':
                    System.out.print("Informe o código: ");
                    codigo = in.next();
                    cadastro.alteraEstoque(codigo);
                    break;
                case '5':
                    System.out.print("Informe o código: ");
                    codigo = in.next();
                    cadastro.exibeProduto(codigo);
                    break;
                case '6':
                    System.out.print("Informe o código: ");
                    codigo = in.next();
                    cadastro.removeProduto(codigo);
                    break;
                case '0':
                    System.out.println("Programa feito por Djalma Henrique.");
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.err.println("Opção inválida");
                    break;
            }
        } while (resp != '0');
    }

    public static void menu() {
        System.out.println("MENU: ");
        System.out.println("1 - Cadastrar produto \n2 - Exibir informações produtos"
                + "\n3 - Alterar preço de um produto \n"
                + "4 - Alterar a quantidade de um produto \n5 - Exibir "
                + "informações de um produto \n6 - Remover produto\n0 - Encerrar");
        System.out.println("Informe a opção desejada:");
        System.out.print("-> ");
    }
}
