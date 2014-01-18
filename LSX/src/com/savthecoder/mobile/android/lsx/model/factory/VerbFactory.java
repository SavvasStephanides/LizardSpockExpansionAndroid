package com.savthecoder.mobile.android.lsx.model.factory;

import com.savthecoder.mobile.android.lsx.model.exceptions.InvalidWeaponCombinationException;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;
import com.savthecoder.mobile.android.lsx.model.weapons.concrete.*;

public class VerbFactory 
{
	
	public static String getVerb(Weapon winningWeapon, Weapon losingWeapon) throws Exception
	{
		if(winningWeapon.compareTo(losingWeapon) < 1)
		{
			throw new InvalidWeaponCombinationException();
		}
		
		if(winningWeapon instanceof Scissors && losingWeapon instanceof Paper)
			return "cut";
		
		if(winningWeapon instanceof Paper && losingWeapon instanceof Rock)
			return "covers";
		
		if(winningWeapon instanceof Rock && losingWeapon instanceof Lizard)
			return "crushes";
		
		if(winningWeapon instanceof Lizard && losingWeapon instanceof Spock)
			return "poisons";
		
		if(winningWeapon instanceof Spock && losingWeapon instanceof Scissors)
			return "smashes";
		
		if(winningWeapon instanceof Scissors && losingWeapon instanceof Lizard)
			return "decapitate";
		
		if(winningWeapon instanceof Lizard && losingWeapon instanceof Paper)
			return "eats";
		
		if(winningWeapon instanceof Paper && losingWeapon instanceof Spock)
			return "disproves";
		
		if(winningWeapon instanceof Spock && losingWeapon instanceof Rock)
			return "vaporizes";
		
		if(winningWeapon instanceof Rock && losingWeapon instanceof Scissors)
			return "crashes";

		throw new Exception("Unexpected error occured");
		
		
	}

}
