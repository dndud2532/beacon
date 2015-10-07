package com.example.smartcampus;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	
	Button backBtn = (Button) findViewById(R.id.backBtn);
	backBtn.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Toast.makeText(getApplicationContext(), "Going Home...", Toast.LENGTH_LONG).show();
			finish();
		}
	});
}

}