/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;


import generated.Anotaciones;
import generated.Asiento;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * Descripción: Se encargará principalmente de procesar el fichero XML y convertirlo en una lista.
 */
public class GestoraAsientos {
    private List<Asiento>listaAsientos;
    private Anotaciones anotaciones;
    /*
    Descripcion: Procesa un fichero XML y crea una colección con sus elementos
    Precondiciones: El XML está correctamente escrito y existe.
    Entradas: Un objeto File.
    Salidas: No hay
    Postcondiciones: No hay
    E/S: No hay
    */
    public void obtenerListaAnotacionesDeXML (File archivoXML){
        JAXBContext contexto;
        try {
            contexto = JAXBContext.newInstance(Anotaciones.class);
            Unmarshaller u = contexto.createUnmarshaller();
            anotaciones = (Anotaciones) u.unmarshal(archivoXML);
            listaAsientos=anotaciones.getAsiento();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void escribirIncidencias(LogIncidencia logIncidencia)
    {
        JAXBContext contexto;
        File archivoIncidencias=new File("src\\trabajoHibernate\\log"+logIncidencia.getNombreArchivo()+".xml");
        try {
            contexto = JAXBContext.newInstance(LogIncidencia.class);
            Marshaller marshalero = contexto.createMarshaller();
            marshalero.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter escribiente = new StringWriter();
            marshalero.marshal(logIncidencia, archivoIncidencias);
            // ahora lo marshaleamos a un stream para visualizarlo
            marshalero.marshal(logIncidencia, escribiente);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }
    
}
