package com.savthecoder.mobile.android.lsx.model.weapons.abstraction;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.factory.WeaponFactory;


public abstract class Weapon implements Comparable<Weapon>
{
	
	private String name;
	private WeaponEnum[] weakerWeapons;
	
	public Weapon(String name, WeaponEnum[] weakerWeapons)
	{
		this.name = name;
		this.weakerWeapons = weakerWeapons;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public boolean equals(Object weaponToCompare)
	{
		
		Weapon w = (Weapon) weaponToCompare;
		
		return this.getName().equals(w.getName());
	}
	
	public int compareTo(Weapon w)
	{
		if(this.equals(w))
		{
			return 0;
		}
		
		for(WeaponEnum weapon : weakerWeapons)
		{
			Weapon opponentsWeapon = WeaponFactory.getWeaponInstance(weapon);
			
			if(w.equals(opponentsWeapon))
			{
				return 1;
			}
		}
		
		return -1;
	}

}

