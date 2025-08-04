package Inheritance;

// Superclass
class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Demo
public class SmartHomeDemo {
    public static void main(String[] args) {
        Device d1 = new Device("D1001", "Online");
        Thermostat t1 = new Thermostat("T2001", "Online", 22.5);

        d1.displayStatus();
        System.out.println("---");
        t1.displayStatus();
    }
}
