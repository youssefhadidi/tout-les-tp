import org.junit.*;
import static org.junit.Assert.*;

import image.Image;
import image.Pixel;
import image.color.GrayColor;

public class ImageTest {
    @Test
    public void testImageCreation() {
      int i,j,width,height;
      boolean ok = true;
      width = 100;
      height = 100;
      Image image = new Image(width,height);
      Pixel pixel = new Pixel (new GrayColor(GrayColor.WHITE));
      assertNotNull(image);
      // SELECTEURS
      assertEquals(width,image.getWidth());
      assertEquals(height,image.getHeight());
      for (i=0;i<width;i++){
        for (j=0;j<height;j++){
          if(!pixel.equals(image.getPixel(i, j))){
            ok = false;
          }
        }
      }
      assertEquals(true,ok);
    }

    @Test
    public void testSetPixel(){
      int width,height;
      width = 100;
      height = 100;
      Image image = new Image(width,height);
      Pixel pixel = new Pixel (new GrayColor(GrayColor.BLACK));
      image.setPixel(10,10,pixel);
      assertTrue(pixel.equals(image.getPixel(10,10)));
    }

    @Test
    public void testChangeColorPixel(){
      int width,height;
      width = 100;
      height = 100;
      Image image = new Image(width,height);
      GrayColor grayColor = new GrayColor(GrayColor.BLACK);
      image.changeColorPixel(10,10,grayColor);
      assertTrue(grayColor.equals(image.getPixel(10,10).getColor()));
    }


/*
    @Test
    public void testEdge(){

    }

    @Test
    public void testDecreaseNbGrayLevels(){
    }
*/

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ImageTest.class);
    }

}
