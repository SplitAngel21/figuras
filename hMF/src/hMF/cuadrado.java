package hMF;
/**
 *
 * @author angel
 */
public class cuadrado implements area, perimetro{
    public float lado;
    public cuadrado(float lado){
     this.lado=lado;   
    }
    public void calcularAreaPerimetroCuadrado(){
        area.super.calcularAreaCuadrado(lado);
        perimetro.super.calcularPerimetroCuadrado(lado);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
