import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();


        int contador = 0;


        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }

        scanner.close();
    }
}
