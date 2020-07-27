
package serviceClient;

import java.math.BigDecimal;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MovieAppOps", targetNamespace = "http://services.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieAppOps {


    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isSessionAuthorized", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.IsSessionAuthorized")
    @ResponseWrapper(localName = "isSessionAuthorizedResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.IsSessionAuthorizedResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/isSessionAuthorizedRequest", output = "http://services.mycompany.com/MovieAppOps/isSessionAuthorizedResponse")
    public boolean isSessionAuthorized();

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAdmin", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetAdmin")
    @ResponseWrapper(localName = "getAdminResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetAdminResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/getAdminRequest", output = "http://services.mycompany.com/MovieAppOps/getAdminResponse")
    public boolean getAdmin(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param title
     * @return
     *     returns boolean
     * @throws NonexistentEntityException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteVideo", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.DeleteVideo")
    @ResponseWrapper(localName = "deleteVideoResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.DeleteVideoResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/deleteVideoRequest", output = "http://services.mycompany.com/MovieAppOps/deleteVideoResponse", fault = {
        @FaultAction(className = NonexistentEntityException_Exception.class, value = "http://services.mycompany.com/MovieAppOps/deleteVideo/Fault/NonexistentEntityException")
    })
    public boolean deleteVideo(
        @WebParam(name = "title", targetNamespace = "")
        String title)
        throws NonexistentEntityException_Exception
    ;

    /**
     * 
     * @param title
     * @return
     *     returns serviceClient.Videos
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVideo", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetVideo")
    @ResponseWrapper(localName = "getVideoResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetVideoResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/getVideoRequest", output = "http://services.mycompany.com/MovieAppOps/getVideoResponse")
    public Videos getVideo(
        @WebParam(name = "title", targetNamespace = "")
        String title);

    /**
     * 
     * @param image
     * @param year
     * @param genre
     * @param title
     * @param type
     * @param starActor
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "postVideo", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.PostVideo")
    @ResponseWrapper(localName = "postVideoResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.PostVideoResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/postVideoRequest", output = "http://services.mycompany.com/MovieAppOps/postVideoResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://services.mycompany.com/MovieAppOps/postVideo/Fault/Exception")
    })
    public boolean postVideo(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "image", targetNamespace = "")
        byte[] image,
        @WebParam(name = "genre", targetNamespace = "")
        String genre,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "starActor", targetNamespace = "")
        StarActor starActor)
        throws Exception_Exception
    ;

    /**
     * 
     * @param image
     * @param year
     * @param genre
     * @param id
     * @param title
     * @param type
     * @param starActor
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "putVideo", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.PutVideo")
    @ResponseWrapper(localName = "putVideoResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.PutVideoResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/putVideoRequest", output = "http://services.mycompany.com/MovieAppOps/putVideoResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://services.mycompany.com/MovieAppOps/putVideo/Fault/Exception")
    })
    public boolean putVideo(
        @WebParam(name = "id", targetNamespace = "")
        BigDecimal id,
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "image", targetNamespace = "")
        byte[] image,
        @WebParam(name = "genre", targetNamespace = "")
        String genre,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "starActor", targetNamespace = "")
        StarActor starActor)
        throws Exception_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns serviceClient.StarActor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStarActor", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetStarActor")
    @ResponseWrapper(localName = "getStarActorResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetStarActorResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/getStarActorRequest", output = "http://services.mycompany.com/MovieAppOps/getStarActorResponse")
    public StarActor getStarActor(
        @WebParam(name = "id", targetNamespace = "")
        BigDecimal id);

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<serviceClient.Videos>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVideosByType", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetVideosByType")
    @ResponseWrapper(localName = "getVideosByTypeResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetVideosByTypeResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/getVideosByTypeRequest", output = "http://services.mycompany.com/MovieAppOps/getVideosByTypeResponse")
    public List<Videos> getVideosByType(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @return
     *     returns java.util.List<serviceClient.Videos>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVideos", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetVideos")
    @ResponseWrapper(localName = "getVideosResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetVideosResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/getVideosRequest", output = "http://services.mycompany.com/MovieAppOps/getVideosResponse")
    public List<Videos> getVideos();

    /**
     * 
     * @return
     *     returns java.util.List<serviceClient.StarActor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStarActors", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetStarActors")
    @ResponseWrapper(localName = "getStarActorsResponse", targetNamespace = "http://services.mycompany.com/", className = "serviceClient.GetStarActorsResponse")
    @Action(input = "http://services.mycompany.com/MovieAppOps/getStarActorsRequest", output = "http://services.mycompany.com/MovieAppOps/getStarActorsResponse")
    public List<StarActor> getStarActors();

}
