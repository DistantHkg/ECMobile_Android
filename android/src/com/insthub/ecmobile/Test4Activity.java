package com.insthub.ecmobile;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Test4Activity extends Activity {
	public void btnClick(View v) {
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test4);
		TextView textView = (TextView) findViewById(R.id.textView1);
		
		System.out.println("测试添加代码");
	}
}
