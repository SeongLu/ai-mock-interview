package airline3;

class PassengerFlight extends Flight {
    private int passengers;

    public PassengerFlight(double distance, int passengers) {
        super(distance);
        this.passengers = passengers;
    }

    @Override
    public double calcFee() {
        return distance * 10 + passengers * 50;
    }
}