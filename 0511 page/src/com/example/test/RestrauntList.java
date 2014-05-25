package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class RestrauntList extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.restraunt_list);
	    
	    Button Hero = (Button) findViewById(R.id.Hero);
	    
	    Hero.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(RestrauntList.this, MenuList.class);
        		startActivity(intent);
				return false;
			}
        }); 
	}

}
