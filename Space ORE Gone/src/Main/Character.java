
	import java.util.ArrayList;
	
public class Character {
	
	protected String name;
	protected int gender;
	protected Role role;

	public Character (String name, int gender, Role role)	{
		this.name = name;
		this.gender = gender;
		this.role = role;
	} 
	
	public String getName()	{
		retun name;
	}
	
	public int getGender()	{
		return gender;
	}
	
	public enum Role	{	//Chief Space Science Officer, Space Engineering Officer, Space Communications Officer
		CSSO ("Chief Space Science Officer"),
		SEO ("Space Engineer Officer"),
		SCO ("Space Communications Officer");
		
		private final String roleName;
		private Role(String roleName)	{
			this.roleName = roleName;
		}
		
		public String toString()	{
			return this.roleName;
		}
	}
}