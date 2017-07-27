
package introsde.storage.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StorageService", targetNamespace = "http://ws.storage.introsde/", wsdlLocation = "http://10.218.204.126:6904/storage?wsdl")
public class StorageService
    extends Service
{

    private final static URL STORAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException STORAGESERVICE_EXCEPTION;
    private final static QName STORAGESERVICE_QNAME = new QName("http://ws.storage.introsde/", "StorageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.218.204.126:6904/storage?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STORAGESERVICE_WSDL_LOCATION = url;
        STORAGESERVICE_EXCEPTION = e;
    }

    public StorageService() {
        super(__getWsdlLocation(), STORAGESERVICE_QNAME);
    }

    public StorageService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STORAGESERVICE_QNAME, features);
    }

    public StorageService(URL wsdlLocation) {
        super(wsdlLocation, STORAGESERVICE_QNAME);
    }

    public StorageService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STORAGESERVICE_QNAME, features);
    }

    public StorageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StorageService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Storage
     */
    @WebEndpoint(name = "StorageImplPort")
    public Storage getStorageImplPort() {
        return super.getPort(new QName("http://ws.storage.introsde/", "StorageImplPort"), Storage.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Storage
     */
    @WebEndpoint(name = "StorageImplPort")
    public Storage getStorageImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.storage.introsde/", "StorageImplPort"), Storage.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STORAGESERVICE_EXCEPTION!= null) {
            throw STORAGESERVICE_EXCEPTION;
        }
        return STORAGESERVICE_WSDL_LOCATION;
    }

}
