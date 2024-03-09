
import java.util.Scanner;

public class PrimeiroAlgoritmo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double gravidade = 9.81;
        double tempo = 0;
        double velocidadeInicial = 0;
       
        System.out.print("Qual a altura inicial do objeto? (em metros): ");
        double alturaInicial = leitor.nextDouble();
        System.out.println("informe o intervalo de tempo que você quer saber o estado do objeto");
        double intervaloTempo = leitor.nextDouble();
        double velocidade = 0;
        // Começar a simulação
        System.out.println("Tempo (s)\tAltura (m)\tVelocidade (m/s)	");
        while (alturaInicial > 0) {
            // Calcular a nova altura do objeto de acordo com a formula em queda livre, que é h=h0 + v0t - 1/2gt^2, como v0 (velocidade iniclal é 0, entao cortamos ele da formula)
            double altura = alturaInicial - (0.5 * gravidade * Math.pow(tempo, 2));

         // aqui vai aumentando a velocidade de queda, fazendo com que gravidade vezes o tempo menos a atual velocidade inicial
            velocidade = (gravidade * tempo) + velocidadeInicial ;

         
            alturaInicial = altura;
            // aqui faço uma validação se a altura ficou negativa, caso sim, ela se torna 0, pois nao é possivel a existencia de uma altura negativa
            if ( alturaInicial < 0) {
            	alturaInicial = 0;
            	altura = 0;
            }
            
            //atualizo o tempo
            tempo += intervaloTempo;
            
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", tempo, altura, velocidade);


            }
        
    	System.out.println(" o objeto caiu no chão com uma velocidade de: " + velocidade + " em " + tempo + "segundos");

      
    }
}
