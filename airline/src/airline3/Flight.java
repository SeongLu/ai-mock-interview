package airline3;

class Flight {
    protected double distance;

    public Flight(double distance) {
        this.distance = distance;
    }

    public double calcFee() {
        return distance * 10;
    }

    public double getDistance() {
        return distance;
    }
}
