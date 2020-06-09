package Entity;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {


    private int IdEvent ;
    private String Name ;
    private String imageE;
    private String description;
    private Date dateD;
    private Date dateF;
    private int hours;
    private Date  date_publication;

    private Date  deadline;
    private int nbVue;
    private int nbApply;
    private int nbRate;

    private  int IdProduct ;

    public int getNbRate() {
        return nbRate;
    }

    public void setNbRate(int nbRate) {
        this.nbRate = nbRate;
    }

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }

    public Event() {
    }



    public Event(String Name, String imageE, String description, int hours, Date  deadline, int IdProduct){
        //this.IdEvent = IdEvent;
        this.Name = Name;
        this.imageE = imageE;
        this.description = description;
        this.hours = hours;
        this.deadline = deadline;
        this.IdProduct = IdProduct;
    }
    public Event(String Name, String imageE, String description, int hours, Date  deadline){
        //this.IdEvent = IdEvent;
        this.Name = Name;
        this.imageE = imageE;
        this.description = description;
        this.hours = hours;
        this.deadline = deadline;
    }
    public Event(int IdEvent , int nbApply){
        this.IdEvent = IdEvent;
        this.nbApply = nbApply;
    }
    public Event(String Name, String imageE, String description, int hours, Date  deadline, int nbVue, int nbApply){
        this.Name = Name;
        this.imageE = imageE;
        this.description = description;
        this.hours = hours;
        this.deadline = deadline;
    }
    public Event(int idEvent, String name, String imageE, String description, int hours, int nbVue, int nbApply) {
        IdEvent = idEvent;
        Name = name;
        this.imageE = imageE;
        this.description = description;
        this.hours = hours;
        this.nbVue = nbVue;
        this.nbApply = nbApply;
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

}
