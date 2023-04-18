package hMF;
/**
 *
 * @author angel
 */
public class triangulo implements area, perimetro{
    public float lado;
    public float base;
    public float altura;
    public triangulo(float lado3, float base, float altura){
     this.lado=lado3;
     this.altura=altura;
     this.base=base;
    }
    public void calcularAreaPerimetroTriangulo(){
        area.super.calcularAreaTriangulo(lado, base, altura);
        perimetro.super.calcularPerimetroTriangulo(lado, altura, base);
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
