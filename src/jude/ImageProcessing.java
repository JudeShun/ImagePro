/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jude;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author cabalhaoma_sd2082
 */
public class ImageProcessing {
   BufferedImage image;
   int width;
   int height;

   public ImageProcessing() {

       try {
           File input = new File("C:\\Users\\cabalhaoma_sd2082\\Downloads\\violet.jpg");
           image = ImageIO.read(input);
           width = image.getWidth();
           height = image.getHeight();

           for (int i = 0; i < height; i++) {

               for (int j = 0; j < width; j++) {

                   Color c = new Color(image.getRGB(j, i));

                   if (c.getRed() >= 70 || c.getGreen() >= 36 || c.getBlue() >= 236) {
                       Color newColor = new Color(255, 255, 255);
                       image.setRGB(j, i, newColor.getRGB());
                   }

               }
           }

           File ouptut = new File("C:\\Users\\cabalhaoma_sd2082\\Downloads\\violet.jpg");
           ImageIO.write(image, "jpg", ouptut);

       } catch (Exception e) {
       }
   }

   static public void main(String args[]) throws Exception {
       ImageProcessing obj = new ImageProcessing();
   }
    
}
