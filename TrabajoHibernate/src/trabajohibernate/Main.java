/*
 * Hecho por Alejandro Gómez y Pablo Jarana.
Descripción: El programa se encargará de leer ficheros XML según el nombre indicaod por el usuario
y registrará en la base de datos los acontecimientos. En caso de producirse algún tipo de error,
el programa, recogerá esos errores en una coelcción de incidencia y lo volcará sobre un archivo XML nuevo.


Pseudocódigo generalizado:

INICIO
    LeerYValidarSiQuiereLeerFichero
    Mientras quiera leer ficheros
       LeerYValidarNombreFichero
       Procesar Fichero
       RealizarActualizacionesBADATYRegogerIncidencias
       CrearNuevo XML con Incidencias
       LeerYValidarSiQuiereLeerOtroFichero
    Fin_Mientras   
FIN
 */
package trabajohibernate;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.hibernate.Session;

/**
 *
 * @author usuario
 */
public class Main {

    
    /*
    Descripción: Imprime las opciones que puede elegir el usuario
    Precondiciones:No hay
    Entrada:No hay
    Salida: No hay
    E/S: No hay
    Postcondiciones: No hay
    */
    public static void imprimirOpciones()
    {
        System.out.println("Indique lo que desea hacer: ");
        System.out.println("1.- Leer un fichero de Registro");
        System.out.println("0.- Salir");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaraciones
        GestoraAsientos gestoraAsientos=new GestoraAsientos();
        GestoraMain gestoraMain=new GestoraMain();
        InputStreamReader corriente=new InputStreamReader(System.in);
        BufferedReader tecladoString=new BufferedReader(corriente);
        String nombreArchivo;
        File archivoAProcesar;
        Scanner teclado=new Scanner(System.in);
        Session ses= HibernateUtil.getSessionFactory().openSession();
        int opcion;
        
        //LeerYValidarSiQuiereLeerFichero
        do
        {
            imprimirOpciones();
            try
            {
                opcion=teclado.nextInt();
            }catch(InputMismatchException e)
            {
                System.out.println("Introduzca el número de la opcion por favor");
                opcion=-1;
                teclado=new Scanner(System.in);
            }
        }while(opcion<0||opcion>1);
        //FIN_LeerYValidarSiQuiereLeerFichero
        //Mientras quiera leer fichero
        while(opcion==1)
        {
            //LeerYValidarNombreFichero
            do
            {
                System.out.println("Introduzca el nombre del fichero que desea procesar: ");
                try {
                    nombreArchivo=tecladoString.readLine();
                } catch (IOException ex) {
                    System.out.println("Hubo algún error: "+ex);
                    nombreArchivo="";
                }
                archivoAProcesar=new File("src\\trabajoHibernate\\"+nombreArchivo+".xml");
                if(nombreArchivo.equals("")||!archivoAProcesar.exists()||archivoAProcesar.isDirectory())
                {
                    System.out.println("El fichero indicado no existe");
                }
            }while(nombreArchivo.equals("")||!archivoAProcesar.exists()||archivoAProcesar.isDirectory());
            //Fin_LeerYValidarNombreFichero
            //JAXB A JIERRO DE POWER
            gestoraAsientos.obtenerListaAnotacionesDeXML(archivoAProcesar);
            gestoraMain.realizarActualizaciones(gestoraAsientos.getListaAsientos(),ses);
            
            //LeerYValidarSiQuiereLeerFichero
            do
            {
                imprimirOpciones();
                try
                {
                    opcion=teclado.nextInt();
                }catch(InputMismatchException e)
                {
                    System.out.println("Introduzca el número de la opcion por favor");
                    opcion=-1;
                    teclado=new Scanner(System.in);
                }
            }while(opcion<0||opcion>1);
            //FIN_LeerYValidarSiQuiereLeerFichero
        }
        //Fin_Mientras
        ses.close();
        HibernateUtil.getSessionFactory().close();
    }//FIN
    
}
