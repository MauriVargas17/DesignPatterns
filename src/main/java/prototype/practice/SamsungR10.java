package prototype.practice;

public class SamsungR10 implements IPrototype{

    private int size;
    private String cpu;
    private int memory;
    private Sim sim;
    private int androidVersion;
    private String camera;
    private int bluetooth;
    private int externalMemoriesCapacity;
    private String batteryType;
    private Accessory[] accessories;

    @Override
    public Object clone() {
        SamsungR10 clone = new SamsungR10();
        clone.setSize(getSize());
        clone.setCpu(getCpu());
        clone.setMemory(getMemory());
        clone.setSim(getSim());
        clone.setAndroidVersion(getAndroidVersion());
        clone.setCamera(getCamera());
        clone.setBluetooth(getBluetooth());
        clone.setExternalMemoriesCapacity(getExternalMemoriesCapacity());
        clone.setBatteryType(getBatteryType());
        clone.setAccessories(getAccessories());
        return clone;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getExternalMemoriesCapacity() {
        return externalMemoriesCapacity;
    }

    public void setExternalMemoriesCapacity(int externalMemoriesCapacity) {
        this.externalMemoriesCapacity = externalMemoriesCapacity;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }
}
