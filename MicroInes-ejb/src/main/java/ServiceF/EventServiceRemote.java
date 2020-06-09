package ServiceF;

import Entity.Event;

import javax.ejb.Remote;

@Remote
public interface EventServiceRemote {
	public String consomation();
	public String consomationEvent(int eventId);
	public String consomationScheduler(int eventId);
	public void deleteEvent(int eventID);
	public String addEvent(String organizer);
	public String AddApply(String s,int id);

	}
