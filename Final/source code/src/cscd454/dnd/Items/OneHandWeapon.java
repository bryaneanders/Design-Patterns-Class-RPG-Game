package cscd454.dnd.Items;

import cscd454.dnd.Stats.StatHolder;

public class OneHandWeapon extends WeaponEquipment 
{
	public OneHandWeapon(StatHolder stats,
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
		if(type.equals("Longsword") ||
		   type.equals("Dagger") ||
		   type.equals("Cudgel")) 
		{
			weaponType = type;
		} else {
			weaponType = "Invalid";
		}
	}
}
