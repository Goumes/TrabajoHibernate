/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;

import generated.Asiento;
import java.util.Date;

/**
 *
 * @author pjarana
 */
public class Incidencia {
    
    private Date momento;
    private String motivo;
    private Asiento asiento;

    public Incidencia() {
        this.momento=null;
        this.motivo=null;
        this.asiento=null;
    }

    public Incidencia(Date momento, String motivo, Asiento asiento) {
        this.momento = momento;
        this.motivo = motivo;
        this.asiento = asiento;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
    
    
    
}
