/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author thierry.59521
 */
public class Segurança extends Funcionario{
    
    private String Turno;

    /**
     * @param Turno the TURNO to set
     */
    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    /**
     * @return the TURNO
     */
    public String getTurno() {
        return Turno;
    }
    
}
