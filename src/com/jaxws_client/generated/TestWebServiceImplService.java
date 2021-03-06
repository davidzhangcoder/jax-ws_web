
package com.jaxws_client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TestWebServiceImplService", targetNamespace = "http://jaxws_web.com/", wsdlLocation = "http://localhost:8080/jax-ws_web/test?wsdl")
public class TestWebServiceImplService
    extends Service
{

    private final static URL TESTWEBSERVICEIMPLSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/jax-ws_web/test?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        TESTWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
    }

    public TestWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestWebServiceImplService() {
        super(TESTWEBSERVICEIMPLSERVICE_WSDL_LOCATION, new QName("http://jaxws_web.com/", "TestWebServiceImplService"));
    }

    /**
     * 
     * @return
     *     returns TestWebServiceImpl
     */
    @WebEndpoint(name = "TestWebServiceImplPort")
    public TestWebServiceImpl getTestWebServiceImplPort() {
        return (TestWebServiceImpl)super.getPort(new QName("http://jaxws_web.com/", "TestWebServiceImplPort"), TestWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestWebServiceImpl
     */
    @WebEndpoint(name = "TestWebServiceImplPort")
    public TestWebServiceImpl getTestWebServiceImplPort(WebServiceFeature... features) {
        return (TestWebServiceImpl)super.getPort(new QName("http://jaxws_web.com/", "TestWebServiceImplPort"), TestWebServiceImpl.class, features);
    }

}
