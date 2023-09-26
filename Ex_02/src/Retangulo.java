import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Retangulo extends Figura implements Formas_Control {


    private final String nome;
    private float base = 0, altura = 0;

    Retangulo(){
        //super();
        this.nome = Nome_Fig.RETANGULO.toString();
        this.setLados();
        this.setArea((this.altura*this.base)/2);

    }

    public void setLados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t Digite a base do retangulo: \t");
        this.setBase(scan.nextFloat());

        System.out.println("\n\t Digite a altura do retangulo: \t");
        this.setAltura(scan.nextFloat());

        List<Float> lados = new ArrayList<>();
        lados.add(getBase());
        lados.add(getAltura());

        super.setLados(lados);
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getBase() {
        return base;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    @Override
    public void setArea(Float area) {
        super.setArea(area);
    }

    @Override
    public void getInfo(){
        System.out.println("\n\t INFOS de "+this.nome+":\n");
        System.out.println("\t\t base = "+this.base);
        System.out.println("\t\t altura = "+this.altura);
        System.out.println("\t\t AREA = "+super.getArea());

    }

}
