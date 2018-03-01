/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pjarana
 */
@XmlRootElement(name="Incidencias")
public class LogIncidencia {
    
    
    private Date fechaLog;
    private String nombreArchivo;
    private ArrayList<Incidencia> incidencias;
    
    public LogIncidencia()
    {
        fechaLog=new Date();
        nombreArchivo="";
        incidencias=new ArrayList<>();
    }
    public LogIncidencia(String nombreArchivo, ArrayList<Incidencia>incidencias)
    {
        fechaLog=new Date();
        this.nombreArchivo=nombreArchivo;
        this.incidencias=incidencias;
    }
    @XmlAttribute(name="fechaLog")
    public Date getFechaLog() {
        return fechaLog;
    }

    public void setFechaLog(Date fechaLog) {
        this.fechaLog = fechaLog;
    }
    @XmlAttribute(name="archivo")
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public ArrayList<Incidencia> getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(ArrayList<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }
    
}
