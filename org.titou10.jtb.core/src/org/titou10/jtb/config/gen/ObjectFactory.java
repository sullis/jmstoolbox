//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.08.07 à 09:24:22 AM EDT 
//


package org.titou10.jtb.config.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.titou10.jtb.config.gen package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.titou10.jtb.config.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link SessionDef }
     * 
     */
    public SessionDef createSessionDef() {
        return new SessionDef();
    }

    /**
     * Create an instance of {@link DestinationFilter }
     * 
     */
    public DestinationFilter createDestinationFilter() {
        return new DestinationFilter();
    }

    /**
     * Create an instance of {@link Properties.Property }
     * 
     */
    public Properties.Property createPropertiesProperty() {
        return new Properties.Property();
    }

    /**
     * Create an instance of {@link QManagerDef }
     * 
     */
    public QManagerDef createQManagerDef() {
        return new QManagerDef();
    }

    /**
     * Create an instance of {@link Config }
     * 
     */
    public Config createConfig() {
        return new Config();
    }

}
