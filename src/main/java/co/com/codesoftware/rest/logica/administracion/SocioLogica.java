package co.com.codesoftware.rest.logica.administracion;

import java.util.List;
import java.util.Map;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import com.google.gson.Gson;

import co.com.codesoftware.rest.entidades.SocioEntity;

public class SocioLogica {
	static class AdministracionRecurso_JerseyClient {

		private WebTarget webTarget;
		private Client client;
		private static final String BASE_URI = "http://localhost:8084/SIGEMCORS/rest";

		public AdministracionRecurso_JerseyClient() {
			client = javax.ws.rs.client.ClientBuilder.newClient();
			webTarget = client.target(BASE_URI).path("admin");
		}

		public <T> T obtenerSocios(Class<T> responseType) throws ClientErrorException {
			return webTarget.path("socio/lista").request().post(null, responseType);
		}

		public String insertarSocio() throws ClientErrorException {
			return webTarget.path("socio/insertar").request().post(null, String.class);
		}

		public <T> T obtenerSocio(Class<T> responseType) throws ClientErrorException {
			return webTarget.path("socio").request().post(null, responseType);
		}

		public String actualizarSocio() throws ClientErrorException {
			return webTarget.path("socio/actualizar").request().post(null, String.class);
		}

		public void close() {
			client.close();
		}
	}

	public List<SocioEntity> consultaSocios() {
		SocioLogica.AdministracionRecurso_JerseyClient ob = new AdministracionRecurso_JerseyClient();
		List<Object> lista = ob.obtenerSocios(List.class);
		System.out.println("size:" + lista.size());
		Gson gson = new Gson();
		String json = gson.toJson(lista);
		System.out.println(json);
		ob.close();
		return null;
	}
}
