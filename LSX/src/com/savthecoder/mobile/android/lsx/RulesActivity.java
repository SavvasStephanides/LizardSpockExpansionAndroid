package com.savthecoder.mobile.android.lsx;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RulesActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		Dialog dialog = new Dialog(this);
		
		dialog.setContentView(R.layout.rules);
		dialog.setTitle("Rules");
		dialog.setCancelable(true);
		dialog.show();
		
//        setContentView(R.layout.rules);
//        
//        Button startGameButton = (Button) findViewById(R.id.button1);
//        
//        startGameButton.setOnClickListener(new OnClickListener() 
//        {
//			
//			public void onClick(View v) 
//			{
//				Intent startGameIntent = new Intent(RulesActivity.this, NewGameActivity.class);
//				
//				startActivity(startGameIntent);
//				
//				finish();
//			}
//		});
	}
	
}
