package hMF;
/**
 *
 * @author angel
 */
public class rombo implements area, perimetro{
    public float lado1;
    public float lado2;
    public float diagonal1;
    public float diagonal2;
    public rombo(float lado1, float lado2, float diagonal1, float diagonal2){
     this.lado1=lado1; 
     this.lado2=lado2;
     this.diagonal1=diagonal1;
     this.diagonal2=diagonal2;
    }
    public void calcularAreaPerimetroRombo(){
        area.super.calcularAreaRombo(lado1, lado2, diagonal1, diagonal2);
        perimetro.super.calcularPerimetroRombo(lado1, lado2, diagonal1, diagonal2);
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

    public float getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(float diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public float getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(float diagonal2) {
        this.diagonal2 = diagonal2;
    }
    
}

