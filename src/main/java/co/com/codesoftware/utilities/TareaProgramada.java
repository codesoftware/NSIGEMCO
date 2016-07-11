package co.com.codesoftware.utilities;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TareaProgramada {
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		//se ejecuta la tarea programada
		EnviaCorreosLogica logica = new EnviaCorreosLogica();
		try {
			logica.enviaCorreosFacturaCompra();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
