package co.com.codesoftware.beans;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import co.com.codesoftware.entity.PuntoMenuEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;

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
	private UsuarioEntity objetoSesion;

	@PostConstruct
	public void init() {
		this.objetoSesion = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("dataSession");
		this.listaPermisos = this.objetoSesion.getPerfil().getPermisos();
		this.creaMenu();
	}

	/**
	 * Funcion con la cual creo el menu principal de la aplicacion
	 */
	public void creaMenu() {
		if (menuDinamico == null) {
			this.menuDinamico = new DefaultMenuModel();
		}
		DefaultMenuItem tercerPunto = new DefaultMenuItem("Cerrar Sesion");
		tercerPunto.setIcon("fa fa-close");
		tercerPunto.setCommand("#{loginBean.cerrarSesion}");
		// Cuarto punto de menu
		// DefaultSubMenu tercerPunto = new DefaultSubMenu();
		DefaultMenuItem cuartoPunto = new DefaultMenuItem("SIGEMCO");
		cuartoPunto.setCommand("#{loginBean.cambioSigemco}");
		this.menuDinamico.addElement(this.generaMenuAdmon());
		this.menuDinamico.addElement(this.generaMenuProd());
		this.menuDinamico.addElement(this.generaMenuParametros());
		this.menuDinamico.addElement(this.generaMenuReportes());
		this.menuDinamico.addElement(this.generaMenuFacturacion());
		this.menuDinamico.addElement(this.generaMenuImportaciones());
		this.menuDinamico.addElement(this.generaMenuContabilidad());
		this.menuDinamico.addElement(tercerPunto);
		this.menuDinamico.addElement(cuartoPunto);
	}

	public DefaultSubMenu generaMenuParametros() {
		DefaultSubMenu segundoPunto = new DefaultSubMenu();
		try {
			// REPORTES
			if (this.listaPermisos.contains(".Per1.") || this.listaPermisos.contains(".Per2.")) {
				segundoPunto.setLabel("PARAMETROS");
				segundoPunto.setIcon("fa fa-archive");
				if (this.listaPermisos.contains(".Per3.")) {
					DefaultSubMenu segPunNivUno = new DefaultSubMenu();
					segPunNivUno.setLabel("Categoria");
					DefaultMenuItem segPunNvUnoAsoc = new DefaultMenuItem("Asociar Cat y Sub Cat");
					segPunNvUnoAsoc.setCommand("/ACTION/SUBCATEGORIA/asocCatSubCat.jsf");
					segundoPunto.addElement(segPunNivUno);
					segPunNivUno.addElement(segPunNvUnoAsoc);
				}
				if (this.listaPermisos.contains(".Per4.")) {
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
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return segundoPunto;
	}

	/**
	 * Funcion con la cual genero el menu de reportes
	 * 
	 * @return
	 */
	public DefaultSubMenu generaMenuReportes() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			// REPORTES
			if (this.listaPermisos.contains(".Per3.") || this.listaPermisos.contains(".Per4.")) {
				menuPrincipal.setLabel("REPORTES");
				menuPrincipal.setIcon("fa fa-file-excel-o");
				if (this.listaPermisos.contains(".Per3.")) {
					DefaultMenuItem basico = new DefaultMenuItem("Basico");
					basico.setCommand("/ACTION/REPORTES/reportes.jsf");
					menuPrincipal.addElement(basico);
				}
				if (this.listaPermisos.contains(".Per4.")) {
					DefaultMenuItem comVentas = new DefaultMenuItem("Compras y Ventas");
					comVentas.setCommand("/ACTION/REPORTES/comprasVentas.xhtml");
					menuPrincipal.addElement(comVentas);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}

	public DefaultSubMenu generaMenuProd() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			if (this.listaPermisos.contains(".Inv1.") || this.listaPermisos.contains(".Inv2.")
					|| this.listaPermisos.contains(".Inv3.") || this.listaPermisos.contains(".Inv5.")
					|| this.listaPermisos.contains(".Inv5.") || this.listaPermisos.contains(".Inv6.")
					|| this.listaPermisos.contains(".Inv7.") || this.listaPermisos.contains(".Inv8.")
					|| this.listaPermisos.contains(".Inv9.") || this.listaPermisos.contains(".Inv10.")
					|| this.listaPermisos.contains(".Inv11")) {
				menuPrincipal.setLabel("INVENTARIOS");
				menuPrincipal.setIcon("fa fa-bank");
				if (this.listaPermisos.contains(".Inv1.") || this.listaPermisos.contains(".Inv3.") || this.listaPermisos.contains(".Inv2.")){
					DefaultSubMenu compras = new DefaultSubMenu();
					compras.setLabel("Compras");
					menuPrincipal.addElement(compras);
					if (this.listaPermisos.contains(".Inv1.")) {
						DefaultMenuItem tercerNivel = new DefaultMenuItem("Registro Tem");
						tercerNivel.setCommand("/ACTION/FACTURACION/facturaCompraTmp.jsf?faces-redirect=false");
						compras.addElement(tercerNivel);
					}
					if (this.listaPermisos.contains(".Inv3.")) {
						DefaultMenuItem tercerNivelFacturaCompraTmp = new DefaultMenuItem("Consulta Temporales");
						tercerNivelFacturaCompraTmp
								.setCommand("/ACTION/FACTURACION/consultaFacCompraTmp.jsf?faces-redirect=false");
						compras.addElement(tercerNivelFacturaCompraTmp);
					}
					if (this.listaPermisos.contains(".Inv2.")) {
						DefaultMenuItem tercerNivelFacturaCompra = new DefaultMenuItem("Consulta");
						tercerNivelFacturaCompra
								.setCommand("/ACTION/PRODUCTOS/consultaFacturaCompras.jsf?faces-redirect=false");
						compras.addElement(tercerNivelFacturaCompra);
					}
				}
				if (     this.listaPermisos.contains(".Inv5.")
						|| this.listaPermisos.contains(".Adm5.") || this.listaPermisos.contains(".Inv6.")
						|| this.listaPermisos.contains(".Inv7.")) {
					// Segundo Nivel
					DefaultSubMenu productos = new DefaultSubMenu();
					productos.setLabel("Productos ");
					menuPrincipal.addElement(productos);
					
					
					
					if (this.listaPermisos.contains(".Inv4.")) {
						DefaultMenuItem tercerNivelPrueba = new DefaultMenuItem("Insertar Productos");
						tercerNivelPrueba.setCommand("/ACTION/PRODUCTOS/insertaProductos.jsf?faces-redirect=false");
						productos.addElement(tercerNivelPrueba);
					}
					if (this.listaPermisos.contains(".Inv5.")) {
						DefaultMenuItem tercerNivelPrecio = new DefaultMenuItem("Parametrizacion de precio");
						tercerNivelPrecio.setCommand("/ACTION/PRODUCTOS/precioProductos.jsf?faces-redirect=false");
						productos.addElement(tercerNivelPrecio);
					}
					if (this.listaPermisos.contains(".Inv6.")) {
						DefaultMenuItem tercerNivelConsGeneral = new DefaultMenuItem("Consulta General");
						tercerNivelConsGeneral
								.setCommand("/ACTION/PRODUCTOS/consGeneralProductos.jsf?faces-redirect=false");
						productos.addElement(tercerNivelConsGeneral);

					}
					if (this.listaPermisos.contains(".Inv11.")) {
						DefaultMenuItem tercerNivelConsGeneral2 = new DefaultMenuItem("Consulta Prod X Sede");
						tercerNivelConsGeneral2
								.setCommand("/ACTION/PRODUCTOS/consultaProductosXsede.jsf?faces-redirect=false");
						productos.addElement(tercerNivelConsGeneral2);

					}
					if (this.listaPermisos.contains(".Inv7.")) {
						DefaultMenuItem tercerNivelSolicitudes = new DefaultMenuItem("Solicitudes");
						tercerNivelSolicitudes
								.setCommand("/ACTION/SOLICITUDES/consultaSolicitudes.jsf?faces-redirect=false");
						productos.addElement(tercerNivelSolicitudes);
					}

				}
				if (this.listaPermisos.contains(".Inv8.") || this.listaPermisos.contains(".Inv9.")) {
					DefaultSubMenu cargues = new DefaultSubMenu();
					cargues.setLabel("Cargues Masivos ");
					menuPrincipal.addElement(cargues);
					if (this.listaPermisos.contains(".Inv8.")) {
						DefaultMenuItem cargueProductos = new DefaultMenuItem("Cargue Productos");
						cargueProductos.setCommand("/ACTION/PRODUCTOS/cargueProductos.jsf?faces-redirect=false");
						cargues.addElement(cargueProductos);

					}
					if (this.listaPermisos.contains(".Inv9.")) {
						DefaultMenuItem cargueProd = new DefaultMenuItem("Solo Prod");
						cargueProd.setCommand("/ACTION/PRODUCTOS/cargueSoloProducto.jsf?faces-redirect=false");
						cargues.addElement(cargueProd);
					}
				}
				if (this.listaPermisos.contains(".Inv10.")) {
					DefaultSubMenu aportesSoci = new DefaultSubMenu();
					aportesSoci.setLabel("Aporte Socio");
					menuPrincipal.addElement(aportesSoci);
					if (this.listaPermisos.contains(".Inv10.")) {
						DefaultMenuItem cargarAparte = new DefaultMenuItem("Aportes");
						cargarAparte.setCommand("/ACTION/PRODUCTOS/aporteSocio.jsf?faces-redirect=false");
						aportesSoci.addElement(cargarAparte);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}

	/**
	 * Funcion con la cual genero el menu de administracion, con todos sus hijos
	 * 
	 * @return
	 */
	public DefaultSubMenu generaMenuAdmon() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			if (this.listaPermisos.contains(".Adm1.") || this.listaPermisos.contains(".Adm2.")
					|| this.listaPermisos.contains(".Adm3.") || this.listaPermisos.contains(".Adm4.")
					|| this.listaPermisos.contains(".Adm5.") || this.listaPermisos.contains(".Adm6.")
					|| this.listaPermisos.contains(".Adm7.") || this.listaPermisos.contains(".Adm8.")
					|| this.listaPermisos.contains(".Adm9.") || this.listaPermisos.contains(".Adm10.")) {
				menuPrincipal.setLabel("ADMINISTRACION");
				menuPrincipal.setIcon("fa fa-users");
				// Se generan los submenus de segundo nivel
				// Genero el segundo nivel del menu
				if (this.listaPermisos.contains(".Adm1.")) {
					DefaultMenuItem segundoNivel = new DefaultMenuItem("Resolución Fact.");
					segundoNivel.setCommand("/ACTION/ADMIN/resolucionFacturacion.jsf");
					menuPrincipal.addElement(segundoNivel);
				}
				if (this.listaPermisos.contains(".Adm2.")) {
					// Genero sedes
					DefaultMenuItem segundoNivelUno = new DefaultMenuItem("Sedes.");
					segundoNivelUno.setCommand("/ACTION/ADMIN/sedes.jsf");
					menuPrincipal.addElement(segundoNivelUno);
				}
				if (this.listaPermisos.contains(".Adm3.")) {
					// Genero conteos
					DefaultMenuItem segundoNivelDos = new DefaultMenuItem("Conteo.");
					segundoNivelDos.setCommand("/ACTION/ADMIN/conteos.jsf");
					menuPrincipal.addElement(segundoNivelDos);
				}
				if (this.listaPermisos.contains(".Adm4.")) {
					// Punto de menu para parametros
					DefaultMenuItem segundoNivelTres = new DefaultMenuItem("Parametros.");
					segundoNivelTres.setCommand("/ACTION/ADMIN/parametrosGenerales.jsf");
					menuPrincipal.addElement(segundoNivelTres);
				}
				if (this.listaPermisos.contains(".Adm5.")) {
					// Punto de menu para usuarios
					DefaultMenuItem segundoNivelCuatro = new DefaultMenuItem("Usuarios.");
					segundoNivelCuatro.setCommand("/ACTION/ADMIN/usuarios.jsf");
					menuPrincipal.addElement(segundoNivelCuatro);
				}
				if (this.listaPermisos.contains(".Adm6.")) {
					DefaultMenuItem segundoNivelCinco = new DefaultMenuItem("Proveedores.");
					segundoNivelCinco.setCommand("/ACTION/ADMIN/proveedores.jsf");
					menuPrincipal.addElement(segundoNivelCinco);
				}
				if (this.listaPermisos.contains(".Adm7.")) {
					DefaultMenuItem segundoNivelSeis = new DefaultMenuItem("Clientes.");
					segundoNivelSeis.setCommand("/ACTION/ADMIN/clientes.jsf");
					menuPrincipal.addElement(segundoNivelSeis);

				}
				if (this.listaPermisos.contains(".Adm8.")) {
					DefaultMenuItem segundoNivelSiete = new DefaultMenuItem("Perfiles.");
					segundoNivelSiete.setCommand("/ACTION/ADMIN/perfiles.jsf");
					menuPrincipal.addElement(segundoNivelSiete);
				}
				if (this.listaPermisos.contains(".Adm9.")) {
					DefaultMenuItem segundoNivelOcho = new DefaultMenuItem("Socios.");
					segundoNivelOcho.setCommand("/ACTION/ADMIN/socios.jsf");
					menuPrincipal.addElement(segundoNivelOcho);
				}
				if (this.listaPermisos.contains(".Adm10.")) {
					DefaultMenuItem segundoNivelOcho = new DefaultMenuItem("Param Productos.");
					segundoNivelOcho.setCommand("/ACTION/ADMIN/productosParam.jsf");
					menuPrincipal.addElement(segundoNivelOcho);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}

	/**
	 * Funcion con la cual genero el menu de facturacion, con todos sus hijos
	 * 
	 * @return
	 */
	public DefaultSubMenu generaMenuFacturacion() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			if (this.listaPermisos.contains(".Fact1.") || this.listaPermisos.contains(".Fact2.")
					|| this.listaPermisos.contains(".Fact3.") || this.listaPermisos.contains(".Fact4.")|| this.listaPermisos.contains(".Fact5.")) {
				menuPrincipal.setLabel("FACTURACION");
				menuPrincipal.setIcon("fa fa-files-o");
				if (this.listaPermisos.contains(".Fact1.") || this.listaPermisos.contains(".Fact2.")) {
					DefaultSubMenu item = new DefaultSubMenu("Notas");
					if (this.listaPermisos.contains(".Fact1.")) {
						DefaultMenuItem subItem = new DefaultMenuItem("Credito");
						subItem.setCommand("/ACTION/FACTURACION/notaCredito.jsf");
						item.addElement(subItem);
					}
					if (this.listaPermisos.contains(".Fact2.")) {
						DefaultMenuItem subItem = new DefaultMenuItem("Debito");
						item.addElement(subItem);
					}
					menuPrincipal.addElement(item);
				}
				if (this.listaPermisos.contains(".Fact3.") || this.listaPermisos.contains(".Fact4.")) {
					DefaultSubMenu segundoNivelDos = new DefaultSubMenu("Remisiones");
					if (this.listaPermisos.contains(".Fact3.")) {
						DefaultMenuItem consultaRemi = new DefaultMenuItem("Consulta Remisiones");
						consultaRemi.setCommand("/ACTION/FACTURACION/remisionFacturacion.jsf");
						segundoNivelDos.addElement(consultaRemi);
					}
					if (this.listaPermisos.contains(".Fact4.")) {
						DefaultMenuItem consultaPagos = new DefaultMenuItem("Registro Pagos");
						consultaPagos.setCommand("/ACTION/FACTURACION/pagosRemision.jsf");
						segundoNivelDos.addElement(consultaPagos);
					}
					menuPrincipal.addElement(segundoNivelDos);
				}
				if (this.listaPermisos.contains(".Fact5.")) {
					DefaultMenuItem segundoNivel = new DefaultMenuItem("Consulta Facturas");
					segundoNivel.setCommand("/ACTION/FACTURACION/consultaFacturas.jsf");
					DefaultSubMenu segundoNivelDos = new DefaultSubMenu("Remisiones");
					menuPrincipal.addElement(segundoNivel);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}

	/**
	 * Menu en el cual se generan las importaciones
	 * 
	 * @return
	 */
	public DefaultSubMenu generaMenuImportaciones() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			menuPrincipal.setLabel("IMPORTACIONES");
			menuPrincipal.setIcon("fa fa-briefcase");
			// Se generan los submenus de segundo nivel
			// Genero el segundo nivel del menu
			DefaultMenuItem segundoNivel = new DefaultMenuItem("Info Principal");
			DefaultMenuItem segundoNivelConsulta = new DefaultMenuItem("Consulta Gral");
			segundoNivel.setCommand("/ACTION/IMPORTACION/adminImportacion.jsf");
			segundoNivelConsulta.setCommand("/ACTION/IMPORTACION/consultaImportacion.jsf");

			// Adiciono al punto de menu principal
			menuPrincipal.addElement(segundoNivel);
			menuPrincipal.addElement(segundoNivelConsulta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return menuPrincipal;
	}

	/**
	 * Menu en el cual se generan las importaciones
	 * 
	 * @return
	 */
	public DefaultSubMenu generaMenuContabilidad() {
		DefaultSubMenu menuPrincipal = new DefaultSubMenu();
		try {
			menuPrincipal.setLabel("CONTABILIDAD");
			menuPrincipal.setIcon("fa fa-calculator");
			// Se generan los submenus de segundo nivel
			// Genero el segundo nivel del menu
			DefaultSubMenu segundoNivel = new DefaultSubMenu("PUC");
			DefaultMenuItem tercerNivelConsulta = new DefaultMenuItem("Consulta Gral");
			// tercerNivelConsulta.setCommand("/ACTION/IMPORTACION/adminImportacion.jsf");
			tercerNivelConsulta.setCommand("/ACTION/CONTABILIDAD/CONSULTAS/consultaClase.jsf");

			DefaultSubMenu segundoNivelDos = new DefaultSubMenu("CONSULTA MV.");
			DefaultMenuItem tercerNivelConsultaDos = new DefaultMenuItem("POR TIPO DOCUMENTO");
			tercerNivelConsultaDos.setCommand("/ACTION/CONTABILIDAD/CONSULTAS/consultaMoviContable.jsf");
			
			DefaultMenuItem tercerNivelConsultaTres= new DefaultMenuItem("POR CUENTA");
			//tercerNivelConsultaTres.setCommand("/ACTION/CONTABILIDAD/CONSULTAS/consultaCuentaTotal.jsf");
			tercerNivelConsultaTres.setOutcome("/ACTION/CONTABILIDAD/CONSULTAS/consultaCuentaTotal.jsf");

			// Adiciono al punto de menu principal
			menuPrincipal.addElement(segundoNivel);
			segundoNivel.addElement(tercerNivelConsulta);

			segundoNivelDos.addElement(tercerNivelConsultaDos);
			segundoNivelDos.addElement(tercerNivelConsultaTres);
			menuPrincipal.addElement(segundoNivelDos);
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

	public UsuarioEntity getObjetoSesion() {
		return objetoSesion;
	}

	public void setObjetoSesion(UsuarioEntity objetoSesion) {
		this.objetoSesion = objetoSesion;
	}

}
