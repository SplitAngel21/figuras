package hMF;
/**
 *
 * @author angel
 */
public class hexagono implements area, perimetro{
    public float ladoo;
    public float apotema;
    public hexagono(float ladoo, float apotema){
     this.ladoo=ladoo;
     this.apotema=apotema;
    }
    public void calcularAreaPerimetroHexagono(){
        area.super.calcularAreaHexagono(ladoo, apotema);
        perimetro.super.calcularPerimetroHexagono(ladoo, apotema);
    }

    public float getLado() {
        return ladoo;
    }

    public void setLado(float lado) {
        this.ladoo = ladoo;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
   
}
