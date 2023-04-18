package hMF;
/**
 *
 * @author angel
 */
public class pentagono implements area, perimetro{
    public float lado;
    public float apotema;
    public pentagono(float lado, float apotema){
     this.lado=lado;
     this.apotema=apotema;
    }
    public void calcularAreaPerimetroPentagono(){
        area.super.calcularAreaPentagono(lado, apotema);
        perimetro.super.calcularPerimetroPentagono(lado, apotema);
    }  

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

}
