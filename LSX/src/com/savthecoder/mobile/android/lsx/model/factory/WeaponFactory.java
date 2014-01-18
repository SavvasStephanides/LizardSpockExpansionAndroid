package com.savthecoder.mobile.android.lsx.model.factory;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;
import com.savthecoder.mobile.android.lsx.model.weapons.concrete.*;


public class WeaponFactory 
{
	
	public static Weapon getWeaponInstance(WeaponEnum actorEnum)
	{
		
	Weapon weaponInstance = new NullWeapon();

		switch(actorEnum)
		{
			case ROCK:
				weaponInstance = new Rock();
				break;
				
			case PAPER:
				weaponInstance = new Paper();
				break;
				
			case SCISSORS:
				weaponInstance = new Scissors();
				break;
				
			case LIZARD:
				weaponInstance = new Lizard();
				break;
				
			case SPOCK:
				weaponInstance = new Spock();
				break;
				
		}

		
		return weaponInstance; 
	}
	
	public static Weapon getRandomWeapon()
	{
		int randomNumber = (int)(Math.random() * WeaponEnum.values().length);
		
		WeaponEnum we = WeaponEnum.values()[randomNumber];
		
		return getWeaponInstance(we);
	}

}
