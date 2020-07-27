
package serviceClient;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieAppOpsService", targetNamespace = "http://services.mycompany.com/", wsdlLocation = "http://localhost:8080/movieServiceApp/MovieAppOpsService?WSDL")
public class MovieAppOpsService
    extends Service
{

    private final static URL MOVIEAPPOPSSERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIEAPPOPSSERVICE_EXCEPTION;
    private final static QName MOVIEAPPOPSSERVICE_QNAME = new QName("http://services.mycompany.com/", "MovieAppOpsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/movieServiceApp/MovieAppOpsService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIEAPPOPSSERVICE_WSDL_LOCATION = url;
        MOVIEAPPOPSSERVICE_EXCEPTION = e;
    }

    public MovieAppOpsService() {
        super(__getWsdlLocation(), MOVIEAPPOPSSERVICE_QNAME);
    }

    public MovieAppOpsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIEAPPOPSSERVICE_QNAME, features);
    }

    public MovieAppOpsService(URL wsdlLocation) {
        super(wsdlLocation, MOVIEAPPOPSSERVICE_QNAME);
    }

    public MovieAppOpsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIEAPPOPSSERVICE_QNAME, features);
    }

    public MovieAppOpsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieAppOpsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieAppOps
     */
    @WebEndpoint(name = "MovieAppOpsPort")
    public MovieAppOps getMovieAppOpsPort() {
        return super.getPort(new QName("http://services.mycompany.com/", "MovieAppOpsPort"), MovieAppOps.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieAppOps
     */
    @WebEndpoint(name = "MovieAppOpsPort")
    public MovieAppOps getMovieAppOpsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.mycompany.com/", "MovieAppOpsPort"), MovieAppOps.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIEAPPOPSSERVICE_EXCEPTION!= null) {
            throw MOVIEAPPOPSSERVICE_EXCEPTION;
        }
        return MOVIEAPPOPSSERVICE_WSDL_LOCATION;
    }

}
