package hMF;
/**
 *
 * @author angel
 */
public class trapecio implements area, perimetro{
    public float base1;
    public float base2;
    public float altura;
    public float lado;
    public trapecio(float base1, float base2, float altura, float lado){
     this.base1=base1; 
     this.base2=base2;
     this.altura=altura;
     this.lado=lado;
    }
    public void calcularAreaPerimetroTrapecio(){
        area.super.calcularAreaTrapecio(lado, altura,base1, base2);
        perimetro.super.calcularPerimetroTrapecio(lado, altura,base1, base2);
    }

    public float getBase1() {
        return base1;
    }

    public void setBase1(float base1) {
        this.base1 = base1;
    }

    public float getBase2() {
        return base2;
    }

    public void setBase2(float base2) {
        this.base2 = base2;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
}