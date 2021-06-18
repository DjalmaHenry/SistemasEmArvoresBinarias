package UsoFuncionario;

import java.util.Scanner;

public class UsoFuncionario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho do cadastro: ");
        int tam = in.nextInt();
        CadastroDeFuncionarios cadastro = new CadastroDeFuncionarios(tam);
        String matricula;
        double porcentagem;
        int opcao;
        do {
            menu();
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    cadastro.cadastra();
                    break;
                case 2:
                    cadastro.exibe();
                    break;
                case 3:
                    System.out.print("Informe a matrícula: ");
                    matricula = in.next();
                    cadastro.exibeFuncionario(matricula);
                    break;
                case 4:
                    System.out.print("Informe a matrícula: ");
                    matricula = in.next();
                    System.out.print("Informe a porcentagem de aumento: ");
                    porcentagem = in.nextDouble();
                    cadastro.aumentaSalario(matricula, porcentagem);
                    break;
                case 5:
                    System.out.print("Informe a matrícula: ");
                    matricula = in.next();
                    cadastro.remove(matricula);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Erro, opção invalida!");
                    break;
            }
        } while (opcao != 0);
    }

    public static void menu() {
        System.out.println("Menu Principal");
        System.out.println("1 - Cadastrar novo funcionário");
        System.out.println("2 - Exibir funcionários cadastrados");
        System.out.println("3 - Exibir dados de um funcionário");
        System.out.println("4 - Dar aumento de salário a um funcionário");
        System.out.println("5 - Demitir um funcionário");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }

}
