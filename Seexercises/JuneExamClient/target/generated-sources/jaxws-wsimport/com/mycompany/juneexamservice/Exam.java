
package com.mycompany.juneexamservice;

import java.util.List;
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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Exam", targetNamespace = "http://juneexamservice.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Exam {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.mycompany.juneexamservice.Director
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDirector", targetNamespace = "http://juneexamservice.mycompany.com/", className = "com.mycompany.juneexamservice.GetDirector")
    @ResponseWrapper(localName = "getDirectorResponse", targetNamespace = "http://juneexamservice.mycompany.com/", className = "com.mycompany.juneexamservice.GetDirectorResponse")
    @Action(input = "http://juneexamservice.mycompany.com/Exam/getDirectorRequest", output = "http://juneexamservice.mycompany.com/Exam/getDirectorResponse")
    public Director getDirector(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.mycompany.juneexamservice.Movie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovie", targetNamespace = "http://juneexamservice.mycompany.com/", className = "com.mycompany.juneexamservice.GetMovie")
    @ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://juneexamservice.mycompany.com/", className = "com.mycompany.juneexamservice.GetMovieResponse")
    @Action(input = "http://juneexamservice.mycompany.com/Exam/getMovieRequest", output = "http://juneexamservice.mycompany.com/Exam/getMovieResponse")
    public Movie getMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovies", targetNamespace = "http://juneexamservice.mycompany.com/", className = "com.mycompany.juneexamservice.GetMovies")
    @ResponseWrapper(localName = "getMoviesResponse", targetNamespace = "http://juneexamservice.mycompany.com/", className = "com.mycompany.juneexamservice.GetMoviesResponse")
    @Action(input = "http://juneexamservice.mycompany.com/Exam/getMoviesRequest", output = "http://juneexamservice.mycompany.com/Exam/getMoviesResponse")
    public List<Integer> getMovies();

}
