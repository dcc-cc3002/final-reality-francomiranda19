package com.github.francomiranda19.finalreality.model.character.player;

import com.github.francomiranda19.finalreality.model.character.ICharacter;
import com.github.francomiranda19.finalreality.model.weapon.Weapon;
import com.github.francomiranda19.finalreality.model.weapon.WeaponType;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.BlockingQueue;

public class BlackMage extends AbstractMage{
  /**
   * Creates a new character.
   *
   * @param name           the character's name
   * @param turnsQueue     the queue with the characters waiting for their turn
   * @param characterClass the class of this character
   * @param lifePoints     the character's life points
   * @param defense        the character's defense
   */
  public BlackMage(@NotNull String name, @NotNull BlockingQueue<ICharacter> turnsQueue, CharacterClass characterClass, int lifePoints, int defense, int mana) {
    super(name, turnsQueue, characterClass, lifePoints, defense, mana);
  }

  public void equip(Weapon weapon) {
    if ((weapon.getType() == WeaponType.KNIFE) || (weapon.getType() == WeaponType.STAFF)) {
      this.equippedWeapon = weapon;
    }
  }

}
