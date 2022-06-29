package creationalPatterns.singleton.example.logger;

public class Invoice {
    private String detail;
    private int invoiceNumber;
    private int total;

    public Invoice(){
        Logger.getInstance().info("Invoice created");
    }

    public String getDetail() {
        Logger.getInstance().info("Invoice - getDetail");
        return detail;
    }

    public void setDetail(String detail) {
        Logger.getInstance().info("Invoice - setDetail");
        this.detail = detail;
    }

    public int getInvoiceNumber() {
        Logger.getInstance().info("Invoice - getInvoiceNumber");
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        Logger.getInstance().info("Invoice - setInvoiceNumber");
        this.invoiceNumber = invoiceNumber;
    }

    public int getTotal() {
        Logger.getInstance().info("Invoice - getTotal");
        return total;
    }

    public void setTotal(int total) {
        Logger.getInstance().info("Invoice - setTotal");
        this.total = total;
    }
}
