package image;

import image.color.GrayColor;

import java.util.*;

public class Image implements ImageInterface {


    private int width;
    private int height;
    private Pixel[][] pixels;

    /*
     * Constructor of Image object
     *@param width (int) width
     *@param height (int) height
     */
    public Image(int width, int height){
      int i,j;
      this.width = width;
      this.height = height;
      this.pixels = new Pixel[width][height];
      for (i=0;i<width;i++){
        for (j=0;j<height;j++){
          this.pixels[i][j] = new Pixel(new GrayColor(GrayColor.WHITE));
        }
      }
    }

    /**
     * Returns a new image with only edges
     *@param threshold (int) threshold
     *@return (Image) new Image
     */
    public Image edge(int threshold) {
      int i,j;
      Image image = new Image(this.width, this.height);
      for (i=0;i<this.width-1;i++){
        for (j=0;j<this.height-1;j++){
          if ( this.pixels[i+1][j].colorLevelDifference(this.pixels[i][j]) >= threshold || this.pixels[i][j+1].colorLevelDifference(this.pixels[i][j]) >= threshold ){
            image.changeColorPixel(i,j,new GrayColor(GrayColor.BLACK));
          }
          /*if (this.pixels[i][j].getColor().getGrayLevel()==255){
            image.changeColorPixel(i,j,new GrayColor(GrayColor.WHITE));
          }else if(this.pixels[i][j].getColor().getGrayLevel()==0){
            image.changeColorPixel(i,j,new GrayColor(GrayColor.BLACK));
          }
          if( this.pixels[i+1][j].colorLevelDifference(this.pixels[i][j]) >= threshold){
            if (this.pixels[i+1][j].getColor().getGrayLevel()>this.pixels[i][j].getColor().getGrayLevel()){
              image.changeColorPixel(i+1,j,new GrayColor(GrayColor.BLACK));
            }else{
              image.changeColorPixel(i,j,new GrayColor(GrayColor.BLACK));
            }
          }else if(this.pixels[i][j+1].colorLevelDifference(this.pixels[i][j]) >= threshold ){
            if (this.pixels[i][j+1].getColor().getGrayLevel()>this.pixels[i][j].getColor().getGrayLevel()){
              image.changeColorPixel(i,j+1,new GrayColor(GrayColor.BLACK));
            }else{
              image.changeColorPixel(i,j,new GrayColor(GrayColor.BLACK));
            }
          }else if( i>1 && this.pixels[i-1][j].colorLevelDifference(this.pixels[i][j]) >= threshold){
            image.changeColorPixel(i,j,new GrayColor(GrayColor.BLACK));
          }else if( j>1 && this.pixels[i][j-1].colorLevelDifference(this.pixels[i][j]) >= threshold ){
            image.changeColorPixel(i,j,new GrayColor(GrayColor.BLACK));
          }*/
        }

      }
      return image;
    }

    /**
     * Create a new Image decreasing level of gray according to nbGrayLevels
     * Warning : nbGrayLevels must be equals to 2**x  !
     *@param nbGrayLevels (int) pixels of new Image are decreased according to nbGrayLevels
     *@return (Image) new Image
     */
    public Image decreaseNbGrayLevels(int nbGrayLevels) {

      int cpt,i,j,length;
      int[][] intervalles = new int[256/nbGrayLevels][nbGrayLevels];
      Image image = new Image(this.width, this.height);

      // CREATE nbGrayLevels INTERVALLES
      length = 0;
      for (i=1;i<=256/nbGrayLevels;i++){
        for(j=0;j<nbGrayLevels;j++){
          intervalles[i-1][j]=length;
          length++;
        }
      }

      // DECREASE GRAY LEVEL
      for (i=0;i<this.width;i++){
        for (j=0;j<this.height;j++){
          for (cpt=1;cpt<=256/nbGrayLevels;cpt++){
            if (intervalles[cpt-1][0]<=this.pixels[i][j].getColor().getGrayLevel() && this.pixels[i][j].getColor().getGrayLevel()<=intervalles[cpt-1][nbGrayLevels-1]){
                image.setPixel(i,j,new Pixel(new GrayColor(intervalles[cpt-1][0])));
            }
          }
        }
      }
      return image;
    }



    // ======================================================================
    /** Reads a PGM image from file.
     * It is assumed that file respects the following PGM file syntax:
     *  <ul><li> first line with string "P2"</li>
     *  <li>second line : a comment</li>
     *  <li>one int for width <code>w</code>, one int for height<code>h</code></li>
     *  <li>one int for max gray level (not used here, we consider this level to be 255 in our images)</li>
     *  <li><code>w</code> x <code>h</code> integers between 0 and max (for us max=255) for each pixel</li></ul>
     *
     * @param fileName the name of the image file in PGM format
     * @return the image built from the file
     */
    public static Image initImagePGM(String fileName) {
        Scanner scan = new Scanner(Image.class.getResourceAsStream(fileName));

        scan.nextLine(); // line P2
        scan.nextLine(); // line comment
        // read width
        int width = scan.nextInt();
        // read height
        int height = scan.nextInt();
        // read max gray level (not used)
        scan.nextInt();
        // create an initially white image
        Image result = new Image(width, height);
        // read pixels
      Pixel pixel = new Pixel(new GrayColor(100));
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                result.changeColorPixel(y, x, new GrayColor(scan.nextInt()));
            }
        }
        return result;
    }

    /** returns width of the image
     * @return width of the image
     */
    public int getWidth(){
      return this.width;
    }

    /** returns height of the image
     * @return height of the image
     */
    public int getHeight(){
      return this.height;
    }

    /** gets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @return pixel at coord x,y of this image. (0,0) is top left corner pixel.
     * @exception UnknownPixelException if pixel of coord (x,y) does not exist
     */
    public Pixel getPixel(int x, int y) throws UnknownPixelException{
      if (x < this.width && y < this.height){
        return this.pixels[x][y];
      }else{
        System.out.println("ERROR");
        throw new UnknownPixelException("This Pixel is not in Image");
      }
    }

    /** sets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @param pixel the new pixel
     * @exception UnknownPixelException if pixel of coord (x,y) does not exist
     */
    public void setPixel(int x, int y, Pixel pixel) throws UnknownPixelException{
      this.pixels[x][y] = pixel;
    }

    /*
     * Set Color of Pixel [x][y] to GrayColor
     *@param x (int) coord x
     *@param y (int) coord y
     *@param grayColor (GrayColor) new GrayColor
     */
    public void changeColorPixel(int x, int y, GrayColor grayColor) throws UnknownPixelException{
      if (x < this.width && y < this.height){
        this.pixels[x][y].setColor(grayColor);
      }else{
        throw new UnknownPixelException("This Pixel is not in Image");
      }
    }
}
