import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Substituindo o '??' por 'nextInt()'
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Substituindo o '??' por 'nextInt()'
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) { // Substituindo o '?' por 'ParametrosInvalidosException'
            // Imprimindo a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Erro: " + exception.getMessage());
        }
        
        terminal.close(); // Fechando o scanner para evitar vazamento de recursos
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR ou IGUAL a parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        // Realizar o for para imprimir os números com base na diferença (contagem)
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe de exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Passando a mensagem para a superclasse Exception
    }
}
