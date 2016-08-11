package co.com.codesoftware.rest.logica.administracion;

import java.util.List;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import co.com.codesoftware.rest.entidades.SocioEntity;
import co.com.codesoftware.server.Cliente;

public class SocioLogica{
    static class AdministracionRecurso_JerseyClient<T> {

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
    public List<SocioEntity> consultaSocios(){
      	 SocioLogica.AdministracionRecurso_JerseyClient<SocioEntity> ob= new SocioLogica.AdministracionRecurso_JerseyClient<>();
           List<SocioEntity> lista= ob.obtenerSocio(null);
           for(int i=0;i<lista.size();i++){
               System.out.println(""+lista.get(i).getId());
           }
           return lista;
      }
}
