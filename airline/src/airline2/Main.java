package airline2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aircraftId = sc.nextInt();
        double lon = sc.nextDouble();
        double lat = sc.nextDouble();
        Aircraft aircraft = new Aircraft(aircraftId, lon, lat);
        String flightNo = sc.next();
        Flight flight = new Flight(flightNo);
        flight.assignAircraft(aircraft);
        double destLon = sc.nextDouble();
        double destLat = sc.nextDouble();
        Position destPos = new Position(destLon, destLat);
        double distance = flight.calcDistance(destPos);
        aircraft.display();
        System.out.printf("航班[%s]到目的地的距离: %.2f\n", flight.getFlightNo(), distance);
    }
}
