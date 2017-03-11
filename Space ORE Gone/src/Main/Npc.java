
public class Npc extends Character {

	private int allie;	//1 if friend 0 if foe
	
	public Npc(String name, int gender, String role, int allie)	{
		super(name, gender, role);
		this.allie = allie;
	}
}
