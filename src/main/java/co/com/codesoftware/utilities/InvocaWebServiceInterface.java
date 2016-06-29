package co.com.codesoftware.utilities;

import co.com.codesoftware.server.nsigemco.AdministrationEndPoint;
import co.com.codesoftware.server.nsigemco.AdministrationEndPoint_Service;
/**
 * Interface con la cual se implementan  
 * @author nicolas
 *
 */
public interface InvocaWebServiceInterface {
	public AdministrationEndPoint_Service service = new AdministrationEndPoint_Service();
	public AdministrationEndPoint port = service.getAdministrationEndPointPort();
	
	public String valida = "OK";

}