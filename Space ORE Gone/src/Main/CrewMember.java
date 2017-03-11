
public class CrewMember extends Character {

	private int strength;
	private int stamina;
	private int speed;
	private int skillPt;
	
	public CrewMember (String name, int gender, String role, int strength, int stamina, int speed)	{
		super(name, gender, role);
		this.strength = strength;
		this.stamina = stamina;
		this.speed = speed;
		skillPt = 10;
	}
}
