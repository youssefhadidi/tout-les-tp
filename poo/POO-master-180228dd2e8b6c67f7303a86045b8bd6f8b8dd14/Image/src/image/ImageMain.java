package image;

import java.util.*;
import image.color.GrayColor;

public class ImageMain{

  public ImageMain(){}

  public static void main (String[] args){
    String url = args[0];
    int width, height;
    int threshold = Integer.parseInt(args[1]);
    int nbGrayLevels = Integer.parseInt(args[2]);
    Image image = Image.initImagePGM(url);

    // initial
    new ImageDisplayer().display(image,"init");

    // Edge
    new ImageDisplayer().display(image.edge(threshold),"Edge");

    // Decrease
    new ImageDisplayer().display(image.decreaseNbGrayLevels(nbGrayLevels),"Decrease");
  }

}
