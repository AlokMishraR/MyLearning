package com.example.myars;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Searchflight extends Activity {
    EditText from,to,date;
    String from1,to1,date1;
    Button search;
    Spinner sp;
    int k=0;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchflight);
		sp=(Spinner) findViewById(R.id.spinner1);
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.planet_array2, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);
		from=(EditText) findViewById(R.id.editText1);
		to=(EditText) findViewById(R.id.editText2);
		date=(EditText) findViewById(R.id.editText3);
		search=(Button) findViewById(R.id.button1);
		search.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				from1=from.getText().toString().trim();
				to1=to.getText().toString().trim();
				date1=date.getText().toString().trim();
		        Intent p=new Intent(Searchflight.this,Searchresult.class);
		        p.putExtra("from", from1);
		        p.putExtra("to", to1);
		        p.putExtra("date",date1);
			    startActivity(p);
			}
		});	
	}	
}
