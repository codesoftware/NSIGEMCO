package co.com.codesoftware.beans.productos;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.codesoftware.server.nsigemco.AporteSocioEntity;

@ManagedBean
@ViewScoped
public class AportesSociosBean {
private AporteSocioEntity aportes;
private List<AporteSocioEntity> listaAportes;
private List<AporteSocioEntity> listaAportesFiltro;
}
