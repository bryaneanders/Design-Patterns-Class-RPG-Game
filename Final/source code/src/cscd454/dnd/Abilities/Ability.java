/* Bryan Anders
 * Sami Awwad
 * Samir Ouahhabi
 * 
 * Team abeeseesdee
 */

package cscd454.dnd.Abilities;

import cscd454.dnd.Characters.CharacterEntity;

public interface Ability
{
	public void castAbility( CharacterEntity target );
	public String getName();
	public String toString();
	public AbilityType getAbilityType();
}
