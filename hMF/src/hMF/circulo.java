package hMF;
/**
 *
 * @author angel
 */
public class circulo implements area, perimetro{
    public float radio;
    public circulo(float radio){
     this.radio=radio;   
    }
    public void calcularAreaPerimetroCirculo(){
        area.super.calcularAreaCirculo(radio);
        perimetro.super.calcularPerimetroCirculo(radio);
    }
    public float getCirculo() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
