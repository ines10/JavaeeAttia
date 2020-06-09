package Entity;


import java.util.List;


public class Rayon {


    private int IdRayon;

    private String description ;

    private  String typeR ;

    private   String imageR ;

    private String flag ;
    private List<Product> Products;
    public Rayon() {
    }


    public List<Product> getProducts() {
        return (List<Product>) Products;
    }

    public Rayon(int idRayon, String description, String typeR, String imageR, String flag, List<Product> products) {
        IdRayon = idRayon;
        this.description = description;
        this.typeR = typeR;
        this.imageR = imageR;
        this.flag = flag;
        Products = products;
    }
    public Rayon(int idRayon, String description, String typeR, String imageR, String flag) {
        IdRayon = idRayon;
        this.description = description;
        this.typeR = typeR;
        this.imageR = imageR;
        this.flag = flag;
    }
    public void setProducts(List<Product> products) {
        Products = products;
    }

    public int getIdRayon() {
        return IdRayon;
    }

    public void setIdRayon(int idRayon) {
        IdRayon = idRayon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeR() {
        return typeR;
    }

    public void setTypeR(String typeR) {
        this.typeR = typeR;
    }

    public String getImageR() {
        return imageR;
    }

    public void setImageR(String imageR) {
        this.imageR = imageR;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
