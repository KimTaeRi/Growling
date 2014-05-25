package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class Category extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    // TODO Auto-generated method stub
	    setContentView(R.layout.category);
	    
	    Button Korea = (Button) findViewById(R.id.korea);
	    
	    Korea.setOnTouchListener(new OnTouchListener() {
  			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Category.this, RestrauntList.class);
        		startActivity(intent);
				return false;
			}
        }); 
	}

}
