public class Shop {
    public static void main(String[] args) {
        Category categoryBread = new Category("Pieczywo", "na śniadanie i kolację");
        Category categoryDairy = new Category("Produkty mleczne", "uwaga - może zawierać laktozę");

        Product bread = new Product("Chleb", 2.40, "pszenny na zakwasie", categoryBread);
        Product kaiser = new Product("Kajzerka", 0.89, "bułka pszenna", categoryBread);
        Product milk = new Product("Mleko", 1.99, "z laktozą, 2% tłuszczu", categoryDairy);
        Product candyBar = new Product("Baton", 2.99, "czekoladowy z rodzynkami");

        SpecialOffer specialOffer = new SpecialOffer(bread,"Oferta weekendowa",
                "od 09.10.2020 do 11.10.2020", 0.2);
        bread.productInfo();
        kaiser.productInfo();
        milk.productInfo();
        candyBar.productInfo();

    }
}