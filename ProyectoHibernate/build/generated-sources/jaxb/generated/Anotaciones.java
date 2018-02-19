//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantacin de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perdern si se vuelve a compilar el esquema de origen. 
// Generado el: AM.02.19 a las 09:08:40 AM CET 
//


package generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Asiento" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Ciudadane" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Madre" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Padre" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PastaFavorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Matrimonio" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                   &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                 &lt;attribute name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asiento"
})
@XmlRootElement(name = "Anotaciones")
public class Anotaciones {

    @XmlElement(name = "Asiento")
    protected List<Anotaciones.Asiento> asiento;

    /**
     * Gets the value of the asiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Anotaciones.Asiento }
     * 
     * 
     */
    public List<Anotaciones.Asiento> getAsiento() {
        if (asiento == null) {
            asiento = new ArrayList<Anotaciones.Asiento>();
        }
        return this.asiento;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Ciudadane" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Madre" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Padre" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PastaFavorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Matrimonio" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}short" />
     *       &lt;attribute name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ciudadane",
        "matrimonio",
        "fecha"
    })
    public static class Asiento {

        @XmlElement(name = "Ciudadane")
        protected List<Anotaciones.Asiento.Ciudadane> ciudadane;
        @XmlElement(name = "Matrimonio")
        protected Byte matrimonio;
        @XmlElement(name = "Fecha")
        protected String fecha;
        @XmlAttribute(name = "ID")
        protected Short id;
        @XmlAttribute(name = "Tipo")
        protected String tipo;

        /**
         * Gets the value of the ciudadane property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ciudadane property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCiudadane().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Anotaciones.Asiento.Ciudadane }
         * 
         * 
         */
        public List<Anotaciones.Asiento.Ciudadane> getCiudadane() {
            if (ciudadane == null) {
                ciudadane = new ArrayList<Anotaciones.Asiento.Ciudadane>();
            }
            return this.ciudadane;
        }

        /**
         * Obtiene el valor de la propiedad matrimonio.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getMatrimonio() {
            return matrimonio;
        }

        /**
         * Define el valor de la propiedad matrimonio.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setMatrimonio(Byte value) {
            this.matrimonio = value;
        }

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecha(String value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getID() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setID(Short value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad tipo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipo() {
            return tipo;
        }

        /**
         * Define el valor de la propiedad tipo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipo(String value) {
            this.tipo = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Madre" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Padre" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PastaFavorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Ciudadane {

            @XmlElementRefs({
                @XmlElementRef(name = "FechaNacimiento", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Apellidos", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Padre", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "PastaFavorita", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Sexo", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Nombre", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "Madre", type = JAXBElement.class, required = false)
            })
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "ID")
            protected Byte id;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link Anotaciones.Asiento.Ciudadane.Padre }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link Anotaciones.Asiento.Ciudadane.Madre }{@code >}
             * {@link String }
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getID() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setID(Byte value) {
                this.id = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Madre {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "ID")
                protected Byte id;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getID() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setID(Byte value) {
                    this.id = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Padre {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "ID")
                protected Byte id;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getID() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setID(Byte value) {
                    this.id = value;
                }

            }

        }

    }

}
