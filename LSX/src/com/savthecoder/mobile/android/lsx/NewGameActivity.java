package com.savthecoder.mobile.android.lsx;

import com.savthecoder.mobile.android.lsx.model.score.Score;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewGameActivity extends Activity 
{

	public void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
        setContentView(R.layout.newgame);
        
       
        Button startButton = (Button) findViewById(R.id.button1);
        
        Intent startGameIntent = new Intent(NewGameActivity.this, ChooseWeaponActivity.class);
		Score gameScore = new Score();
		startGameIntent.putExtra("gamescore", gameScore);
		startActivity(startGameIntent);
		
		finish();
	
	}
}
