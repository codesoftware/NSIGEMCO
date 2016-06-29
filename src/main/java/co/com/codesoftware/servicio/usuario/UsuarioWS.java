
package co.com.codesoftware.servicio.usuario;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsuarioWS", targetNamespace = "http://usuario.servicio.codesoftware.com.co/")
@XmlSeeAlso({
    co.com.codesoftware.respuesta.ObjectFactory.class,
    co.com.codesoftware.servicio.usuario.ObjectFactory.class
})
public interface UsuarioWS {


    /**
     * 
     * @param password
     * @param nombre
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "loginResponse", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://respuesta.codesoftware.com.co/", className = "co.com.codesoftware.respuesta.LoginResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/loginRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/loginResponse")
    public List<String> login(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param cliente
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertaCliente", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.InsertaCliente")
    @ResponseWrapper(localName = "insertaClienteResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.InsertaClienteResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/insertaClienteRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/insertaClienteResponse")
    public Integer insertaCliente(
        @WebParam(name = "Cliente", targetNamespace = "")
        ClienteEntity cliente);

    /**
     * 
     * @param cliente
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "valida", targetNamespace = "")
    @RequestWrapper(localName = "updateCliente", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.UpdateCliente")
    @ResponseWrapper(localName = "updateClienteResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.UpdateClienteResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/updateClienteRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/updateClienteResponse")
    public boolean updateCliente(
        @WebParam(name = "Cliente", targetNamespace = "")
        ClienteEntity cliente);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.usuario.UsuarioEntity>
     */
    @WebMethod
    @WebResult(name = "listaUsuarios", targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuarios", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerUsuarios")
    @ResponseWrapper(localName = "obtenerUsuariosResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerUsuariosResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerUsuariosRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerUsuariosResponse")
    public List<UsuarioEntity> obtenerUsuarios();

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.usuario.PerfilEntity>
     */
    @WebMethod
    @WebResult(name = "listaPerfiles", targetNamespace = "")
    @RequestWrapper(localName = "obtenerPerfiles", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerPerfiles")
    @ResponseWrapper(localName = "obtenerPerfilesResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerPerfilesResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerPerfilesRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerPerfilesResponse")
    public List<PerfilEntity> obtenerPerfiles();

    /**
     * 
     * @param usuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "insertaUsuario", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.InsertaUsuario")
    @ResponseWrapper(localName = "insertaUsuarioResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.InsertaUsuarioResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/insertaUsuarioRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/insertaUsuarioResponse")
    public String insertaUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        UsuarioEntity usuario);

    /**
     * 
     * @return
     *     returns java.util.List<co.com.codesoftware.servicio.usuario.ClienteEntity>
     */
    @WebMethod
    @WebResult(name = "Cliente", targetNamespace = "")
    @RequestWrapper(localName = "obtenerClientes", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerClientes")
    @ResponseWrapper(localName = "obtenerClientesResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerClientesResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerClientesRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerClientesResponse")
    public List<ClienteEntity> obtenerClientes();

    /**
     * 
     * @param tiusUsuario
     * @return
     *     returns co.com.codesoftware.servicio.usuario.UsuarioEntity
     */
    @WebMethod
    @WebResult(name = "UsuarioEntity", targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuarioXUser", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerUsuarioXUser")
    @ResponseWrapper(localName = "obtenerUsuarioXUserResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerUsuarioXUserResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerUsuarioXUserRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerUsuarioXUserResponse")
    public UsuarioEntity obtenerUsuarioXUser(
        @WebParam(name = "tius_usuario", targetNamespace = "")
        String tiusUsuario);

    /**
     * 
     * @param cedula
     * @return
     *     returns co.com.codesoftware.servicio.usuario.ClienteEntity
     */
    @WebMethod
    @WebResult(name = "Cliente", targetNamespace = "")
    @RequestWrapper(localName = "obtenerClienteXCedula", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerClienteXCedula")
    @ResponseWrapper(localName = "obtenerClienteXCedulaResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ObtenerClienteXCedulaResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerClienteXCedulaRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/obtenerClienteXCedulaResponse")
    public ClienteEntity obtenerClienteXCedula(
        @WebParam(name = "cedula", targetNamespace = "")
        String cedula);

    /**
     * 
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "cambiaClaveUsuario", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.CambiaClaveUsuario")
    @ResponseWrapper(localName = "cambiaClaveUsuarioResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.CambiaClaveUsuarioResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/cambiaClaveUsuarioRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/cambiaClaveUsuarioResponse")
    public boolean cambiaClaveUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        UsuarioEntity usuario);

    /**
     * 
     * @param usuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "respuesta", targetNamespace = "")
    @RequestWrapper(localName = "actualizarUsuario", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ActualizarUsuario")
    @ResponseWrapper(localName = "actualizarUsuarioResponse", targetNamespace = "http://usuario.servicio.codesoftware.com.co/", className = "co.com.codesoftware.servicio.usuario.ActualizarUsuarioResponse")
    @Action(input = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/actualizarUsuarioRequest", output = "http://usuario.servicio.codesoftware.com.co/UsuarioWS/actualizarUsuarioResponse")
    public String actualizarUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        UsuarioEntity usuario);

}