import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int tentativas = 5;
        int numero = new Random().nextInt(100);

        System.out.println("Qual é o seu número?");
        int numeroLeitura = leitura.nextInt();

        while (tentativas > 0 && numeroLeitura != numero) {
            System.out.println("Tente novamente!");
            numeroLeitura = leitura.nextInt();
            tentativas--;
        }

        if (numeroLeitura == numero) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Que pena, você errou!");
            System.out.println(numero);
        }

    }
}
