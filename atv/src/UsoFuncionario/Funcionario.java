package UsoFuncionario;

public class Funcionario implements Comparable<Funcionario> {

    private String matricula;
    private String nome;
    private String cargo;
    private double salario;
    private int contratacao;

    public Funcionario(String matricula, String nome, String cargo, double salario, int contratacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.contratacao = contratacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getContratacao() {
        return contratacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setContratacao(int contratacao) {
        this.contratacao = contratacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", contratacao=" + contratacao + '}';
    }

    public int compareTo(Funcionario funcionario) {
        int resultado;
        resultado = this.matricula.compareTo(funcionario.matricula);
        return resultado;
    }
}
