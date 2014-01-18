package com.savthecoder.mobile.android.lsx.model.weapons.concrete;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;


public class Paper extends Weapon
{
	
	private static WeaponEnum[] weaker = {WeaponEnum.SPOCK, WeaponEnum.ROCK};

	public Paper()
	{
		super("Paper", weaker);
	}

}
