package hMF;
/**
 *
 * @author angel
 */
public interface perimetro extends figura{
    @Override
    public default void calcularPerimetroCuadrado(float lado){
        System.out.println("El perimetro del cuadrado es-->"+(lado*4));
    }
    @Override
    public default void calcularPerimetroRectangulo(float lado1, float lado2){
        System.out.println("El perimetro del rectangulo es-->"+((lado1*2)+(lado2*2)));
    }
    @Override
    public default void calcularPerimetroCirculo(float radio){
        System.out.println("El perimetro del circulo es-->"+(3.1416*(radio*2)));
    }
    @Override
    public default void calcularPerimetroHexagono(float lado, float apotema){
        System.out.println("El perimetro del hexagono es-->"+(lado*6));
    }
    @Override
    public default void calcularPerimetroPentagono(float lado, float apotema){
        System.out.println("El perimetro del pentagono es-->"+(lado*5));
    }
    @Override
    public default void calcularPerimetroParalelogramo(float lado, float altura, float base){
        System.out.println("El perimetro del paralelogramo es-->"+(lado*4));
    }
    @Override
    public default void calcularPerimetroTrapecio(float base1, float base2,float altura, float lado){
        System.out.println("El perimetro del pentagono es-->"+(((base1+base2)+lado*2)));
    }
    @Override
    public default void calcularPerimetroTriangulo(float lado, float altura, float base){
        System.out.println("El perimetro del pentagono es-->"+(lado*3));
    }
    @Override
    public default void calcularPerimetroRombo(float lado1, float lado2, float diagonal1, float diagonal2){
        System.out.println("El perimetro del pentagono es-->"+((lado1*2)+(lado2*2)));
    }
}
