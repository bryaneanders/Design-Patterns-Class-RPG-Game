package cscd454.dnd.Stats;

public class BasicStat extends Stat 
{
	public BasicStat(double value, String type)
	{
		super(value, type);
		
		if(value < 0)
			setValue(0);
		
		if(type.equals("Block") || type.equals("Parry"))
			normalize();
	}
	
	public static boolean isPrimaryStat(Stat s)
	{
		// maybe use database
		if(s.getType().equals("Strength") ||
		   s.getType().equals("Dexterity") ||
		   s.getType().equals("Intelligence") ||
		   s.getType().equals("Wisdom")) 
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isCombatStat(Stat s)
	{
		if(s.getType().equals("Parry") ||
		   s.getType().equals("Block") ||
		   s.getType().equals("Damage")) 
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isBasicStat(Stat s)
	{
		return (BasicStat.isPrimaryStat(s) || BasicStat.isCombatStat(s)) ? true : false;
	}
	
	public BasicStat getInstance() 
	{
		return new BasicStat(getValue(), getType());
	}
	
	public BasicStat add(BasicStat stat)
	{
		if(!stat.getType().equals(getType())) {
			return (BasicStat) getInstance();
		}
		
		return new BasicStat(add(stat.getValue()), getType());
	}
	
	public BasicStat subtract(BasicStat stat)
	{
		if(!stat.getType().equals(getType())) {
			return (BasicStat) getInstance();
		}
		
		return new BasicStat(subtract(stat.getValue()), getType());
	}
	
	public BasicStat multiply(BasicStat stat)
	{
		if(!stat.getType().equals(getType())) {
			return (BasicStat) getInstance();
		}
		
		return new BasicStat(multiply(stat.getValue()), getType());
	}
	
	public BasicStat divide(BasicStat stat)
	{
		if(!stat.getType().equals(getType())) {
			return (BasicStat) getInstance();
		}
		
		return new BasicStat(divide(stat.getValue()), getType());
	}
	
	private void normalize()
	{
		if(getValue() > 1) {
			setValue(getValue() / (getValue() * 10));
		}
	}
}
