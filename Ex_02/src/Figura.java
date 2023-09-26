import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Figura  {

    private final HashMap<Object,Object> formas = new HashMap<>();
    private String nome;
    
    private float area;
    private final List<Float> lados = new ArrayList<>();

    protected enum Nome_Fig{
          TRIANGULO,
          RETANGULO,
          QUADRADO
      }

  
    Figura(){

    }

    public void setFormas(HashMap<Object,Figura> forma){
      this.formas.putAll(forma);
    }
  
    public void setNome(Object nome) {
        this.nome = nome.toString();
    }
    public Object getNome() {
        return nome;
    }

    
    public void setLados(List<Float> lados){
        this.lados.addAll(lados);
    }
  
    public void setArea(float area) {
        this.area = area;
    }
    public float getArea() {
        return area;
    }


    protected void setArea(Float area) {
        this.area = area;
    }

    public void getInfo(){

    }





}