
package com.amazon.webservices.awsecommerceservice._2013_08_01;

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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Request" minOccurs="0"/>
 *         &lt;element name="CartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URLEncodedHMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PurchaseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileCartURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}Price" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}CartItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SavedForLaterItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SimilarProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}TopSellers" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}NewReleases" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}SimilarViewedProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2013-08-01}OtherCategoriesSimilarProducts" minOccurs="0"/>
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
    "request",
    "cartId",
    "hmac",
    "urlEncodedHMAC",
    "purchaseURL",
    "mobileCartURL",
    "subTotal",
    "cartItems",
    "savedForLaterItems",
    "similarProducts",
    "topSellers",
    "newReleases",
    "similarViewedProducts",
    "otherCategoriesSimilarProducts"
})
@XmlRootElement(name = "Cart")
public class Cart {

    @XmlElement(name = "Request")
    public Request request;
    @XmlElement(name = "CartId", required = true)
    public String cartId;
    @XmlElement(name = "HMAC", required = true)
    public String hmac;
    @XmlElement(name = "URLEncodedHMAC", required = true)
    public String urlEncodedHMAC;
    @XmlElement(name = "PurchaseURL")
    public String purchaseURL;
    @XmlElement(name = "MobileCartURL")
    public String mobileCartURL;
    @XmlElement(name = "SubTotal")
    public Price subTotal;
    @XmlElement(name = "CartItems")
    public CartItems cartItems;
    @XmlElement(name = "SavedForLaterItems")
    public SavedForLaterItems savedForLaterItems;
    @XmlElement(name = "SimilarProducts")
    public SimilarProducts similarProducts;
    @XmlElement(name = "TopSellers")
    public TopSellers topSellers;
    @XmlElement(name = "NewReleases")
    public NewReleases newReleases;
    @XmlElement(name = "SimilarViewedProducts")
    public SimilarViewedProducts similarViewedProducts;
    @XmlElement(name = "OtherCategoriesSimilarProducts")
    public OtherCategoriesSimilarProducts otherCategoriesSimilarProducts;

    /**
     * Gets the value of the request property.
     *
     * @return
     *     possible object is
     *     {@link Request }
     *
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value
     *     allowed object is
     *     {@link Request }
     *
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the cartId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * Sets the value of the cartId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCartId(String value) {
        this.cartId = value;
    }

    /**
     * Gets the value of the hmac property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHMAC() {
        return hmac;
    }

    /**
     * Sets the value of the hmac property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHMAC(String value) {
        this.hmac = value;
    }

    /**
     * Gets the value of the urlEncodedHMAC property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURLEncodedHMAC() {
        return urlEncodedHMAC;
    }

    /**
     * Sets the value of the urlEncodedHMAC property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURLEncodedHMAC(String value) {
        this.urlEncodedHMAC = value;
    }

    /**
     * Gets the value of the purchaseURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPurchaseURL() {
        return purchaseURL;
    }

    /**
     * Sets the value of the purchaseURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPurchaseURL(String value) {
        this.purchaseURL = value;
    }

    /**
     * Gets the value of the mobileCartURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMobileCartURL() {
        return mobileCartURL;
    }

    /**
     * Sets the value of the mobileCartURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMobileCartURL(String value) {
        this.mobileCartURL = value;
    }

    /**
     * Gets the value of the subTotal property.
     *
     * @return
     *     possible object is
     *     {@link Price }
     *
     */
    public Price getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     *
     * @param value
     *     allowed object is
     *     {@link Price }
     *
     */
    public void setSubTotal(Price value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the cartItems property.
     *
     * @return
     *     possible object is
     *     {@link CartItems }
     *
     */
    public CartItems getCartItems() {
        return cartItems;
    }

    /**
     * Sets the value of the cartItems property.
     *
     * @param value
     *     allowed object is
     *     {@link CartItems }
     *
     */
    public void setCartItems(CartItems value) {
        this.cartItems = value;
    }

    /**
     * Gets the value of the savedForLaterItems property.
     *
     * @return
     *     possible object is
     *     {@link SavedForLaterItems }
     *
     */
    public SavedForLaterItems getSavedForLaterItems() {
        return savedForLaterItems;
    }

    /**
     * Sets the value of the savedForLaterItems property.
     *
     * @param value
     *     allowed object is
     *     {@link SavedForLaterItems }
     *
     */
    public void setSavedForLaterItems(SavedForLaterItems value) {
        this.savedForLaterItems = value;
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
     * Gets the value of the topSellers property.
     *
     * @return
     *     possible object is
     *     {@link TopSellers }
     *
     */
    public TopSellers getTopSellers() {
        return topSellers;
    }

    /**
     * Sets the value of the topSellers property.
     *
     * @param value
     *     allowed object is
     *     {@link TopSellers }
     *
     */
    public void setTopSellers(TopSellers value) {
        this.topSellers = value;
    }

    /**
     * Gets the value of the newReleases property.
     *
     * @return
     *     possible object is
     *     {@link NewReleases }
     *
     */
    public NewReleases getNewReleases() {
        return newReleases;
    }

    /**
     * Sets the value of the newReleases property.
     *
     * @param value
     *     allowed object is
     *     {@link NewReleases }
     *
     */
    public void setNewReleases(NewReleases value) {
        this.newReleases = value;
    }

    /**
     * Gets the value of the similarViewedProducts property.
     *
     * @return
     *     possible object is
     *     {@link SimilarViewedProducts }
     *
     */
    public SimilarViewedProducts getSimilarViewedProducts() {
        return similarViewedProducts;
    }

    /**
     * Sets the value of the similarViewedProducts property.
     *
     * @param value
     *     allowed object is
     *     {@link SimilarViewedProducts }
     *
     */
    public void setSimilarViewedProducts(SimilarViewedProducts value) {
        this.similarViewedProducts = value;
    }

    /**
     * Gets the value of the otherCategoriesSimilarProducts property.
     *
     * @return
     *     possible object is
     *     {@link OtherCategoriesSimilarProducts }
     *
     */
    public OtherCategoriesSimilarProducts getOtherCategoriesSimilarProducts() {
        return otherCategoriesSimilarProducts;
    }

    /**
     * Sets the value of the otherCategoriesSimilarProducts property.
     *
     * @param value
     *     allowed object is
     *     {@link OtherCategoriesSimilarProducts }
     *
     */
    public void setOtherCategoriesSimilarProducts(OtherCategoriesSimilarProducts value) {
        this.otherCategoriesSimilarProducts = value;
    }

}
