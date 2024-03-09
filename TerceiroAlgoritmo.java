
// essa tambem senti dificuldade, pedi ajuda a inteligencia artificial porem pesquisei e procurei entender  o conceito de todo o processo atraves de pesquisas
// e videos aulas no youtube sobre colisao bidimensional
import java.util.Scanner;

public class TerceiroAlgoritmo {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);

        //massas e velocidades iniciais das partículas
        System.out.println("Digite a massa da primeira partícula (em kg):");
        double massaParticula1 = leitor.nextDouble();

        System.out.println("Digite a velocidade inicial da primeira partícula (em m/s) - componente x:");
        double velocidadeInicialX1 = leitor.nextDouble();
        System.out.println("Digite a velocidade inicial da primeira partícula (em m/s) - componente y:");
        double velocidadeInicialY1 = leitor.nextDouble();

        System.out.println("Digite a massa da segunda partícula (em kg):");
        double massaParticula2 = leitor.nextDouble();

        System.out.println("Digite a velocidade inicial da segunda partícula (em m/s) - componente x:");
        double velocidadeInicialX2 = leitor.nextDouble();
        System.out.println("Digite a velocidade inicial da segunda partícula (em m/s) - componente y:");
        double velocidadeInicialY2 = leitor.nextDouble();

        // Para determinar o movimento geral do sistema, precisamos calcular a velocidade do centro de massa desses objetos,
        // usamos a formula m1*v1 + m2 *v2 / m1+m2 nos dois casos isolados do eixo x e y
        double velocidadeCentroMassaX = (massaParticula1 * velocidadeInicialX1 + massaParticula2 * velocidadeInicialX2) /
                (massaParticula1 + massaParticula2);
        double velocidadeCentroMassaY = (massaParticula1 * velocidadeInicialY1 + massaParticula2 * velocidadeInicialY2) /
                (massaParticula1 + massaParticula2);

//        As velocidades relativas das partículas são calculadas subtraindo as velocidades do 
//        centro de massa das velocidades iniciais de cada partícula ao longo dos eixos 
//        x e  y. Essas velocidades relativas são usadas para realizar a troca de momento.
        double velocidadeRelativaX1 = velocidadeInicialX1 - velocidadeCentroMassaX;
        double velocidadeRelativaY1 = velocidadeInicialY1 - velocidadeCentroMassaY;
        double velocidadeRelativaX2 = velocidadeInicialX2 - velocidadeCentroMassaX;
        double velocidadeRelativaY2 = velocidadeInicialY2 - velocidadeCentroMassaY;

        // Troca de momento, colisao (reversão da velocidade relativa da partícula 1)
        double temp = velocidadeRelativaX1;
        velocidadeRelativaX1 = velocidadeRelativaX2;
        velocidadeRelativaX2 = temp;

        // Cálculo das velocidades finais das partículas após a colisao
        double velocidadeFinalX1 = velocidadeRelativaX1 + velocidadeCentroMassaX;
        double velocidadeFinalY1 = velocidadeRelativaY1 + velocidadeCentroMassaY;
        double velocidadeFinalX2 = velocidadeRelativaX2 + velocidadeCentroMassaX;
        double velocidadeFinalY2 = velocidadeRelativaY2 + velocidadeCentroMassaY;


        System.out.println("\nVelocidades finais:");
        System.out.println("Partícula 1: (" + velocidadeFinalX1 + " m/s, " + velocidadeFinalY1 + " m/s)");
        System.out.println("Partícula 2: (" + velocidadeFinalX2 + " m/s, " + velocidadeFinalY2 + " m/s)");

     
    }
}
