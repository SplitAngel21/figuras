package hMF;
/**
 *
 * @author angel
 */
public class rectangulo implements area, perimetro{
    public float lado1;
    public float lado2;
    public rectangulo(float lado1, float lado2){
     this.lado1=lado1;
     this.lado2=lado2;
    }
    public void calcularAreaPerimetroRectangulo(){
        area.super.calcularAreaRectangulo(lado1, lado2);
        perimetro.super.calcularPerimetroRectangulo(lado1, lado2);
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
}
