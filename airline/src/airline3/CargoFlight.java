package airline3;

class CargoFlight extends Flight {
    private double weight;

    public CargoFlight(double distance, double weight) {
        super(distance);
        this.weight = weight;
    }

    @Override
    public double calcFee() {
        return distance * 5 + weight * 2;
    }
}