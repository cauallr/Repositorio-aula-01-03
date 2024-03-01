import java.util.Scanner;

public class PrimeiroAlgoritmo {  
    public static void main(String[] args) {

        // pergutando do usuario a altura atual do objeto e especificando que é em metros
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a altura atual do objeto (em metros)? ");
        float altura = leitor.nextFloat();

        // definindo a gravidade
        float gravidade = 9.8f; 

        //criando a variavel velocidade para trabalhar no for
        float velocidade;

        for (int i = 1; i <= altura; i++) {
            velocidade = (float) Math.sqrt(2 * gravidade * i);
            System.out.println("Na posição " + i + ", o objeto terá velocidade " + velocidade + " m/s");
        }
    }
}
