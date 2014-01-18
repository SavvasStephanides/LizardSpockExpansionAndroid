package com.savthecoder.mobile.android.lsx;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class DevelopersWebsiteActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.savthecoder.com/"));
		
		startActivity(browserIntent);

	}

}
