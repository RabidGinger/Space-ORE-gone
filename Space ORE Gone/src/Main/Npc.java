
public class Npc extends Character {

	private int ally;	//1 if friend 0 if foe
	
	public Npc(String name, int gender, String role, int ally)	{
		super(name, gender, role);
		this.ally = ally;
	}
	
	public int getAlly()	{
		return ally;
	}
}
