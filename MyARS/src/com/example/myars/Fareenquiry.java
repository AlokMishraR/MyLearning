package com.example.myars;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Fareenquiry extends Activity {
	Spinner from,to;
	Cursor mCursor;
	RadioGroup clas;
	String from1,to1,clas1,fare1;
	public Dbhelper mHelper;
	public SQLiteDatabase database;
	ContentValues values;
	Button get;
	String s1,s2,s3,s4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fareenquiry);
		get=(Button) findViewById(R.id.button1);
		from=(Spinner) findViewById(R.id.spinner1);
		to=(Spinner) findViewById(R.id.spinner2);

		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.planet_array6, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		from.setAdapter(adapter);

		ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this, R.array.planet_array6, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		to.setAdapter(adapter1);
		clas=(RadioGroup)findViewById(R.id.radioGroup1);
		mHelper=new Dbhelper(this);
        database=mHelper.getWritableDatabase(); 
        mCursor= database.rawQuery("SELECT * FROM "+ Dbhelper.TABLE_NAME3,null);
	     mCursor.moveToFirst();
		get.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				from1=from.getSelectedItem().toString().trim();
				to1=to.getSelectedItem().toString().trim();
				int id = clas.getCheckedRadioButtonId();
				if (id == R.id.radio0)
				{
				    clas1="Business Class";
				}
				
			    if (id == R.id.radio1)
			    {
				     clas1="Economy Class";   
			    }
				
				 while(!mCursor.isAfterLast())
		           {
		           	    s1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_SOURCE));
		                s2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_DESTINATION));
		                s3=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_CLASS));
		               s4=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FARE));
		               
		              if(from1.equals(s1)&& to1.equals(s2)&& clas1.equals(s3))
		              {
		            	  Intent kl=new Intent(Fareenquiry.this,Fareresult.class);
		            	 kl.putExtra("source",s1);
		            	 kl.putExtra("destination",s2);
		            	 kl.putExtra("class",s3);
		            	 kl.putExtra("fare",s4);
		            	 startActivity(kl);
		              }
		             
		               mCursor.moveToNext();
		           }
				
				
				
			}
		});
			
	}	
}
