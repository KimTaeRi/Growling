package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class Delivery extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.delivery);
	    
	    Button Hero = (Button) findViewById(R.id.Hero);
	    Button Yoon = (Button) findViewById(R.id.Yoon);
	    Button pichihome = (Button) findViewById(R.id.pichihome);
	    
	    Button Hero_re = (Button) findViewById(R.id.Hero_re);
	    Button Yoon_re = (Button) findViewById(R.id.Yoon_re);
	    Button pichihome_re = (Button) findViewById(R.id.pichihome_re);
	    
	    Hero.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent = new Intent(Delivery.this, MenuList.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        		startActivity(intent);
				return false;
			}
        }); 
	    
	    Yoon.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent = new Intent(Delivery.this, MenuList.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        		startActivity(intent);
				return false;
			}
        });
	    
	    pichihome.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent = new Intent(Delivery.this, MenuList.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        		startActivity(intent);
				return false;
			}
        });
	    
	    Hero_re.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent1 = new Intent(Delivery.this, Review.class);
				intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        		startActivity(intent1);
				return false;
			}
        });
	    
	    Yoon_re.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent2 = new Intent(Delivery.this, Review.class);
				intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        		startActivity(intent2);
				return false;
			}
        });
	    
	    pichihome_re.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent3 = new Intent(Delivery.this, Review.class);
				intent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        		startActivity(intent3);
				return false;
			}
        });
	}
	
	//****************************************************************
	
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

}
