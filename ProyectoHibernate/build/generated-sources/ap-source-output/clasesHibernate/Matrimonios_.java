package clasesHibernate;

import clasesHibernate.Ciudadanes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-19T09:33:34")
@StaticMetamodel(Matrimonios.class)
public class Matrimonios_ { 

    public static volatile SingularAttribute<Matrimonios, Ciudadanes> iDConyuge1;
    public static volatile SingularAttribute<Matrimonios, Ciudadanes> iDConyuge2;
    public static volatile SingularAttribute<Matrimonios, Date> fechamatrimonio;
    public static volatile SingularAttribute<Matrimonios, Date> fechafin;
    public static volatile SingularAttribute<Matrimonios, Integer> id;

}