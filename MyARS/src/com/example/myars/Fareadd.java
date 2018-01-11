package com.example.myars;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Fareadd extends Activity {
	Spinner from,to;
	RadioGroup clas;
	EditText fare;
	String from1,to1,clas1,fare1;
	Button add;
	public Dbhelper mHelper;
	public SQLiteDatabase database;
	ContentValues values;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fareadd);
		fare=(EditText) findViewById(R.id.editText1);
		
		from=(Spinner) findViewById(R.id.spinner1);
		to=(Spinner) findViewById(R.id.spinner2);
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.planet_array6, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		from.setAdapter(adapter);

		ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this, R.array.planet_array6, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		to.setAdapter(adapter1);
		clas=(RadioGroup)findViewById(R.id.radioGroup1);
		add=(Button) findViewById(R.id.button1);
		mHelper =new Dbhelper(this);
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			from1=from.getSelectedItem().toString().trim();
			to1=to.getSelectedItem().toString().trim();
			fare1=fare.getText().toString().trim();
			int id = clas.getCheckedRadioButtonId();
			if (id == R.id.radio0)
			{
			    clas1="Business Class";
			}
			
		    if (id == R.id.radio1)
		    {
			     clas1="Economy Class";   
		    }
			
			database=mHelper.getWritableDatabase();
			values=new ContentValues();
			values.put(mHelper.KEY_SOURCE,from1);
			values.put(mHelper.KEY_DESTINATION,to1);
			values.put(mHelper.KEY_CLASS,clas1);
			values.put(mHelper.KEY_FARE,fare1);
			database.insert(Dbhelper.TABLE_NAME3, null, values);
			database.close();
			Toast.makeText(getApplicationContext(), "Fare Details Added Successfully ", Toast.LENGTH_LONG).show();
			}
		});
	}	
}
