import java.util.Objects;
import java.util.Scanner;

public class Main {
    private enum Nome_Fig{
        TRIANGULO,
        RETANGULO,
        QUADRADO
    }
    public static void main(String[] args) {
        System.out.println("\n\t Menu de figuras: \n\t\t [1] <- TRIANGULO\n\t\t [2] <- RETANGULO\n\t\t [3] <- QUADRADO\n " +
                "\n\t Dado o menu acima, digite o codigo nome da figura que desejas manipular: \t\t");

        Scanner scan = new Scanner(System.in);
        Object nome = new Object();

        int op = scan.nextInt();

        switch (op) {
            case 1 -> nome = Nome_Fig.TRIANGULO;
            case 2 -> nome = Nome_Fig.RETANGULO;
            case 3 -> nome = Nome_Fig.QUADRADO;
        }


        Figura figura = new Figura();
        figura.setNome(nome);
        figura.displayInfo();

    }
}