//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.26 at 06:22:17 PM CET 
//


package pl.kolojava.dataset;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dane" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Regon" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Nip" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="StatusNip" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="Uchylony"/>
 *                         &lt;enumeration value="Unieważniony"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Nazwa" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Wojewodztwo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Powiat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Gmina" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Miejscowosc" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="KodPocztowy" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Ulica" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NrNieruchomosci" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NrLokalu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Typ" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SilosID" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DataZakonczeniaDzialalnosci" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MiejscowoscPoczty" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
    "dane"
})
@XmlRootElement(name = "root")
public class DaneSzukajPodmioty {

    protected List<DaneSzukajPodmioty.Dane> dane;

    /**
     * Gets the value of the dane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaneSzukajPodmioty.Dane }
     * 
     * 
     */
    public List<DaneSzukajPodmioty.Dane> getDane() {
        if (dane == null) {
            dane = new ArrayList<DaneSzukajPodmioty.Dane>();
        }
        return this.dane;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Regon" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Nip" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="StatusNip" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value=""/>
     *               &lt;enumeration value="Uchylony"/>
     *               &lt;enumeration value="Unieważniony"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Nazwa" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Wojewodztwo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Powiat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Gmina" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Miejscowosc" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="KodPocztowy" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Ulica" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NrNieruchomosci" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NrLokalu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Typ" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SilosID" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DataZakonczeniaDzialalnosci" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MiejscowoscPoczty" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "regon",
        "nip",
        "statusNip",
        "nazwa",
        "wojewodztwo",
        "powiat",
        "gmina",
        "miejscowosc",
        "kodPocztowy",
        "ulica",
        "nrNieruchomosci",
        "nrLokalu",
        "typ",
        "silosID",
        "dataZakonczeniaDzialalnosci",
        "miejscowoscPoczty"
    })
    public static class Dane {

        @XmlElement(name = "Regon")
        protected String regon;
        @XmlElement(name = "Nip")
        protected String nip;
        @XmlElement(name = "StatusNip")
        protected String statusNip;
        @XmlElement(name = "Nazwa")
        protected String nazwa;
        @XmlElement(name = "Wojewodztwo")
        protected String wojewodztwo;
        @XmlElement(name = "Powiat")
        protected String powiat;
        @XmlElement(name = "Gmina")
        protected String gmina;
        @XmlElement(name = "Miejscowosc")
        protected String miejscowosc;
        @XmlElement(name = "KodPocztowy")
        protected String kodPocztowy;
        @XmlElement(name = "Ulica")
        protected String ulica;
        @XmlElement(name = "NrNieruchomosci")
        protected String nrNieruchomosci;
        @XmlElement(name = "NrLokalu")
        protected String nrLokalu;
        @XmlElement(name = "Typ")
        protected String typ;
        @XmlElement(name = "SilosID")
        protected Integer silosID;
        @XmlElement(name = "DataZakonczeniaDzialalnosci")
        protected XMLGregorianCalendar dataZakonczeniaDzialalnosci;
        @XmlElement(name = "MiejscowoscPoczty")
        protected String miejscowoscPoczty;

        /**
         * Gets the value of the regon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegon() {
            return regon;
        }

        /**
         * Sets the value of the regon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegon(String value) {
            this.regon = value;
        }

        /**
         * Gets the value of the nip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNip() {
            return nip;
        }

        /**
         * Sets the value of the nip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNip(String value) {
            this.nip = value;
        }

        /**
         * Gets the value of the statusNip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusNip() {
            return statusNip;
        }

        /**
         * Sets the value of the statusNip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusNip(String value) {
            this.statusNip = value;
        }

        /**
         * Gets the value of the nazwa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNazwa() {
            return nazwa;
        }

        /**
         * Sets the value of the nazwa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNazwa(String value) {
            this.nazwa = value;
        }

        /**
         * Gets the value of the wojewodztwo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWojewodztwo() {
            return wojewodztwo;
        }

        /**
         * Sets the value of the wojewodztwo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWojewodztwo(String value) {
            this.wojewodztwo = value;
        }

        /**
         * Gets the value of the powiat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPowiat() {
            return powiat;
        }

        /**
         * Sets the value of the powiat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPowiat(String value) {
            this.powiat = value;
        }

        /**
         * Gets the value of the gmina property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGmina() {
            return gmina;
        }

        /**
         * Sets the value of the gmina property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGmina(String value) {
            this.gmina = value;
        }

        /**
         * Gets the value of the miejscowosc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiejscowosc() {
            return miejscowosc;
        }

        /**
         * Sets the value of the miejscowosc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiejscowosc(String value) {
            this.miejscowosc = value;
        }

        /**
         * Gets the value of the kodPocztowy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKodPocztowy() {
            return kodPocztowy;
        }

        /**
         * Sets the value of the kodPocztowy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKodPocztowy(String value) {
            this.kodPocztowy = value;
        }

        /**
         * Gets the value of the ulica property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUlica() {
            return ulica;
        }

        /**
         * Sets the value of the ulica property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUlica(String value) {
            this.ulica = value;
        }

        /**
         * Gets the value of the nrNieruchomosci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrNieruchomosci() {
            return nrNieruchomosci;
        }

        /**
         * Sets the value of the nrNieruchomosci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrNieruchomosci(String value) {
            this.nrNieruchomosci = value;
        }

        /**
         * Gets the value of the nrLokalu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNrLokalu() {
            return nrLokalu;
        }

        /**
         * Sets the value of the nrLokalu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNrLokalu(String value) {
            this.nrLokalu = value;
        }

        /**
         * Gets the value of the typ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTyp() {
            return typ;
        }

        /**
         * Sets the value of the typ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTyp(String value) {
            this.typ = value;
        }

        /**
         * Gets the value of the silosID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSilosID() {
            return silosID;
        }

        /**
         * Sets the value of the silosID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSilosID(Integer value) {
            this.silosID = value;
        }

        /**
         * Gets the value of the dataZakonczeniaDzialalnosci property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataZakonczeniaDzialalnosci() {
            return dataZakonczeniaDzialalnosci;
        }

        /**
         * Sets the value of the dataZakonczeniaDzialalnosci property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataZakonczeniaDzialalnosci(XMLGregorianCalendar value) {
            this.dataZakonczeniaDzialalnosci = value;
        }

        /**
         * Gets the value of the miejscowoscPoczty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiejscowoscPoczty() {
            return miejscowoscPoczty;
        }

        /**
         * Sets the value of the miejscowoscPoczty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiejscowoscPoczty(String value) {
            this.miejscowoscPoczty = value;
        }

    }

}