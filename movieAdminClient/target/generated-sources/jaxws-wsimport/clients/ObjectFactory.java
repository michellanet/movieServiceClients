
package clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clients package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAdminResponse_QNAME = new QName("http://services.mycompany.com/", "getAdminResponse");
    private final static QName _GetStarActorsResponse_QNAME = new QName("http://services.mycompany.com/", "getStarActorsResponse");
    private final static QName _GetVideosResponse_QNAME = new QName("http://services.mycompany.com/", "getVideosResponse");
    private final static QName _GetAdmin_QNAME = new QName("http://services.mycompany.com/", "getAdmin");
    private final static QName _DeleteVideoResponse_QNAME = new QName("http://services.mycompany.com/", "deleteVideoResponse");
    private final static QName _GetStarActorResponse_QNAME = new QName("http://services.mycompany.com/", "getStarActorResponse");
    private final static QName _PutVideo_QNAME = new QName("http://services.mycompany.com/", "putVideo");
    private final static QName _PostVideoResponse_QNAME = new QName("http://services.mycompany.com/", "postVideoResponse");
    private final static QName _GetStarActor_QNAME = new QName("http://services.mycompany.com/", "getStarActor");
    private final static QName _GetVideo_QNAME = new QName("http://services.mycompany.com/", "getVideo");
    private final static QName _GetVideoResponse_QNAME = new QName("http://services.mycompany.com/", "getVideoResponse");
    private final static QName _NonexistentEntityException_QNAME = new QName("http://services.mycompany.com/", "NonexistentEntityException");
    private final static QName _GetVideosByTypeResponse_QNAME = new QName("http://services.mycompany.com/", "getVideosByTypeResponse");
    private final static QName _Videos_QNAME = new QName("http://services.mycompany.com/", "videos");
    private final static QName _GetStarActors_QNAME = new QName("http://services.mycompany.com/", "getStarActors");
    private final static QName _PutVideoResponse_QNAME = new QName("http://services.mycompany.com/", "putVideoResponse");
    private final static QName _GetVideosByType_QNAME = new QName("http://services.mycompany.com/", "getVideosByType");
    private final static QName _Exception_QNAME = new QName("http://services.mycompany.com/", "Exception");
    private final static QName _DeleteVideo_QNAME = new QName("http://services.mycompany.com/", "deleteVideo");
    private final static QName _StarActor_QNAME = new QName("http://services.mycompany.com/", "starActor");
    private final static QName _IsSessionAuthorized_QNAME = new QName("http://services.mycompany.com/", "isSessionAuthorized");
    private final static QName _IsSessionAuthorizedResponse_QNAME = new QName("http://services.mycompany.com/", "isSessionAuthorizedResponse");
    private final static QName _PostVideo_QNAME = new QName("http://services.mycompany.com/", "postVideo");
    private final static QName _GetVideos_QNAME = new QName("http://services.mycompany.com/", "getVideos");
    private final static QName _PutVideoImage_QNAME = new QName("", "image");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsSessionAuthorized }
     * 
     */
    public IsSessionAuthorized createIsSessionAuthorized() {
        return new IsSessionAuthorized();
    }

    /**
     * Create an instance of {@link IsSessionAuthorizedResponse }
     * 
     */
    public IsSessionAuthorizedResponse createIsSessionAuthorizedResponse() {
        return new IsSessionAuthorizedResponse();
    }

    /**
     * Create an instance of {@link PostVideo }
     * 
     */
    public PostVideo createPostVideo() {
        return new PostVideo();
    }

    /**
     * Create an instance of {@link GetVideos }
     * 
     */
    public GetVideos createGetVideos() {
        return new GetVideos();
    }

    /**
     * Create an instance of {@link GetVideo }
     * 
     */
    public GetVideo createGetVideo() {
        return new GetVideo();
    }

    /**
     * Create an instance of {@link GetVideoResponse }
     * 
     */
    public GetVideoResponse createGetVideoResponse() {
        return new GetVideoResponse();
    }

    /**
     * Create an instance of {@link NonexistentEntityException }
     * 
     */
    public NonexistentEntityException createNonexistentEntityException() {
        return new NonexistentEntityException();
    }

    /**
     * Create an instance of {@link GetVideosByTypeResponse }
     * 
     */
    public GetVideosByTypeResponse createGetVideosByTypeResponse() {
        return new GetVideosByTypeResponse();
    }

    /**
     * Create an instance of {@link Videos }
     * 
     */
    public Videos createVideos() {
        return new Videos();
    }

    /**
     * Create an instance of {@link GetStarActors }
     * 
     */
    public GetStarActors createGetStarActors() {
        return new GetStarActors();
    }

    /**
     * Create an instance of {@link PutVideoResponse }
     * 
     */
    public PutVideoResponse createPutVideoResponse() {
        return new PutVideoResponse();
    }

    /**
     * Create an instance of {@link GetVideosByType }
     * 
     */
    public GetVideosByType createGetVideosByType() {
        return new GetVideosByType();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DeleteVideo }
     * 
     */
    public DeleteVideo createDeleteVideo() {
        return new DeleteVideo();
    }

    /**
     * Create an instance of {@link StarActor }
     * 
     */
    public StarActor createStarActor() {
        return new StarActor();
    }

    /**
     * Create an instance of {@link GetStarActorResponse }
     * 
     */
    public GetStarActorResponse createGetStarActorResponse() {
        return new GetStarActorResponse();
    }

    /**
     * Create an instance of {@link PutVideo }
     * 
     */
    public PutVideo createPutVideo() {
        return new PutVideo();
    }

    /**
     * Create an instance of {@link PostVideoResponse }
     * 
     */
    public PostVideoResponse createPostVideoResponse() {
        return new PostVideoResponse();
    }

    /**
     * Create an instance of {@link GetStarActor }
     * 
     */
    public GetStarActor createGetStarActor() {
        return new GetStarActor();
    }

    /**
     * Create an instance of {@link GetAdminResponse }
     * 
     */
    public GetAdminResponse createGetAdminResponse() {
        return new GetAdminResponse();
    }

    /**
     * Create an instance of {@link GetStarActorsResponse }
     * 
     */
    public GetStarActorsResponse createGetStarActorsResponse() {
        return new GetStarActorsResponse();
    }

    /**
     * Create an instance of {@link GetVideosResponse }
     * 
     */
    public GetVideosResponse createGetVideosResponse() {
        return new GetVideosResponse();
    }

    /**
     * Create an instance of {@link GetAdmin }
     * 
     */
    public GetAdmin createGetAdmin() {
        return new GetAdmin();
    }

    /**
     * Create an instance of {@link DeleteVideoResponse }
     * 
     */
    public DeleteVideoResponse createDeleteVideoResponse() {
        return new DeleteVideoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getAdminResponse")
    public JAXBElement<GetAdminResponse> createGetAdminResponse(GetAdminResponse value) {
        return new JAXBElement<GetAdminResponse>(_GetAdminResponse_QNAME, GetAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStarActorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getStarActorsResponse")
    public JAXBElement<GetStarActorsResponse> createGetStarActorsResponse(GetStarActorsResponse value) {
        return new JAXBElement<GetStarActorsResponse>(_GetStarActorsResponse_QNAME, GetStarActorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getVideosResponse")
    public JAXBElement<GetVideosResponse> createGetVideosResponse(GetVideosResponse value) {
        return new JAXBElement<GetVideosResponse>(_GetVideosResponse_QNAME, GetVideosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getAdmin")
    public JAXBElement<GetAdmin> createGetAdmin(GetAdmin value) {
        return new JAXBElement<GetAdmin>(_GetAdmin_QNAME, GetAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVideoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "deleteVideoResponse")
    public JAXBElement<DeleteVideoResponse> createDeleteVideoResponse(DeleteVideoResponse value) {
        return new JAXBElement<DeleteVideoResponse>(_DeleteVideoResponse_QNAME, DeleteVideoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStarActorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getStarActorResponse")
    public JAXBElement<GetStarActorResponse> createGetStarActorResponse(GetStarActorResponse value) {
        return new JAXBElement<GetStarActorResponse>(_GetStarActorResponse_QNAME, GetStarActorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutVideo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "putVideo")
    public JAXBElement<PutVideo> createPutVideo(PutVideo value) {
        return new JAXBElement<PutVideo>(_PutVideo_QNAME, PutVideo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostVideoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "postVideoResponse")
    public JAXBElement<PostVideoResponse> createPostVideoResponse(PostVideoResponse value) {
        return new JAXBElement<PostVideoResponse>(_PostVideoResponse_QNAME, PostVideoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStarActor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getStarActor")
    public JAXBElement<GetStarActor> createGetStarActor(GetStarActor value) {
        return new JAXBElement<GetStarActor>(_GetStarActor_QNAME, GetStarActor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getVideo")
    public JAXBElement<GetVideo> createGetVideo(GetVideo value) {
        return new JAXBElement<GetVideo>(_GetVideo_QNAME, GetVideo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getVideoResponse")
    public JAXBElement<GetVideoResponse> createGetVideoResponse(GetVideoResponse value) {
        return new JAXBElement<GetVideoResponse>(_GetVideoResponse_QNAME, GetVideoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentEntityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "NonexistentEntityException")
    public JAXBElement<NonexistentEntityException> createNonexistentEntityException(NonexistentEntityException value) {
        return new JAXBElement<NonexistentEntityException>(_NonexistentEntityException_QNAME, NonexistentEntityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideosByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getVideosByTypeResponse")
    public JAXBElement<GetVideosByTypeResponse> createGetVideosByTypeResponse(GetVideosByTypeResponse value) {
        return new JAXBElement<GetVideosByTypeResponse>(_GetVideosByTypeResponse_QNAME, GetVideosByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Videos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "videos")
    public JAXBElement<Videos> createVideos(Videos value) {
        return new JAXBElement<Videos>(_Videos_QNAME, Videos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStarActors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getStarActors")
    public JAXBElement<GetStarActors> createGetStarActors(GetStarActors value) {
        return new JAXBElement<GetStarActors>(_GetStarActors_QNAME, GetStarActors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutVideoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "putVideoResponse")
    public JAXBElement<PutVideoResponse> createPutVideoResponse(PutVideoResponse value) {
        return new JAXBElement<PutVideoResponse>(_PutVideoResponse_QNAME, PutVideoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideosByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getVideosByType")
    public JAXBElement<GetVideosByType> createGetVideosByType(GetVideosByType value) {
        return new JAXBElement<GetVideosByType>(_GetVideosByType_QNAME, GetVideosByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVideo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "deleteVideo")
    public JAXBElement<DeleteVideo> createDeleteVideo(DeleteVideo value) {
        return new JAXBElement<DeleteVideo>(_DeleteVideo_QNAME, DeleteVideo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StarActor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "starActor")
    public JAXBElement<StarActor> createStarActor(StarActor value) {
        return new JAXBElement<StarActor>(_StarActor_QNAME, StarActor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsSessionAuthorized }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "isSessionAuthorized")
    public JAXBElement<IsSessionAuthorized> createIsSessionAuthorized(IsSessionAuthorized value) {
        return new JAXBElement<IsSessionAuthorized>(_IsSessionAuthorized_QNAME, IsSessionAuthorized.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsSessionAuthorizedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "isSessionAuthorizedResponse")
    public JAXBElement<IsSessionAuthorizedResponse> createIsSessionAuthorizedResponse(IsSessionAuthorizedResponse value) {
        return new JAXBElement<IsSessionAuthorizedResponse>(_IsSessionAuthorizedResponse_QNAME, IsSessionAuthorizedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostVideo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "postVideo")
    public JAXBElement<PostVideo> createPostVideo(PostVideo value) {
        return new JAXBElement<PostVideo>(_PostVideo_QNAME, PostVideo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVideos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mycompany.com/", name = "getVideos")
    public JAXBElement<GetVideos> createGetVideos(GetVideos value) {
        return new JAXBElement<GetVideos>(_GetVideos_QNAME, GetVideos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "image", scope = PutVideo.class)
    public JAXBElement<byte[]> createPutVideoImage(byte[] value) {
        return new JAXBElement<byte[]>(_PutVideoImage_QNAME, byte[].class, PutVideo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "image", scope = PostVideo.class)
    public JAXBElement<byte[]> createPostVideoImage(byte[] value) {
        return new JAXBElement<byte[]>(_PutVideoImage_QNAME, byte[].class, PostVideo.class, ((byte[]) value));
    }

}
