public class SpecialOffer {
    Product product;
    String description;
    String date;
    double discount;

    public SpecialOffer(Product product, String description, String date, double discount) {
        this.product = product;
        this.description = description;
        this.date = date;
        this.discount = discount;
        product.setPrice(product.getPrice()*(1-discount));

        System.out.println("UWAGA!!! Oferta promocyjna: " + product.name + " posiada cenę obniżoną o " + discount*100 +
                "%! Kupuj teraz z kartą SmartShop!");
    }
}