package rental;

public class SuspiciousRentalAgency extends RentalAgency{

  public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
      if (client.getAge() <= 25){
        return super.rentVehicle(client, v)*1.1f;
      }else{
        return super.rentVehicle(client, v);
      }
  }
}
