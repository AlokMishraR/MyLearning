package com.example.myars;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Flightstatusresult extends Activity {
	TextView result;
	String result1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flightstatusresult);
		result=(TextView) findViewById(R.id.textView2);
		Intent hhj=getIntent();
		String flightno=hhj.getStringExtra("flightno1");
		String flightname=hhj.getStringExtra("flightname1");
		String flightsource=hhj.getStringExtra("flightsource1");
		String flightdestination=hhj.getStringExtra("flightdestination1");
		String flightdate=hhj.getStringExtra("flightdate1");
		String flightarrival=hhj.getStringExtra("flightarrival1");
		String flightdeparture=hhj.getStringExtra("flightdeparture1");	
		result1="FlightNo="+flightno+"\n"+"Flight Name="+flightname+"\n"+"Flight Source="+flightsource+"\n"+"Flight Destination="+flightdestination+"\n"+"Flight Date="+flightdate+"\n"+"Flight Arrival="+flightarrival+"\n"+"Flight Departure="+flightdeparture+"\n";
		result.setText(result1);
	}	
}
