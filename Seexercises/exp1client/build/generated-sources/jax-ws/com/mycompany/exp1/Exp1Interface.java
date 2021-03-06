
package com.mycompany.exp1;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "exp1_interface", targetNamespace = "http://exp1.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Exp1Interface {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClients", targetNamespace = "http://exp1.mycompany.com/", className = "com.mycompany.exp1.GetClients")
    @ResponseWrapper(localName = "getClientsResponse", targetNamespace = "http://exp1.mycompany.com/", className = "com.mycompany.exp1.GetClientsResponse")
    @Action(input = "http://exp1.mycompany.com/exp1_interface/getClientsRequest", output = "http://exp1.mycompany.com/exp1_interface/getClientsResponse")
    public List<String> getClients();

}
