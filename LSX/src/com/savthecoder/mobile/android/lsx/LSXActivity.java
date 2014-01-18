package com.savthecoder.mobile.android.lsx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class LSXActivity extends Activity 
{

	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
       
        
		super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        

        
        ImageButton newGameImageButton = (ImageButton) findViewById(R.id.playImageButton);
        newGameImageButton.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
		        
				Intent newGameIntent = new Intent(LSXActivity.this, NewGameActivity.class);
				startActivity(newGameIntent);
				
			}
		});
        
        Button rulesButton = (Button) findViewById(R.id.buttonRules);
        rulesButton.setOnClickListener(new OnClickListener()
        {

			public void onClick(View arg0) 
			{
				Intent rulesIntent = new Intent(LSXActivity.this, RulesActivity.class);
				startActivity(rulesIntent);
				
			}
        	
        });
        
        Button achievementsButton = (Button) findViewById(R.id.buttonAchievements);
        
        achievementsButton.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
				Intent achievementsIntent = new Intent(LSXActivity.this, AchievementsActivity.class);
				startActivity(achievementsIntent);
				
			}
		});
        
        Button devSite = (Button) findViewById(R.id.button3);
        
        devSite.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
				Intent devsiteIntent = new Intent(LSXActivity.this, DevelopersWebsiteActivity.class);
				startActivity(devsiteIntent);
			}
		});
        
        Button rateButton = (Button) findViewById(R.id.rateButton);
        rateButton.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
				Intent devsiteIntent = new Intent(LSXActivity.this, RateAppActivity.class);
				startActivity(devsiteIntent);
			}
		});
        
        Button likeOnFacebookButton = (Button) findViewById(R.id.button4);
        likeOnFacebookButton.setOnClickListener(new OnClickListener() 
        {
			
			public void onClick(View v) 
			{
				Intent likeOnFacebookIntent = new Intent(LSXActivity.this, LikeOnFacebookActivity.class);
				startActivity(likeOnFacebookIntent);
				
			}
		});
    }
}