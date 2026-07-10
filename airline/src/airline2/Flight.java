package airline2;

class Flight {
 private String flightNo; 
 private Aircraft aircraft;
 public Flight(String flightNo) {
     this.flightNo = flightNo;
 }
 public void assignAircraft(Aircraft ac) {
     this.aircraft = ac;
 }
 public double calcDistance(Position dest) {
     Position now = aircraft.getCurrentPos();
     return Math.abs(now.getLongitude() - dest.getLongitude())+Math.abs(now.getLatitude() - dest.getLatitude());
 }
 public String getFlightNo() {
     return flightNo;
 }
}