package com.savthecoder.mobile.android.lsx.model.weapons.concrete;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;


public class Scissors extends Weapon
{
	
	private static WeaponEnum[] weaker = {WeaponEnum.LIZARD, WeaponEnum.PAPER};

	public Scissors()
	{
		super("Scissors", weaker);
	}

}
