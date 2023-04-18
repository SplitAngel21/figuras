package hMF;
/**
 *
 * @author angel
 */
public interface figura {
    public void calcularPerimetroCuadrado(float lado);
    public void calcularPerimetroRectangulo(float lado1, float lado2);
    public void calcularPerimetroCirculo(float radio);
    public void calcularPerimetroHexagono(float lado, float apotema);
    public void calcularPerimetroPentagono(float lado, float apotema);
    public void calcularPerimetroRombo(float lado1, float lado2, float diagonal1, float diagonal2);
    public void calcularPerimetroTriangulo(float lado, float altura, float base);
    public void calcularPerimetroParalelogramo(float lado, float altura, float base);
    public void calcularPerimetroTrapecio(float base1, float base2,float altura, float lado);
    public void calcularAreaCuadrado(float lado);
    public void calcularAreaRectangulo(float lado1, float lado2);
    public void calcularAreaCirculo(float radio);
    public void calcularAreaHexagono(float lado, float apotema);
    public void calcularAreaPentagono(float lado, float apotema);
    public void calcularAreaRombo(float lado1, float lado2, float diagonal1, float diagonal2);
    public void calcularAreaTriangulo(float lado, float altura, float base);
    public void calcularAreaParalelogramo(float lado, float altura, float base);
    public void calcularAreaTrapecio(float base1, float base2,float altura, float lado);
}
