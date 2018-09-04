/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author ESTUDIANTE
 */
public class Cuadrado extends Figura{

    private int ladoCuad;

    public Cuadrado(int ladoCuad) {
        super();
        this.ladoCuad = ladoCuad;
    }

    public int getLadoCuad() {
        return ladoCuad;
    }

    public void setLadoCuad(int ladoCuad) {
        this.ladoCuad = ladoCuad;
    }
    
    
    
    
    @Override
    public void calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutarFigura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
