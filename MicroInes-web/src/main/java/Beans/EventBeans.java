package Beans;
import Entity.Event;
import Entity.Product;
import ServiceF.EventService;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.json.JSONArray;
import org.json.JSONObject;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.chart.PieChartModel;
import org.xhtmlrenderer.pdf.ITextRenderer;
import java.io.*;
import java.util.ArrayList;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@ManagedBean(name = "eventBean")
@SessionScoped
public class EventBeans implements Serializable {
	private static final long serialVersionUID = 1L;
	private int IdEvent ;
	private String Name ;
	private String imageE;
	private String description;
	private Date dateD;
	private Date dateF;
	private int hours;
	private Date  date_publication;
	private int nbRate;
	private Date  deadline;
	private int nbVue;
	private int nbApply;
	static Event event1=new Event();
	private Product Product ;
	private  int IdProduct ;
	private Double moyenne_rate;
	private long number_rate;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getIdEvent() {
		return IdEvent;
	}

	public void setIdEvent(int idEvent) {
		IdEvent = idEvent;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getImageE() {
		return imageE;
	}

	public void setImageE(String imageE) {
		this.imageE = imageE;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateD() {
		return dateD;
	}

	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}

	public Date getDateF() {
		return dateF;
	}

	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Date getDate_publication() {
		return date_publication;
	}

	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}

	public int getNbRate() {
		return nbRate;
	}

