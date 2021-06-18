package UsoFuncionario;

import java.util.Scanner;

public class CadastroDeFuncionarios {

    private Funcionario[] funcionarios;
    private int qtd;

    public CadastroDeFuncionarios(int tam) {
        funcionarios = new Funcionario[tam];
    }

    public void cadastra() {
        Scanner in = new Scanner(System.in);
        String matricula, nome, cargo;
        double salario;
        int contratacao, resultado;
        if (funcionarios.length == qtd) {
            System.out.println("Erro, cadastro cheio!");
        } else {
            System.out.print("Informe a matrícula: ");
            matricula = in.next();
            Funcionario f = new Funcionario(matricula, "", "", 0, 0);
            resultado = busca(f);
            if (resultado != -1) {
                System.out.println("Erro, matricula já existe!");
            } else {
                System.out.print("Informe o nome: ");
                nome = in.next();
                System.out.print("Informe o cargo: ");
                cargo = in.next();
                System.out.print("Informe o salário: ");
                salario = in.nextDouble();
                System.out.print("Informe o ano de contratação: ");
                contratacao = in.nextInt();
                Funcionario fun = new Funcionario(matricula, nome, cargo, salario, contratacao);
                funcionarios[qtd] = fun;
                qtd++;
                System.out.println("Cadastro realizado com sucesso!");
            }
        }
    }

    public void exibe() {
        if (qtd == 0) {
            System.out.println("Cadastro vazio!");
        } else {
            for (int i = 0; i < qtd; i++) {
                System.out.println(funcionarios[i]);
            }
        }
    }

    private int busca(Funcionario funcionario) {
        if (qtd == 0) {
            return -1;
        } else {
            for (int i = 0; i < qtd; i++) {
                if (funcionarios[i].compareTo(funcionario) == 0) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void aumentaSalario(String matricula, double percentual) {
        Funcionario f = new Funcionario(matricula, "", "", 0, 0);
        int resultado = busca(f);
        if (resultado == -1) {
            System.out.println("Erro, matrícula inexistente!");
        } else {
            double atual = funcionarios[resultado].getSalario();
            double aumento = atual * percentual;
            aumento = aumento / 100;
            atual = atual + aumento;
            funcionarios[resultado].setSalario(atual);
            System.out.println("Aumento de salário aplicado com sucesso!");
        }
    }

    public void exibeFuncionario(String matricula) {
        Funcionario f = new Funcionario(matricula, "", "", 0, 0);
        int resultado = busca(f);
        if (resultado == -1) {
            System.out.println("Erro, matrícula inexistente!");
        } else {
            System.out.println(funcionarios[resultado]);
        }
    }

    public void remove(String matricula) {
        Funcionario f = new Funcionario(matricula, "", "", 0, 0);
        int resultado = busca(f);
        if (resultado == -1) {
            System.out.println("Erro, matrícula inexistente!");
        } else {
            if (resultado == qtd - 1) {
                funcionarios[resultado] = null;
            } else {
                for (int i = resultado; i < qtd; i++) {
                    funcionarios[i] = funcionarios[i + 1];
                }
            }
            qtd--;
            System.out.println("Funcionário demitido com sucesso!");
        }
    }
}
