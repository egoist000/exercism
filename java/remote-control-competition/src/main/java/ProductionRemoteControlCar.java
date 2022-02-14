class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private static final int SPEED = 10;
    private int distance = 0;
    private int victories = 0;

    public void drive() {
        distance += SPEED;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        victories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.getNumberOfVictories() - o.getNumberOfVictories();
    }
}
