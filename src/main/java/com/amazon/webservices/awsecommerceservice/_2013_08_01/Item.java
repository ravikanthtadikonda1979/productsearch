
package com.amazon.webservices.awsecommerceservice._2013_08_01;

import groovy.transform.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParentASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Errors" minOccurs="0"/>
 *         &lt;element name="DetailPageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemLinks" minOccurs="0"/>
 *         &lt;element name="SalesRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmallImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="MediumImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="LargeImage" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Image" minOccurs="0"/>
 *         &lt;element name="ImageSets" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ImageSet" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ItemAttributes" minOccurs="0"/>
 *         &lt;element name="VariationAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}VariationAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}RelatedItems" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Collections" minOccurs="0"/>
 *         &lt;element name="Subjects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OfferSummary" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Offers" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}RentalOffers" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}VariationSummary" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Variations" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}CustomerReviews" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}EditorialReviews" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SimilarProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Accessories" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Tracks" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}BrowseNodes" minOccurs="0"/>
 *         &lt;element name="AlternateVersions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AlternateVersion" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
    "asin",
    "parentASIN",
    "errors",
    "detailPageURL",
    "itemLinks",
    "salesRank",
    "smallImage",
    "mediumImage",
    "largeImage",
    "imageSets",
    "itemAttributes",
    "variationAttributes",
    "relatedItems",
    "collections",
    "subjects",
    "offerSummary",
    "offers",
    "rentalOffers",
    "variationSummary",
    "variations",
    "customerReviews",
    "editorialReviews",
    "similarProducts",
    "accessories",
    "tracks",
    "browseNodes",
    "alternateVersions"
})
@XmlRootElement(name = "Item")
public class Item {

    @XmlElement(name = "ASIN", required = true)
    public String asin;
    @XmlElement(name = "ParentASIN")
    public String parentASIN;
    @XmlElement(name = "Errors")
    public Errors errors;
    @XmlElement(name = "DetailPageURL")
    public String detailPageURL;
    @XmlElement(name = "ItemLinks")
    public ItemLinks itemLinks;
    @XmlElement(name = "SalesRank")
    public String salesRank;
    @XmlElement(name = "SmallImage")
    public Image smallImage;
    @XmlElement(name = "MediumImage")
    public Image mediumImage;
    @XmlElement(name = "LargeImage")
    public Image largeImage;
    @XmlElement(name = "ImageSets")
    public List<ImageSets> imageSets;
    @XmlElement(name = "ItemAttributes")
    public ItemAttributes itemAttributes;
    @XmlElement(name = "VariationAttributes")
    public VariationAttributes variationAttributes;
    @XmlElement(name = "RelatedItems")
    public List<RelatedItems> relatedItems;
    @XmlElement(name = "Collections")
    public Collections collections;
    @XmlElement(name = "Subjects")
    public Subjects subjects;
    @XmlElement(name = "OfferSummary")
    public OfferSummary offerSummary;
    @XmlElement(name = "Offers")
    public Offers offers;
    @XmlElement(name = "RentalOffers")
    public RentalOffers rentalOffers;
    @XmlElement(name = "VariationSummary")
    public VariationSummary variationSummary;
    @XmlElement(name = "Variations")
    public Variations variations;
    @XmlElement(name = "CustomerReviews")
    public CustomerReviews customerReviews;
    @XmlElement(name = "EditorialReviews")
    public EditorialReviews editorialReviews;
    @XmlElement(name = "SimilarProducts")
    public SimilarProducts similarProducts;
    @XmlElement(name = "Accessories")
    public Accessories accessories;
    @XmlElement(name = "Tracks")
    public Tracks tracks;
    @XmlElement(name = "BrowseNodes")
    public BrowseNodes browseNodes;
    @XmlElement(name = "AlternateVersions")
    public AlternateVersions alternateVersions;

    /**
     * Gets the value of the asin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Sets the value of the asin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setASIN(String value) {
        this.asin = value;
    }

    /**
     * Gets the value of the parentASIN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentASIN() {
        return parentASIN;
    }

    /**
     * Sets the value of the parentASIN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentASIN(String value) {
        this.parentASIN = value;
    }

    /**
     * Gets the value of the errors property.
     *
     * @return
     *     possible object is
     *     {@link Errors }
     *
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     *
     * @param value
     *     allowed object is
     *     {@link Errors }
     *
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the detailPageURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDetailPageURL() {
        return detailPageURL;
    }

    /**
     * Sets the value of the detailPageURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDetailPageURL(String value) {
        this.detailPageURL = value;
    }

    /**
     * Gets the value of the itemLinks property.
     *
     * @return
     *     possible object is
     *     {@link ItemLinks }
     *
     */
    public ItemLinks getItemLinks() {
        return itemLinks;
    }

