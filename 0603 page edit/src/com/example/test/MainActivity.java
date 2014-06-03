package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
	    Button Delivery = (Button) findViewById(R.id.Delivery);
	    Button NoneDelivery = (Button) findViewById(R.id.NoneDelivery);
	    Button ShcoolRestraunt = (Button) findViewById(R.id.ShcoolRestraunt);
    
	    Delivery.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent = new Intent(MainActivity.this, Delivery.class);
	    		startActivity(intent);
				return false;
			}
	    }); 	
	    
	    NoneDelivery.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent = new Intent(MainActivity.this, None_Delivery.class);
	    		startActivity(intent);
				return false;
			}
	    });
	    
	    // 여기는 학생식당 url로 연결되도록
	    ShcoolRestraunt.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				Intent intent = new Intent(Intent.ACTION_VIEW);
				Uri u = Uri.parse("http://www.hansung.ac.kr/web/www/life_03_01_t1");
	    		intent.setData(u);
	    		startActivity(intent);
				return false;
			}
	    });
	}
}
