public class ElonsToyCar {
    
    private static final int CAR_CONSUME = 20; // Meters to drain 1% of battery
    private int distance;
    private int battery;

    public ElonsToyCar() {
        this.battery = 100;
        this.distance = 0;
    }
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        }
        else {
            return "Battery at " + this.battery + "%";
        }
    }

    public void drive() {
        if(battery > 0) {
            this.distance += CAR_CONSUME;
            this.battery -= 1;
        }
    }
}
