package com.savthecoder.mobile.android.lsx.model.weapons.concrete;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;


public class Spock extends Weapon
{
	
	private static WeaponEnum[] weaker = {WeaponEnum.ROCK, WeaponEnum.SCISSORS};

	public Spock()
	{
		super("Spock", weaker);
	}

}
