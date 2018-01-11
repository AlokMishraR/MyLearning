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

public class Reservation extends Activity {
	String pnr;
	String flightno,flightname,flightsource,flightdestination,flightdate,flightarrival,flightdeparture;
	EditText pid,name,city,contactno,flightnum;
	Spinner gender,clas;
	String pid1,name1,gender1,city1,contactno1,clas1,flightnum1;
   Button book;
   Spinner sp,sp2;
   public Dbhelper mHelper;
   public SQLiteDatabase database;
   ContentValues values,values1;
   String message;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reservation);
		sp=(Spinner) findViewById(R.id.spinner1);
		sp2=(Spinner) findViewById(R.id.spinner2);
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.planet_array1, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(adapter);
		ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this, R.array.planet_array2, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp2.setAdapter(adapter1);
		pid=(EditText) findViewById(R.id.editText1);
		name=(EditText) findViewById(R.id.editText2);
		gender=(Spinner) findViewById(R.id.spinner1);
		city=(EditText) findViewById(R.id.editText3);
		contactno=(EditText) findViewById(R.id.editText4);
		clas=(Spinner) findViewById(R.id.spinner2);
		flightnum=(EditText) findViewById(R.id.editText5);
		book=(Button)findViewById(R.id.button1);
		Intent cv= getIntent();
        flightno=cv.getStringExtra("flightno");
        flightname=cv.getStringExtra("flightname");
         flightsource=cv.getStringExtra("flightsource");
         flightdestination=cv.getStringExtra("flightdestination");
        flightdate=cv.getStringExtra("flightdate");
        flightarrival=cv.getStringExtra("flightarrival");
       flightdeparture=cv.getStringExtra("flightdeparture");
        flightnum.setText(flightno);
        mHelper =new Dbhelper(this);
		book.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pid1=pid.getText().toString().trim();
				name1=name.getText().toString().trim();
				gender1=gender.getSelectedItem().toString().trim();
				city1=city.getText().toString().trim();
				contactno1=contactno.getText().toString().trim();
				clas1=clas.getSelectedItem().toString().trim();
				flightnum1=flightnum.getText().toString().trim();
				database=mHelper.getWritableDatabase();
				values=new ContentValues();
				values.put(Dbhelper.KEY_PASSPORTID,pid1);
				values.put(Dbhelper.KEY_CUSTOMERNAME,name1);
				values.put(Dbhelper.KEY_GENDER1,gender1);
				values.put(Dbhelper.KEY_CITY1,city1);
				values.put(Dbhelper.KEY_CONTACT1,contactno1);
				values.put(Dbhelper.KEY_CLASS1,clas1);
				values.put(Dbhelper.KEY_FLIGHTNO1,flightnum1);
				database.insert(Dbhelper.TABLE_NAME5, null, values);
				database.close();
				database=mHelper.getWritableDatabase();
				values1=new ContentValues();
				int a=getRandomNumber(100000, 1000000);
				pnr = Integer.toString(a);
				values1.put(Dbhelper.KEY_PNR,pnr);
				values1.put(Dbhelper.KEY_FLIGHTNO2,flightno);
				values1.put(Dbhelper.KEY_FLIGHTNAME1,flightname);
				values1.put(Dbhelper.KEY_SOURCE1,flightsource);
				values1.put(Dbhelper.KEY_DESTINATION1, flightdestination);
				values1.put(Dbhelper.KEY_DATE,flightdate);
				values1.put(Dbhelper.KEY_ARRIVAL,flightarrival);
				values1.put(Dbhelper.KEY_DEPARTURE,flightdeparture);
				database.insert(Dbhelper.TABLE_NAME6, null, values1);	 
			 Intent ssd=new Intent(Reservation.this,Reservationresult.class);
			 ssd.putExtra("pnr2", pnr);
           	  ssd.putExtra("flightno2", flightno);
           	  ssd.putExtra("flightname2", flightname);
           	  ssd.putExtra("flightsource2",flightsource);
           	  ssd.putExtra("flightdestination2", flightdestination);
           	  ssd.putExtra("flightdate2", flightdate);
           	  ssd.putExtra("flightarrival2", flightarrival);
           	  ssd.putExtra("flightdeparture2", flightdeparture);
           	  startActivity(ssd);
           	    database.close(); 	
				Toast.makeText(getApplicationContext(), "Ticket Successfully Booked Details will be Messaged to you", Toast.LENGTH_LONG).show();
				pid.setText(" ");
				name.setText(" ");
				city.setText(" ");
				contactno.setText(" ");
				flightnum.setText(" ");
			}
		});
		
			
	}	
	public int getRandomNumber(int min, int max) {
	    return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}
	
	
}
