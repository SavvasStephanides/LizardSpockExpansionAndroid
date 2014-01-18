package com.savthecoder.mobile.android.lsx;

import com.savthecoder.mobile.android.lsx.model.score.Score;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChooseWeaponActivity extends Activity 
{
	
	public void onCreate(Bundle savedInstanceState)
	{
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chooseweapon);
		
		ImageButton chooseRock = (ImageButton) findViewById(R.id.chooseweapon_rockbutton);
		ImageButton choosePaper = (ImageButton) findViewById(R.id.chooseweapon_paperbutton);
		ImageButton chooseScissors = (ImageButton) findViewById(R.id.chooseweapon_scissorsbutton);
		ImageButton chooseLizard = (ImageButton) findViewById(R.id.chooseweapon_lizardbutton);
		ImageButton chooseSpock = (ImageButton) findViewById(R.id.chooseweapon_spockbutton);
		
		Intent currentIntent = getIntent();
		
		Score gameScore = (Score) currentIntent.getSerializableExtra("gamescore");
		
		TextView scoreView = (TextView) findViewById(R.id.textView2);
		
		scoreView.setText(gameScore.toString());
		
		chooseRock.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				fightAgainstOpponent("rock");
			}
		});
		
		choosePaper.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				fightAgainstOpponent("paper");
			}
		});
		
		chooseScissors.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				fightAgainstOpponent("scissors");
			}
		});
		
		chooseLizard.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				fightAgainstOpponent("lizard");
			}
		});
		
		chooseSpock.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				fightAgainstOpponent("spock");
			}
		});
	}
	
	private void fightAgainstOpponent(String playerWeapon)
	{
		Intent i = getIntent();
		
		Score gameScore = (Score) i.getSerializableExtra("gamescore");
		
		Intent goToOpponent = new Intent(ChooseWeaponActivity.this, OpponentPlayActivity.class);
		
		goToOpponent.putExtra("gamescore", gameScore);
		goToOpponent.putExtra("playerweapon", playerWeapon);
		
		
		startActivity(goToOpponent);
		
		finish();
		
		
	}

}
