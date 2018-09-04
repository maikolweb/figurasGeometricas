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
public class Rectangulo  extends Figura{
    
    private int baseRecta;
    private int alturaRecta;

    public Rectangulo(int baseRecta, int alturaRecta) {
        super();
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
    }

    public int getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(int baseRecta) {
        this.baseRecta = baseRecta;
    }

    public int getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(int alturaRecta) {
        this.alturaRecta = alturaRecta;
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
