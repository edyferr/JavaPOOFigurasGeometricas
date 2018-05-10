/*
 * Archivo que contiene la Clase Rectangulo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase 
 * @author Marcelo
 */
public class Triangulo {
    private double Lado1, Lado2, Lado3,basee;
    

    public Triangulo(double Lado1, double Lado2, double Lado3,double basee) {
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
        this.Lado3 = Lado3;
        this.basee = basee;
    }

    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double Lado1) {
        this.Lado1 = Lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double Lado2) {
        this.Lado2 = Lado2;
    }

    public double getLado3() {
        return Lado3;
    }

    public void setLado3(double Lado3) {
        this.Lado3 = Lado3;
    }
    public double getBasee() {
        return basee;
    }

    public void setBase(double basee) {
        this.basee = basee;
    }
   


    
    
    /**
     * Método que retorna el area del Rectangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (this.Lado1*this.basee)/2;
    }
    
    /**
     * Método que retorna el perimetro del Rectangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return this.Lado1+this.Lado2+this.Lado3;
    }
}
