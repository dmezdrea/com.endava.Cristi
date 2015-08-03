package com.endava.tema_cristi;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


/**
 * Created by dmezdrea on 8/3/2015.
 */
public class FTest {

    @Test
  public void test() throws IOException{
       URL url = new URL ("http://www.sellcell.com/blog/wp-content/uploads/2014/03/dog-apps.jpg");
        BufferedImage image = ImageIO.read(url);
        System.out.println("Dimensiunea este:" + image.getWidth() + "x" + image.getHeight() );
    }

}
