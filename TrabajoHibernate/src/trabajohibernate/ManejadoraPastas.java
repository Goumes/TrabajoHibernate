/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;

import clasesHibernate.Matrimonios;
import clasesHibernate.Pastas;
import org.hibernate.Session;

/**
 *
 * @author pjarana
 */
public class ManejadoraPastas {
    
    /*
    Descripcion: Devuelve un objeto Pastas de la bbdd
    Precondiciones: No hay
    Entradas: Un objeto session y un string
    Salidas: Un objeto Pastas
    Postcondiciones: Un objeto Pastas si todo va bien y null si no se encuentra la pasta
    */
    public Pastas recuperarPasta(Session ses, String nombrePasta)
    {
        Pastas p=null;
        p = (Pastas)ses.get(Pastas.class, nombrePasta);
        return p;
    }
}
