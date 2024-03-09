// Infelizmente a questão 4 eu não consegui, ela esta dando erro, tentei sozinho e  também com ajuda de IA, porém senti muita dificuldade de entender 


// aqui está meu código:

import java.util.Scanner;

public class QuartoAlgoritmo {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      
      System.out.println("qual o comprimento da corda?");
      double comprimento = leitor.nextDouble();
      
      System.out.println("qual a masse do objeto em quilogramas?");
      double massa = leitor.nextDouble();
      
      System.out.println("qual o angulo que o objeto foi solto em graus?");
      double angulo = leitor.nextDouble();
      
      System.out.println("qual o intervalo de tempo que voce deseja saber a posição do pendulo?");
      double intervaloTempo = leitor.nextDouble();
      
      double gravidade = 9.81;
      
      //considero velocidade angular igual a 0 pois o movimento é iniciado com 0 de velocidade e ganha acelaração da gravidade
      double velocidadeInicial = 0;
      //para facilitar o calculo transformamos em radianos
      double anguloRadianos = Math.toRadians(angulo);
      double posicaoAngular = anguloRadianos;
      
      double tempoPassado = 0;
      double velocidadeAngular = 0;
   // Aceleração angular, força resultante que age sobre o objeto pendurado e à massa desse objeto
      double aceleracaoAngular = (-gravidade/comprimento) * Math.sin(posicaoAngular);
      
      while (aceleracaoAngular > 1) {
    	  aceleracaoAngular = (-gravidade/comprimento) * Math.sin(posicaoAngular);
    	// A velocidade angular é atualizada de acordo com a aceleração angular
          velocidadeAngular += aceleracaoAngular * intervaloTempo;
       // Atualização da posição angular usando o método de Euler
          posicaoAngular += velocidadeAngular * intervaloTempo;

          // Saída da posição angular (em graus)
          System.out.println("Tempo: " + tempoPassado + "s - Posição angular: " + Math.toDegrees(posicaoAngular) + " graus");

          // Atualiza o tempo
          tempoPassado += intervaloTempo;
      
    	  
      }
      
    }
}
