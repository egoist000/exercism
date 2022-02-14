class NeedForSpeed {
    
    private int speed;
    private int distance;
    private int batteryDrain;
    private int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.battery = 100;
        this.distance = 0;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (this.battery <= 0) || (this.battery - batteryDrain < 0);
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distance += speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        while(!car.batteryDrained()) {
            car.drive();
            if(car.distanceDriven() >= this.distance) {
                return true;
            }
        }
        return false;
    }
}
