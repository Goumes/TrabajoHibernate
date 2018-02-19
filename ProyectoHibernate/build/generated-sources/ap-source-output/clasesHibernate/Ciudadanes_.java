package clasesHibernate;

import clasesHibernate.Ciudadanes;
import clasesHibernate.Matrimonios;
import clasesHibernate.Pastas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-19T09:44:54")
@StaticMetamodel(Ciudadanes.class)
public class Ciudadanes_ { 

    public static volatile SingularAttribute<Ciudadanes, String> apellidos;
    public static volatile SingularAttribute<Ciudadanes, Date> fechamuerte;
    public static volatile SingularAttribute<Ciudadanes, Ciudadanes> iDpadre;
    public static volatile SingularAttribute<Ciudadanes, Short> kGpasta;
    public static volatile CollectionAttribute<Ciudadanes, Matrimonios> matrimoniosCollection;
    public static volatile SingularAttribute<Ciudadanes, String> nombre;
    public static volatile SingularAttribute<Ciudadanes, Ciudadanes> iDmadre;
    public static volatile SingularAttribute<Ciudadanes, Pastas> pastafavorita;
    public static volatile CollectionAttribute<Ciudadanes, Ciudadanes> ciudadanesCollection1;
    public static volatile CollectionAttribute<Ciudadanes, Matrimonios> matrimoniosCollection1;
    public static volatile SingularAttribute<Ciudadanes, Date> fechanacimiento;
    public static volatile CollectionAttribute<Ciudadanes, Ciudadanes> ciudadanesCollection;
    public static volatile SingularAttribute<Ciudadanes, Integer> id;
    public static volatile SingularAttribute<Ciudadanes, Character> sexo;

}