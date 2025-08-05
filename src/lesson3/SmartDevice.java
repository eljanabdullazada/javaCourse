package lesson3;

public class SmartDevice {

    private String brand;
    private String model;
    private boolean isOnline;

    public SmartDevice(String brand, String model, boolean isOnline) {
        this.brand = brand;
        this.model = model;
        this.isOnline = isOnline;
    }

    protected String connectToWiFi() {
        if(!isOnline){
            this.isOnline = true;
            return brand + " " + model + " " + "connected to WiFi";
        }
        return brand + " " + model + " " + "was already online";
    }

    protected String disconnect() {
        if(isOnline){
            this.isOnline = false;
            return brand + " " + model + " " + "is offline";
        }
        return brand + " " + model + " " + " was already disconnected";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public String toString() {
        if(isOnline )return "Smart Device: " + brand + " " + model + " is online";
        return "Smart Device: " + brand + " " + model + " is offline";
    }
}