    /**
     * Sets the value of the itemLinks property.
     *
     * @param value
     *     allowed object is
     *     {@link ItemLinks }
     *
     */
    public void setItemLinks(ItemLinks value) {
        this.itemLinks = value;
    }

    /**
     * Gets the value of the salesRank property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesRank() {
        return salesRank;
    }

    /**
     * Sets the value of the salesRank property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesRank(String value) {
        this.salesRank = value;
    }

    /**
     * Gets the value of the smallImage property.
     *
     * @return
     *     possible object is
     *     {@link Image }
     *
     */
    public Image getSmallImage() {
        return smallImage;
    }

    /**
     * Sets the value of the smallImage property.
     *
     * @param value
     *     allowed object is
     *     {@link Image }
     *
     */
    public void setSmallImage(Image value) {
        this.smallImage = value;
    }

    /**
     * Gets the value of the mediumImage property.
     *
     * @return
     *     possible object is
     *     {@link Image }
     *
     */
    public Image getMediumImage() {
        return mediumImage;
    }

    /**
     * Sets the value of the mediumImage property.
     *
     * @param value
     *     allowed object is
     *     {@link Image }
     *
     */
    public void setMediumImage(Image value) {
        this.mediumImage = value;
    }

    /**
     * Gets the value of the largeImage property.
     *
     * @return
     *     possible object is
     *     {@link Image }
     *
     */
    public Image getLargeImage() {
        return largeImage;
    }

    /**
     * Sets the value of the largeImage property.
     *
     * @param value
     *     allowed object is
     *     {@link Image }
     *
     */
    public void setLargeImage(Image value) {
        this.largeImage = value;
    }

    /**
     * Gets the value of the imageSets property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageSets property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageSets().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageSets }
     *
     *
     */
    public List<ImageSets> getImageSets() {
        if (imageSets == null) {
            imageSets = new ArrayList<ImageSets>();
        }
        return this.imageSets;
    }

    /**
     * Gets the value of the itemAttributes property.
     *
     * @return
     *     possible object is
     *     {@link ItemAttributes }
     *
     */
    public ItemAttributes getItemAttributes() {
        return itemAttributes;
    }

    /**
     * Sets the value of the itemAttributes property.
     *
     * @param value
     *     allowed object is
     *     {@link ItemAttributes }
     *
     */
    public void setItemAttributes(ItemAttributes value) {
        this.itemAttributes = value;
    }

    /**
     * Gets the value of the variationAttributes property.
     *
     * @return
     *     possible object is
     *     {@link VariationAttributes }
     *
     */
    public VariationAttributes getVariationAttributes() {
        return variationAttributes;
    }

    /**
     * Sets the value of the variationAttributes property.
     *
     * @param value
     *     allowed object is
     *     {@link VariationAttributes }
     *
     */
    public void setVariationAttributes(VariationAttributes value) {
        this.variationAttributes = value;
    }

    /**
     * Gets the value of the relatedItems property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItems property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItems().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItems }
     *
     *
     */
    public List<RelatedItems> getRelatedItems() {
        if (relatedItems == null) {
            relatedItems = new ArrayList<RelatedItems>();
        }
        return this.relatedItems;
    }

    /**
     * Gets the value of the collections property.
     *
     * @return
     *     possible object is
     *     {@link Collections }
     *
     */
    public Collections getCollections() {
        return collections;
    }

    /**
     * Sets the value of the collections property.
     *
     * @param value
     *     allowed object is
     *     {@link Collections }
     *
     */
    public void setCollections(Collections value) {
        this.collections = value;
    }

    /**
     * Gets the value of the subjects property.
     *
     * @return
     *     possible object is
     *     {@link Subjects }
     *
     */
    public Subjects getSubjects() {
        return subjects;
    }

    /**
     * Sets the value of the subjects property.
     *
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *
     */
    public void setSubjects(Subjects value) {
        this.subjects = value;
    }

    /**
     * Gets the value of the offerSummary property.
     *
     * @return
     *     possible object is
     *     {@link OfferSummary }
     *
     */
    public OfferSummary getOfferSummary() {
        return offerSummary;
    }

