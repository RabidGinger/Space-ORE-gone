import java.awt.*;
import javax.swing.*;

public class MainFrame {
	public static void main (String[] args)
	{
		JFrame frame;
		MainPanel main;
		
		frame = new JFrame("Space Ore Gone Trail");
		//frame.setIconImage(new ImageIcon(imgURL).getImage());
        main = new MainPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(640,480);
        frame.setContentPane(main);
        frame.setVisible(true);
	}
}