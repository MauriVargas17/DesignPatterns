package creationalPatterns.singleton.example.logger;

public class Supplier {
    private String name;
    private String address;
    private String phone;

    public Supplier(){
        Logger.getInstance().info("Supplier created");
    }

    public String getName() {
        Logger.getInstance().info("Supplier - getName");
        return name;
    }

    public void setName(String name) {
        Logger.getInstance().info("Supplier - setName");
        this.name = name;
    }

    public String getAddress() {
        Logger.getInstance().info("Supplier - getAddress");
        return address;
    }

    public void setAddress(String address) {
        Logger.getInstance().info("Supplier - setAddress");
        this.address = address;
    }

    public String getPhone() {
        Logger.getInstance().info("Supplier - getPhone");
        return phone;
    }

    public void setPhone(String phone) {
        Logger.getInstance().info("Supplier - setPhone");
        this.phone = phone;
    }
}