    /**
     * Sets the value of the offerSummary property.
     *
     * @param value
     *     allowed object is
     *     {@link OfferSummary }
     *
     */
    public void setOfferSummary(OfferSummary value) {
        this.offerSummary = value;
    }

    /**
     * Gets the value of the offers property.
     *
     * @return
     *     possible object is
     *     {@link Offers }
     *
     */
    public Offers getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     *
     * @param value
     *     allowed object is
     *     {@link Offers }
     *
     */
    public void setOffers(Offers value) {
        this.offers = value;
    }

    /**
     * Gets the value of the rentalOffers property.
     *
     * @return
     *     possible object is
     *     {@link RentalOffers }
     *
     */
    public RentalOffers getRentalOffers() {
        return rentalOffers;
    }

    /**
     * Sets the value of the rentalOffers property.
     *
     * @param value
     *     allowed object is
     *     {@link RentalOffers }
     *
     */
    public void setRentalOffers(RentalOffers value) {
        this.rentalOffers = value;
    }

    /**
     * Gets the value of the variationSummary property.
     *
     * @return
     *     possible object is
     *     {@link VariationSummary }
     *
     */
    public VariationSummary getVariationSummary() {
        return variationSummary;
    }

    /**
     * Sets the value of the variationSummary property.
     *
     * @param value
     *     allowed object is
     *     {@link VariationSummary }
     *
     */
    public void setVariationSummary(VariationSummary value) {
        this.variationSummary = value;
    }

    /**
     * Gets the value of the variations property.
     *
     * @return
     *     possible object is
     *     {@link Variations }
     *
     */
    public Variations getVariations() {
        return variations;
    }

    /**
     * Sets the value of the variations property.
     *
     * @param value
     *     allowed object is
     *     {@link Variations }
     *
     */
    public void setVariations(Variations value) {
        this.variations = value;
    }

    /**
     * Gets the value of the customerReviews property.
     *
     * @return
     *     possible object is
     *     {@link CustomerReviews }
     *
     */
    public CustomerReviews getCustomerReviews() {
        return customerReviews;
    }

    /**
     * Sets the value of the customerReviews property.
     *
     * @param value
     *     allowed object is
     *     {@link CustomerReviews }
     *
     */
    public void setCustomerReviews(CustomerReviews value) {
        this.customerReviews = value;
    }

    /**
     * Gets the value of the editorialReviews property.
     *
     * @return
     *     possible object is
     *     {@link EditorialReviews }
     *
     */
    public EditorialReviews getEditorialReviews() {
        return editorialReviews;
    }

    /**
     * Sets the value of the editorialReviews property.
     *
     * @param value
     *     allowed object is
     *     {@link EditorialReviews }
     *
     */
    public void setEditorialReviews(EditorialReviews value) {
        this.editorialReviews = value;
    }

    /**
     * Gets the value of the similarProducts property.
     *
     * @return
     *     possible object is
     *     {@link SimilarProducts }
     *
     */
    public SimilarProducts getSimilarProducts() {
        return similarProducts;
    }

    /**
     * Sets the value of the similarProducts property.
     *
     * @param value
     *     allowed object is
     *     {@link SimilarProducts }
     *
     */
    public void setSimilarProducts(SimilarProducts value) {
        this.similarProducts = value;
    }

    /**
     * Gets the value of the accessories property.
     *
     * @return
     *     possible object is
     *     {@link Accessories }
     *
     */
    public Accessories getAccessories() {
        return accessories;
    }

    /**
     * Sets the value of the accessories property.
     *
     * @param value
     *     allowed object is
     *     {@link Accessories }
     *
     */
    public void setAccessories(Accessories value) {
        this.accessories = value;
    }

    /**
     * Gets the value of the tracks property.
     *
     * @return
     *     possible object is
     *     {@link Tracks }
     *
     */
    public Tracks getTracks() {
        return tracks;
    }

    /**
     * Sets the value of the tracks property.
     *
     * @param value
     *     allowed object is
     *     {@link Tracks }
     *
     */
    public void setTracks(Tracks value) {
        this.tracks = value;
    }

    /**
     * Gets the value of the browseNodes property.
     *
     * @return
     *     possible object is
     *     {@link BrowseNodes }
     *
     */
    public BrowseNodes getBrowseNodes() {
        return browseNodes;
    }

    /**
     * Sets the value of the browseNodes property.
     *
     * @param value
     *     allowed object is
     *     {@link BrowseNodes }
     *
     */
    public void setBrowseNodes(BrowseNodes value) {
        this.browseNodes = value;
    }

