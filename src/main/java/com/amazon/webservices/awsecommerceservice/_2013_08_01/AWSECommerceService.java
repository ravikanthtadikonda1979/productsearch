
/*
 *
 */

package com.amazon.webservices.awsecommerceservice._2013_08_01;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.1.2
 * Sun Feb 25 18:08:44 GMT 2018
 * Generated source version: 2.1.2
 *
 */


@WebServiceClient(name = "AWSECommerceService",
                  wsdlLocation = "file:/Users/kiran.tadikonda/Downloads/productsearch/src/main/resources/wsdl/AWSECommerceService.wsdl",
                  targetNamespace = "http://webservices.amazon.com/AWSECommerceService/2013-08-01")
public class AWSECommerceService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceService");
    public final static QName AWSECommerceServicePortCA = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortCA");
    public final static QName AWSECommerceServicePortES = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortES");
    public final static QName AWSECommerceServicePortUS = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortUS");
    public final static QName AWSECommerceServicePortDE = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortDE");
    public final static QName AWSECommerceServicePort = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePort");
    public final static QName AWSECommerceServicePortIN = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortIN");
    public final static QName AWSECommerceServicePortJP = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortJP");
    public final static QName AWSECommerceServicePortUK = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortUK");
    public final static QName AWSECommerceServicePortCN = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortCN");
    public final static QName AWSECommerceServicePortIT = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortIT");
    public final static QName AWSECommerceServicePortFR = new QName("http://webservices.amazon.com/AWSECommerceService/2013-08-01", "AWSECommerceServicePortFR");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/kiran.tadikonda/Downloads/productsearch/src/main/resources/wsdl/AWSECommerceService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/Users/kiran.tadikonda/Downloads/productsearch/src/main/resources/wsdl/AWSECommerceService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public AWSECommerceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AWSECommerceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AWSECommerceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortCA")
    public AWSECommerceServicePortType getAWSECommerceServicePortCA() {
        return super.getPort(AWSECommerceServicePortCA, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortCA")
    public AWSECommerceServicePortType getAWSECommerceServicePortCA(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortCA, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortES")
    public AWSECommerceServicePortType getAWSECommerceServicePortES() {
        return super.getPort(AWSECommerceServicePortES, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortES")
    public AWSECommerceServicePortType getAWSECommerceServicePortES(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortES, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortUS")
    public AWSECommerceServicePortType getAWSECommerceServicePortUS() {
        return super.getPort(AWSECommerceServicePortUS, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortUS")
    public AWSECommerceServicePortType getAWSECommerceServicePortUS(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortUS, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortDE")
    public AWSECommerceServicePortType getAWSECommerceServicePortDE() {
        return super.getPort(AWSECommerceServicePortDE, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortDE")
    public AWSECommerceServicePortType getAWSECommerceServicePortDE(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortDE, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePort")
    public AWSECommerceServicePortType getAWSECommerceServicePort() {
        return super.getPort(AWSECommerceServicePort, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePort")
    public AWSECommerceServicePortType getAWSECommerceServicePort(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePort, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortIN")
    public AWSECommerceServicePortType getAWSECommerceServicePortIN() {
        return super.getPort(AWSECommerceServicePortIN, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortIN")
    public AWSECommerceServicePortType getAWSECommerceServicePortIN(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortIN, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortJP")
    public AWSECommerceServicePortType getAWSECommerceServicePortJP() {
        return super.getPort(AWSECommerceServicePortJP, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortJP")
    public AWSECommerceServicePortType getAWSECommerceServicePortJP(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortJP, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortUK")
    public AWSECommerceServicePortType getAWSECommerceServicePortUK() {
        return super.getPort(AWSECommerceServicePortUK, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortUK")
    public AWSECommerceServicePortType getAWSECommerceServicePortUK(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortUK, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortCN")
    public AWSECommerceServicePortType getAWSECommerceServicePortCN() {
        return super.getPort(AWSECommerceServicePortCN, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortCN")
    public AWSECommerceServicePortType getAWSECommerceServicePortCN(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortCN, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortIT")
    public AWSECommerceServicePortType getAWSECommerceServicePortIT() {
        return super.getPort(AWSECommerceServicePortIT, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortIT")
    public AWSECommerceServicePortType getAWSECommerceServicePortIT(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortIT, AWSECommerceServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortFR")
    public AWSECommerceServicePortType getAWSECommerceServicePortFR() {
        return super.getPort(AWSECommerceServicePortFR, AWSECommerceServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AWSECommerceServicePortType
     */
    @WebEndpoint(name = "AWSECommerceServicePortFR")
    public AWSECommerceServicePortType getAWSECommerceServicePortFR(WebServiceFeature... features) {
        return super.getPort(AWSECommerceServicePortFR, AWSECommerceServicePortType.class, features);
    }

}
