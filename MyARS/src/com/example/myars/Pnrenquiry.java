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

public class Pnrenquiry extends Activity {
	public SQLiteDatabase database;
    Cursor mCursor;
    public Dbhelper mHelper;
	EditText pnr;
	String pnr1;
	Button get;
	String s0,s1,s2,s3,s4,d1,d2,d3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pnrenquiry);
		pnr=(EditText) findViewById(R.id.editText1);
		get=(Button) findViewById(R.id.button1);
		mHelper=new Dbhelper(this);
        database=mHelper.getWritableDatabase(); 
	     mCursor= database.rawQuery("SELECT * FROM "+ Dbhelper.TABLE_NAME6,null);
	     mCursor.moveToFirst();
		get.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pnr1=pnr.getText().toString().trim();
				
		           while(!mCursor.isAfterLast())
		           { 
		        	    s0=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_PNR));
		           	    s1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTNO2));
		           	    d1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTNAME1));
		                s2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_SOURCE1));
		                s3=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_DESTINATION1));
		                s4=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_DATE));
		                d2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_ARRIVAL));
		                d3=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_DEPARTURE));
		              if(pnr1.equals(s0))
		              {
		            	  Intent sso=new Intent(Pnrenquiry.this,Pnrresult.class);
		     			      sso.putExtra("pnr3", s0);
		                	  sso.putExtra("flightno3",s1);
		                	  sso.putExtra("flightname3", d1);
		                	  sso.putExtra("flightsource3",s2);
		                	  sso.putExtra("flightdestination3", s3);
		                	  sso.putExtra("flightdate3", s4);
		                	  sso.putExtra("flightarrival3",d2);
		                	  sso.putExtra("flightdeparture3", d3);
		                	  startActivity(sso);
		                 
		              }
		             
		               mCursor.moveToNext();
		           }
			}
		});	
	}	
}
