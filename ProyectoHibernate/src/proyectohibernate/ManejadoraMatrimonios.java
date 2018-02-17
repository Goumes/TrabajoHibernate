/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohibernate;

import clasesHibernate.Ciudadanes;
import clasesHibernate.Matrimonios;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aleja
 */
public class ManejadoraMatrimonios 
{
    /* Prototipo: Matrimonios crearMatrimonio (Session ses, Date fechaMatrimonio, Ciudadanes conyuge1, Ciudadanes conyuge2)
     * Precondiciones: Los ciudadanes existen en la badat. Ninguno de los dos está ya casado. Ninguno ha fallecido.
     * Entradas: Un objeto Session, un Date y dos Ciudadanes
     * Salidas: Un objeto Matrimonios
     * Postcondiciones: El matrimonio creado en la badat y el objeto hecho persistente.
    */
    public Matrimonios crearMatrimonio (Session ses, Date fechaMatrimonio, Ciudadanes conyuge1, Ciudadanes conyuge2)
    {
        Transaction tran;
        tran = ses.beginTransaction();
        Matrimonios matrimonio = new Matrimonios();
        matrimonio.setFechaMatrimonio(fechaMatrimonio);
        matrimonio.setCiudadanesByIdconyuge1(conyuge1);
        matrimonio.setCiudadanesByIdconyuge1(conyuge2);
        ses.save(matrimonio);
        tran.commit();
        
        return matrimonio;
    }
    
    /* Prototipo: Matrimonios divorciar (Session ses, Matrimonios matrimonio, Date fechaDivorcio)
     * Precondiciones: El matrimonio existe. La fecha de divorcio es posterior a la de casamiento. El matrimonio no está ya divorciado.
     * Entradas: Un objeto Session, un Date y un matrimonio
     * Salidas: Un objeto Matrimonios
     * Postcondiciones: El matrimonio disuelto.
    */
    public Matrimonios divorciar (Session ses, Matrimonios matrimonio, Date fechaDivorcio)
    {
        Transaction tran;
        tran = ses.beginTransaction();
        
        matrimonio.setFechaFin(fechaDivorcio);
        ses.update(matrimonio);
        
        tran.commit();
        
        return matrimonio;
    }
    
    
    /* Prototipo: Matrimonios recuperar (Session ses, short id)
     * Precondiciones: Ninguna
     * Entradas: Un objeto Session, un id
     * Salidas: Un objeto Matrimonios
     * Postcondiciones: El matrimonio con la id deseada
    */
    public Matrimonios recuperar (Session ses, int id){
        Matrimonios matrimonio;
        matrimonio = (Matrimonios)ses.get(Matrimonios.class, id);
        return matrimonio;
    }
}
