abstract class Appliance {
    private boolean isOn;
    public Appliance(){
        this.isOn = false;
    }
    public void turnOn(){
        this.isOn = true;
        System.out.println("Appliance is turned on.");
    }
    public void turnOff(){
        this.isOn = false;
        System.out.println("Appliance is turned off.");
    }
    public abstract void showStatus();
}

class WashingMachine extends Appliance{
    private int loadCapacity;
    public WashingMachine(int loadCapacity){
        super();
        this.loadCapacity = loadCapacity;
    }
    public int getLoadCapacity(){
        return loadCapacity;
    }
    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void showStatus(){
        System.out.println("The washing machine is running. Load capacity: " + loadCapacity);
    }
}

class Refrigerator extends Appliance{
    private double temperature;
    public Refrigerator(double temperature){
        super();
        this.temperature = temperature;
    }
    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    @Override
    public void showStatus(){
        System.out.println("The refrigerator is running. Current temperature: " + temperature + " degree celsius");
    }
}

public class Main{
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine(7);
        wm.turnOn();
        wm.showStatus();
        wm.setLoadCapacity(10);
        wm.turnOff();
        wm.showStatus();
        System.out.println();

        Refrigerator fridge = new Refrigerator(4.0);
        fridge.turnOn();
        fridge.showStatus();
        fridge.setTemperature(3.0);
        fridge.turnOff();
        fridge.showStatus();
    }
}