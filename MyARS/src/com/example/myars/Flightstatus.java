package com.example.myars;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Flightstatus extends Activity {
	
 EditText flightno;
 String flightno1;
 Button status;
 public Dbhelper mHelper;
 public SQLiteDatabase database;
 Cursor mCursor;
 String s1,s2,s3,s4,s5,s6,s7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flightstatus);
		flightno=(EditText) findViewById(R.id.editText1);
		status=(Button) findViewById(R.id.button1);
		mHelper =new Dbhelper(this);
		status.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				flightno1=flightno.getText().toString().trim();
				database=mHelper.getWritableDatabase(); 
			    mCursor= database.rawQuery("SELECT * FROM "+ Dbhelper.TABLE_NAME4,null);
			    mCursor.moveToFirst();
	            while(!mCursor.isAfterLast())
	            {
	            	
	                String s1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTNO));
	                String s2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTNAME));
	                String s3=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTSOURCE));
	                String s4=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTDESTINATION));
	                String s5=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTDATE));
	                String s6=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTARRIVAL));
	                String s7=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTDEPARTURE));
	               if(s1.equals(flightno1))
	               {
	            	   System.out.println(s1);
	            	   Intent oo=new Intent(Flightstatus.this,Flightstatusresult.class);
	            	  oo.putExtra("flightno1", s1);
	            	  oo.putExtra("flightname1", s2);
	            	  oo.putExtra("flightsource1", s3);
	            	  oo.putExtra("flightdestination1", s4);
	            	  oo.putExtra("flightdate1", s5);
	            	  oo.putExtra("flightarrival1", s6);
	            	  oo.putExtra("flightdeparture1", s7);
	            	  startActivity(oo);
	               }
	                
	                
	                mCursor.moveToNext();
	            }
			}
		});	
	}	
}
