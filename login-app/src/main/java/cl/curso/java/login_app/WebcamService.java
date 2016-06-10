/**
 * 
 */
package cl.curso.java.login_app;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

/**
 * @author gonza
 *
 */
public class WebcamService {
	
	public static void capturaFoto() throws IOException{
		
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(WebcamResolution.VGA.getSize());
	    //webcam.setViewSize(new Dimension(640, 480));
		
		webcam.open();
		ImageIO.write(webcam.getImage(),"PNG",new File("C:/Users/gonza/Desktop/test.png"));
		webcam.close();
		
	}
	
	

}
