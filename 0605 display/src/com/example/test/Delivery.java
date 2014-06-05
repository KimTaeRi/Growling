package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class Delivery extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    // TODO Auto-generated method stub
	    setContentView(R.layout.delivery);
	    
	    Button Hero = (Button) findViewById(R.id.Hero);
	    Button Yoon = (Button) findViewById(R.id.Yoon);
	    Button pichihome = (Button) findViewById(R.id.pichihome);
	    
	    Hero.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Delivery.this, MenuList.class);
        		startActivity(intent);
				return false;
			}
        }); 
	    
	    Yoon.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Delivery.this, MenuList.class);
        		startActivity(intent);
				return false;
			}
        });
	    
	    pichihome.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Delivery.this, MenuList.class);
        		startActivity(intent);
				return false;
			}
        });
	}

}
