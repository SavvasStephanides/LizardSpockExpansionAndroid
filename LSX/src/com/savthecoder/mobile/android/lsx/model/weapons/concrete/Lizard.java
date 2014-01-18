package com.savthecoder.mobile.android.lsx.model.weapons.concrete;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;


public class Lizard extends Weapon
{
	
	private static WeaponEnum[] weaker = {WeaponEnum.SPOCK, WeaponEnum.PAPER};

	public Lizard()
	{
		super("Lizard", weaker);
	}

}
