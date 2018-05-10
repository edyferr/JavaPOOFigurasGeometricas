/*
 * Archivo que contiene la Clase Rectangulo 
 */
package bo.usfx.sis457.figuras;


public class Poligono {
    
    double NoLados;
    double Lado;
    double Apotema;
    

    public Poligono(double NoLados, double Lado, double Apotema) {
        this.NoLados = NoLados;
        this.Lado = Lado;
        this.Apotema = Apotema;
    }

     
    
 

    public double getNoLados() {
        return NoLados;
    }

    public void setNoLados(double NoLados) {
        this.NoLados = NoLados;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }

    public double getApotema() {
        return Apotema;
    }

    public void setApotema(double Apotema) {
        this.Apotema = Apotema;
    }

  
      public double getPerimetro()
        {
            return  this.NoLados * this.Lado;
        }  
        
   
    
    public double getArea()
        {
         return  this.Apotema / 2;
        }
    
        
   
        
    }

