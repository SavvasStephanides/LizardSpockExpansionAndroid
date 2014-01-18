package com.savthecoder.mobile.android.lsx.model.weapons.concrete;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;


public class Rock extends Weapon
{
	
	private static WeaponEnum[] weaker = {WeaponEnum.LIZARD, WeaponEnum.SCISSORS};

	public Rock() 
	{
		super("Rock", weaker);
	}
	
	

}
