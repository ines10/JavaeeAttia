package Entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

    private int IdProduit ;

    public Product() {
    }

    public Product(int idProduit, String nom, String imageP, String description, Entity.CategorieP categorieP) {
        IdProduit = idProduit;
        Nom = nom;
        this.imageP = imageP;
        this.description = description;
        CategorieP = categorieP;
    }
    public Product(int idProduit, String nom, String imageP, String description, Entity.CategorieP categorieP, String barcode, String marque, double price, Date dateC, Date dateF, int qte) {
        IdProduit = idProduit;
        Nom = nom;
        this.imageP = imageP;
        this.description = description;
        CategorieP = categorieP;
        this.barcode = barcode;
        this.marque = marque;
        this.price = price;
        this.dateC = dateC;
        this.dateF = dateF;
        this.qte = qte;
    }
    public Product(int idProduit, String nom, String imageP, String description, Entity.CategorieP categorieP, String barcode, String marque, double price, Date dateC, Date dateF, int qte, Rayon rayon) {
        IdProduit = idProduit;
        Nom = nom;
        this.imageP = imageP;
        this.description = description;
        CategorieP = categorieP;
        this.barcode = barcode;
        this.marque = marque;
        this.price = price;
        this.dateC = dateC;
        this.dateF = dateF;
        this.qte = qte;
        this.rayon = rayon;
    }

    public Product(int idProduit, String nom, String imageP, String description, Entity.CategorieP categorieP, String barcode, String marque, double price, Date dateC, Date dateF, int qte, Rayon rayon, Event event) {
        IdProduit = idProduit;
        Nom = nom;
        this.imageP = imageP;
        this.description = description;
        CategorieP = categorieP;
        this.barcode = barcode;
        this.marque = marque;
        this.price = price;
        this.dateC = dateC;
        this.dateF = dateF;
        this.qte = qte;
        this.rayon = rayon;
        this.event = event;
    }

    private String Nom ;
    private String imageP;
    private String description ;
    private Entity.CategorieP CategorieP;
    private String barcode;

    private String marque;

    private double   price;

    private Date dateC;
    private Date   dateF;
    private int qte;

    private Rayon rayon;

    private Event event;

    public Product(Rayon rayon) {
        this.rayon = rayon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateC() {
        return dateC;
    }

    public void setDateC(Date dateC) {
        this.dateC = dateC;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getIdProduit() {
        return IdProduit;
    }

    public void setIdProduit(int idProduit) {
        IdProduit = idProduit;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getImageP() {
        return imageP;
    }

    public void setImageP(String imageP) {
        this.imageP = imageP;
    }

    public Entity.CategorieP getCategorieP() {
        return CategorieP;
    }

    public void setCategorieP(Entity.CategorieP categorieP) {
        CategorieP = categorieP;
    }
}
