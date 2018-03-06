import org.junit.*;
import static org.junit.Assert.*;

import image.Pixel;
import image.color.GrayColor;

public class PixelTest {
    @Test
    public void testPixelCreation() {
      Pixel pixel = new Pixel(new GrayColor(100));
      GrayColor grayColor = new GrayColor(100);
      assertNotNull(pixel);
      // SELECTEURS
      assertTrue(grayColor.equals(pixel.getColor()));
    }

    @Test
    public void testSetColor(){
      Pixel pixel = new Pixel(new GrayColor(100));
      GrayColor grayColor = new GrayColor(200);
      pixel.setColor(grayColor);
      assertEquals(grayColor,pixel.getColor());
    }

    @Test
    public void testColorLevelDifference(){
      Pixel pixel = new Pixel(new GrayColor(100));
      Pixel pixel2 = new Pixel(new GrayColor(200));
      assertEquals(100,pixel.colorLevelDifference(pixel2));
    }

    @Test
    public void testEquals(){
      Pixel pixel = new Pixel(new GrayColor(100));
      Pixel pixel2 = new Pixel(new GrayColor(100));
      assertTrue(pixel.equals(pixel2));
    }


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PixelTest.class);
    }

}
