/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;

import clasesHibernate.Ciudadanes;
import clasesHibernate.Matrimonios;
import generated.Asiento;
import generated.Ciudadane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        incidencias=new ArrayList<Incidencia>();
        Incidencia incidencia;
        Matrimonios matrimonio;
        for(int i=0;i<listaAsientos.size();i++)
        {
            switch(listaAsientos.get(i).getTipo())
            {
                case "Divorcio":
                    matrimonio=manejadoraMatrimonios.recuperar(ses, listaAsientos.get(i).getMatrimonio().intValue());//Para pasar de BigInteger a int
                    if(matrimonio==null)
                    {
                        incidencia=new Incidencia(new Date(),"El matrimonio a divorciar no existe",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    else if(matrimonio.getFechafin()!=null)
                    {
                        incidencia=new Incidencia(new Date(),"El matrimonio ya se ha divorciado",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    else if(matrimonio.getFechafin()!= null && matrimonio.getFechamatrimonio().compareTo(matrimonio.getFechafin())>0)
                    {
                        incidencia=new Incidencia(new Date(),"La fecha de casamiento es posterior a la del divorcio, me ahorro las palabritas",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    else
                    {
                        manejadoraMatrimonios.divorciar(ses, matrimonio, new Date());
                        System.out.println("Sa divorciao");
                    }                               
                    break;
                case "Matrimonio":
                    ArrayList<Matrimonios>matrimonios;
                    Ciudadanes c1=manejadoraCiudadanes.recuperar(ses, listaAsientos.get(i).getCiudadane().get(0).getID().intValue());
                    Ciudadanes c2=manejadoraCiudadanes.recuperar(ses, listaAsientos.get(i).getCiudadane().get(1).getID().intValue());
                    matrimonios=new ArrayList<>(c1.getMatrimoniosCollection());
                    if(c1==null||c2==null)
                    {
                        incidencia=new Incidencia(new Date(),"Alguno de los conyuges no existe",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    if()
                    
                    break;
                case "Nacimiento":
                    break;
                case "Deceso":
                    break;
            }
        }       
        ses.close();
        HibernateUtil.getSessionFactory().close();
    }
 
    //EXPLICACIONES A GOME
/*    public ArrayList<Ciudadanes> ConverterCiudadaneToCiudadanes(ArrayList<Ciudadane> ciudadane)
    {
        ArrayList<Ciudadanes> arrayConvertio=new ArrayList<>();
        SimpleDateFormat casteoStringToDate=new SimpleDateFormat();
        for(int i=0;i<ciudadane.size();i++)
        {
            try {
                Ciudadanes conyuge=new Ciudadanes();
                conyuge.setNombre(ciudadane.get(i).getNombre());
                conyuge.setApellidos(ciudadane.get(i).getApellidos());
                conyuge.setFechanacimiento(casteoStringToDate.parse(ciudadane.get(i).getFechaNacimiento()));
                conyuge.setIDmadre(ciudadane.get);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }*/
}
