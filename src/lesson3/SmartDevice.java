package lesson3;

public class SmartDevice {

    private String brand;
    private String model;
    private boolean isOnline;

    public SmartDevice(){}

    public SmartDevice(String brand, String model, boolean isOnline) {
        this.brand = brand;
        this.model = model;
        this.isOnline = isOnline;
    }

    private String connectToWiFi(String brand, String model, boolean isOnline) {
        if(!isOnline){
            this.isOnline = true;
            return brand + " " + model + " " + "connected to WiFi";
        }
        return brand + " " + model + " " + "was already online";
    }

    private String disconnect(String brand, String model, boolean isOnline) {
        if(isOnline){
            this.isOnline = false;
            return brand + " " + model + " " + "is offline";
        }
        return brand + " " + model + " " + " was already disconnected";
    }

}
