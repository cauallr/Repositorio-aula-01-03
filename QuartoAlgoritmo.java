import java.util.Scanner;

public class QuartoAlgoritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário: comprimento da corda, massa do objeto e ângulo inicial
        System.out.println("Digite o comprimento da corda (em metros):");
        double comprimentoCorda = scanner.nextDouble();

        System.out.println("Digite a massa do objeto (em quilogramas):");
        double massaObjeto = scanner.nextDouble();

        System.out.println("Digite o ângulo inicial (em graus):");
        double anguloInicial = scanner.nextDouble();

        // Conversão do ângulo inicial de graus para radianos
        double anguloRadianos = Math.toRadians(anguloInicial);

        // Constantes
        final double gravidade = 9.81; // Aceleração devido à gravidade (m/s^2)

        // Tempo total de simulação
        System.out.println("Digite o tempo total de simulação (em segundos):");
        double tempoTotal = scanner.nextDouble();

        // Intervalo de tempo para cálculo da posição angular (a cada 0.1 segundos)
        double intervaloTempo = 0.1;

        // Condições iniciais
        double velocidadeAngular = 0; // Velocidade angular inicial
        double posicaoAngular = anguloRadianos; // Posição angular inicial

        // Cálculo da posição angular ao longo do tempo usando a equação do pêndulo simples
        double tempoAtual = 0;
        while (tempoAtual <= tempoTotal) {
            // Aceleração angular (segunda derivada da posição angular)
            double aceleracaoAngular = (-gravidade / comprimentoCorda) * Math.sin(posicaoAngular);

            // Atualização da velocidade angular usando o método de Euler
            velocidadeAngular += aceleracaoAngular * intervaloTempo;

            // Atualização da posição angular usando o método de Euler
            posicaoAngular += velocidadeAngular * intervaloTempo;

            // Saída da posição angular
            System.out.println("Tempo: " + tempoAtual + "s - Posição angular: " + Math.toDegrees(posicaoAngular) + " graus");

            // Atualiza o tempo para o próximo intervalo de tempo
            tempoAtual += intervaloTempo;
        }

        scanner.close();
    }
}
