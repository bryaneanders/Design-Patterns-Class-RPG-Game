package cscd454.dnd.Items;

import cscd454.dnd.Stats.StatHolder;

public class TwoHandWeapon extends WeaponEquipment 
{
	public TwoHandWeapon(StatHolder stats,
						 String name,
						 String desc,
						 int levelReq)
	{
		super(stats, name, desc, levelReq);
		
		setWeaponType(stats.getEquipmentType());
	}
	
	@Override
	protected void setWeaponType(String type)
	{
		if(type.equals("Greatsword") ||
		   type.equals("Warhammer") ||
		   type.equals("Staff") ||
		   type.equals("Crossbow") ||
		   type.equals("Bow"))
		{
			weaponType = type;
		} else {
			weaponType = "Invalid";
		}
	}
}
