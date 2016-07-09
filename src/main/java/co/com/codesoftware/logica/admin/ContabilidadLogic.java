package co.com.codesoftware.logica.admin;

import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.contabilidad.ClaseEntity;
import co.com.codesoftware.servicio.contabilidad.CuentaEntity;
import co.com.codesoftware.servicio.contabilidad.GrupoEntity;
import co.com.codesoftware.servicio.contabilidad.MoviContableEntity;
import co.com.codesoftware.servicio.contabilidad.SubCuentaEntity;
import co.com.codesoftware.utilities.Utilitites;
import co.com.codesoftware.utilities.WSGeneralInterface;

public class ContabilidadLogic implements WSGeneralInterface {
	/**
	 * Funcion con la cual obtengo las clases que tiene parametrizada en el sistema
	 * @return
	 */
	public List<ClaseEntity> obtenerClases(){
		List<ClaseEntity> rta = null;
		try {
			rta = conexionWSContabilidad().getPortContabilidad().obtenerClases();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual obtengo los grupos por medio del id de la clase
	 * @param idClase
	 * @return
	 */
	public List<GrupoEntity> obtenerGrupoXClase(Integer idClase){
		List<GrupoEntity> lista = null;
		try {
			lista = conexionWSContabilidad().getPortContabilidad().obtenerGruposXClase(idClase);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	/**
	 * Funcion con la cual obtengo las cuentas por medio de un grupo
	 * @param idGrupo
	 * @return
	 */
	public List<CuentaEntity> obtenerCuentaXGrupo(Integer idGrupo){
		List<CuentaEntity> rta = null;
		try {
			rta = conexionWSContabilidad().getPortContabilidad().obtenerCuentaXGrupo(idGrupo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual obtengo 
	 * @param idCuenta
	 * @return
	 */
	public List<SubCuentaEntity> obtenerSubCuentaXCuenta(Integer idCuenta){
		List<SubCuentaEntity> rta = null;
		try {
			rta = conexionWSContabilidad().getPortContabilidad().obtenerSubCuentaXCuenta(idCuenta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual inserta un auxiliar contable
	 * @return
	 */
	public String insertarAuxiliar(AuxContableEntity objEntity){
		String rta = "";
		try {
			rta = conexionWSContabilidad().getPortContabilidad().insertaAuxiliarCont(objEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la cual obtengo los auxiliares contables por medio de la subcuenta
	 * @param idSubCuenta
	 * @return
	 */
	public List<AuxContableEntity> obtenerAuxiliarContXSubCuenta(Integer idSubCuenta){
		List<AuxContableEntity> rta = null;
		try {
			rta = conexionWSContabilidad().getPortContabilidad().obtenerAuxContableXSubCuenta(idSubCuenta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	/**
	 * Funcion con la cual obtengo los auxiliares contables por medio de un criterio
	 * @param idSubCuenta
	 * @return
	 */
	public List<AuxContableEntity> obtenerAuxiliarContXCriterio(String criterio){
		List<AuxContableEntity> rta = null;
		try {
			rta = conexionWSContabilidad().getPortContabilidad().obtenerAuxContableXCrit(criterio);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con la obtengo un auxiliar contable por medio de su id
	 * @param idAux
	 * @return
	 */
	public AuxContableEntity obtenerAuxiliarContableXId(Integer idAux){
		AuxContableEntity aux = null;
		try {
			aux = conexionWSContabilidad().getPortContabilidad().obtenerAuxContableXId(idAux);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return aux;
	}
	/**
	 * Funcion con la cual obtengo el asiento contable de una transacion 
	 * @return
	 */
	public List<MoviContableEntity> obtenerAsientoContable(Integer idTrans){
		List<MoviContableEntity> rta = null;
		try {
			rta = conexionWSContabilidad().getPortContabilidad().obtenerAsientoContable(idTrans);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	/**
	 * Funcion con el cual se obtienen los movimientos contalbes por medio de parametros
	 * @param fechaIni
	 * @param fechaFin
	 * @param tipoDoc
	 * @return
	 */
	public List<MoviContableEntity> obtenerMovimientosContable(Date fechaIni, Date fechaFin, String tipoDoc){
		List<MoviContableEntity> rta = null;
		try {
			XMLGregorianCalendar fechaI = Utilitites.dateToXMLGC(fechaIni);
			XMLGregorianCalendar fechaF = Utilitites.dateToXMLGC(fechaFin);
			rta = conexionWSContabilidad().getPortContabilidad().obtenerMovimientosContables(fechaI, fechaF, tipoDoc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
}
