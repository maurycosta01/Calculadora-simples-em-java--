import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            // entrada do usuario
            System.out.print("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.print("Digite a operação(+, -, *, /):");
            char operador = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            int num3 = scanner.nextInt();
            int num4 = scanner.nextInt();

            //chamada do metodo calcular
            double resultado = calcular(num1, num2, operador);

            // exibe o resultado
            System.out.println("Resultado:" + resultado);

            // pergunta se quer continuar
            System.out.print("Deseja realizar outra operação? (s/n)");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');
        System.out.println("Calculadora encerrada.");
        scanner.close();
    }
    // metodo para calcular
    public static double calcular(double num1, double num2, char operador) {
        switch (operador){
            case '+':
            return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case'/':
                if (num2 != 0){
                    return num1 / num2;
                }else{
                    System.out.println("Erro: Divisão por zero não e permitido");
                    return 0;
                }
            default:
                System.out.println("Operação invalida.");
                return 0;
        }
    }
}


// 1 - usamos a classe Scanner para capturar o que o usuario escreve
// 2 - vamos criar um metodo calcular que recebes os numeros digitados
// 3 - vamos utilizar switch-case para definir a operação matematica
// 4 - vamos incluir tratamento de erros para evitar divisao por zero
// 5 - vamos fazer o programa andar em loop ate o usuario sair usando o metodo while.