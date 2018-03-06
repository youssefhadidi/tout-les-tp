package rental;

import java.util.*;

public class MainQ7 {

  public static void main(String[] args){
    RentalAgency agency = new RentalAgency();
    RentalAgency agency2 = new SuspiciousRentalAgency();
    Vehicle v = new Vehicle("b","m",2016,100);
    Vehicle c = new Car("b","m",2016,100,5);
    Vehicle m = new Motorbike("b","m",2016,100,125);
    agency.addVehicle(v);
    agency.addVehicle(c);
    agency.addVehicle(m);
    agency2.addVehicle(v);
    agency2.addVehicle(c);
    agency2.addVehicle(m);
    Client client = new Client("Jean",20);
    System.out.format("avec l'agence normale: %f\n",agency.rentVehicle(client,c));
    System.out.format("avec l'agence cheloue: %f\n",agency2.rentVehicle(client,c));
  }
}
