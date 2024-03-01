import java.util.Scanner;

public class SegundoAlgaritmo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
 

        System.out.println("olá, este é um algoritmo capaz de calcular aproxidamente a trajetoria nos seguintes angulos: 45,90,135 /n por favor informe as informações: ");

        // aqui é feito o do- while, caso o angulo que o usuario colocar for invalido ele irá repetir o while até o angulo for valido de 1 até 180
        // eu considerei que o angulo vai até 180

        do {
        System.out.println("Qual o angulo do objeto lançado em relação ao solo?");
        int angulo = leitor.nextInt();
        
        
        while (angulo == 0 || angulo >180) {
            System.out.println("coloque um angulo válido em relação, de 1 até 180");;

    
  }
    
    System.out.println("qual a velocidade do objeto lançado em metros por segundo?");
    int velocidade = leitor.nextInt();





    }
    
}
