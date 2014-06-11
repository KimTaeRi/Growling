package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Review extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.review);
	}
	
	//************************************************************
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 0, 0, "Home").setIcon(android.R.drawable.ic_menu_revert);
		menu.add(0, 1, 0, "Exit").setIcon(android.R.drawable.ic_menu_revert);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int id = item.getItemId();
		
		Intent intent_home = new Intent(this, MainActivity.class);
		
		switch(id) {
		case 0: startActivity(intent_home); break;
		case 1: System.exit(0);
		default: break;
		}
		
		if(id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}


}
