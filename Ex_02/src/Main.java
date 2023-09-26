import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

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

        Figura figura = new Figura();
        HashMap<Object,Figura> forma = new HashMap<>();
      
        switch (op)
        {
            case 1 ->{
                figura = new Triangulo();
                nome = Nome_Fig.TRIANGULO;
                forma.put(nome,figura);
             }
            case 2 -> {
                figura = new Retangulo();
                nome = Nome_Fig.RETANGULO;
                forma.put(nome,figura);
            }
            case 3 -> {
                figura = new Quadrado();
                nome = Nome_Fig.QUADRADO;
                forma.put(nome, figura);}
        }

        figura.setFormas(forma);
        figura.setNome(nome);
        figura.setArea(forma.get(nome).getArea());
        figura.getInfo();

    }
}