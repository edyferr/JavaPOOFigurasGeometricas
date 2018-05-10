/*
 * Archivo que contiene la Clase Rectangulo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase 
 * @author Marcelo
 */
public class Trapecio {
    private int bmayor,bmenor,lados,alturaT;

    public Trapecio(int bmayor, int bmenor, int lados, int alturaT) {
        this.bmayor = bmayor;
        this.bmenor = bmenor;
        this.lados = lados;
        this.alturaT = alturaT;
    }

    public int getBmayor() {
        return bmayor;
    }

    public void setBmayor(int bmayor) {
        this.bmayor = bmayor;
    }

    public int getBmenor() {
        return bmenor;
    }

    public void setBmenor(int bmenor) {
        this.bmenor = bmenor;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getAlturaT() {
        return alturaT;
    }

    public void setAlturaT(int alturaT) {
        this.alturaT = alturaT;
    }

    
 

   
    public int getArea() {
        return ((this.bmayor +this.bmenor)*this.alturaT)/2;
    }
    
    public int getPerimetro() {
        return this.bmenor + this.bmayor+this.lados+this.lados;
    }
}
