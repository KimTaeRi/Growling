package com.example.test;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	static final int MSG_TIMER_EXPIRED = 1;
	static final int BACKEY_TIMEOUT=2000;
	boolean isBackKeyPressed = false;
	long currentTimeInMillis = 0;

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
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    		startActivity(intent);
				return false;
			}
	    }); 	
	    
	    NoneDelivery.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				Intent intent = new Intent(MainActivity.this, None_Delivery.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
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
	    startActivity(new Intent(this, LoadingActivity.class));
	}
	
	//**********************************************************************
	
    @Override
	public void onBackPressed() {
    	if(isBackKeyPressed == false) {
    		isBackKeyPressed = true;
    		currentTimeInMillis = Calendar.getInstance().getTimeInMillis(); 
            Toast.makeText(this, "Press BACK again  to exit.", Toast.LENGTH_SHORT).show(); 
            startTimer();
    	}
    	
    	else {
    		isBackKeyPressed = false; 
    		if(Calendar.getInstance().getTimeInMillis() <= (currentTimeInMillis + (BACKEY_TIMEOUT))){ 
    			finish(); 
    			android.os.Process.killProcess(android.os.Process.myPid());
               } 
    	}
	}
    
    private void startTimer(){ 
        mTimerHander.sendEmptyMessageDelayed(MSG_TIMER_EXPIRED, BACKEY_TIMEOUT); 
    } 

    private Handler mTimerHander = new Handler() { 
        public void handleMessage(Message msg){ 
            switch(msg.what){ 
                case MSG_TIMER_EXPIRED: isBackKeyPressed = false; break; 
            } 
        }};
}
