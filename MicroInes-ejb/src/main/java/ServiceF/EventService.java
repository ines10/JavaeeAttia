package ServiceF;

import org.json.JSONArray;
import org.json.JSONObject;
import Entity.Event;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Stateless
@LocalBean
public class EventService implements EventServiceRemote, EventServiceLocal {

    
    public EventService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String consomation() {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://10.211.55.7:6415/api/Events");
		
		Response response=target.request().get();
		String result=response.readEntity(String.class);
		
		//response.close();
		return result;
	}

	@Override
	public String consomationEvent(int eventId) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://10.211.55.7:6415/api/Events/"+eventId);
		Response response=target.request().get();
		String result=response.readEntity(String.class);
		return result;
	}
	@Override
	public String consomationScheduler(int eventId) {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("https://10.211.55.7:44326/api/Products/"+eventId);
		Response response=target.request().get();
		String result=response.readEntity(String.class);
		return result;
	}
	


	@Override
	public void deleteEvent(int eventID) {
		Client client=ClientBuilder.newClient();
		WebTarget target =client.target("http://10.211.55.7:6415/api/Events/"+eventID);
		Invocation.Builder invocationBuilder = target.request();
        invocationBuilder.delete();
	}

	@Override
	public String addEvent(String Event) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://10.211.55.7:6415/api/Events/PostEvent");
		Invocation.Builder invocationBuilder = target.request();
		Response response = invocationBuilder.post(Entity.entity(Event, MediaType.APPLICATION_JSON));
		return response.readEntity(String.class);
	}

	@Override
	public String AddApply(String s,int id) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://10.211.55.7:6415/api/Events/"+id);
		Invocation.Builder invocationBuilder = target.request();
		Response response = invocationBuilder.put(Entity.entity(s, MediaType.APPLICATION_JSON));
		return response.readEntity(String.class);
	}



}
