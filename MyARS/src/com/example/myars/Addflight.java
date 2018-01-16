package com.example.myars;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addflight extends Activity {
	
	EditText flightno,flightname,source,destination,date,arrival,departure;
	String flightno1,flightname1,source1,destination1,date1,arrival1,departure1;
	Button add;
	public Dbhelper mHelper;
    public SQLiteDatabase database;
    ContentValues values;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addflight);
		flightno=(EditText) findViewById(R.id.editText1);
		flightname=(EditText) findViewById(R.id.editText2);
		source=(EditText) findViewById(R.id.editText3);
		destination=(EditText) findViewById(R.id.editText4);
		date=(EditText) findViewById(R.id.editText5);
		arrival=(EditText) findViewById(R.id.editText6);
		departure=(EditText) findViewById(R.id.editText7);
		add=(Button) findViewById(R.id.button1);
		mHelper =new Dbhelper(this);
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				flightno1=flightno.getText().toString().trim();
				flightname1=flightname.getText().toString().trim();
				source1=source.getText().toString().trim();
				destination1=destination.getText().toString().trim();
				date1=date.getText().toString().trim();
				arrival1=arrival.getText().toString().trim();
				departure1=departure.getText().toString().trim();
				database=mHelper.getWritableDatabase();
				values=new ContentValues();
				values.put(Dbhelper.KEY_FLIGHTNO,flightno1);
				values.put(Dbhelper.KEY_FLIGHTNAME,flightname1);
				values.put(Dbhelper.KEY_FLIGHTSOURCE,source1);
				values.put(Dbhelper.KEY_FLIGHTDESTINATION,destination1);
				values.put(Dbhelper.KEY_FLIGHTDATE,date1);
				values.put(Dbhelper.KEY_FLIGHTARRIVAL,arrival1);
				values.put(Dbhelper.KEY_FLIGHTDEPARTURE,departure1);
				database.insert(Dbhelper.TABLE_NAME4, null, values);
				database.close();
				
				Toast.makeText(getApplicationContext(), "Flight Added Successfully", Toast.LENGTH_LONG).show();
			}
		});
	}	
}
