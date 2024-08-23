package Models;

public class ItemsModels {
    private int id ;
    private String description;
    private int cant;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemsModels() {
    }

    public ItemsModels(int id, String description, int cant, double price) {
        this.id = id;
        this.description = description;
        this.cant = cant;
        this.price = price;
    }
    public double calcularPrecioTotal() {
        return this.price * this.cant;
    }

    public String toString() {
        return "ItemVenta[id=" + id + ", descripcion=" + description +
                ", cantidad=" + cant + ", pUnitario=" + price +
                ", pTotal=" + calcularPrecioTotal() + "]";
    }
}
