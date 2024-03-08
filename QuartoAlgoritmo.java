import java.util.Scanner;

public class QuartoAlgoritmo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // comprimento da corda, massa do objeto e ângulo inicial
        System.out.println("Digite o comprimento da corda (em metros):");
        double comprimentoCorda = leitor.nextDouble();

        System.out.println("Digite a massa do objeto (em quilogramas):");
        double massaObjeto = leitor.nextDouble();

        System.out.println("Digite o ângulo inicial (em graus):");
        double anguloInicial = leitor.nextDouble();

        // Conversão do ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloInicial);

     
        final double gravidade = 9.81; 

      
      System.out.println("digite o intervalo de tempo que deseja saber a posição do objeto");
        double intervaloTempo = leitor.nextDouble();

  
        double velocidadeAngular = 0;
        double posicaoAngular = anguloRadianos; 

      
        double tempoAtual = 0;
        while (Math.abs(velocidadeAngular) > 0.001){
            // Aceleração angular, força resultante que age sobre o objeto pendurado e à massa desse objeto
            double aceleracaoAngular = (-gravidade / comprimentoCorda) * Math.sin(posicaoAngular);

            // a velocidade angular vai calcular a atual acelaração vezes o intervalo de tempo
            velocidadeAngular += aceleracaoAngular * intervaloTempo;

            // Atualização da posição angular usando o método de Euler
            posicaoAngular += velocidadeAngular * intervaloTempo;

            // Saída da posição angular, a função de math.toDegrees transforma radianos para graus
            System.out.println("Tempo: " + tempoAtual + "s - Posição angular: " + Math.toDegrees(posicaoAngular) + " graus");

          
            tempoAtual += intervaloTempo;
        }

      
    }
}
