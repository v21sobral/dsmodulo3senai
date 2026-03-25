

public class FuncionarioGerente extends Funcionario {
    private String departamento;
    private static final Double BONUS = 2000.0;

    public FuncionarioGerente(String nome, double salario, String departamento) {
        super(nome, "Gerente", salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: Gerente");
        System.out.println("Salário: " + getSalario());
        System.out.println("Departamento: " + getDepartamento());
    }
    
}
