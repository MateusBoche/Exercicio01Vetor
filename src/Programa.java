import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Programa app = new Programa();
        app.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numero vc quer digitar?");
        int quantidade = sc.nextInt();
        int[] vetor = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            sc.nextLine();
            System.out.println("digite um numero: ");
            int x = sc.nextInt();
            vetor[i] = x;
        }
        System.out.println("numeros negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]<0){
                System.out.println(vetor[i]);
            }

        }

    }
}
