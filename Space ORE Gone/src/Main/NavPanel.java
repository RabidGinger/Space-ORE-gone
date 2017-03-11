import java.awt.*;
import javax.swing.*;
import java.io.*;

public class NavPanel extends JPanel {
	
	JLabel playerN;
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
		setLayout(new GridLayout(1,22));
		
		//PLAYER
		playerN = new JLabel("Player Name: ");
		healthpts = new JLabel("Health Points: ");
		condition = new JLabel("Condtion: ");
		hunger = new JLabel("Hunger: ");
		thirst = new JLabel("Thirst: ");
		
		add(playerN);
		add(healthpts);
		add(condition);
		add(hunger);
		add(thirst);
		
		//CREW1
		crew1 = new JLabel("Member Name: ");
		healthpts1 = new JLabel("Health Points: ");
		condition1 = new JLabel("Condtion: ");
		hunger1 = new JLabel("Hunger: ");
		thirst1 = new JLabel("Thirst: ");
		
		add(crew1);
		add(healthpts1);
		add(condition1);
		add(hunger1);
		add(thirst1);
		
		//CREW2
		crew2 = new JLabel("Member Name: ");
		healthpts2 = new JLabel("Health Points: ");
		condition2 = new JLabel("Condtion: ");
		hunger2 = new JLabel("Hunger: ");
		thirst2 = new JLabel("Thirst: ");
		
		add(crew2);
		add(healthpts2);
		add(condition2);
		add(hunger2);
		add(thirst2);
		
		//CREW3
		crew3 = new JLabel("Member Name: ");
		healthpts3 = new JLabel("Health Points: ");
		condition3 = new JLabel("Condtion: ");
		hunger3 = new JLabel("Hunger: ");
		thirst3 = new JLabel("Thirst: ");
		
		add(crew2);
		add(healthpts3);
		add(condition3);
		add(hunger3);
		add(thirst3);
		
		///SAVE AND LOAD BUTTON
		//We will add this in the end when we can get one game to start
		save = new JButton("Save");
		load = new JButton("Load");
		
		add(save);
		add(load);
	}
}
