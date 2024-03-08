import java.util.Scanner;

public class QuintoAlgoritmo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       
        System.out.println("Digite o raio da trajetória circular (em metros):");
        double raio = leitor.nextDouble();

        
        // sabemos que velocidade alguma é w= vt/r
        System.out.println("Digite a velocidade angular (em radianos por segundo):");
        double velocidadeAngular = leitor.nextDouble();

        // entao para calcular a velocidade tangencial, podemos realocar a equação, fazendo com que fique: vt=w*r
        double velocidadeTangencial = velocidadeAngular * raio;

        // o calculo da acelaração centripita é da seguinte forma: a=w^2 *r
        double aceleracaoCentripeta = Math.pow(velocidadeAngular, 2) * raio;

       // Realizando os prints
        System.out.println("\nVelocidade angular: " + velocidadeAngular + " rad/s");
        System.out.println("Velocidade tangencial: " + velocidadeTangencial + " m/s");
        System.out.println("Aceleração centrípeta: " + aceleracaoCentripeta + " m/s²");

      
    }
}
