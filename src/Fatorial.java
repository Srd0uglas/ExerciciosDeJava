import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        int cont = 1;
        System.out.println("Digite um número para saber o fatorial dele: ");
        num = scanner.nextInt();
        for (int i = 1; i <=num; i++) {
//            o segredo é declarar a variável como 1
            cont = cont * i;
            System.out.println(cont);
        }
    }
}
