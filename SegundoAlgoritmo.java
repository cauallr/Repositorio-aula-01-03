import java.util.Scanner;

public class SegundoAlgoritmo{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Entrada de velocidade inicial e ângulo de lançamento
        System.out.println("Digite a velocidade inicial (m/s):");
        double velocidadeInicial = leitor.nextDouble();

        System.out.println("Digite o ângulo de lançamento (graus):");
        double anguloLancamento = leitor.nextDouble();
        
        System.out.println("Digite o intervalo de tempo que deseje saber o trajeto");
        double intervaloTempo = leitor.nextDouble();
        
        
        // Convertendo o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloLancamento);

        
        final double gravidade = 9.81; 

        //  para calcular os lançamentos, dividimos o movimento em eixo x e eixo y,
        //  Cálculo das componentes horizontal e vertical da velocidade inicial
        double velocidadeInicialX = velocidadeInicial * Math.cos(anguloRadianos);
        double velocidadeInicialY = velocidadeInicial * Math.sin(anguloRadianos);

        // para calcular o tempo de voo desse projetil, é necessario saber a sua velocidade vertical e dividi-lo pela gravidade
        double tempoVoo = (2 * velocidadeInicialY) / gravidade;

        

    
        double tempoAtual = 0;
        while (tempoAtual <= tempoVoo) {
            // no eixo x, multiplicamos o tempo pela velocidade horizontal para saber a distancia
            double posicaoX = velocidadeInicialX * tempoAtual;

            // no eixo y, multiplocamos a velocidade vertical pelo tempo para sabermos a altura, porem, para calcular com precisao a altura
            // temos que levar em consideração a infleuncia da gravidade, que pode ser definida pela formula voy*t - 1/2 gt^2
            double posicaoY = (velocidadeInicialY * tempoAtual) - (0.5 * gravidade * tempoAtual * tempoAtual);

           
            System.out.println("Tempo: " + tempoAtual + "s - Posição em X: (" + posicaoX + "m, posição em Y" + posicaoY + "m)");

            tempoAtual += intervaloTempo;
        }

      
    }
}
