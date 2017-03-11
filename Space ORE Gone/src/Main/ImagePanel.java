
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;

public class ImagePanel extends JPanel {
	
	public class ImagePanel()
	{
		BufferedImage img = null;
		try {
			
			img = ImageIO.read(new File("strawberry.jpg"));
		    
		} catch (IOException e) {
			
			
		}	
	}

}
