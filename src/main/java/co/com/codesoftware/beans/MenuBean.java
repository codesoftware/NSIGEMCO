package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import co.com.codesoftware.entity.PuntoMenuEntity;

@ManagedBean
@ViewScoped
public class MenuBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String listaPermisos = ".InPr13.";
	private ArrayList<PuntoMenuEntity> menu;
	private MenuModel menuDinamico;

	@PostConstruct
	public void init() {
		this.creaMenu();
	}

	/**
	 * Funcion con la cual creo el menu principal de la aplicacion
	 */
	public void creaMenu() {
		if (menuDinamico == null) {
			this.menuDinamico = new DefaultMenuModel();
		}
		DefaultSubMenu primerNivel = new DefaultSubMenu();
		primerNivel.setLabel("INVENTARIOS");
		primerNivel.setIcon("fa fa-bank");

		DefaultSubMenu segundoNivel = new DefaultSubMenu();
		segundoNivel.setLabel("Productos");

		DefaultMenuItem tercerNivel = new DefaultMenuItem("Add. Prod. X Fact");
		tercerNivel.setCommand("/ACTION/FACTURACION/facturaCompraTmp.jsf?faces-redirect=false");
		DefaultMenuItem tercerNivelFacturaCompra = new DefaultMenuItem("Consulta Fac Compra");
		tercerNivelFacturaCompra.setCommand("/ACTION/PRODUCTOS/consultaFacturaCompras.jsf?faces-redirect=false");
		
		DefaultMenuItem tercerNivelFacturaCompraTmp = new DefaultMenuItem("Consulta Fac Compra tmp");
		tercerNivelFacturaCompraTmp.setCommand("/ACTION/FACTURACION/consultaFacCompraTmp.jsf?faces-redirect=false");

		DefaultMenuItem tercerNivelPrueba = new DefaultMenuItem("Insertar Productos");
		tercerNivelPrueba.setCommand("/ACTION/PRODUCTOS/insertaProductos.jsf?faces-redirect=false");

		DefaultMenuItem tercerNivelCargaArchivo = new DefaultMenuItem("Cargue productosArchivo");
		tercerNivelCargaArchivo.setCommand("/ACTION/PRODUCTOS/cargueProductos.jsf?faces-redirect=false");

		DefaultMenuItem tercerNivelPrecio = new DefaultMenuItem("Parametrizacion de precio");
		tercerNivelPrecio.setCommand("/ACTION/PRODUCTOS/precioProductos.jsf?faces-redirect=false");

		DefaultMenuItem tercerNivelConsGeneral = new DefaultMenuItem("Consulta General");
		tercerNivelConsGeneral.setCommand("/ACTION/PRODUCTOS/consGeneralProductos.jsf?faces-redirect=false");

		DefaultMenuItem tercerNivelSolicitudes = new DefaultMenuItem("Solicitudes");
		tercerNivelSolicitudes.setCommand("/ACTION/SOLICITUDES/consultaSolicitudes.jsf?faces-redirect=false");
		// Segundo punto de menu

		DefaultSubMenu segundoPunto = new DefaultSubMenu();
		segundoPunto.setLabel("PARAMETROS");
		segundoPunto.setIcon("fa fa-archive");

		DefaultSubMenu segPunNivUno = new DefaultSubMenu();
		segPunNivUno.setLabel("Categoria");

		DefaultMenuItem segPunNvUnoAsoc = new DefaultMenuItem("Asociar Cat y Sub Cat");
		segPunNvUnoAsoc.setCommand("/ACTION/SUBCATEGORIA/asocCatSubCat.jsf");

		segundoPunto.addElement(segPunNivUno);
		segPunNivUno.addElement(segPunNvUnoAsoc);

		DefaultSubMenu segPunNivDos = new DefaultSubMenu();
		segPunNivDos.setLabel("Precio Masivo");

		DefaultMenuItem segPunNvDosPrecMasiv = new DefaultMenuItem("Consulta Porcentajes");
		segPunNvDosPrecMasiv.setCommand("/ACTION/PRECIOS/ConsPorcPrecioMasivo.jsf");

		DefaultMenuItem segPunNvDosPrecMasivIns = new DefaultMenuItem("Insercion Parametros");
		segPunNvDosPrecMasivIns.setCommand("/ACTION/PRECIOS/InsercionParametrosPrecio.jsf");

		DefaultMenuItem segPunNvDosPrecMasivEje = new DefaultMenuItem("Ejecucion");
		segPunNvDosPrecMasivEje.setCommand("/ACTION/PRECIOS/EjecuionParaPrecioMasivo.jsf");

		segundoPunto.addElement(segPunNivDos);
		segPunNivDos.addElement(segPunNvDosPrecMasiv);
		segPunNivDos.addElement(segPunNvDosPrecMasivIns);
		segPunNivDos.addElement(segPunNvDosPrecMasivEje);

		segundoNivel.addElement(tercerNivel);
		segundoNivel.addElement(tercerNivelFacturaCompra);
		segundoNivel.addElement(tercerNivelFacturaCompraTmp);
		segundoNivel.addElement(tercerNivelPrueba);
		segundoNivel.addElement(tercerNivelCargaArchivo);
		segundoNivel.addElement(tercerNivelPrecio);
		segundoNivel.addElement(tercerNivelConsGeneral);
		segundoNivel.addElement(tercerNivelSolicitudes);

		primerNivel.addElement(segundoNivel);

		// REPORTES
		DefaultMenuItem menuReportes = new DefaultMenuItem("REPORTES");
		menuReportes.setIcon("fa fa-file-excel-o");
		menuReportes.setCommand("/ACTION/REPORTES/reportes.jsf");
		// Tercer punto de menu
		// DefaultSubMenu tercerPunto = new DefaultSubMenu();
		// Menu Facturacion
//		DefaultSubMenu menuFacturacion = new DefaultSubMenu();
//		menuFacturacion.setLabel("FACTURACION");

		

		DefaultMenuItem tercerPunto = new DefaultMenuItem("Cerrar Sesion");
		tercerPunto.setIcon("fa fa-close");
		tercerPunto.setCommand("#{loginBean.cerrarSesion}");
		// Cuarto punto de menu
		// DefaultSubMenu tercerPunto = new DefaultSubMenu();
		DefaultMenuItem cuartoPunto = new DefaultMenuItem("SIGEMCO");
		cuartoPunto.setCommand("#{loginBean.cambioSigemco}");
		this.menuDinamico.addElement(this.generaMenuAdmon());
		this.menuDinamico.addElement(primerNivel);
		this.menuDinamico.addElement(segundoPunto);
		this.menuDinamico.addElement(menuReportes);
		this.menuDinamico.addElement(this.generaMenuFacturacion());
		this.menuDinamico.addElement(this.generaMenuImportaciones());
		this.menuDinamico.addElement(this.generaMenuContabilidad());
		this.menuDinamico.addElement(tercerPunto);
		this.menuDinamico.addElement(cuartoPunto);
	}
	/**
	 * Funcion con la cual genero el menu de administracion, con todos sus hijos
	 * @return
	 */
	public DefaultSubMenu generaMenuAdmon() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			menuPrincipal.setLabel("ADMINISTRACION");
			menuPrincipal.setIcon("fa fa-users");
			// Se generan los submenus de segundo nivel
			//Genero el segundo nivel del menu
			DefaultMenuItem segundoNivel = new DefaultMenuItem("Resolución Fact.");
			segundoNivel.setCommand("/ACTION/ADMIN/resolucionFacturacion.jsf");
			//Genero sedes
			DefaultMenuItem segundoNivelUno = new DefaultMenuItem("Sedes.");
			segundoNivelUno.setCommand("/ACTION/ADMIN/sedes.jsf");
			//Genero conteos
			DefaultMenuItem segundoNivelDos = new DefaultMenuItem("Conteo.");
			segundoNivelDos.setCommand("/ACTION/ADMIN/conteos.jsf");
			//Punto de menu para parametros
			DefaultMenuItem segundoNivelTres = new DefaultMenuItem("Parametros.");
			segundoNivelTres.setCommand("/ACTION/ADMIN/parametrosGenerales.jsf");
			//Punto de menu para usuarios
			DefaultMenuItem segundoNivelCuatro = new DefaultMenuItem("Usuarios.");
			segundoNivelCuatro.setCommand("/ACTION/ADMIN/usuarios.jsf");
			
			DefaultMenuItem segundoNivelCinco = new DefaultMenuItem("Proveedores.");
			segundoNivelCinco.setCommand("/ACTION/ADMIN/proveedores.jsf");
			//Adiciono al punto de menu principal
			menuPrincipal.addElement(segundoNivel);
			menuPrincipal.addElement(segundoNivelUno);
			menuPrincipal.addElement(segundoNivelDos);
			menuPrincipal.addElement(segundoNivelTres);
			menuPrincipal.addElement(segundoNivelCuatro);
			menuPrincipal.addElement(segundoNivelCinco);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}
	
	/**
	 * Funcion con la cual genero el menu de facturacion, con todos sus hijos
	 * @return
	 */
	public DefaultSubMenu generaMenuFacturacion() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			menuPrincipal.setLabel("FACTURACION");
			menuPrincipal.setIcon("fa fa-files-o");
			// Se generan los submenus de segundo nivel
			//Genero el segundo nivel del menu
			DefaultMenuItem segundoNivel = new DefaultMenuItem("Consulta Facturas");
			segundoNivel.setCommand("/ACTION/FACTURACION/consultaFacturas.jsf");
			DefaultSubMenu segundoNivelDos = new DefaultSubMenu("Remisiones");
			
			DefaultMenuItem consultaRemi = new DefaultMenuItem("Consulta Remisiones");
			consultaRemi.setCommand("/ACTION/FACTURACION/remisionFacturacion.jsf");
			DefaultMenuItem consultaPagos = new DefaultMenuItem("Registro Pagos");
			consultaPagos .setCommand("/ACTION/FACTURACION/pagosRemision.jsf");
			
			segundoNivelDos.addElement(consultaRemi);
			segundoNivelDos.addElement(consultaPagos);

			//Adiciono al punto de menu principal
			menuPrincipal.addElement(segundoNivel);
			menuPrincipal.addElement(segundoNivelDos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}
	/**
	 * Menu en el cual se generan las importaciones
	 * @return
	 */
	public DefaultSubMenu generaMenuImportaciones() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			menuPrincipal.setLabel("IMPORTACIONES");
			menuPrincipal.setIcon("fa fa-briefcase");
			// Se generan los submenus de segundo nivel
			//Genero el segundo nivel del menu
			DefaultMenuItem segundoNivel = new DefaultMenuItem("Info Principal");
			DefaultMenuItem segundoNivelConsulta = new DefaultMenuItem("Consulta Gral");
			segundoNivel.setCommand("/ACTION/IMPORTACION/adminImportacion.jsf");
			segundoNivelConsulta.setCommand("/ACTION/IMPORTACION/consultaImportacion.jsf");

			//Adiciono al punto de menu principal
			menuPrincipal.addElement(segundoNivel);
			menuPrincipal.addElement(segundoNivelConsulta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}
	/**
	 * Menu en el cual se generan las importaciones
	 * @return
	 */
	public DefaultSubMenu generaMenuContabilidad() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			menuPrincipal.setLabel("CONTABILIDAD");
			menuPrincipal.setIcon("fa fa-calculator");
			// Se generan los submenus de segundo nivel
			//Genero el segundo nivel del menu
			DefaultSubMenu segundoNivel = new DefaultSubMenu("PUC");
			DefaultMenuItem tercerNivelConsulta = new DefaultMenuItem("Consulta Gral");
			//tercerNivelConsulta.setCommand("/ACTION/IMPORTACION/adminImportacion.jsf");
			tercerNivelConsulta.setCommand("/ACTION/CONTABILIDAD/CONSULTAS/consultaClase.jsf");

			//Adiciono al punto de menu principal
			menuPrincipal.addElement(segundoNivel);
			segundoNivel.addElement(tercerNivelConsulta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}
	
	

	public String getListaPermisos() {
		return listaPermisos;
	}

	public void setListaPermisos(String listaPermisos) {
		this.listaPermisos = listaPermisos;
	}

	public ArrayList<PuntoMenuEntity> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<PuntoMenuEntity> menu) {
		this.menu = menu;
	}

	public MenuModel getMenuDinamico() {
		return menuDinamico;
	}

	public void setMenuDinamico(MenuModel menuDinamico) {
		this.menuDinamico = menuDinamico;
	}

}
