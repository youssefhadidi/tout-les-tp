package rental;

public class Car extends Vehicle{

  private int nbPlaces;

  public Car(String brand, String model, int productionYear, float dailyRentalPRice, int nbPlaces){
    super(brand, model, productionYear, dailyRentalPRice);
    this.nbPlaces = nbPlaces;
  }

  public int getNbPlaces(){
    return this.nbPlaces;
  }

  public String toString(){
    return super.toString()+" "+this.nbPlaces;
  }
}
