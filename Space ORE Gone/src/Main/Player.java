
public class Player extends Character {

	private int strength;
	private int stamina;
	private int speed;
	private int skillPt;
	
	public Player (String name, int gender, String role, int strength, int stamina, int speed)	{
		super(name, gender, role);
		this.strength = strength;
		this.stamina = stamina;
		this.speed = speed;
		skillPt = 10;
		skillPt -= strength - stamina - speed;
	}
	
	public int getStrength()	{
		return strength;
	}
	
	public int getStamina()	{
		return stamina;
	}
	
	public int getSpeed()	{
		return speed;
	}
	
	public int getskillPt()	{
		return skillPt;
	}
}
