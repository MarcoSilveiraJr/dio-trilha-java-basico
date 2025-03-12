package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args)  {
        //imprimirSelecionados();
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu= false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu ;  
            if(continuarTentando)
            tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
            
        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " TENTATIVAS");

    }


    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++) {
            System.out.println("O candidato n° " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação com for each");

        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos () {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};

        int candidatosSelecionados = 0;
        int candidatosatual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosatual < candidatos.length) {
            String candidato = candidatos[candidatosatual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosatual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } 
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } 
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

        
    }

}
