package creationalPatterns.singleton.example.logger;

public class ClientExample {
    public static void main(String[] args){
        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber(342);
        invoice.getInvoiceNumber();

        Supplier supplier = new Supplier();
        supplier.setName("Robert");
        supplier.getName();

        Product product = new Product();
        product.setPrice(199);
        product.getPrice();
        product.promoPrice();

        Client client = new Client();
        client.setId("12");
        client.getId();
        client.getName();
    }
}
