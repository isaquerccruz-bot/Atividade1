import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("me de um numero");
        int numero1 = sc.nextInt();
        if (numero1 % 2 == 0) {
            System.out.println("esse numero é par");
        } else {
            System.out.println("esse numero é impar");
        }
    }
}