    /**
     * Gets the value of the alternateVersions property.
     *
     * @return
     *     possible object is
     *     {@link AlternateVersions }
     *
     */
    public AlternateVersions getAlternateVersions() {
        return alternateVersions;
    }

    /**
     * Sets the value of the alternateVersions property.
     *
     * @param value
     *     allowed object is
     *     {@link AlternateVersions }
     *
     */
    public void setAlternateVersions(AlternateVersions value) {
        this.alternateVersions = value;
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
     *         &lt;element name="AlternateVersion" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "alternateVersion"
    })
    public static class AlternateVersions {

        @XmlElement(name = "AlternateVersion")
        public List<AlternateVersion> alternateVersion;

        /**
         * Gets the value of the alternateVersion property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateVersion property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateVersion().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AlternateVersion }
         *
         *
         */
        public List<AlternateVersion> getAlternateVersion() {
            if (alternateVersion == null) {
                alternateVersion = new ArrayList<AlternateVersion>();
            }
            return this.alternateVersion;
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
         *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "asin",
            "title",
            "binding"
        })
        public static class AlternateVersion {

            @XmlElement(name = "ASIN", required = true)
            public String asin;
            @XmlElement(name = "Title")
            public String title;
            @XmlElement(name = "Binding")
            public String binding;

            /**
             * Gets the value of the asin property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getASIN() {
                return asin;
            }

            /**
             * Sets the value of the asin property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setASIN(String value) {
                this.asin = value;
            }

            /**
             * Gets the value of the title property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the binding property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBinding() {
                return binding;
            }

            /**
             * Sets the value of the binding property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBinding(String value) {
                this.binding = value;
            }

        }

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
     *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}ImageSet" maxOccurs="unbounded" minOccurs="0"/>
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
        "imageSet"
    })
    public static class ImageSets {

        @XmlElement(name = "ImageSet")
        public List<ImageSet> imageSet;

        /**
         * Gets the value of the imageSet property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the imageSet property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImageSet().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImageSet }
         *
         *
         */
        public List<ImageSet> getImageSet() {
            if (imageSet == null) {
                imageSet = new ArrayList<ImageSet>();
            }
            return this.imageSet;
        }

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
     *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "subject"
    })
    public static class Subjects {

        @XmlElement(name = "Subject")
        public List<String> subject;

        /**
         * Gets the value of the subject property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subject property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubject().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getSubject() {
            if (subject == null) {
                subject = new ArrayList<String>();
            }
            return this.subject;
        }

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
     *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}VariationAttribute" maxOccurs="unbounded" minOccurs="0"/>
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
        "variationAttribute"
    })
    public static class VariationAttributes {

        @XmlElement(name = "VariationAttribute")
        public List<VariationAttribute> variationAttribute;

        /**
         * Gets the value of the variationAttribute property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variationAttribute property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariationAttribute().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VariationAttribute }
         *
         *
         */
        public List<VariationAttribute> getVariationAttribute() {
            if (variationAttribute == null) {
                variationAttribute = new ArrayList<VariationAttribute>();
            }
            return this.variationAttribute;
        }

    }

    @Override
    public String toString() {
        return "Item{" +
                "asin='" + asin + '\'' +
                ", parentASIN='" + parentASIN + '\'' +
                ", errors=" + errors +
                ", detailPageURL='" + detailPageURL + '\'' +
                ", itemLinks=" + itemLinks +
                ", salesRank='" + salesRank + '\'' +
                ", smallImage=" + smallImage +
                ", mediumImage=" + mediumImage +
                ", largeImage=" + largeImage +
                ", imageSets=" + imageSets +
                ", itemAttributes=" + itemAttributes +
                ", variationAttributes=" + variationAttributes +
                ", relatedItems=" + relatedItems +
                ", collections=" + collections +
                ", subjects=" + subjects +
                ", offerSummary=" + offerSummary +
                ", offers=" + offers +
                ", rentalOffers=" + rentalOffers +
                ", variationSummary=" + variationSummary +
                ", variations=" + variations +
                ", customerReviews=" + customerReviews +
                ", editorialReviews=" + editorialReviews +
                ", similarProducts=" + similarProducts +
                ", accessories=" + accessories +
                ", tracks=" + tracks +
                ", browseNodes=" + browseNodes +
                ", alternateVersions=" + alternateVersions +
                '}';
    }
}