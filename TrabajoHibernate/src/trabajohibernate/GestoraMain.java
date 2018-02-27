/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;

import clasesHibernate.Ciudadanes;
import clasesHibernate.Matrimonios;
import clasesHibernate.Pastas;
import generated.Asiento;
import generated.Ciudadane;
import java.text.DateFormat;
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
    private ManejadoraPastas manejadoraPastas;
    private DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
    /*
    Descripción: Este método se encargará de recorrer la lista de asientos y realizar las actualizaciones correspondientes,
    dependiendo el tipo de asiento.
    Precondiciones: No hay.
    Entradas: Un List de Asientos.
    Salidas: No hay
    Precondiciones: Si hay errores, se rellenará el array de incidencias, si no, nada.
    E/S: No hay
    */
    public void realizarActualizaciones(List<Asiento> listaAsientos,Session ses)
    {
        manejadoraCiudadanes=new ManejadoraCiudadanes();
        manejadoraMatrimonios=new ManejadoraMatrimonios();
        manejadoraPastas=new ManejadoraPastas();
        incidencias=new ArrayList<Incidencia>();
        Incidencia incidencia;
        Matrimonios matrimonio;
        boolean casado = false;
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
                    ArrayList<Matrimonios>matrimoniosC1_1;
                    ArrayList<Matrimonios>matrimoniosC1_2;
                    ArrayList<Matrimonios>matrimoniosC2_1;
                    ArrayList<Matrimonios>matrimoniosC2_2;
                    Ciudadanes c1=manejadoraCiudadanes.recuperar(ses, listaAsientos.get(i).getCiudadane().get(0).getID().intValue());
                    Ciudadanes c2=manejadoraCiudadanes.recuperar(ses, listaAsientos.get(i).getCiudadane().get(1).getID().intValue());
                    matrimoniosC1_1=new ArrayList<>(c1.getMatrimoniosCollection());
                    matrimoniosC1_2=new ArrayList<>(c1.getMatrimoniosCollection1());
                    matrimoniosC2_1=new ArrayList<>(c2.getMatrimoniosCollection());
                    matrimoniosC2_2=new ArrayList<>(c2.getMatrimoniosCollection1());
                    if(c1==null||c2==null)
                    {
                        incidencia=new Incidencia(new Date(),"Alguno de los conyuges no existe",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    
                    else if(!matrimoniosC1_1.isEmpty()||
                            !matrimoniosC1_2.isEmpty()||
                            !matrimoniosC2_1.isEmpty()||
                            !matrimoniosC2_2.isEmpty())
                    {
                        
                        if(!matrimoniosC1_1.isEmpty()&&matrimoniosC1_1.get(matrimoniosC1_1.size()-1).getFechafin()==null)casado = true; 

                        else if(!matrimoniosC1_2.isEmpty()&&matrimoniosC1_2.get(matrimoniosC1_2.size()-1).getFechafin()==null)casado = true; 

                        else if(!matrimoniosC2_1.isEmpty() && matrimoniosC2_1.get(matrimoniosC2_1.size()-1).getFechafin()==null)casado = true; 

                        else if(!matrimoniosC2_2.isEmpty() && matrimoniosC2_2.get(matrimoniosC2_2.size()-1).getFechafin()==null) casado=true;                       
                        if (casado)
                        {
                            incidencia=new Incidencia(new Date(),"Alguno de los conyuges est� casad@",listaAsientos.get(i));
                            incidencias.add(incidencia);
                            System.out.println(incidencia.getMotivo());
                        }                      
                    }
                    
                    else if(c1.getFechamuerte()!=null||c2.getFechamuerte()!=null)
                    {
                            incidencia=new Incidencia(new Date(),"Alguno la palmao",listaAsientos.get(i));
                            incidencias.add(incidencia);
                            System.out.println(incidencia.getMotivo());
                    }
                    else
                    {
                        manejadoraMatrimonios.crearMatrimonio(ses, new Date(), c1, c2);
                        System.out.println("San Casao");
                    }
                    break;
                case "Nacimiento":
                    Ciudadanes c=manejadoraCiudadanes.recuperar(ses, listaAsientos.get(i).getCiudadane().get(0).getID().intValue());
                    Pastas p=manejadoraPastas.recuperarPasta(ses, listaAsientos.get(i).getCiudadane().get(0).getPastaFavorita());
                    Ciudadanes padre=manejadoraCiudadanes.recuperar(ses, listaAsientos.get(i).getCiudadane().get(0).getPadre().getID().intValue());
                    Ciudadanes madre=manejadoraCiudadanes.recuperar(ses, listaAsientos.get(i).getCiudadane().get(0).getMadre().getID().intValue());
                    
                    Date fechaNacimiento = null;
                    try {
                        fechaNacimiento = format.parse(listaAsientos.get(i).getCiudadane().get(0).getFechaNacimiento());
                    } catch (ParseException ex) {
                        Logger.getLogger(GestoraMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(c!=null)
                    {
                        incidencia=new Incidencia(new Date(),"Este ciudadane ya existe",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    else if(p==null)
                    {
                        incidencia=new Incidencia(new Date(),"Esta pasta no existe",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    
                    else if (padre == null || madre == null)
                    {
                        if (padre == null)
                        {
                            incidencia=new Incidencia(new Date(),"El padre no existe",listaAsientos.get(i));
                            incidencias.add(incidencia);
                            System.out.println(incidencia.getMotivo());
                        }
                        
                        if (madre == null)
                        {
                            incidencia=new Incidencia(new Date(),"La madre no existe",listaAsientos.get(i));
                            incidencias.add(incidencia);
                            System.out.println(incidencia.getMotivo());
                        }
                    }
                    
                    //Este ciudadane tiene que ser el que viene del xml, no el recuperado de Hibernate
                    
                    else if (listaAsientos.get(i).getCiudadane() != null && fechaNacimiento.compareTo(new Date()) > 0)
                    {
                        incidencia=new Incidencia(new Date(),"La fecha de nacimiento es posterior a la fecha actual",listaAsientos.get(i));
                        incidencias.add(incidencia);
                        System.out.println(incidencia.getMotivo());
                    }
                    
                    else
                    {
                        manejadoraCiudadanes.crearCiudadane(ses, listaAsientos.get(i).getCiudadane().get(0).getID().intValue(), listaAsientos.get(i).getCiudadane().get(0).getNombre(), listaAsientos.get(i).getCiudadane().get(0).getApellidos(), listaAsientos.get(i).getCiudadane().get(0).getSexo().charAt(0), madre, padre, p, Short.valueOf("0"), fechaNacimiento);
                         System.out.println("Ha nacio");
                    }
                    
                    break;
                case "Deceso":
                    Ciudadanes c = //HACER LOS DECESOS CRACKS
                    break;
            }
        }       
        //ses.close();
        //HibernateUtil.getSessionFactory().close();
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
