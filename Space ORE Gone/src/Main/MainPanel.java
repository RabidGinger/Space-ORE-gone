import java.awt.*;
import javax.swing.*;
import java.io.*;


public class MainPanel extends JPanel {
	
	FileReader fr;
	BufferedReader reader;
	
	JScrollPane area;
	JTextArea text;
	
	NavPanel navPanel;
	
	JPanel buttonArea;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	
	public MainPanel () 
	{
		//PANEL LAYOUT
		setLayout(new BorderLayout());
		
		 navPanel = new NavPanel();
		 add(navPanel, BorderLayout.WEST);
		
		//TEXT AREA//
		area = new JScrollPane(text = new JTextArea(""));
		area.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(area);		
		
		//--> reads for main story text
	
		try {
			//change story.txt to whatever is named
			fr = new FileReader("story.txt");
			reader = new BufferedReader(fr);
			text.read(reader,"story.txt"); //textArea.read	
		
		} catch (FileNotFoundException e) {
		
		text.setText("File missing...\n" + e.getMessage());
		
		} catch (IOException e) {
		
		text.setText("Error...\n" + e.getMessage());
		
		}
		
		//JBUTTON AREA
		buttonArea = new JPanel(new GridLayout(2,4));
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		
		buttonArea.add(b1);
		buttonArea.add(b2);
		buttonArea.add(b3);
		buttonArea.add(b4);
		buttonArea.add(b5);
		buttonArea.add(b6);
		buttonArea.add(b7);
		buttonArea.add(b8);
		
		add(buttonArea, BorderLayout.SOUTH);
		
		//b1.addActionListener();
		//test
		
		
		
		
	}
}

