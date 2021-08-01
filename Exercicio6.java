import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de estudantes que vão alugar quatos: ");
        int n = sc.nextInt();
        sc.nextLine();

        Quartos[] quart = new Quartos[10];

        for(int i=1; i<=n; i++){
            System.out.println("\nRent #" + i + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            sc.nextLine();
            quart[quarto-1] = new Quartos(nome, email, quarto);
        }

        sc.close();
        System.out.println("\nBusy rooms:");
        for(int i=0; i<quart.length; i++){
            if (quart[i] != null){
                System.out.println(quart[i].getQuarto() + " " + quart[i]);
            }
        }
    }
}
