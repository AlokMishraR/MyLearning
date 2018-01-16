package com.example.myars;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Pnrresult extends Activity {
	TextView result;
	String result1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pnrresult);
		result=(TextView) findViewById(R.id.textView2);
		Intent llt=getIntent();
		String pnr=llt.getStringExtra("pnr3");
		String flightno=llt.getStringExtra("flightno3");
		String flightname=llt.getStringExtra("flightname3");
		String flightsource=llt.getStringExtra("flightsource3");
		String flightdestination=llt.getStringExtra("flightdestination3");
		String flightdate=llt.getStringExtra("flightdate3");
		String flightarrival=llt.getStringExtra("flightarrival3");
		String flightdeparture=llt.getStringExtra("flightdeparture3");	
		result1="Pnr="+pnr+"\n"+"FlightNo="+flightno+"\n"+"Flight Name="+flightname+"\n"+"Flight Source="+flightsource+"\n"+"Flight Destination="+flightdestination+"\n"+"Flight Date="+flightdate+"\n"+"Flight Arrival="+flightarrival+"\n"+"Flight Departure="+flightdeparture+"\n";
		result.setText(result1);
	}	
}
