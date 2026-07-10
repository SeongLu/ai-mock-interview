package airline3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static double getTotalFee(List<Flight> list) {
        double total=0;
        for (Flight f:list) {
            total+=f.calcFee();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<Flight> flightList = new ArrayList<>();
        int m=input.nextInt();
        int n=input.nextInt();
        for (int i=0;i<m;i++){
            double dist = input.nextDouble();
            double w = input.nextDouble();
            flightList.add(new CargoFlight(dist,w));
        }
        for (int i=0;i<n;i++){
            double dist=input.nextDouble();
            int p=input.nextInt();
            flightList.add(new PassengerFlight(dist,p));
        }
        double total=getTotalFee(flightList);
        System.out.printf("总的费用为:%.1f\n",total);
    }
}