import java.util.Scanner;

/**
 * Programa 6: Calculadora de operações aritméticas
 * PROBLEMA: Entrar com dois números e uma operação aritmética
 * ENTRADA: OPERANDO1 (real), OPERANDO2 (real), OPERADOR (caractere)
 * SAÍDA: RESULTADO (real)
 * Operadores suportados: + - * /
 */
public class CalculadoraOperacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        double operando1 = scanner.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        double operando2 = scanner.nextDouble();
        
        // Variável para armazenar o resultado
        double resultado = 0;
        boolean operacaoValida = true;
        
        // Processamento (executa a operação correspondente)
        if (operador == '+') {
            resultado = operando1 + operando2;
        } else if (operador == '-') {
            resultado = operando1 - operando2;
        } else if (operador == '*') {
            resultado = operando1 * operando2;
        } else if (operador == '/') {
            if (operando2 != 0) {
                resultado = operando1 / operando2;
            } else {
                System.out.println("Erro: Divisão por zero!");
                operacaoValida = false;
            }
        } else {
            System.out.println("Operador inválido!");
            operacaoValida = false;
        }
        
        // Saída
        if (operacaoValida) {
            System.out.println(operando1 + " " + operador + " " + operando2 + " = " + resultado);
        }
        
        scanner.close();
    }
}
