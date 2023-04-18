package hMF;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class main {
    public static void main (String[] args){
        Scanner sa = new Scanner(System.in);
                System.out.println("Dame el lado del cuadrado-->");
                float lado = sa.nextFloat();
                cuadrado a = new cuadrado((float) lado);
                a.calcularAreaPerimetroCuadrado();
        Scanner sa1 = new Scanner(System.in);        
                System.out.println("Dame el radio del circulo-->");
                float radio = sa1.nextFloat();
                circulo a1 = new circulo((float) radio);
                a1.calcularAreaPerimetroCirculo();
        Scanner sa2 = new Scanner(System.in);        
                System.out.println("Dame el lado 1 del rectangulo-->");
                float lado1 = sa2.nextFloat();
                System.out.println("Dame el lado 2 del rectangulo-->");
                float lado2 = sa2.nextFloat();
                rectangulo a2 = new rectangulo((float) lado1, lado2);
                a2.calcularAreaPerimetroRectangulo();
        Scanner sa3 =new Scanner(System.in);
                System.out.println("Dame el lado del hexagono-->");
                float ladoo = sa3.nextFloat();
                System.out.println("Dame el apotema del hexagono-->");
                float apotema = sa3.nextFloat();
                hexagono a3 = new hexagono((float) ladoo, apotema);
                a3.calcularAreaPerimetroHexagono();
        Scanner sa4 =new Scanner(System.in);
                System.out.println("Dame el lado del pentagono-->");
                float ladooo = sa4.nextFloat();
                System.out.println("Dame el apotema del pentagono-->");
                float apotemaa = sa4.nextFloat();
                pentagono a4 = new pentagono((float) ladooo, apotemaa);
                a4.calcularAreaPerimetroPentagono();
        Scanner sa5 =new Scanner(System.in);
                System.out.println("Dame el lado 1 del rombo-->");
                float lado01 = sa5.nextFloat();
                System.out.println("Dame el lado 2 del rombo-->");
                float lado02 = sa5.nextFloat();
                System.out.println("Dame el diagonal 1 del rombo-->");
                float diagonal1 = sa5.nextFloat();
                System.out.println("Dame el diagonal 2 del rombo-->");
                float diagonal2 = sa5.nextFloat();
                rombo a5 = new rombo((float) lado01, lado02, diagonal1, diagonal2);
                a5.calcularAreaPerimetroRombo();        
        Scanner sa6 =new Scanner(System.in);
                System.out.println("Dame el lado del triangulo-->");
                float ladoooo = sa6.nextFloat();
                System.out.println("Dame la base del triangulo-->");
                float base = sa6.nextFloat();
                System.out.println("Dame la altura del triangulo-->");
                float altura = sa6.nextFloat();
                triangulo a6 = new triangulo((float) ladoooo, base, altura);
                a6.calcularAreaPerimetroTriangulo();         
        Scanner sa7 =new Scanner(System.in);
                System.out.println("Dame el lado del paralelogramo-->");
                float ladooooo = sa7.nextFloat();
                System.out.println("Dame la base del paralelogramo-->");
                float basee = sa7.nextFloat();
                System.out.println("Dame la altura del paralelogramo-->");
                float alturaa = sa7.nextFloat();
                paralelogramo a7 = new paralelogramo((float) ladooooo, basee, alturaa);
                a7.calcularAreaPerimetroParalelogramo();
        Scanner sa8 =new Scanner(System.in);
                System.out.println("Dame el lado del trapecio-->");
                float ladoooooo = sa8.nextFloat();
                System.out.println("Dame la base 1 del trapecio-->");
                float basee1 = sa8.nextFloat();
                System.out.println("Dame la base 2 del trapecio-->");
                float basee2 = sa8.nextFloat();
                System.out.println("Dame la altura del trapecio-->");
                float alturaaa = sa8.nextFloat();
                trapecio a8 = new trapecio((float) ladoooooo, basee1, basee2, alturaaa);
                a8.calcularAreaPerimetroTrapecio();        
    }
}
