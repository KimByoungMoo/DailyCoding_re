package src.ditest;

public class Menu {

    private int id;
    private String Name;
    private int Price;

    public Menu(int id, String name, int price) {
        this.id = id;
        Name = name;
        Price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
