package com.example.test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class MainView extends View {
	
	Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.growling_main);
	
	MainView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	protected void inDraw(Canvas canvas) {
		canvas.drawBitmap(bmp, 0, 0, null);
	}

}
