public class FuncionarioTecnico extends Funcionario {
    private String especialidade;
    private Double BONUS = 1000.0;

    public FuncionarioTecnico(String nome, double salario, String especialidade) {
        super(nome, "Técnico", salario);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: Técnico");
        System.out.println("Salário: " + getSalario());
        System.out.println("Especialidade: " + getEspecialidade());
    }
}
       
