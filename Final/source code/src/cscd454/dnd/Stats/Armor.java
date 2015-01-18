/* Bryan Anders
 * Sami Awwad
 * Samir Ouahhabi
 * 
 * Team abeeseesdee
 * 
 * Armor Stat Class
 */

package cscd454.dnd.Stats;

public class Armor extends Stat
{	
	private static final int MITIGATION_CONSTANT = 10;
	
	public Armor(double armorVal)
	{
		super(armorVal, "Armor");
	}
	
	// return a new copy
	public Armor getInstance()
	{
		return new Armor(getValue());
	}

	// get the mitigation the armor provides
	public Mitigation getMitigation()
	{
		double value = getValue() / (getValue() * MITIGATION_CONSTANT);
		// insert calculation here
		
		return new Mitigation(value);
	}
	
	public Armor grantArmor(Stat stat)
	{
		return new Armor(this.getValue() + stat.getValue());
	}
	
	public Armor reduceArmor(Stat stat)
	{
		return new Armor(this.getValue() - stat.getValue());
	}
	
	public Armor add(Armor stat)
	{
		if(!stat.getType().equals(getType())) {
			return (Armor) getInstance();
		}
		
		return new Armor(add(stat.getValue()));
	}
	
	public Armor subtract(Armor stat)
	{
		if(!stat.getType().equals(getType())) {
			return (Armor) getInstance();
		}
		
		return new Armor(subtract(stat.getValue()));
	}
	
	public Armor multiply(Armor stat)
	{
		if(!stat.getType().equals(getType())) {
			return (Armor) getInstance();
		}
		
		return new Armor(multiply(stat.getValue()));
	}
	
	public Armor divide(Armor stat)
	{
		if(!stat.getType().equals(getType())) {
			return (Armor) getInstance();
		}
		
		return new Armor(divide(stat.getValue()));
	}
}