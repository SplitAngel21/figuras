package hMF;
/**
 *
 * @author angel
 */
public interface area extends figura{
    @Override
    public default void calcularAreaCuadrado(float lado){
        System.out.println("El area del cuadrado es-->"+(lado*lado));
    }
    @Override
    public default void calcularAreaRectangulo(float lado1, float lado2){
        System.out.println("El area del rectangulo es-->"+(lado1*lado2));
    }
    @Override
    public default void calcularAreaCirculo(float radio){
        System.out.println("El area del circulo es-->"+(3.1416*(radio*radio)));
    }
    @Override
    public default void calcularAreaHexagono(float lado, float apotema){
        System.out.println("El area del hexagono es-->"+(((lado*6)*apotema)/2));
    }
    @Override
    public default void calcularAreaPentagono(float lado, float apotema){
        System.out.println("El area del pentagono es-->"+(((lado*5)*apotema)/2));
    }
    @Override
    public default void calcularAreaParalelogramo(float lado, float altura, float base){
        System.out.println("El area del paralelogramos es-->"+(base*altura));
    }
    @Override
    public default void calcularAreaTrapecio(float base1, float base2,float altura, float lado){
        System.out.println("El area del pentagono es-->"+(((base1+base2)/2)*altura));
    }
    @Override
    public default void calcularAreaTriangulo(float lado, float altura, float base){
        System.out.println("El area del pentagono es-->"+((base*altura)/2));
    }
    @Override
    public default void calcularAreaRombo(float lado1, float lado2, float diagonal1, float diagonal2){
        System.out.println("El area del pentagono es-->"+((diagonal1*diagonal2)/2));
    }
}
