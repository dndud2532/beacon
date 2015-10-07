package com.example.smartcampus;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	
	Button startBtn = (Button) findViewById(R.id.startBtn);
	startBtn.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
			
			Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
			startActivity(myIntent);
		}
	});
}

}
