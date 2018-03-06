import org.junit.*;
import static org.junit.Assert.*;

import image.color.GrayColor;

public class GrayColorTest {
    @Test
    public void testGrayColorCreation() {
      GrayColor grayColor = new GrayColor(100);
      assertNotNull(grayColor);
      // SELECTEURS
      assertEquals(100,grayColor.getGrayLevel());
      assertEquals(255,GrayColor.WHITE);
      assertEquals(0,GrayColor.BLACK);
    }

    @Test
    public void testEquals(){
      GrayColor grayColor1 = new GrayColor(100);
      GrayColor grayColor2 = new GrayColor(100);
      assertTrue(grayColor1.equals(grayColor2));
    }


    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(GrayColorTest.class);
    }

}
