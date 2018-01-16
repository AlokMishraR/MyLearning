package com.example.myars;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends Activity {

   EditText username,password,dob,city,contactno;
   
   public Dbhelper mHelper;
   public SQLiteDatabase database;
   String username1,password1,dob1,gender1,city1,contactno1;
   ContentValues values1,values2;
   Button submit;
   String role;
   String s1="Admin";
   String s2="Customer";
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.register);
		submit=(Button) findViewById(R.id.button1);
		final Spinner sp=(Spinner) findViewById(R.id.spinner1);
		
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.planet_array1, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		sp.setAdapter(adapter);	
		
		username=(EditText) findViewById(R.id.editText1);
		
		password=(EditText) findViewById(R.id.editText2);
		
		dob=(EditText) findViewById(R.id.editText3);
		
		 
		city=(EditText) findViewById(R.id.editText4);
		
		contactno=(EditText) findViewById(R.id.editText5);
		mHelper =new Dbhelper(this);
		
		
	   submit.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			username1=username.getText().toString().trim();
			password1=password.getText().toString().trim();
			
			dob1=dob.getText().toString().trim();
			
			
			gender1=sp.getSelectedItem().toString().trim();
			city1=city.getText().toString().trim();
			contactno1=contactno.getText().toString().trim();
			 
			database=mHelper.getWritableDatabase();
			values1=new ContentValues();
			values2=new ContentValues();
			values1.put(Dbhelper.KEY_USER,username1);
			values1.put(mHelper.KEY_PASSWORD,password1);
			if(username1.equals("Admin"))
			{
				values1.put(mHelper.KEY_ROLE,s1);
			}
			else
			{
				values1.put(mHelper.KEY_ROLE,s2);
			}
			database.insert(Dbhelper.TABLE_NAME1, null, values1);
			database.close();
			
			database=mHelper.getWritableDatabase();
			values2.put(mHelper.KEY_USER1,username1);
			values2.put(mHelper.KEY_PASSWORD1,password1);
			values2.put(mHelper.KEY_DOB,dob1);
			values2.put(mHelper.KEY_GENDER,gender1);
			values2.put(mHelper.KEY_CITY,city1);
			values2.put(mHelper.KEY_CONTACT,contactno1);
			database.insert(Dbhelper.TABLE_NAME2, null, values2);
			database.close();
			Toast.makeText(getApplicationContext(), "Successful Registered Remember Your UserName:"+username1+" and Password:"+password1+" ", Toast.LENGTH_LONG).show();
			username.setText("");
			password.setText("");
			dob.setText("");
			city.setText("");
			contactno.setText("");
		}
	});
		
	}	
}
