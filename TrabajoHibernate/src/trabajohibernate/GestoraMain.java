/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajohibernate;

import generated.Asiento;
import java.util.List;

/**
 *
 * @author usuario
 * Descripción: Esta gestora se encargará de procesar la lista de asientos.
 */
public class GestoraMain {
    
    public void realizarActualizaciones(List<Asiento> listaAsientos)
    {
        for(int i=0;i<listaAsientos.size();i++)
        {
            switch(listaAsientos.get(i).getTipo())
            {
                case "Divorcio":
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
