import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleato = new Random();
        int numero =aleato.nextInt(100);
        int conta = 0;

        while (true){
            System.out.println("Tente adivinhar qual número de 0 à 100 eu pensei");
            int chute = leitor.nextInt();
            conta++;
            if (numero>chute){
                System.out.println("O número que eu pensei está acima");
            }else if (numero<chute){
                System.out.println("O número que eu pensei está abaixo");
            }
            if (numero == chute){
                System.out.println("Parabéns você acertou, o número que eu pensei foi "+ numero);
                break;
            }else if (conta == 5){
                System.out.println("Infeleizmente você errou 5 vezes, esgotou-se suas tentativas.");
                System.out.println("O número era "+numero);
                break;
            }
        }

    }
}