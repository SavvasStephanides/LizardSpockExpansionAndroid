package com.savthecoder.mobile.android.lsx;

import com.savthecoder.mobile.android.lsx.model.enums.WeaponEnum;
import com.savthecoder.mobile.android.lsx.model.factory.VerbFactory;
import com.savthecoder.mobile.android.lsx.model.factory.WeaponFactory;
import com.savthecoder.mobile.android.lsx.model.score.Score;
import com.savthecoder.mobile.android.lsx.model.weapons.abstraction.Weapon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OpponentPlayActivity extends Activity 
{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opponentplay);
		
		Intent currentIntent = getIntent();
		final Score gameScore = (Score) currentIntent.getSerializableExtra("gamescore");
		
		int plays = gameScore.getPlayerScore() + gameScore.getOpponentScore();
				
		String weaponString = currentIntent.getStringExtra("playerweapon");
		
		Weapon playerWeapon = WeaponFactory.getWeaponInstance(WeaponEnum.valueOf(weaponString.toUpperCase()));
		Weapon opponentWeapon = WeaponFactory.getRandomWeapon();
		
		TextView tv2 = (TextView) findViewById(R.id.textView2);
		TextView tv4 = (TextView) findViewById(R.id.textView4);
		TextView tv5 = (TextView) findViewById(R.id.textView5);
		
		tv2.setText(playerWeapon.getName());
		tv4.setText(opponentWeapon.getName());
		
		int playerWeaponID = getResources().getIdentifier("com.savthecoder.mobile.android.lsx:drawable/lsx_rock_button", null, null);
		
		int comparison = playerWeapon.compareTo(opponentWeapon);
		
		switch(comparison)
		{
			case 1:
				try 
				{
					tv5.setText(playerWeapon.getName() 
							+ " " + VerbFactory.getVerb(playerWeapon, opponentWeapon) + " " + opponentWeapon.getName() 
							+ ". Congratulations! You won this round!");
				} 
				catch (Exception e) 
				{}
				
				gameScore.playerWins();
				break;
				
			case -1:
			try 
				{
					tv5.setText(opponentWeapon.getName() 
							+ " " + VerbFactory.getVerb(opponentWeapon, playerWeapon) + " " + playerWeapon.getName() 
							+ ". You lost this round.");
				} catch (Exception e) 
				{
				}
				
				gameScore.opponentWins();
				break;
				
			case 0:
				
				if(playerWeapon.getName().equals("Spock"))
				{
					tv5.setText("Okay, one of us has to stop putting up Spock!");
				}
				else
				{
					tv5.setText("You have both chosen " + playerWeapon.getName() + ". This game is a tie.");
				}
				break;
			
		}
		
		Button nextRoundButton = (Button) findViewById(R.id.button1);
		
		nextRoundButton.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				Intent nextRoundIntent = new Intent(OpponentPlayActivity.this, ChooseWeaponActivity.class);
				
				nextRoundIntent.putExtra("gamescore", gameScore);	
				
				startActivity(nextRoundIntent);
				
				finish();
				
			}
		});
		
		
		Button endGameButton = (Button) findViewById(R.id.button2);
		
		endGameButton.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				Intent endGameIntent = new Intent(OpponentPlayActivity.this, GameEndActivity.class);
				
				endGameIntent.putExtra("gamescore", gameScore);
				
				startActivity(endGameIntent);
				
				finish();
			}
		});
		
		if(gameScore.gameIsOver())
		{
			nextRoundButton.setVisibility(View.INVISIBLE);
		}
		else
		{
			endGameButton.setVisibility(View.INVISIBLE);
		}
		
	}

}
