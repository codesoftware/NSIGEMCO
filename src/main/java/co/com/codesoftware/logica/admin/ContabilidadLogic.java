package co.com.codesoftware.logica.admin;

import java.util.List;

import co.com.codesoftware.servicio.contabilidad.AuxContableEntity;
import co.com.codesoftware.servicio.contabilidad.ClaseEntity;
import co.com.codesoftware.servicio.contabilidad.CuentaEntity;
import co.com.codesoftware.servicio.contabilidad.GrupoEntity;
import co.com.codesoftware.servicio.contabilidad.SubCuentaEntity;
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

}
