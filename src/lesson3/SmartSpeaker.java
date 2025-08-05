package lesson3;

public class SmartSpeaker extends SmartDevice{
    public SmartSpeaker(String brand, String model, boolean isOnline){
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

    protected String playMusic(String musicType){
        return "Playing " + musicType + "music";
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
