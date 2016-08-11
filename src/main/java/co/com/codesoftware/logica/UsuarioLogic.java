package co.com.codesoftware.logica;

import java.io.File;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.commons.io.FileUtils;

import co.com.codesoftware.servicio.usuario.PerfilEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.WSGeneralInterface;

/**
 * Clase con la cual realizo la logica de los usuarios
 * 
 * @author ACER
 *
 */
public class UsuarioLogic implements WSGeneralInterface {

	private String valida;

	/**
	 * Funcion en la cual se busca la informacion de un usuario basandose en su
	 * usuario
	 * 
	 * @param usuario
	 * @return
	 */
	public UsuarioEntity buscaInfoUsuario(String usuario) {
		UsuarioEntity objEntity = null;
		try {
			boolean valida = this.initWebServiceAdm();
			if (valida) {
				objEntity = conexionWSUsuarios().getPortUsuarios().obtenerUsuarioXUser(usuario);
			} else {
				this.valida = "Error de conexion con el Web Services";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return objEntity;
	}

	/**
	 * Funcion con la cual inicializo los objetos necesarios para realizar el
	 * llamado con un WebServices
	 * 
	 * @return boolean (true) conexion exitosa (false) Error de conexion
	 */
	public boolean initWebServiceAdm() {
		try {
			// service = new AdministrationEndPoint_Service();
			// port = service.getAdministrationEndPointPort();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Funcion con la cual realizo el login de usuarios en el sistema
	 * 
	 * @return
	 */
	public List loginUsuario(String usuario, String contra) {
		List rta = null;
		try {
			rta = conexionWSAdmin().getPortAdm().loginUsuario(usuario, contra);
			this.valida = "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			this.valida = "Error " + e;
		}
		return rta;
	}

	public String getValida() {
		return valida;
	}

	public void setValida(String valida) {
		this.valida = valida;
	}

	/**
	 * Funcion con la cual se cambia la contraseña de un usuario
	 * 
	 * @param usuario
	 * @param pass
	 * @return
	 */
	public boolean cambioContrasena(String usuario, String pass) {
		boolean rta = false;
		try {
			UsuarioEntity usuarioEntity = new UsuarioEntity();
			usuarioEntity.setUsuario(usuario);
			usuarioEntity.setPassword(pass);
			rta = conexionWSUsuarios().getPortUsuarios().cambiaClaveUsuario(usuarioEntity);
			rta = true;
		} catch (Exception e) {
			rta = false;
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual copio la imagen del servidor a la aplicacion para
	 * vizualizar en que aplicacion se encuentra
	 */
	public void copiaLogoServer(String rutaDestino) {
		try {
			File file = new File(rutaDestino);
			if(!file.exists()){
				System.out.println("El logo no se encuentra en la ruta parametrizada: " + rutaDestino);
			}else{
				this.guardaImagenServidor(file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
     * Funcion con la cual guardo la imagen en el repositorio de imagenes
     * @return 
     */
    public String guardaImagenServidor(File file){
        String rta = "Ok";
        try {
        	String rutaBase = this.obtieneParametroContext();
            File origen = new File(rutaBase+"logo.jpg");
            FileUtils.copyFile(origen, file);
        } catch (Exception e) {
            e.printStackTrace();
            rta = "Error "+ e;
        }
        return rta;
    }
    
    /**
     * Funcion con la cual obtengo la ruta base de sigemco para las aplicaciones
     * @return 
     */
	public String obtieneParametroContext() {
        String parametro = "";
        try {
           Context initCtx = new InitialContext();
           String envCtx = (String) initCtx.lookup("java:comp/env/RutaBaseApp");
            parametro = envCtx;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parametro;
    }
	/**
	 * Funcion con la cual obtengo todos los usuarios de la aplicacion
	 * @return
	 */
	public List<UsuarioEntity> obtenerUsuarios(){
		List<UsuarioEntity> rta = null;
		try {
			rta = conexionWSUsuarios().getPortUsuarios().obtenerUsuarios();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual obtengo todos los perfiles de la aplicacion
	 * @return
	 */
	public List<PerfilEntity> obtenerPerfiles(){
		List<PerfilEntity> rta = null;
		try {
			rta = conexionWSUsuarios().getPortUsuarios().obtenerPerfiles();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual actualizo un usuario usuario
	 * @param usua
	 * @return
	 */
	public String actualizaUsuario(UsuarioEntity usua){
		String rta = "";
		try {
			rta = conexionWSUsuarios().getPortUsuarios().actualizarUsuario(usua);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual inserto un usuario
	 * @param usuario
	 * @return
	 */
	public String insertaUsuarios(UsuarioEntity usuario){
		String rta = "";
		try {
			rta = conexionWSUsuarios().getPortUsuarios().insertaUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual se actualizan los perfiles
	 * @param objEntity
	 * @return
	 */
	public String actualizaPerfiles(PerfilEntity objEntity){
		String rta = "";
		try {
			co.com.codesoftware.server.nsigemco.PerfilEntity aux = new co.com.codesoftware.server.nsigemco.PerfilEntity();
			aux.setId(objEntity.getId());
			aux.setEstado(objEntity.getEstado());
			aux.setDescripcion(objEntity.getDescripcion());
			aux.setNombre(objEntity.getNombre());
			aux.setPermisos(objEntity.getPermisos());
			rta = conexionWSAdmin().getPortAdm().actualizarPerfiles(aux);
		} catch (Exception e) {
			e.printStackTrace();
			rta = "Error " +  e;
		}
		return rta;
	}

}
