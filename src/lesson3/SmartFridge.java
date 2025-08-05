package lesson3;

public class SmartFridge extends SmartDevice{
    private int coolingLevel;

    public SmartFridge(String brand, String model, boolean isOnline, int coolingLevel){
        super(brand, model, isOnline);
        this.coolingLevel = coolingLevel;
    }

    @Override
    protected String connectToWiFi(){
        return super.connectToWiFi();
    }

    @Override
    protected String disconnect(){
        return super.disconnect();
    }

    protected String showTemperature(){
        return "Temperature is: " + coolingLevel * 5 + " ºC";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
