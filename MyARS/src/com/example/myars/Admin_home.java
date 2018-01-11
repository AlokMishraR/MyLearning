package com.example.myars;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Admin_home extends Activity {
	Button add,cancel,fare;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admin_home);
		add=(Button) findViewById(R.id.button1);
		cancel=(Button) findViewById(R.id.button2);
		fare=(Button) findViewById(R.id.button3);
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent a=new Intent(Admin_home.this,Addflight.class);
				startActivity(a);
				
			}
		});
		cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent ab=new Intent(Admin_home.this,Cancelflight.class);
				startActivity(ab);
			}
		});
fare.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent ll=new Intent(Admin_home.this,Fareadd.class);
				startActivity(ll);
				
			}
		});
			
	}	
}
