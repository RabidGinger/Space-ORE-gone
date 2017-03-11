import java.awt.*;
import javax.swing.*;
import java.io.*;

public class NavPanel extends JPanel {
	
	JLabel playerName;
	JLabel healthpts;
	JLabel condition;
	JLabel hunger;
	JLabel thirst;
	
	JLabel crew1;
	JLabel healthpts1;
	JLabel condition1;
	JLabel hunger1;
	JLabel thirst1;
	
	JLabel crew2;
	JLabel healthpts2;
	JLabel condition2;
	JLabel hunger2;
	JLabel thirst2;
	
	JLabel crew3;
	JLabel healthpts3;
	JLabel condition3;
	JLabel hunger3;
	JLabel thirst3;
	
	JButton save;
	JButton load;
	
	public NavPanel()
	{
		setLayout(new GridLayout(2,22))
	}
}
