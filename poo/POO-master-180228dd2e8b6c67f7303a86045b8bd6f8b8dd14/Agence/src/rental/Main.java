package rental;

import java.util.*;

public class Main {

  public static void main(String[] args){
    RentalAgency agency = new RentalAgency();
    Vehicle v = new Vehicle("b","m",2016,100);
    Vehicle c = new Car("b","m",2016,100,5);
    Vehicle m = new Motorbike("b","m",2016,100,125);
    agency.addVehicle(v);
    agency.addVehicle(c);
    agency.addVehicle(m);
    Criterion cr = new PriceCriterion(200);
    agency.displaySelection(cr);
  }
}
