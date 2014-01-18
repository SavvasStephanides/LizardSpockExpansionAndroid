package com.savthecoder.mobile.android.lsx;

import com.savthecoder.mobile.android.lsx.model.score.Score;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GameEndActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.gameend);
		
		Intent currentIntent = getIntent();
		
		Score finalScore = (Score) currentIntent.getSerializableExtra("gamescore");
		
		TextView playerScoreView = (TextView) findViewById(R.id.playerScoreView);
		TextView opponentScoreView = (TextView) findViewById(R.id.opponentScoreView);
		
		String playerScoreString = Integer.toString(finalScore.getPlayerScore());
		String opponentScoreString = Integer.toString(finalScore.getOpponentScore());
		
		playerScoreView.setText(playerScoreString);
		opponentScoreView.setText(opponentScoreString);
		
		Button newGameButton = (Button) findViewById(R.id.button1);
		
		newGameButton.setOnClickListener(new OnClickListener() 
		{
			
			public void onClick(View v) 
			{
				Intent startNewGame = new Intent(GameEndActivity.this, NewGameActivity.class);
				
				startActivity(startNewGame);
				
				finish();
			}
		});
		
        Button rateButton = (Button) findViewById(R.id.rateButton);
        rateButton.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
				Intent devsiteIntent = new Intent(GameEndActivity.this, RateAppActivity.class);
				startActivity(devsiteIntent);
			}
		});
	}
	
}
