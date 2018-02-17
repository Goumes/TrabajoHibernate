/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohibernate;

import clasesHibernate.Ciudadanes;
import clasesHibernate.Matrimonios;
import clasesHibernate.Pastas;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aleja
 */
public class ManejadoraCiudadanes 
{
     /* Prototipo: Ciudadanes crearCiudadane (Session ses, int id, Serializable nombre, Serializable apellidos, char sexo, Ciudadanes madre, Ciudadanes padre, Pastas pastas, Short kgPasta, Date fechaNacimiento)
     * Precondiciones: El tipo de pasta existe. La fecha de nacimiento no es posterior a la actual. El padre y la madre existen.
     * Entradas: Un objeto Session, un entero, dos serializables, un char, dos Ciudadanes, un Pastas, un Short y un Date.
     * Salidas: Un objeto Ciudadanes
     * Postcondiciones: El ciudadane creado en la badat y el objeto hecho persistente.
    */
    public Ciudadanes crearCiudadane (Session ses, int id, Serializable nombre, Serializable apellidos, char sexo, Ciudadanes madre, Ciudadanes padre, Pastas pastas, Short kgPasta, Date fechaNacimiento)
    {
        Transaction tran;
        tran = ses.beginTransaction();
        Ciudadanes ciudadane = new Ciudadanes();
        ciudadane.setId(id);
        ciudadane.setApellidos(apellidos);
        ciudadane.setNombre (nombre);
        ciudadane.setCiudadanesByIdMadre(madre);
        ciudadane.setCiudadanesByIdPadre(padre);
        ciudadane.setSexo(sexo);
        ciudadane.setPastas(pastas);
        ciudadane.setKgPasta(kgPasta);
        ciudadane.setFechaNacimiento(fechaNacimiento);
        ses.save(ciudadane);
        tran.commit();
        
        return ciudadane;
    }
    
     /* Prototipo: Ciudadanes crearCiudadane (Session ses, int id, Serializable nombre, Serializable apellidos, char sexo, Pastas pastas, Short kgPasta, Date fechaNacimiento)
     * Precondiciones: El tipo de pasta existe. La fecha de nacimiento no es posterior a la actual. El padre y la madre existen.
     * Entradas: Un objeto Session, un entero, dos serializables, un char, dos Ciudadanes, un Pastas, un Short y un Date.
     * Salidas: Un objeto Ciudadanes
     * Postcondiciones: El ciudadane creado en la badat y el objeto hecho persistente.
    */
    public Ciudadanes crearCiudadaneHuerfano (Session ses, int id, Serializable nombre, Serializable apellidos, char sexo, Pastas pastas, Short kgPasta, Date fechaNacimiento)
    {
        Transaction tran;
        tran = ses.beginTransaction();
        Ciudadanes ciudadane = new Ciudadanes();
        ciudadane.setId(id);
        ciudadane.setApellidos(apellidos);
        ciudadane.setNombre (nombre);
        ciudadane.setSexo(sexo);
        ciudadane.setPastas(pastas);
        ciudadane.setKgPasta(kgPasta);
        ciudadane.setFechaNacimiento(fechaNacimiento);
        ses.save(ciudadane);
        tran.commit();
        
        return ciudadane;
    }
    
    /* Prototipo: Matrimonios divorciar (Session ses, Matrimonios matrimonio, Date fechaDivorcio)
     * Precondiciones: El ciudadane existe. El ciudadane está vivo.
     * Entradas: Un objeto Session, un Date y un Ciudadane
     * Salidas: Un objeto Ciudadane
     * Postcondiciones: El ciudadane muerto.
    */
    public Ciudadanes morir (Session ses, Ciudadanes ciudadane, Date fechaMuerte)
    {
        Transaction tran;
        tran = ses.beginTransaction();
        
        ciudadane.setFechaMuerte(fechaMuerte);
        ses.update(ciudadane);
        
        tran.commit();
        
        return ciudadane;
    }
    
    /* Prototipo: Ciudadanes recuperar (Session ses, int id)
     * Precondiciones: Ninguna
     * Entradas: Un objeto Session, un id
     * Salidas: Un objeto Ciudadanes
     * Postcondiciones: El ciudadane con la id deseada
    */
    public Ciudadanes recuperar (Session ses, int id){
        Ciudadanes ciudadane;
        ciudadane = (Ciudadanes)ses.get(Ciudadanes.class, id);
        return ciudadane;
    }
}
