package Models;

public class BookModel {
    private static int idCounter = 0;

    private String title;
    private String author;
    private double prices;
    private int cant;
    private int id;

    public static int getIdCounter() {
        return idCounter;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public BookModel(String title, String author, double prices, int cant, int id) {
        this.title = title;
        this.author = author;
        this.prices = prices;
        this.cant = cant;
        this.id = ++idCounter;
    }
}
