package image.color;

public class GrayColor{

  public static final int WHITE = 255;
  public static final int BLACK = 0;
  private int grayLevel;

  /*
   * Constructor of GrayColor object
   *@param level (int) level of gray
   */
  public GrayColor(int level){
    this.grayLevel = level;
  }

  /*
   * Constructor of GrayColor object
   *@return (int) grayLevel of GrayColor object
   */
  public int getGrayLevel(){
    return this.grayLevel;
  }

  /*
   * Returns true if GrayColor object is similar to another GrayColor object, false else
   *@return (boolean) true if Pixel object is similar to another Pixel object, false else
   */
  public boolean equals(GrayColor other){
    if(other instanceof GrayColor){
			GrayColor theOther = (GrayColor) other;
			return (this.grayLevel == theOther.grayLevel);//  && (this.WHITE==theOther.WHITE) && (this.BLACK==theOther.BLACK);
		}
		else {
			return false;
		}
  }

}
