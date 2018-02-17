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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author aleja
 */
public class MainProyecto 
{
    public static void main(String[] args) 
    {
        ManejadoraCiudadanes mc = new ManejadoraCiudadanes ();
        ManejadoraMatrimonios mm = new ManejadoraMatrimonios ();
        
        Ciudadanes ciudadane = null;
        Matrimonios matrimonio = null;
        Pastas pasta = new Pastas ("pasta de mierda");
        
        Session ses = HibernateUtil.getSessionFactory().openSession();
        
         try
         {
             mc.crearCiudadaneHuerfano(ses, 0, "pepe", "java el crack", 'H', pasta, Short.valueOf ("2"), new Date ());
         } 
         
         finally 
         {
            ses.close();
         }
        
       
        
    }
}
