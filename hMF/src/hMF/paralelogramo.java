package hMF;
/**
 *
 * @author angel
 */
public class paralelogramo implements area, perimetro{
    public float lado;
    public float base;
    public float altura;
    public paralelogramo(float lado, float altura, float base){
     this.lado=lado;
     this.altura=altura;
     this.base=base;
    }
    public void calcularAreaPerimetroParalelogramo(){
        area.super.calcularAreaParalelogramo(lado, altura, base);
        perimetro.super.calcularPerimetroParalelogramo(lado, altura, base);
    }  

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
