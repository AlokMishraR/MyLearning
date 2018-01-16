package com.example.myars;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Reservationresult extends Activity {
	TextView result;
	String result1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reservationresult);
	   result=(TextView) findViewById(R.id.textView2);
		Intent llp=getIntent();
		String pnr=llp.getStringExtra("pnr2");
		String flightno=llp.getStringExtra("flightno2");
		String flightname=llp.getStringExtra("flightname2");
		String flightsource=llp.getStringExtra("flightsource2");
		String flightdestination=llp.getStringExtra("flightdestination2");
		String flightdate=llp.getStringExtra("flightdate2");
		String flightarrival=llp.getStringExtra("flightarrival2");
		String flightdeparture=llp.getStringExtra("flightdeparture2");	
		result1="Pnr="+pnr+"\n"+"FlightNo="+flightno+"\n"+"Flight Name="+flightname+"\n"+"Flight Source="+flightsource+"\n"+"Flight Destination="+flightdestination+"\n"+"Flight Date="+flightdate+"\n"+"Flight Arrival="+flightarrival+"\n"+"Flight Departure="+flightdeparture+"\n";
		result.setText(result1);
		Toast.makeText(getApplicationContext(), "Please Remember your PNR Number for further use", Toast.LENGTH_LONG).show();
	}	
}
