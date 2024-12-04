import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade!");
        } else {
            System.out.println("Você é maior de idade!");
        }
    }
}
