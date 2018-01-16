package com.example.myars;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class One extends Activity {
	 public Dbhelper mHelper;
	int k=0;
   EditText user;
   EditText password;
   String user1,password1,role;
   ImageButton register;
   ImageButton login;
   public SQLiteDatabase database;
   Cursor mCursor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);
		user=(EditText) findViewById(R.id.editText1);
		password=(EditText) findViewById(R.id.editText2);
		login=(ImageButton) findViewById(R.id.imageButton1); 
		register=(ImageButton) findViewById(R.id.imageButton2);
		final Spinner sp=(Spinner) findViewById(R.id.one);
		mHelper =new Dbhelper(this);
		
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.planet_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 try
			        {
					 role=sp.getSelectedItem().toString();
					 user1=user.getText().toString().trim();
					 password1=password.getText().toString().trim();
					 database=mHelper.getWritableDatabase(); 
				     mCursor= database.rawQuery("SELECT * FROM "+ Dbhelper.TABLE_NAME1,null);
			            mCursor.moveToFirst();
			            while(!mCursor.isAfterLast())
			            {
			            	
			                String s2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_USER));
			                String s3=mCursor.getString(mCursor.getColumnIndex(mHelper.KEY_PASSWORD));
			                String s4=mCursor.getString(mCursor.getColumnIndex(mHelper.KEY_ROLE));
			               if(user1.equals(s2)&& password1.equals(s3)&& role.equals(s4))
			               {
			            	   
			            	   k=1;
			            	   break;
			               }
			                
			                
			                mCursor.moveToNext();
			            }
			            if(k==1)
			            {
			            	if(role.equals("Admin"))
			            	{
			            		Intent abc=new Intent(One.this,Admin_home.class);
			            		
				            	startActivity(abc);
			            	}
			            	else
			            	{
			            	Intent abcd=new Intent(One.this,Customer_home.class);
			            	 abcd.putExtra("username", user1);
			            	 abcd.putExtra("password", password1);
			            	startActivity(abcd);
			            	}
			            	
			            }
			            else
			            {
			            	Toast.makeText(getApplicationContext(),"UserName and Password Does'nt Match",Toast.LENGTH_LONG).show();
			            	user.setText("");
			            	password.setText("");
			            	
			            }
			           

			        }
			        catch(SQLiteException e)
			        {

			        }
			}
		});
		register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent a=new Intent(One.this,Register.class);
				startActivity(a);
				System.out.println("+++++++++++++++hi++++++++++");
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.one, menu);
		return true;
	}

}
