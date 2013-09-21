package com.appspot.mapconapp.androidphonedailer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}


	public void onResume(){
		super.onResume();
		Button button=(Button)findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener(){
			public void onClick(View view){
				Intent dailIntent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:09440737786"));
				dailIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(dailIntent);
			}
		});
		
		Button button2=(Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			public void onClick(View view){
				Intent dailIntent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:09491700636"));
				dailIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(dailIntent);
			}
		});
	}
}
