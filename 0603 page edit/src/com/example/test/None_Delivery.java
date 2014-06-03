package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class None_Delivery extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// TODO Auto-generated method stub
		setContentView(R.layout.none_delivery);

		Button Cup = (Button) findViewById(R.id.Cup);
		Button Hansung = (Button) findViewById(R.id.Hansung);
		Button Sanukki = (Button) findViewById(R.id.Sanukki);

		Cup.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(None_Delivery.this, MenuList.class);
				startActivity(intent);
				return false;
			}
		});

		Hansung.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(None_Delivery.this, MenuList.class);
				startActivity(intent);
				return false;
			}
		});

		Sanukki.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(None_Delivery.this, MenuList.class);
				startActivity(intent);
				return false;
			}
		});
	}
}
