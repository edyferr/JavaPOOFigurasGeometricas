/*
 * Ejemplo del Principio de Encapsulamiento 
 */
package bo.usfx.sis457;

import bo.usfx.sis457.figuras.*;
import java.util.Scanner;

/**
 * Clase principal que instancia objetos de las clases del paquete figuras
 * @author Marcelo
 */
public class POOFigurasGeometricas {
        
    /**
     * Clase principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de las variables
        Scanner entradaTeclado;
        int opcion;
        
        System.out.println("+==================================================+");
        System.out.println("| Programa: Figuras Geometricas                    |");
        System.out.println("| - Ejemplo de Encapsulamiento                     |");
        System.out.println("+==================================================+");
        System.out.println("| Que desea realizar?                              |");
        System.out.println("| 1) Calcular el area y perimetro de un Circulo    |");
        System.out.println("| 2) Calcular el area y perimetro de un Cuadrado   |");
        System.out.println("| 3) Calcular el area y perimetro de un Rectangulo |");
        System.out.println("| 4) Calcular el area y perimetro de un Triangulo   |");
        System.out.println("| 5) Calcular el area y perimetro de un Poligono  |");
        System.out.println("| 6) Calcular el area y perimetro de un Trapecio |");
 
       
        System.out.println("| *) Salir                                         |");
        System.out.println("+==================================================+");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.nextInt();
        switch (opcion) {
            case 1:
                /* Se instancia un objeto de la Clase Círculo y posteriormente se modifica el valor
                   de su propiedad "Radio" a través de un método accesor o setter (setRadio). */
                Circulo circulo = new Circulo();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Circulo                             |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del radio: ");
                float radio = (float)entradaTeclado.nextFloat();
                circulo.setRadio(radio);
                System.out.println("El Area del Circulo es: " + circulo.getArea());
                System.out.println("El Perimetro del Circulo es: " + circulo.getPerimetro());
                break;
            case 2:
                /* Se instancia un objeto de la Clase Cuadrado y posteriormente se modifica el valor
                   de su propiedad "Lado" a través de un método accesor o setter (setRadio). */
                Cuadrado cuadrado = new Cuadrado();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Cuadrado                            |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del lado: ");
                cuadrado.setLado(entradaTeclado.nextDouble());
                System.out.println("El Area del Cuadrado es: " + cuadrado.getArea());
                System.out.println("El Perimetro del Cuadrado es: " + cuadrado.getPerimetro());
                break;
            case 3:
                /* Se instancia un objeto de la Clase Rectangulo y a la vez se inicilaizan los valores
                   de sus propiedades "Base" y "Altura" a través del método Constructor (Rectangulo). */
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rectangulo                          |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor de la Base: ");
                double base = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la Altura: ");
                double altura = entradaTeclado.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                System.out.println("El Area del Rectangulo es: " + rectangulo.getArea());
                System.out.println("El Perimetro del Rectangulo es: " + rectangulo.getPerimetro());
                break;
            default:
                System.out.println("Salio del programa");
                
                
        case 4:
               
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Triangulo                         |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el lado1: ");
                double Lado1 = entradaTeclado.nextDouble();
                System.out.print("Introduzca el lado2: ");
                double Lado2 = entradaTeclado.nextDouble();
                System.out.print("Introduzca el lado3: ");
                double Lado3 = entradaTeclado.nextDouble();
                System.out.print("Introduzca la base: ");
                double basee = entradaTeclado.nextDouble();

                Triangulo triangulo = new Triangulo(Lado1,Lado2,Lado3,basee);
                System.out.println("El Area del Triangulo es: " + triangulo.getArea());
                System.out.println("El Perimetro del Triangulo es: " + triangulo.getPerimetro());
                break;
           
                
           case 5:
               
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Poligono                       |");
                System.out.println("+==================================================+");
                
                System.out.println("Introducir Numeros de Lados del Poligono :");
                 double  NoLados= entradaTeclado.nextDouble();
                System.out.println("Introducir Valor de los Lados:");
                 double  Lados= entradaTeclado.nextDouble();
                System.out.println("Introducir Escribe valos del Apotema:");
                 double Apotema= entradaTeclado.nextDouble();
               
               
                Poligono poligono = new Poligono(NoLados,Lados,Apotema);
                System.out.println("El Area del Pentagono es: " + poligono.getArea());
                System.out.println("El Perimetro del Pentagono es: " + poligono.getPerimetro());
                break;
                
                
                
           case 6:
               
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma Trapecio                      |");
                System.out.println("+==================================================+");
                
                System.out.println("Introducir la base mayor :");
                 int  bmayor= entradaTeclado.nextInt();
                System.out.println("Introducir la base menor :");
                 int bmenor= entradaTeclado.nextInt();
                System.out.println("Introducir los lados:");
                 int lados= entradaTeclado.nextInt();
                System.out.println("Introducir la altura:");
                 int alturaT= entradaTeclado.nextInt();
               
                Trapecio trapecio = new Trapecio(bmayor,bmenor,lados,alturaT);
                System.out.println("El Area del Trapecio es: " + trapecio.getArea());
                System.out.println("El Perimetro del Trapecio es: " + trapecio.getPerimetro());
                break;
           
               
            
                
        }
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
