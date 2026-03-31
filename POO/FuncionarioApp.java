import java.util.Scanner;

public class FuncionarioApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1Funcionario = new Funcionario("Maria", "Gerente", 5000.00);
        Funcionario f2Funcionario = new Funcionario("João", "Tecnico", 3000.00);
        
        System.out.println("Nome: " + f1Funcionario.getNome());
            System.out.println("Salário: " + f1Funcionario.getSalario());

        System.out.println("Nome: " + f2Funcionario.getNome());
            System.out.println("Salário: " + f2Funcionario.getSalario());


        sc.close();
        }


}
