import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Figura implements Fig_Control{

    private Collection<Objects> figs_Set = new ArrayList<>();
    private String nome;

    private float area;


    Figura(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void displayInfo(){
        System.out.println("\n Figura escolhida:\t"+ getNome());
    }





}