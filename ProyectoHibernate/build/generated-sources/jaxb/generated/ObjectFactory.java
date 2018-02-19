//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantacin de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perdern si se vuelve a compilar el esquema de origen. 
// Generado el: AM.02.19 a las 09:08:40 AM CET 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnotacionesAsientoCiudadaneNombre_QNAME = new QName("", "Nombre");
    private final static QName _AnotacionesAsientoCiudadaneFechaNacimiento_QNAME = new QName("", "FechaNacimiento");
    private final static QName _AnotacionesAsientoCiudadanePadre_QNAME = new QName("", "Padre");
    private final static QName _AnotacionesAsientoCiudadaneApellidos_QNAME = new QName("", "Apellidos");
    private final static QName _AnotacionesAsientoCiudadanePastaFavorita_QNAME = new QName("", "PastaFavorita");
    private final static QName _AnotacionesAsientoCiudadaneMadre_QNAME = new QName("", "Madre");
    private final static QName _AnotacionesAsientoCiudadaneSexo_QNAME = new QName("", "Sexo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Anotaciones }
     * 
     */
    public Anotaciones createAnotaciones() {
        return new Anotaciones();
    }

    /**
     * Create an instance of {@link Anotaciones.Asiento }
     * 
     */
    public Anotaciones.Asiento createAnotacionesAsiento() {
        return new Anotaciones.Asiento();
    }

    /**
     * Create an instance of {@link Anotaciones.Asiento.Ciudadane }
     * 
     */
    public Anotaciones.Asiento.Ciudadane createAnotacionesAsientoCiudadane() {
        return new Anotaciones.Asiento.Ciudadane();
    }

    /**
     * Create an instance of {@link Anotaciones.Asiento.Ciudadane.Madre }
     * 
     */
    public Anotaciones.Asiento.Ciudadane.Madre createAnotacionesAsientoCiudadaneMadre() {
        return new Anotaciones.Asiento.Ciudadane.Madre();
    }

    /**
     * Create an instance of {@link Anotaciones.Asiento.Ciudadane.Padre }
     * 
     */
    public Anotaciones.Asiento.Ciudadane.Padre createAnotacionesAsientoCiudadanePadre() {
        return new Anotaciones.Asiento.Ciudadane.Padre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Nombre", scope = Anotaciones.Asiento.Ciudadane.class)
    public JAXBElement<String> createAnotacionesAsientoCiudadaneNombre(String value) {
        return new JAXBElement<String>(_AnotacionesAsientoCiudadaneNombre_QNAME, String.class, Anotaciones.Asiento.Ciudadane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FechaNacimiento", scope = Anotaciones.Asiento.Ciudadane.class)
    public JAXBElement<String> createAnotacionesAsientoCiudadaneFechaNacimiento(String value) {
        return new JAXBElement<String>(_AnotacionesAsientoCiudadaneFechaNacimiento_QNAME, String.class, Anotaciones.Asiento.Ciudadane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Anotaciones.Asiento.Ciudadane.Padre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Padre", scope = Anotaciones.Asiento.Ciudadane.class)
    public JAXBElement<Anotaciones.Asiento.Ciudadane.Padre> createAnotacionesAsientoCiudadanePadre(Anotaciones.Asiento.Ciudadane.Padre value) {
        return new JAXBElement<Anotaciones.Asiento.Ciudadane.Padre>(_AnotacionesAsientoCiudadanePadre_QNAME, Anotaciones.Asiento.Ciudadane.Padre.class, Anotaciones.Asiento.Ciudadane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Apellidos", scope = Anotaciones.Asiento.Ciudadane.class)
    public JAXBElement<String> createAnotacionesAsientoCiudadaneApellidos(String value) {
        return new JAXBElement<String>(_AnotacionesAsientoCiudadaneApellidos_QNAME, String.class, Anotaciones.Asiento.Ciudadane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PastaFavorita", scope = Anotaciones.Asiento.Ciudadane.class)
    public JAXBElement<String> createAnotacionesAsientoCiudadanePastaFavorita(String value) {
        return new JAXBElement<String>(_AnotacionesAsientoCiudadanePastaFavorita_QNAME, String.class, Anotaciones.Asiento.Ciudadane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Anotaciones.Asiento.Ciudadane.Madre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Madre", scope = Anotaciones.Asiento.Ciudadane.class)
    public JAXBElement<Anotaciones.Asiento.Ciudadane.Madre> createAnotacionesAsientoCiudadaneMadre(Anotaciones.Asiento.Ciudadane.Madre value) {
        return new JAXBElement<Anotaciones.Asiento.Ciudadane.Madre>(_AnotacionesAsientoCiudadaneMadre_QNAME, Anotaciones.Asiento.Ciudadane.Madre.class, Anotaciones.Asiento.Ciudadane.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Sexo", scope = Anotaciones.Asiento.Ciudadane.class)
    public JAXBElement<String> createAnotacionesAsientoCiudadaneSexo(String value) {
        return new JAXBElement<String>(_AnotacionesAsientoCiudadaneSexo_QNAME, String.class, Anotaciones.Asiento.Ciudadane.class, value);
    }

}
