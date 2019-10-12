package chris.dust;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    public static void main(String[] args) throws AWTException {
        Rectangle screenRepresentation = new Rectangle();
        Robot robot = new Robot();
        Dimension screenSiz = Toolkit.getDefaultToolkit().getScreenSize();


        double screenHeight = screenSiz.height;
        double screenWidth = screenSiz.width;

        screenRepresentation.setSize((int) screenWidth, (int) screenHeight);
        BufferedImage screenie = robot.createScreenCapture(screenRepresentation);

        try{
            File outputfile = new File("testing.png");
            ImageIO.write(screenie, "png", outputfile);
        } catch (Exception e){
            System.out.println("something bad happened...");
        }

    }
}
