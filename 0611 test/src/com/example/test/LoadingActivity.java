package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class LoadingActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);

		Handler hdl = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                finish(); // activity 종료
            }
        };
        
        hdl.sendEmptyMessageDelayed(0, 2000); // 3초후 메시지 보내지
    }
}
