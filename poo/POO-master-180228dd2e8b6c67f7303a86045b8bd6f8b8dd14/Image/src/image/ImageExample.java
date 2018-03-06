package image;

import image.color.GrayColor;

public class ImageExample{

  public ImageExample(){}

  public static void main (String[] args){
    Image image = new Image(200,400);
    int width,height;
    // RECTANGLE NOIR
    for (width=0; width<=20; width++){
      for (height=0; height<=30; height++){
        image.setPixel(10+width,30+height,new Pixel(new GrayColor(GrayColor.BLACK)));
      }
    }
    // RECTANGLE GRIS 64
    for (width=0; width<=20; width++){
      for (height=0; height<=50; height++){
        image.setPixel(50+width,50+height,new Pixel(new GrayColor(64)));
      }
    }
    // RECTANGLE GRIS 230
    for (width=0; width<=20; width++){
      for (height=0; height<=50; height++){
        image.setPixel(20+width,110+height,new Pixel(new GrayColor(200)));
      }
    }
    new ImageDisplayer().display(image,"init");
    // SEUIL A 50
    new ImageDisplayer().display(image.edge(50),"seuil à 50");
    // SEUIL A 100
    new ImageDisplayer() .display(image.edge(100),"seuil à 100");
    // SEUIL A 250
    new ImageDisplayer() .display(image.edge(250),"seuil à 250");

    new ImageDisplayer().display(image.decreaseNbGrayLevels(16),"decrease");
  }
}
