package rental;

import java.util.*;

/** a rental vehicle agency, client can rent one vehicle at a time */
public class RentalAgency {
    // vehicles of this agency
    private List<Vehicle> theVehicles;

    // maps client and rented vehicle (at most one vehicle by client)
    private Map<Client,Vehicle> rentedVehicles;

    public RentalAgency() {
      this.theVehicles = new ArrayList<Vehicle>();
      this.rentedVehicles = new Hashtable<Client,Vehicle>();
    }

    /** adds a vehicle to this agency
    * @param v the added vehicle
    */
    public void addVehicle(Vehicle v) {
      this.theVehicles.add(v);
    }

    /** provides the list of the vehicles that satisfy the criterion c
    * @param c the selection criterion
    * @return  the list of the vehicles that satisfy the criterion c
    */
    public List<Vehicle> select(Criterion c) {
      int i;
      List<Vehicle> vehicles = new ArrayList<Vehicle>();
      for(Vehicle vehicle : this.theVehicles){
        if(c.isSatisfiedBy(vehicle)){
          vehicles.add(vehicle);
        }
      }
        return vehicles;
    }
    /** displays the vehicles that satisfy the criterion c
    * @param c the selection criterion
    */
    public void displaySelection(Criterion c) {
      int i;
      List<Vehicle> vehicles = new ArrayList<Vehicle>();
      vehicles = select(c);
      for (Vehicle vehicle : vehicles){
        System.out.println(vehicle.toString());
      }
    }

    /** client rents a vehicle
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price
    * @exception UnknownVehicleException   if v is not a vehicle of this agency
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
    	if (!this.theVehicles.contains(v)){
        throw new UnknownVehicleException("Vehicle not in our agency");
      }
      if (hasRentedAVehicle(client) && isRented(v)){ // si le vehicule est déjà loué ou si le client loue déjà une voiture
        throw new IllegalStateException("No possible to rent this vehicle ( client is renting already a vehicle or this vehicle is already rented)");
      }
      this.rentedVehicles.put(client,v);
      return v.getDailyPrice();
    }

    /** returns <em>true</em> iff client c is renting a vehicle
    * @return <em>true</em> iff client c is renting a vehicle
    */
    public boolean hasRentedAVehicle(Client client){
    	return this.rentedVehicles.containsKey(client);
    }

    /** returns <em>true</em> iff vehicle v is rented
    * @return <em>true</em> iff vehicle v is rented
    */
    public boolean isRented(Vehicle v){
    	return this.rentedVehicles.containsValue(v);
    }

    /** the client returns a rented vehicle. Nothing happens if client didn't have rented a vehicle.
    * @param the client who returns a vehicle
    */
    public void returnVehicle(Client client){
    	this.rentedVehicles.remove(client);
    }
    /** provides the collection of rented vehicles for this agency
    * @return collection of currently rented vehicles
    */
    public Collection<Vehicle> allRentedVehicles(){
    	return this.rentedVehicles.values();
    }

}
