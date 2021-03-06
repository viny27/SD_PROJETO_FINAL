
package ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServidorWeb", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServidorWeb {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addRestaurante", targetNamespace = "http://ws/", className = "ws.client.AddRestaurante")
    @ResponseWrapper(localName = "addRestauranteResponse", targetNamespace = "http://ws/", className = "ws.client.AddRestauranteResponse")
    @Action(input = "http://ws/ServidorWeb/addRestauranteRequest", output = "http://ws/ServidorWeb/addRestauranteResponse")
    public String addRestaurante(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        short arg2);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCinema", targetNamespace = "http://ws/", className = "ws.client.AddCinema")
    @ResponseWrapper(localName = "addCinemaResponse", targetNamespace = "http://ws/", className = "ws.client.AddCinemaResponse")
    @Action(input = "http://ws/ServidorWeb/addCinemaRequest", output = "http://ws/ServidorWeb/addCinemaResponse")
    public String addCinema(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        short arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        short arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        short arg5);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addTeatro", targetNamespace = "http://ws/", className = "ws.client.AddTeatro")
    @ResponseWrapper(localName = "addTeatroResponse", targetNamespace = "http://ws/", className = "ws.client.AddTeatroResponse")
    @Action(input = "http://ws/ServidorWeb/addTeatroRequest", output = "http://ws/ServidorWeb/addTeatroResponse")
    public String addTeatro(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        short arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        short arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        short arg5);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "recuperaRestaurante", targetNamespace = "http://ws/", className = "ws.client.RecuperaRestaurante")
    @ResponseWrapper(localName = "recuperaRestauranteResponse", targetNamespace = "http://ws/", className = "ws.client.RecuperaRestauranteResponse")
    @Action(input = "http://ws/ServidorWeb/recuperaRestauranteRequest", output = "http://ws/ServidorWeb/recuperaRestauranteResponse")
    public String recuperaRestaurante(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "recuperaCinema", targetNamespace = "http://ws/", className = "ws.client.RecuperaCinema")
    @ResponseWrapper(localName = "recuperaCinemaResponse", targetNamespace = "http://ws/", className = "ws.client.RecuperaCinemaResponse")
    @Action(input = "http://ws/ServidorWeb/recuperaCinemaRequest", output = "http://ws/ServidorWeb/recuperaCinemaResponse")
    public String recuperaCinema(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        short arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        short arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "recuperaTeatro", targetNamespace = "http://ws/", className = "ws.client.RecuperaTeatro")
    @ResponseWrapper(localName = "recuperaTeatroResponse", targetNamespace = "http://ws/", className = "ws.client.RecuperaTeatroResponse")
    @Action(input = "http://ws/ServidorWeb/recuperaTeatroRequest", output = "http://ws/ServidorWeb/recuperaTeatroResponse")
    public String recuperaTeatro(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        short arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        short arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reservarRestaurante", targetNamespace = "http://ws/", className = "ws.client.ReservarRestaurante")
    @ResponseWrapper(localName = "reservarRestauranteResponse", targetNamespace = "http://ws/", className = "ws.client.ReservarRestauranteResponse")
    @Action(input = "http://ws/ServidorWeb/reservarRestauranteRequest", output = "http://ws/ServidorWeb/reservarRestauranteResponse")
    public String reservarRestaurante(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "comprarIngressoCinema", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoCinema")
    @ResponseWrapper(localName = "comprarIngressoCinemaResponse", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoCinemaResponse")
    @Action(input = "http://ws/ServidorWeb/comprarIngressoCinemaRequest", output = "http://ws/ServidorWeb/comprarIngressoCinemaResponse")
    public String comprarIngressoCinema(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        short arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        short arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "comprarIngressoTeatro", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoTeatro")
    @ResponseWrapper(localName = "comprarIngressoTeatroResponse", targetNamespace = "http://ws/", className = "ws.client.ComprarIngressoTeatroResponse")
    @Action(input = "http://ws/ServidorWeb/comprarIngressoTeatroRequest", output = "http://ws/ServidorWeb/comprarIngressoTeatroResponse")
    public String comprarIngressoTeatro(
        @WebParam(name = "arg0", targetNamespace = "")
        short arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        short arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        short arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

}
