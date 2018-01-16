package com.example.myars;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Fareresult extends Activity {
	
TextView result;
String result1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fareresult);
		result=(TextView) findViewById(R.id.textView1);
		Intent pqp= getIntent();
        String source=pqp.getStringExtra("source");
        String destination=pqp.getStringExtra("destination");
        String clas=pqp.getStringExtra("class");
        String fare=pqp.getStringExtra("fare");
        result1="Source="+source+"\n"+"Destination="+destination+"\n"+"Class="+clas+"\n"+"Fare="+fare+"\n"; 
		result.setText(result1);	
	}	
}
