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
public class Circulo extends Figura{
    
    private int radioCirc;

    public Circulo(int radioCirc) {
        this.radioCirc = radioCirc;
    }

    public int getRadioCirc() {
        return radioCirc;
    }

    public void setRadioCirc(int radioCirc) {
        this.radioCirc = radioCirc;
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
