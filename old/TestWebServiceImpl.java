
package com.jaxws_client.generated.old;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TestWebServiceImpl", targetNamespace = "http://jaxws_web.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWebServiceImpl {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:WebServiceMethod1")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "webServiceMethod1", targetNamespace = "http://jaxws_web.com/", className = "com.jaxws_client.generated.WebServiceMethod1")
    @ResponseWrapper(localName = "webServiceMethod1Response", targetNamespace = "http://jaxws_web.com/", className = "com.jaxws_client.generated.WebServiceMethod1Response")
    public String webServiceMethod1();

}
