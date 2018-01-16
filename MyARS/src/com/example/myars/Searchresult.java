package com.example.myars;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Searchresult extends Activity {
	public SQLiteDatabase database;
    Cursor mCursor;
    public Dbhelper mHelper;
    String s1,s2,s3,s4,d1,d2,d3;
    String result;
   
    ListView lv;
    Set<String> set = new HashSet<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchresult);
		lv =(ListView) findViewById(R.id.listcr);
		Intent pq= getIntent();
        String from=pq.getStringExtra("from");
        String to=pq.getStringExtra("to");
        String date=pq.getStringExtra("date");
       
    	mHelper=new Dbhelper(this);
        database=mHelper.getWritableDatabase(); 
	     mCursor= database.rawQuery("SELECT * FROM "+ Dbhelper.TABLE_NAME4,null);
	     mCursor.moveToFirst();
           while(!mCursor.isAfterLast())
           {
           	    s1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTNO));
           	    d1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTNAME));
                s2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTSOURCE));
                s3=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTDESTINATION));
                s4=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTDATE));
                d2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTARRIVAL));
                d3=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTDEPARTURE));
              if(from.equals(s2)&& to.equals(s3)&& date.equals(s4))
              {
            	  result=s2.concat("\t"+s3.concat("\t"+s4+"\t Tap To Book Flight"));
                  set.add(result);
                  mCursor.moveToNext();
                 
              }
             
               mCursor.moveToNext();
           }
           List<String> list = new ArrayList<String>(set);
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
           lv.setAdapter(adapter);
           lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if(((TextView)view).getText().toString().trim().equals(result))
				{
					Intent as=new Intent(Searchresult.this,Reservation.class);
					as.putExtra("flightno", s1); 
					as.putExtra("flightname", d1);
					as.putExtra("flightsource", s2);
					as.putExtra("flightdestination", s3);
					as.putExtra("flightdate", s4);
					as.putExtra("flightarrival", d2);
					as.putExtra("flightdeparture", d3);
					startActivity(as);
				}
				
			}
        	   
		});
        
	}	
}
