public class CarsAssemble {

    private static final int BASE_PRODUCTION = 221;

    public double productionRatePerHour(int speed) {
        double res = speed * BASE_PRODUCTION;
        if(speed >= 1 && speed <= 4) { // 100%
            return res;
        }
        else if (speed >= 5 && speed <= 8) { // 90%
            res *= 0.90;
        }
        else if (speed == 9) { //80%
            res *= 0.8;
        }
        else if (speed == 10){ // 77%
            res *= 0.77;
        }
        else {return 0;}
        return res;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
