package co.com.codesoftware.beans.productos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.com.codesoftware.beans.consultas.admin.FiltrosServiceBean;
import co.com.codesoftware.logica.ProductosLogica;
import co.com.codesoftware.logica.ReferenciaLogica;
import co.com.codesoftware.server.nsigemco.CategoriaEntity;
import co.com.codesoftware.server.nsigemco.ProductoEntity;
import co.com.codesoftware.server.nsigemco.ReferenciaEntity;
import co.com.codesoftware.server.nsigemco.RespuestaEntity;
import co.com.codesoftware.server.productos.PrecioProdSimpleEntity;
import co.com.codesoftware.servicio.general.SedeEntity;
import co.com.codesoftware.servicio.usuario.UsuarioEntity;
import co.com.codesoftware.utilities.ErrorEnum;

@ManagedBean
@ViewScoped
public class CambioPrecioProductoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UsuarioEntity objSession;
	private CategoriaEntity categoriaSelect;
	private List<CategoriaEntity> listaCate;
	private List<ReferenciaEntity> listaRefe;
	private ReferenciaEntity referenciaSelect;
	@ManagedProperty("#{filtrosService}")
	private FiltrosServiceBean filtrosService;
	private ErrorEnum enumer;
	// Lista con los resultados de la busqueda
	private List<ProductoEntity> resultadoConsulta;
	private List<ProductoEntity> filteredConsulta;
	private boolean resultConsulta;
	// Objeto con el cual selecciono
	private ProductoEntity producto;
	private boolean panelProducto;
	private BigDecimal precioProducto;
	// Lista de sedes
	private SedeEntity sedeSelect;
	// Codigo externo para busqueda directa
	private String codigoExterno;
	// Lista con el historico de precios de un producto por sede
	private List<PrecioProdSimpleEntity> listaPrecios;
	// Indica si el precio sera estatico para el producto en esta sede
	private boolean precioFijo;
	private BigDecimal precioUni;
	private BigDecimal precioDec;
	private BigDecimal precioMil;
	// Id de la categoria Seleccionada
	private Integer idCate;

	@PostConstruct
	public void init() {
		try {
			this.listaCate = filtrosService.serviceObtieneCategorias();
			resultConsulta = false;
			panelProducto = false;
			this.precioProducto = new BigDecimal("0");
			this.precioUni = new BigDecimal("0");
			this.precioDec = new BigDecimal("0");
			this.precioMil = new BigDecimal("0");
			objSession = (UsuarioEntity) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("dataSession");
			this.precioFijo = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Evento con el cual se captura el cambio de select de categoria
	 */
	public void cambioSelectCate() {
		try {
			if (this.idCate == -1) {
				this.setEnumer(ErrorEnum.WARNING);
				this.messageBean("Por favor seleccione una categoria");
			} else {
				ReferenciaLogica logica = new ReferenciaLogica();
				//this.listaRefe = logica.obtieneReferenciasXcate(categoriaSelect.getId());
				this.listaRefe = logica.obtieneReferenciasXcate(this.idCate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se realiza la busqueda general de productos
	 */
	public void buscarProductos() {
		try {
			if (this.codigoExterno != null & !"".equalsIgnoreCase(this.codigoExterno.trim())) {
				ProductosLogica objLogica = new ProductosLogica();
				resultadoConsulta = objLogica.buscaProductosXCodigoExterno(this.codigoExterno.toUpperCase());
				if (resultadoConsulta == null) {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("La consulta no arrojo ningun resultado ");
				} else {
					resultConsulta = true;
				}
			} else {
				if (this.idCate == null && this.idCate != -1) {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Por favor seleccione una Categoria");
				} else if (this.referenciaSelect == null) {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean("Por favor seleccione una Referencia");
				} else {
					ProductosLogica objLogica = new ProductosLogica();
					resultadoConsulta = objLogica.buscaProductosXCatSubMarc(this.idCate,
							referenciaSelect.getDescripcion(), null);
					if (resultadoConsulta == null) {
						this.setEnumer(ErrorEnum.ERROR);
						this.messageBean("La consulta no arrojo ningun resultado ");
					} else {
						resultConsulta = true;
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funcion con la cual se busca el historico de un producto
	 */
	public void buscaHistoricoProductos() {
		if (producto == null) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Por favor Seleccione un producto");
		} else if (sedeSelect == null) {
			this.setEnumer(ErrorEnum.ERROR);
			this.messageBean("Por favor seleccione una sede");
		} else {
			ProductosLogica objLogica = new ProductosLogica();
			listaPrecios = objLogica.buscaPreciosHistoricosProdXSede(producto.getId(), sedeSelect.getId());
			this.setEnumer(ErrorEnum.SUCCESS);
			this.messageBean("ahora si");
		}

	}

	public CategoriaEntity getCategoriaSelect() {
		return categoriaSelect;
	}

	public void setCategoriaSelect(CategoriaEntity categoriaSelect) {
		this.categoriaSelect = categoriaSelect;
	}

	public List<CategoriaEntity> getListaCate() {
		return listaCate;
	}

	public void setListaCate(List<CategoriaEntity> listaCate) {
		this.listaCate = listaCate;
	}

	public FiltrosServiceBean getFiltrosService() {
		return filtrosService;
	}

	public void setFiltrosService(FiltrosServiceBean filtrosService) {
		this.filtrosService = filtrosService;
	}

	/**
	 * Funcion la cual se utiliza para visualizar los mensajes
	 * 
	 * @param message
	 */
	public void messageBean(String message) {
		switch (this.enumer) {
		case ERROR:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
			break;
		case FATAL:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "Error de sistema"));
			break;
		case SUCCESS:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Ok!", message));
			break;
		case WARNING:
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Precaución!", message));
			break;
		default:
			break;
		}
	}

	/**
	 * Funcion con la cual obtengo las referencias asociadas basado en la
	 * categoria que selecciono previamente
	 * 
	 * @return
	 */
	public List<ReferenciaEntity> completaReferenciaXCat(String query) {
		List<ReferenciaEntity> respuesta = null;
		try {
			if (idCate != null && idCate != -1) {
				if (query != null && query.length() != 0) {
					if (query.length() != 0) {
						for (ReferenciaEntity item : listaRefe) {
							if ((item.getNombre().toUpperCase()).contains(query.toUpperCase())) {
								if (respuesta == null) {
									respuesta = new ArrayList<ReferenciaEntity>();
								}
								respuesta.add(item);
							}
						}
					}
				}
			} else {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Por Favor seleccione una categoria antes de seleccionar una subcategoria");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	public ErrorEnum getEnumer() {
		return enumer;
	}

	public void setEnumer(ErrorEnum enumer) {
		this.enumer = enumer;
	}

	public ReferenciaEntity getReferenciaSelect() {
		return referenciaSelect;
	}

	public void setReferenciaSelect(ReferenciaEntity referenciaSelect) {
		this.referenciaSelect = referenciaSelect;
	}

	public List<ReferenciaEntity> getListaRefe() {
		return listaRefe;
	}

	public void setListaRefe(List<ReferenciaEntity> listaRefe) {
		this.listaRefe = listaRefe;
	}

	public List<ProductoEntity> getResultadoConsulta() {
		return resultadoConsulta;
	}

	public void setResultadoConsulta(List<ProductoEntity> resultadoConsulta) {
		this.resultadoConsulta = resultadoConsulta;
	}

	public List<ProductoEntity> getFilteredConsulta() {
		return filteredConsulta;
	}

	public void setFilteredConsulta(List<ProductoEntity> filteredConsulta) {
		this.filteredConsulta = filteredConsulta;
	}

	public boolean isResultConsulta() {
		return resultConsulta;
	}

	public void setResultConsulta(boolean resultConsulta) {
		this.resultConsulta = resultConsulta;
	}

	public ProductoEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}

	/**
	 * Funcion con la cual selecciono un producto
	 * 
	 * @param objEntity
	 * @return
	 */
	public void seleccionoProducto(ProductoEntity objEntity) {
		try {
			producto = objEntity;
			panelProducto = true;
			resultConsulta = false;
			resultadoConsulta = null;
			RequestContext.getCurrentInstance().execute("busca();");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Funcion con la cual me encargo de parametrizar el precio
	 */
	public void parametrizarPrecio() {
		try {
			if (producto == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error por favor busque y adicione un producto antes de parametrizar el precio");
			} else if (sedeSelect == null) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error por favor seleccione una sede para parametrizar el precio del producto");
			} else if (precioProducto.compareTo(new BigDecimal(0)) == -1) {
				this.setEnumer(ErrorEnum.ERROR);
				this.messageBean("Error el precio debe ser superior a cero");
			} else {
				ProductosLogica objLogica = new ProductosLogica();
				String precioEstatico = "";
				if (precioFijo) {
					precioEstatico = "S";
				} else {
					precioEstatico = "N";
				}
				RespuestaEntity rta = objLogica.cambiaPrecioproducto(objSession.getId(), sedeSelect.getId(),
						producto.getId(), precioProducto, precioUni, precioDec, precioMil, precioEstatico);
				if (rta.getCodigoRespuesta() == 1) {
					this.setEnumer(ErrorEnum.SUCCESS);
					this.messageBean(rta.getMensajeRespuesta());
				} else {
					this.setEnumer(ErrorEnum.ERROR);
					this.messageBean(rta.getMensajeRespuesta() + " " + rta.getDescripcionRespuesta());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isPanelProducto() {
		return panelProducto;
	}

	public void setPanelProducto(boolean panelProducto) {
		this.panelProducto = panelProducto;
	}

	public BigDecimal getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(BigDecimal precioProducto) {
		this.precioProducto = precioProducto;
	}

	public SedeEntity getSedeSelect() {
		return sedeSelect;
	}

	public void setSedeSelect(SedeEntity sedeSelect) {
		this.sedeSelect = sedeSelect;
	}

	public UsuarioEntity getObjSession() {
		return objSession;
	}

	public void setObjSession(UsuarioEntity objSession) {
		this.objSession = objSession;
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	public List<PrecioProdSimpleEntity> getListaPrecios() {
		return listaPrecios;
	}

	public void setListaPrecios(List<PrecioProdSimpleEntity> listaPrecios) {
		this.listaPrecios = listaPrecios;
	}

	public boolean isPrecioFijo() {
		return precioFijo;
	}

	public void setPrecioFijo(boolean precioFijo) {
		this.precioFijo = precioFijo;
	}

	public BigDecimal getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(BigDecimal precioUni) {
		this.precioUni = precioUni;
	}

	public BigDecimal getPrecioDec() {
		return precioDec;
	}

	public void setPrecioDec(BigDecimal precioDec) {
		this.precioDec = precioDec;
	}

	public BigDecimal getPrecioMil() {
		return precioMil;
	}

	public void setPrecioMil(BigDecimal precioMil) {
		this.precioMil = precioMil;
	}

	public Integer getIdCate() {
		return idCate;
	}

	public void setIdCate(Integer idCate) {
		this.idCate = idCate;
	}

}
