/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;

import generated.Asiento;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author usuario
 * Descripción: Esta gestora se encargará de procesar la lista de asientos.
 */
public class GestoraMain {
    
    private ManejadoraCiudadanes manejadoraCiudadanes;
    private ManejadoraMatrimonios manejadoraMatrimonios;
    private ArrayList<Incidencia>incidencias;
    private  Session ses;
    /*
    Descripción: Este método se encargará de recorrer la lista de asientos y realizar las actualizaciones correspondientes,
    dependiendo el tipo de asiento.
    Precondiciones: No hay.
    Entradas: Un List de Asientos.
    Salidas: No hay
    Precondiciones: Si hay errores, se rellenará el array de incidencias, si no, nada.
    E/S: No hay
    */
    public void realizarActualizaciones(List<Asiento> listaAsientos)
    {
        manejadoraCiudadanes=new ManejadoraCiudadanes();
        manejadoraMatrimonios=new ManejadoraMatrimonios();
        ses= HibernateUtil.getSessionFactory().openSession();
        Incidencia incidencia;
        for(int i=0;i<listaAsientos.size();i++)
        {
            switch(listaAsientos.get(i).getTipo())
            {
                case "Divorcio":
                    manejadoraMatrimonios.recuperar(ses, listaAsientos.get(i).getMatrimonio().intValue());//Para pasar de BigInteger a int
                    break;
                case "Matrimonio":
                    break;
                case "Nacimiento":
                    break;
                case "Deceso":
                    break;
            }
        }
    }
    
}
