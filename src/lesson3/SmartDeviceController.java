package lesson3;

public class SmartDeviceController {
    public static void main(String[] args) {

        SmartDevice smartDevice1 = new SmartDevice("Any", "Smart", true);
        SmartDevice smartDevice2 = new SmartDevice("Other", "Device", false);
        System.out.println(smartDevice1);
        System.out.println(smartDevice2);

        SmartWatch sw1 = new SmartWatch("Samsung", "Galaxy Band", true);
        SmartWatch sw2 = new SmartWatch("Apple", "Watch", false);
        System.out.println(sw1);
        System.out.println(sw2);

        SmartSpeaker ss1 = new SmartSpeaker("JBL", "Tune", true);
        SmartSpeaker ss2 = new SmartSpeaker("Sony", "NoModel", false);
        System.out.println(ss1);
        System.out.println(ss2);

        SmartFridge sf1 = new SmartFridge("Indesit", "NoModel", true, 5);
        SmartFridge sf2 = new SmartFridge("Bosch", "NoModel", false, 3);
        System.out.println(sf1);
        System.out.println(sf2 + "\n");

        System.out.println(sw1.connectToWiFi());
        System.out.println(ss1.connectToWiFi());
        System.out.println(sf2.connectToWiFi() + "\n");

        // Methods belonging to specific devices
        System.out.println("Hear rate per second: " + sw1.trackHeartRate(120));
        System.out.println(ss1.playMusic("Classic"));
        System.out.println(sf1.showTemperature());

    }
}
