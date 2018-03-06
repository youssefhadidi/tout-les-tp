package image;

import image.color.GrayColor;

public class Pixel{

  private GrayColor grayColor;

  /*
   * Constructor of Pixel object
   *@param grayColor (GrayColor) grayColor of Pixel object
   */
  public Pixel(GrayColor grayColor){
    this.grayColor = grayColor;
  }

  /*
   * Returns the GrayColor of Pixel object
   *@return (GrayColor) the grayColor of Pixel object
   */
  public GrayColor getColor(){
    return this.grayColor;
  }

  /*
   * Set grayColor of Pixel object
   *@param grayColor (GrayColor) new GrayColor
   */
  public void setColor(GrayColor grayColor){
    this.grayColor = grayColor;
  }

  /*
   * Returns the difference between the level of gray of Pixel object and the level of gray of another Pixel object
   *@param other (Pixel) other Pixel object
   *@return (int) the difference between the level of gray of Pixel object and the level of gray of another Pixel object
   */
  public int colorLevelDifference(Pixel other){
    return java.lang.Math.abs(other.getColor().getGrayLevel() - this.getColor().getGrayLevel());
  }

  /*
   * Returns true if Pixel object is similar to another Pixel object, false else
   *@return (boolean) true if Pixel object is similar to another Pixel object, false else
   */
  public boolean equals(Pixel other){
    if(other instanceof Pixel){
			Pixel theOther = (Pixel) other;
			return (this.grayColor.equals( theOther.getColor()));
		}
		else {
			return false;
		}
  }

}
