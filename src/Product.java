public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void productInfo() {
        System.out.print("Produkt: " + name + ", " + description);
        if (category != null) {
            System.out.print(". Kategoria: " + category.name + ", " + category.description);
        }
        System.out.println(". Cena: " + price);
    }
}

