package lesson3;

public class SmartWatch extends SmartDevice{
    SmartWatch(String brand, String model, boolean isOnline){
        super(brand, model, isOnline);
    }

    @Override
    protected String connectToWiFi(){
        return super.connectToWiFi();
    }

    @Override
    protected String disconnect(){
        return super.disconnect();
    }

    public int trackHeartRate(int bpm){
        return bpm / 60;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