	public void setNbRate(int nbRate) {
		this.nbRate = nbRate;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public int getNbVue() {
		return nbVue;
	}

	public void setNbVue(int nbVue) {
		this.nbVue = nbVue;
	}

	public int getNbApply() {
		return nbApply;
	}

	public void setNbApply(int nbApply) {
		this.nbApply = nbApply;
	}

	public static Event getEvent1() {
		return event1;
	}

	public static void setEvent1(Event event1) {
		EventBeans.event1 = event1;
	}

	public Double getMoyenne_rate() {
		return moyenne_rate;
	}

	public void setMoyenne_rate(Double moyenne_rate) {
		this.moyenne_rate = moyenne_rate;
	}

	public long getNumber_rate() {
		return number_rate;
	}

	public void setNumber_rate(long number_rate) {
		this.number_rate = number_rate;
	}

	public ArrayList<Object> getListdata() {
		return listdata;
	}

	public void setListdata(ArrayList<Object> listdata) {
		this.listdata = listdata;
	}

	public EventService getEventService() {
		return eventService;
	}

	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	public static Event getEvent() {
		return event;
	}

	public static void setEvent(Event event) {
		EventBeans.event = event;
	}

	public int getIdProduct() {
		return IdProduct;
	}

	public void setIdProduct(int idProduct) {
		IdProduct = idProduct;
	}

	public Entity.Product getProduct() {
		return Product;
	}

	public void setProduct(Entity.Product product) {
		Product = product;
	}

	ArrayList<Object> listdata = new ArrayList<Object>();

	@EJB
	EventService eventService;
	/**************************GetAllEvent**************************************************************/
	@GET
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Object> getAll(){

		String lr= eventService.consomation();
		JSONArray array = new JSONArray(lr);
		ArrayList<Object> listdata = new ArrayList<Object>();

		if (array != null) {
			for (int i=0;i<array.length();i++){

				listdata.add(array.get(i));

			}
		}
		return listdata;
	}
	@GET
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public  String getAllS(){

		String lr= eventService.consomation();
		JSONArray array = new JSONArray(lr);
		ArrayList<Object> listdata = new ArrayList<Object>();

		if (array != null) {
			for (int i=0;i<array.length();i++){

				listdata.add(array.get(i));

			}
		}
		return listdata.toString();
	}
	static Event event=new Event();

	/**************************Add**************************************************************/

	@POST
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public void AddEvent(){
		String jsonString = new JSONObject().put("IdEvent", IdEvent).put("Name", Name).put("imageE",imageE).put("description",description).
		put("hours",hours).put("nbApply",nbApply).
		put("nbVue",nbVue).put("dateF","2020-07-07T12:05:26.033").put("dateD","2020-07-07T12:05:26.033")
				.put("deadline","2020-07-07T12:05:26.033").put("date_publication","2020-07-07T12:05:26.033").
		put("IdProduct",38).toString();
		eventService.addEvent(jsonString);
		System.out.println(jsonString);
		System.out.println("***********Event Added successfully***********");
		System.out.println(eventService.addEvent(jsonString));
	}
	/**************************Rating**************************************************************/
	@PUT
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public String execute(int idEvent) {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String txtAnotherProperty= request.getParameter("rating");
		System.out.println("Hedhi request.getParameter"+txtAnotherProperty);
		int result = Integer.parseInt(txtAnotherProperty);
		System.out.println("Hedhi result"+result);
		String lr= eventService.consomationEvent(idEvent);
		JSONObject array = new JSONObject(lr);
		int ratean = (int) array.get("nbRate");
		int sum =(Integer) (ratean+result)* 5 / 10;
		String jsonString = array
				.put("nbRate",sum)
				.toString();
		eventService.AddApply(jsonString,idEvent);
		return "/listEvent?faces-redirect=true";
	}
	/**************************Apply**************************************************************/
	@PUT
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public void Apply(int id)
	{
		String lr= eventService.consomationEvent(id);
		JSONObject array = new JSONObject(lr);
	     int g = (Integer) array.get("nbApply")+1;
		System.out.println("********************SCENFERFJED ECBECNEKCE CBECEMCHENUCBEICNEBC******************");
		System.out.println(g);
		String jsonString = array
				.increment("nbApply")
				.toString();
		eventService.AddApply(jsonString,id);

		System.out.println(jsonString);
	}
	/**************************Chart**************************************************************/

	public StreamedContent getApplyNumber(){
		int apply=0;
		int nbapp=0;
		/*String lr= eventService.consomationEvent(event1.getIdEvent());
		JSONObject array = new JSONObject(lr);
		//String lr= eventService.consomationEvent(event1.getIdEvent());
		//org.primefaces.json.JSONArray array = new org.primefaces.json.JSONArray(lr);


		String jsonString = array.get(("nbApply")).toString();

		String ApplyList= jsonString;
		org.primefaces.json.JSONArray arrayApply = new org.primefaces.json.JSONArray(ApplyList);
		if (arrayApply != null) {
			for (int i=0;i<arrayApply.length();i++){
				org.primefaces.json.JSONObject object = arrayApply.getJSONObject(i);
				if(object.getInt("nbApply")>1){
					apply=apply+1;
				}

			}
		}*/
		nbapp=apply;
		DefaultPieDataset dataset = new DefaultPieDataset();

		dataset.setValue("Apply= "+apply, apply);



		StreamedContent chart = null;
		JFreeChart jfreechart = ChartFactory.createPieChart("Number Of Apply: "+nbapp, dataset, true, true, false);
		File chartFile1 = new File("dynamichart");
		try {
			ChartUtilities.saveChartAsPNG(chartFile1, jfreechart, 375, 300);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			chart = new DefaultStreamedContent(new FileInputStream(chartFile1),"image/png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return chart ;

	}
	/**************************Delete**************************************************************/

	@DELETE
	@Path("{IdEvent}")
	@Consumes(MediaType.APPLICATION_JSON)
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public void eventDelete(@PathParam("IdEvent") int IdEvent){
		System.out.println("*********Delete event*******");
		eventService.deleteEvent(IdEvent);
		System.out.println("****************************");
	}
	/**************************Nombre Vue**************************************************************/
	@PUT
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public void NbVue(int id)
	{
		String lr= eventService.consomationEvent(id);
		JSONObject array = new JSONObject(lr);
		int g = (Integer) array.get("nbVue")+1;

		String jsonString = array
				.put("nbVue",g)
				.toString();
		eventService.AddApply(jsonString,id);

		System.out.println(jsonString);
	}
	/**************************DETAILS**************************************************************/
	@GET
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public Object getEventDetail(){
		NbVue(event1.getIdEvent());
		String lr= eventService.consomationEvent(event1.getIdEvent());
		JSONObject array = new JSONObject(lr);
		return array;
	}

	public String getPageDetails(int eventId){

		event1.setIdEvent(eventId);
		return "/eventDetails?faces-redirect=true";

	}
	/**************************DETAILS**************************************************************/
	public void createPDF(int eventId){
		event1.setIdEvent(eventId);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		HttpSession session = (HttpSession) externalContext.getSession(true);
		String url = "http://localhost:8080/MicroInes-web/pdf.xhtml;JSESSIONID="+session.getId()+"pdf=true";
		try {
			ITextRenderer renderer = new ITextRenderer();
			renderer.setDocument(url);
			renderer.layout();
			HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
			response.reset();
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition","/Users/inesatia/Desktop/first.pdf");
			OutputStream browserStream = response.getOutputStream();
			renderer.createPDF(browserStream);
			browserStream.close();
			session.invalidate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		facesContext.responseComplete();

	}






}
