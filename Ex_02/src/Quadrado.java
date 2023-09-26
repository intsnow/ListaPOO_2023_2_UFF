import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quadrado extends Figura implements Formas_Control{
    private final String nome;
    private float lado;

    Quadrado(){
        super();
        this.nome = Nome_Fig.QUADRADO.toString();
        this.setLados();
        this.setArea(this.lado*this.lado);

    }

    public void setLados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t Digite o lado do quadrado: \t");
        this.setLado(scan.nextFloat());

        List<Float> lados = new ArrayList<>();
        lados.add(getBase());

        super.setLados(lados);
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getBase() {
        return lado;
    }


    @Override
    public void setArea(Float area){
        super.setArea(area);
    }

    @Override
    public void getInfo(){
        System.out.println("\n\t INFOS de "+this.nome+":\n");
        System.out.println("\t\t lado = "+this.lado);
        System.out.println("\t\t AREA = "+super.getArea());

    }
}
