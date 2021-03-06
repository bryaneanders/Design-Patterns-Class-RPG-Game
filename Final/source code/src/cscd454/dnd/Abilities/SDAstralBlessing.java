package cscd454.dnd.Abilities;

import java.util.ArrayList;
import cscd454.dnd.Characters.CharacterEntity;
import cscd454.dnd.Characters.CharacterType;
import cscd454.dnd.Utils.Output;

public class SDAstralBlessing extends SingleTargetDefensiveAbility
{

	public SDAstralBlessing(CharacterEntity master)
	{
		super(master);
		_type = CharacterType.CLERIC;
		checkCompatibility();
		_name = "Astral blessing";
		_description = "Heals an ally character.";
	}

	@Override
	protected void applyAbility(ArrayList<CharacterEntity> targets)
	{
		double healAmount = _master.getStats().getWisdom().getValue()
				* _scaling;
		healAmount += _baseValue + _perLevel * _level;
		for (CharacterEntity character : targets)
		{
			if (character.isDead())
				continue;
			Output.getInstance().info(
					_master.getName() + " casts " + _name + " on "
							+ character.getName());
			character.applyHeal(healAmount);
		}
	}

}
