import java.util.ArrayList;

public class Party {

	private ArrayList<Player> members = new ArrayList<Player>();
	private int spaceCows;
	private double money;
	private Rations rations;
	private Pace pace;
	private int water;
	private int fuel;
	
	public Party()	{
		this.members = null;
	}
	
	public Party (Pace pace, Rations rations, int spaceCows, double money, int water, int fuel, ArrayList<Player> party) {//space cows, money, rations, water, fuel
		for(Player player : party)	{
			if(player != null) 	{
				members.add(player);
			}
		}
		this.money = 0;
		this.water = 0;
		this.fuel = 0;
		this.pace = pace;
		this.rations = rations;
		
	}
	
	public enum Rations	{ 
		  FILLING ("Filling"), 
		  MEAGER ("Meager"), 
		  BAREBONES ("Barebones"); 
		   
		  private final String name; 
		  private Rations(String name) { 
		   this.name = name; 
		  } 
		   
		  public String toString() { 
		   return this.name; 
		  } 
	} 
	
	public Rations getRations()	{ 
		  return rations; 
	} 
	
	 public void setRations(Rations rations)	{ 
		  this.rations = rations; 
	 } 
	 
	 public enum Pace	{ 
		  STEADY ("Steady"), 
		  STRENUOUS ("Strenuous"), 
		  GRUELING ("Grueling"); 
		   
		  private final String name; 
		  private Pace(String name) { 
		   this.name = name; 
		  } 
		   
		  public String toString() { 
		   return this.name; 
		  } 
	 }
	 
	 public Pace getPace()	{ 
		  return pace; 
	 }
	 
	 public void setPace(Pace pace){ 
		  this.pace = pace; 
	}
}
